package com.hfad.greetings;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

/**
 *  InitialFragment.java - Greetings
 *  This program provides functionality for the initial screen's fragment.
 *  This fragment allows an individual to select the language they wish
 *  to view the greeting in and click the "Translate" button.
 *
 *  @author Joseph Traglia
 *
 */
public class InitialFragment extends Fragment {

    /**
     * Method utilized to create and return the view hierarchy associated with the initial
     * screen's fragment.
     * @param inflater inflates the application's layout to fit the device's screen.
     * @param container parent view that the fragment's user interface is attached to.
     * @param savedInstanceState default parameter used to save the application's data
     *                           once the screen has been rotated to landscape mode.
     * @return the View for the fragment's user interface.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_initial, container, false);
        Button btnTranslate = view.findViewById(R.id.btnTranslate);
        Spinner spnLanguages = view.findViewById(R.id.spnLanguages);
        TextView tvTextTranslated = view.findViewById(R.id.tvTextTranslated);

        btnTranslate.setOnClickListener(new View.OnClickListener()
        {
            /**
             * Method utilized to provide functionality to the "Translate" button.
             * This method will switch from InitialFragment to LanguageFragment
             * once the button is clicked.
             * @param view the view that was clicked.
             */
            @Override
            public void onClick(View view)
            {
                String language = spnLanguages.getSelectedItem().toString();
                String translatedWord = translateSelection(language);

                //Passes the translated greeting to be displayed on LanguageFragment.
                InitialFragmentDirections.ActionInitialFragmentToLanguageFragment action =
                    InitialFragmentDirections.actionInitialFragmentToLanguageFragment(translatedWord);

                Navigation.findNavController(view).navigate(action);
            }
        });
        return view;
    }

    /**
     * This method is utilized to translate the individual's language selection
     * to its respective greeting.
     * @param language the language selected from the spnLanguages spinner.
     * @return the greeting of the language selected.
     */
    public String translateSelection(String language)
    {
        if (language.equals("English"))
            return "Hello";
        else if (language.equals("Spanish"))
            return "Hola";
        else
            return "Bonjour";
    }
}
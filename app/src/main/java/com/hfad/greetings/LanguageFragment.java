package com.hfad.greetings;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 *  LanguageFragment.java - Greetings
 *  This fragment displays the proper greeting based on the user's
 *  selected language.
 *
 *  @author Joseph Traglia
 *
 */
public class LanguageFragment extends Fragment {

    /**
     * Method utilized to create and return the view hierarchy associated with the language
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
        View view = inflater.inflate(R.layout.fragment_language, container, false);

        String translation = LanguageFragmentArgs.fromBundle(requireArguments()).getTranslation();

        //Display the translated greeting.
        TextView tvTextTranslated = view.findViewById(R.id.tvTextTranslated);
        tvTextTranslated.setText(translation);

        return view;
    }
}
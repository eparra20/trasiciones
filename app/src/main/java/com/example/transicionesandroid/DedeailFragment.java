package com.example.transicionesandroid;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.transition.TransitionInflater;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DedeailFragment extends Fragment {


    private ImageView imageView;
    public DedeailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dedeail, container, false);
      //
        imageView = view.findViewById(R.id.fdImageView);
        imageView.setTransitionName(MainActivity.TRANSICION_DE_GATITO);

        return view;
    }
}

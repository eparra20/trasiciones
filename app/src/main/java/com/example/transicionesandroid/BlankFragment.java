package com.example.transicionesandroid;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.transition.TransitionInflater;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    private Button buttonIr;
    private ImageView imageView;
    private BlankFragmentListener blankFragmentListener;

    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        blankFragmentListener = (BlankFragmentListener) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        buttonIr = view.findViewById(R.id.buttonIr);
        imageView = view.findViewById(R.id.maImageView);

        buttonIr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setTransitionName(MainActivity.TRANSICION_DE_GATITO);

               // setSharedElementReturnTransition(TransitionInflater.from(getActivity()).inflateTransition(android.R.transition.move));


                blankFragmentListener.onClickFragment(imageView);
            }
        });


        return view;
    }

    public interface BlankFragmentListener{
        public void onClickFragment(ImageView imageView);
    }
}

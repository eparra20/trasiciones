package com.example.transicionesandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.widget.ImageView;

public class FragActivity extends AppCompatActivity implements BlankFragment.BlankFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag);

        Transition transition = TransitionInflater.from(this).inflateTransition(android.R.transition.move);
        BlankFragment blankFragment = new BlankFragment();
        blankFragment.setSharedElementEnterTransition(transition );


        getSupportFragmentManager().beginTransaction().replace(R.id.container, blankFragment)
                .addToBackStack(null).commit();
    }

    @Override
    public void onClickFragment(ImageView imageView) {

        DedeailFragment dedeailFragment = new DedeailFragment();

      //  setSharedElementReturnTransition(TransitionInflater.from(getActivity()).inflateTransition(android.R.transition.move));

        Transition transition = TransitionInflater.from(this).inflateTransition(android.R.transition.move);
        dedeailFragment.setSharedElementEnterTransition(transition );
        dedeailFragment.setSharedElementReturnTransition(transition);


        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, dedeailFragment)
                .addSharedElement(imageView,imageView.getTransitionName())
                .addToBackStack(null)
                .commit();

    }
}

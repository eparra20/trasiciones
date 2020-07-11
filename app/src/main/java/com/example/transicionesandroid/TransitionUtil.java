package com.example.transicionesandroid;

import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.view.Gravity;

public class TransitionUtil {


    public static Transition getSlide(){
        Slide slide = new Slide();
        slide.setDuration(500);
        slide.setSlideEdge(Gravity.RIGHT);
        return slide;
    }

    public static Transition getFade(){
        Fade fade = new Fade();
        fade.setDuration(500);
        return fade;
    }

    public static Transition getExplode(){
        Explode explode = new Explode();
        explode.setDuration(1000);
        return explode;
    }
}

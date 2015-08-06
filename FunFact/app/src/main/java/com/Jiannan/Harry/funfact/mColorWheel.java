package com.Jiannan.Harry.funfact;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Harry on 2015/7/30.
 */
public class mColorWheel {
    //member variables
    private String[] colors = {
            "#FF2D751E",
            "#FF1B858D",
            "#FFAE5C1D",
            "#FFBF2541"
            ,"#FF1D30DC"
            ,"#FF93C21C"
            ,"#FF5D22BC"
            ,"#FF1DA84E"
            ,"#FF23747F"
            ,"#FF15322F"
    };
    //random select a fact
    public int GetColors(){
        String fact = "";
        int color;
        //randomly select the fact from "fact";
        Random randomGenerator = new Random(); //construct the a Random
        int randomNumber = randomGenerator.nextInt(colors.length); //create random number within range from 0 to 4
        fact = colors[randomNumber];// convert the number to string without adding anything.
        color = Color.parseColor(fact);
        //update the label with our dynamic fact;
        return color;
    }
}

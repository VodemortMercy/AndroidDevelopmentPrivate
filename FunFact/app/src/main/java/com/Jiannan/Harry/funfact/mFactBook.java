package com.Jiannan.Harry.funfact;

import java.util.Random;

/**
 * Created by Harry on 2015/7/30.
 */
public class mFactBook {
    //member variables
    private String[] facts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually mostly made of silver.",
            "You are born with 300 bones, by the time you are an adult you will have 206."
            ,"It takes about 8 minutes for light travel from the Sun to the Earth."
            ,"Some bamboo plants can grow almost a meter a day"
            ,"The state Florida is bigger than England."
            ,"Some penguin can leap almost 2-3 meters out of the water."
            ,"On average, it takes 66 days to form a new habit."
            ,"Mammoths still walked the earth when the Great Pyramid was being built."
    };
    //random select a fact
    public String getFacts(){
        String fact = "";
        //randomly select the fact from "fact";
        Random randomGenerator = new Random(); //construct the a Random
        int randomNumber = randomGenerator.nextInt(facts.length); //create random number within range from 0 to 4
        fact = facts[randomNumber];// convert the number to string without adding anything.
        //update the label with our dynamic fact;
        return fact;
    }
}

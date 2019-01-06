package com.example.android.miwok;

import java.util.ArrayList;

public class Word {

    /**Fields*/
    private String[] word = new String[2];

    public  Word(String word1, String word2){
        this.word[0] = word1;
        this.word[1] = word2;
    }

    public String[] getWord(){
        return (word);
    }

    public String getDefaultTranslation(){
        return word[0];
    }

    public String getMiwokTranslation(){
        return word[1];
    }

    public void setDefaultTranslation(String newTranslation){
        word[0] = newTranslation;
    }

    public void setMiwokTranslation(String newTranslation){
        word[1] = newTranslation;
    }

}

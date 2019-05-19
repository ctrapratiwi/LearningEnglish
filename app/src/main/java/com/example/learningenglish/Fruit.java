package com.example.learningenglish;

import java.util.Random;

public class Fruit {
    private int listfruit[] = {
            R.drawable.questionapple,
            R.drawable.questionbanana,
            R.drawable.questionorange,
            R.drawable.questiongrape,
            R.drawable.questionmango,
            R.drawable.questionwatermelon,
            R.drawable.questionpineapple,
            R.drawable.questionpear,
            R.drawable.questionpapaya,
            R.drawable.questionmangosteen,
            R.drawable.questionlemon,
            R.drawable.questionjackfruit,
            R.drawable.questioncherry,
            R.drawable.questionavocado
    };

    private int listanswerfruit[][] = {
            {R.drawable.ansapple, R.drawable.ansorange, R.drawable.anspapaya},
            {R.drawable.ansjackfruit,R.drawable.ansbanana,R.drawable.ansavocado},
            {R.drawable.anscherry,R.drawable.answatermelon,R.drawable.ansorange},
            {R.drawable.ansbanana,R.drawable.ansgrape,R.drawable.ansmangosteen},
            {R.drawable.ansmango,R.drawable.anspear,R.drawable.anspineapple},
            {R.drawable.ansgrape,R.drawable.answatermelon,R.drawable.ansmango},
            {R.drawable.anspineapple,R.drawable.ansapple,R.drawable.anslemon},
            {R.drawable.ansapple,R.drawable.anspapaya,R.drawable.anspear},
            {R.drawable.ansorange,R.drawable.anspapaya,R.drawable.ansbanana},
            {R.drawable.ansmangosteen,R.drawable.ansapple,R.drawable.anscherry},
            {R.drawable.anspineapple,R.drawable.ansavocado,R.drawable.anslemon},
            {R.drawable.ansjackfruit,R.drawable.ansgrape,R.drawable.ansmango},
            {R.drawable.anspear,R.drawable.anscherry,R.drawable.anslemon},
            {R.drawable.ansavocado,R.drawable.anspineapple,R.drawable.ansbanana}
    };

    private int correctanswer[] = {R.drawable.ansapple,R.drawable.ansbanana,R.drawable.ansorange,R.drawable.ansgrape,R.drawable.ansmango,R.drawable.answatermelon,R.drawable.anspineapple,R.drawable.anspear,
            R.drawable.anspapaya,R.drawable.ansmangosteen,R.drawable.anslemon,R.drawable.ansjackfruit,R.drawable.anscherry,R.drawable.ansavocado};

    public int getLength(){
        return listfruit.length;
    }

    public int getimagequestion(int i) {
        return listfruit[i];
    }

    public int getListfruit(int index) {
        int question = listfruit[index];
        return question;
    }

    public int getListanswerfuit (int index, int num){
        int choice = listanswerfruit[index][num-1];
        return choice;
    }
    public int getCorrectanswer(int a){
        int answer = correctanswer[a];
        return answer;
    }
}
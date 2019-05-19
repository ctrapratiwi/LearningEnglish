package com.example.learningenglish;

import java.util.Random;

public class Animal {
    private int listanimal[] = {
            R.drawable.quizdog,
            R.drawable.quizcat,
            R.drawable.quizbutterfly,
            R.drawable.quizfish,
            R.drawable.quizgiraffe,
            R.drawable.quizdragonfly,
            R.drawable.quizturtle,
            R.drawable.quiztiger,
            R.drawable.quizsquid,
            R.drawable.quizoctopus,
            R.drawable.quizmouse,
            R.drawable.quizlion,
            R.drawable.quizelephant,
            R.drawable.quizcrocodile,
            R.drawable.quizbird,
            R.drawable.quizbee,
            R.drawable.quizant
    };

    private int listansweranimal[][] = {
            {R.drawable.anstiger,R.drawable.ansmouse,R.drawable.ansdog},
            {R.drawable.ansant,R.drawable.anscat,R.drawable.ansbee},
            {R.drawable.ansbutterfly,R.drawable.anstiger,R.drawable.ansbird},
            {R.drawable.ansfish,R.drawable.anssquid,R.drawable.anscrocodile},
            {R.drawable.anselephant,R.drawable.ansgiraffe,R.drawable.ansoctopus},
            {R.drawable.ansdragonfly,R.drawable.ansdog,R.drawable.ansant},
            {R.drawable.anselephant,R.drawable.ansdragonfly,R.drawable.ansturtle},
            {R.drawable.anssquid,R.drawable.anstiger,R.drawable.anscat},
            {R.drawable.ansbutterfly,R.drawable.anslion,R.drawable.anssquid},
            {R.drawable.ansoctopus,R.drawable.ansfish,R.drawable.ansgiraffe},
            {R.drawable.ansfish,R.drawable.ansmouse,R.drawable.anselephant},
            {R.drawable.anslion,R.drawable.ansbird,R.drawable.anscrocodile},
            {R.drawable.ansdog,R.drawable.anselephant,R.drawable.anscat},
            {R.drawable.anscrocodile,R.drawable.ansbird,R.drawable.ansbutterfly},
            {R.drawable.ansbird,R.drawable.anssquid,R.drawable.ansant},
            {R.drawable.anslion,R.drawable.ansbutterfly,R.drawable.ansbee},
            {R.drawable.ansant,R.drawable.anselephant,R.drawable.ansturtle}
    };

    private int correctanswer[] = {R.drawable.ansdog,R.drawable.anscat,R.drawable.ansbutterfly,R.drawable.ansfish,R.drawable.ansgiraffe,R.drawable.ansdragonfly,
            R.drawable.ansturtle,R.drawable.anstiger,R.drawable.anssquid,R.drawable.ansoctopus,R.drawable.ansmouse,R.drawable.anslion,R.drawable.anselephant,R.drawable.anscrocodile,
            R.drawable.ansbird,R.drawable.ansbee,R.drawable.ansant};

    public int getLength(){
        return listanimal.length;
    }

    public int getimagequestion(int i) {
        return listanimal[i];
    }

    public int getListanimal(int index) {
        int question = listanimal[index];
        return question;
    }

    public int getListansweranimal (int index, int num){
        int choice = listansweranimal[index][num-1];
        return choice;
    }
    public int getCorrectanswer(int a){
        int answer = correctanswer[a];
        return answer;
    }
}
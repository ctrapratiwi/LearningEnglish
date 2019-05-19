package com.example.learningenglish;

public class Number {
    private int listnumber[] = {
            R.drawable.quiz5,
            R.drawable.quiz2,
            R.drawable.quiz4,
            R.drawable.quiz10,
            R.drawable.quiz1,
            R.drawable.quiz3,
            R.drawable.quiz6,
            R.drawable.quiz9,
            R.drawable.quiz7,
            R.drawable.quiz8
    };

    private int listanswernumber[][] = {
            {R.drawable.ans1,R.drawable.ans5,R.drawable.ans10},
            {R.drawable.ans5,R.drawable.ans10,R.drawable.ans2},
            {R.drawable.ans3,R.drawable.ans2,R.drawable.ans4},
            {R.drawable.ans8,R.drawable.ans4,R.drawable.ans10},
            {R.drawable.ans1,R.drawable.ans5,R.drawable.ans2},
            {R.drawable.ans6,R.drawable.ans3,R.drawable.ans7},
            {R.drawable.ans1,R.drawable.ans7,R.drawable.ans6},
            {R.drawable.ans9,R.drawable.ans2,R.drawable.ans5},
            {R.drawable.ans10,R.drawable.ans7,R.drawable.ans9},
            {R.drawable.ans3,R.drawable.ans8,R.drawable.ans10}
    };



    private int correctanswer[] = {R.drawable.ans5,R.drawable.ans2,R.drawable.ans4,R.drawable.ans10,R.drawable.ans1,R.drawable.ans3,R.drawable.ans6,R.drawable.ans9,R.drawable.ans7,R.drawable.ans8};


    public int getLength(){
        return listnumber.length;
    }

    public int getimagequestion(int i) {
        return listnumber[i];
    }

    public int getListnumber(int index) {
        int question = listnumber[index];
        return question;
    }

    public int getListanswernumber (int index, int num){
        int choice = listanswernumber[index][num-1];
        return choice;
    }
    public int getCorrectanswer(int a){
        int answer = correctanswer[a];
        return answer;
    }
}
package com.example.mahima.demo1;

public class Questions {
    public String mQuestions[]={
            "1.Who is known as the father of C Language ?",
            "2.C language was developed in the year ____",
            "3.Which one is not a reserve keyword in C Language?",
            "4.C variable name can start with a ____",
            "5.Prototype of a function means _____",
            "6.Name the loop that executes at least once.?",
            "7.Far pointer can access _____",
            "8.A pointer pointing to a memory location of the variable even after deletion of the variavle is known as _____",
            "9.An uninitialized pointer in C is called ___",
            "10.A pointer that is pointing to NOTHING is called ____"



    };

    public String mChoices[][]={
            {"James A. Sosling","Vjarne Stroustrup","Dennis Ritchie","Dr. E. F. Codd"},
            {"1970","1975","1980","1985"},
            {"auto","main","case","register"},
            {"Number","Plus Sign(+)","Underscore","Asterisk(*)"},
            {"Name of Function","Output of Function","Declaration of Function","Input of a Function"},
            {"For","if","do-while","while"},
            {"Single memory location","No memory location","All memory location","First and Last Memory Address"},
            {"far pointer","dangling pointer","null pointer","void pointer"},
            {"Constructor","dangling pointer","Wild Pointer","Destructor"},
            {"VOID Pointer","DANGLING Pointer","NULL Pointer","WILD Pointer"},

    };

    private  String mCorrectAnswer[]={"Dennis Ritchie","1970","main","Underscore","Declaration of Function","do-while","All memory location","dangling pointer","Wild Pointer","NULL Pointer"};

    public String getQuestion(int a){
        String questions=mQuestions[a];
        return questions;

    }

    public String getChoice1(int a){
        String choice=mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice=mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice=mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice=mChoices[a][3];
        return choice;
    }



   /* public String getChoice5(int a){
        String choice=mChoices[a][2];
        return choice;
    }


    public String getChoice6(int a){
        String choice=mChoices[a][2];
        return choice;
    }


    public String getChoice7(int a){
        String choice=mChoices[a][2];
        return choice;
    }


    public String getChoice8(int a){
        String choice=mChoices[a][2];
        return choice;
    }


    public String getChoice9(int a){
        String choice=mChoices[a][2];
        return choice;
    }


    public String getChoice10(int a){
        String choice=mChoices[a][2];
        return choice;
    }*/

    public String getCorrectAnswer(int a){
        String answer=mCorrectAnswer[a];
        return answer;
    }

}

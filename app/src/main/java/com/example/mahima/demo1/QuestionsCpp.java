package com.example.mahima.demo1;

public class QuestionsCpp {
    public String mQuestions[]={
            "1.Declaration a pointer more than once may cause ____",
            "2.Which one is not a correct variable type in C++?",
            "3.Which operation is used as Logical 'AND'.?",
            "4.An expression A.B in C++ means ____",
            "5.A C++ code line ends with ___",
            "6.______ function is used to allocate space for array in memory.",
            "7.A pointer pointing to a variable that is not initialized is called ____",
            "8.Default constructor has ____ arguments.",
            "9.A class whos objects can not be created is known as _____",
            "10.Which class allows only one object to be created.",
            "11.Reusability of code in C++ is achieved through ____",
            "12.In CPP, members of a class are ______ by default.",
            "13.In C++ Program, inline fuctions are expanded during ____",
            "14.To perfor file input / output operation in C++, we must include which header file ?",
            "15.An exception in C++ can be generated using which keywords."



    };

    public String mChoices[][]={
            {"Error","Abort","Trap","NULL"},
            {"float","real","int","double"},
            {"Operator-&","Operator-||","Operator-&&","Operator +"},
            {"A is member of object B","B is member of object A","Product of A and B","None of these"},
            {"A Semicolon (;)","A Fullstop(.)","A Comma (,)","A Slash (/)"},
            {"malloc()","relloc()","alloc","calloc()"},
            {"Void Pointer","Null Pointer","Empty Pointer","wild pointer"},
            {"No argument","1 argument","2 argument","None of these"},
            {"Absurd Class","Dead Class","Super Class","Abstract Class"},
            {"Nuclear Family Class","Abstruct Class","Sigleton Class","Numero Undo Class"},
            {"Polymorphism","Inheritance","Encapsulation","Both A and B"},
            {"Public","Private","Protected","Static"},
            {"Run Time","Compile Time","Debug Time","Coding Time"},
            {"<fiostream>","<ifstream>","<ofstream>","<fstream>"},
            {"thrown","threw","throw","throws"}




    };

    private  String mCorrectAnswer[]={"Trap","real","Operator-&&","B is member of object A","A Semicolon (;)","calloc()","Null Pointer","No argument","Abstract Class","Sigleton Class","Inheritance","Private","Run Time","<fstream>","throw"};

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

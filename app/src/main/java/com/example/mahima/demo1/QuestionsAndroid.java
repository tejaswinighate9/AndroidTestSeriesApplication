package com.example.mahima.demo1;

public class QuestionsAndroid {
    public String mQuestions[]={
            "How to pass the data between activities in Android?",
            "What are the layouts available in android?",
            "What is the difference between services and thread in android?",
            " How to access the context in android content provider?",
            "What are the wake locks available in android?",
            "What is ADB in android?",
            "How to fix crash using log cat in android?",
            "How to find the JSON element length in android JSON?",
            "Is it mandatory to call onCreate() and onStart() in android?",
            "What is the life cycle of foreground activity in android?"



    };

    public String mChoices[][]={
            {"Intent","Content Provider","Content Provider","None of the Above"},
            {"Linear Layout","Frame Layout","Table Layout","All of above"},
            {"Services performs functionalities in the background. By default services run on main thread only","Thread and services are having same functionalities."," Thread works on services","None of the above"},
            {"Using getContext() in onCreate()","Using intent()","Using getApplicationContext() at anywhere in an application","A & C"},
            {"PARTIAL_WAKE_LOCK","SCREEN_DIM_WAKE_LOCK","SCREEN_BRIGHT_WAKE_LOCK","FULL_WAKE_LOCK"},
            {"Image tool","Development tool","Android Debug Bridge","None of the above"},
            {"Gmail","log cat contains the exception name along with the line number","Google search","None of the above"},
            {"count()","sum()","add()","length()"},
            {"No, we can write the program without writing onCreate() and onStart()","Yes, we should call onCreate() and onStart() to write the program"," At least we need to call onCreate() once","None of the above"},
            {"onCreate() -> onStart() -> onResume() -> onStop() -> onRestart","onCreate() -> onStart() -> onResume() ->onStop()","onCreate() -> onStart() -> onResume()","None of the above"},

    };

    private  String mCorrectAnswer[]={"Intent","All of above","Services performs functionalities in the background. By default services run on main thread only","A & C","FULL_WAKE_LOCK","Android Debug Bridge","log cat contains the exception name along with the line number","length()","No, we can write the program without writing onCreate() and onStart()","onCreate() -> onStart() -> onResume()"};

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

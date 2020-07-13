package com.example.mahima.demo1;

public class QuestionsJava {
    public String mQuestions[]={
            "What are the two parts of a value of type double? ",
            " After the following code fragment, what is the value in a? ",
            "What is an infinite loop? ",
            " If s = \"text\", what is the value returned by s.length()? ",
            "What is the difference between a TextArea and a TextField? ",
            "_The sequence \\n does what? ",
            "What is the value of k after the following code fragment?\n" +
                    "int k = 0;" +
                    "int n = 12" +
                    "while (k < n)" +
                    "{" +
                    " k = k + 1;" +
                    "} ",
            " What does the following line of code mean?" +
                    "double table[]; ",
            " Given the following code fragment:" +
                    "int A[];" +
                    "int i = 0;" +
                    "A = new int A[4];" +
                    "while (i < 4)" +
                    "{" +
                    " A[i] = 10;" +
                    " i = i + 1;" +
                    "}" +
                    "What is the value of A[3]? ",
            " Given the following statement:" +
                    "huey.setDouble(8.0*32.2+1.0); ",
            "Which rules must be applied to parse the following line?" +
                    "TextField m1, m2; ",
            "What is the purpose of this bit of code" +
                    "void init()" +
                    "{" +
                    " ..." +
                    "}" +
                    "?",
            " How would the TrafficLight program perform if the following" +
                    "line was omitted?" +
                    "b2.addActionListener(this); ",
            "A compound statement is: ",
            "The following is NOT an example of a data type. "



    };

    public String mChoices[][]={
            {"significant digits","length ","Mode","Denominator"},
            {"-1","0","4","random value"},
            {"A loop that functions infinitely well","A loop that runs forever","A loop that never starts","A loop that will never function"},
            {"false","true","4","5"},
            {"A TextArea can handle multiple lines of text","A textarea can be used for output","TextArea is not a class","TextAreas are used for displaying graphics"},
            {"makes a link","Prints a backslash followed by a n","Adds 5 spaces","Starts a new line"},
            {"0","11","12","unknown"},
            {"table is a variable to refers to a real number","table is a variable that refers to two numbers","It is not legal Java code","table is a variable that refers to an array"},
            {"0","3","10","unknown"},
            {"DoubleField","TextField","IntField","double"},
            {"Rule #1 ","Rule #16","Rule #17","all of these"},
            {"a class that initializes the applet","A required method in an applet","A place to declare variables","interacting with users"},
            {"It would not compile","It would not run","Pushing the button labelled"+"GREEN"+"would have no" +
                    "effect ","Pushing the button labelled YELLOW would have no effect"},
            {"A collection of one or more statements enclosed in braces","A statement involving if and else","A way of declaring variables","a way of setting the value of a variable"},
            {"int","public","button","void"}




    };

    private  String mCorrectAnswer[]={"significant digits","-1","A loop that runs forever","4","A TextArea can handle multiple lines of text","Starts a new line","12","table is a variable that refers to an array","10","DoubleField","all of these","A required method in an applet","Pushing the button labelled YELLOW would have no effect","A collection of one or more statements enclosed in braces","public"};

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

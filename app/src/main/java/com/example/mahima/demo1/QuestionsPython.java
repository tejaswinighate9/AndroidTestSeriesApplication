package com.example.mahima.demo1;

public class QuestionsPython {
    public String mQuestions[]={
            "What is the output for - 'python ' [-3]?",
            " What is output of following code -" +
                    "a = (1, 2)" +
                    "a[0] +=1",
            "How can we generate random numbers in python using methods?",
            " What is output for - max(''please help '')",
            " Find the output of the code?" +
                    "def f(a, b = 1, c = 2):" +
                    "   print('a is: ',a, 'b is: ', b, 'c is: ', c)" +
                    "f(2, c = 2)" +
                    "f(c = 100, a = 110)",
            "Guess the output -\n" +
                    "\n" +
                    "def main(): \n" +
                    "   try: \n" +
                    "      func() \n" +
                    "      print(''print this after function call'') \n" +
                    "   except ZeroDivisionError: \n" +
                    "      print('Divided By Zero! Not Possible! ') \n" +
                    "   except: \n" +
                    "      print('Its an Exception!') \n" +
                    "def func(): \n" +
                    "   print(1/0) \n" +
                    "main()",
            "What is the out of the code?\n" +
                    "\n" +
                    "def rev_func(x,length): \n" +
                    "   print(x[length-1],end='' '') \n" +
                    "   rev_func(x,length-1) \n" +
                    "x=[11, 12, 13, 14, 15] \n" +
                    "rev_func(x,5) ",
            "Select the correct function among them which can be used to write the data to perform for a binary output?",
            "Which way among them is used to create an event loop ?",
            " What will be the output of the following code?\n" +
                    "\n" +
                    "print(type(1/2))"



    };

    public String mChoices[][]={
            {"'o'","'t'","'h'","Negative index error."},
            {"(1,1,2)","2","Type Error","Syntax Error"},
            {"random.uniform ()","random.randint()","random.random()","All of These"},
            {"s","a blank space character","e","p"},
            {"a is: 2 b is: 1 c is: 2\n" +
                    "\n" +
                    "a is: 110 b is: 1 c is: 100"," a is: 2 b is: 2 c is: 2\n" +
                    "\n" +
                    "a is: 110 b is: 2 c is: 100","a is: 0 b is: 2 c is: 2\n" +
                    "\n" +
                    "a is: 110 b is: 0 c is: 100","a is: 110 b is: 0 c is: 100\n" +
                    "\n" +
                    "a is: 110 b is: 0 c is: 100"},
            {"Its an Exception!","Divided By Zero! Not possible!","print this after function call followed by Divided By Zero! Not Possible!"," print this after function call followed by Its an Exception!"},
            {"The program runs fine without error.","Program displays 15 14 13 12 11.","Program displays 11 12 13 14 15."," Program displays 15 14 13 12 11 and then raises an index out of range exception."},
            {" Write","Output.binary","Dump","Binary.output"},
            {"Window.eventloop()","Window.mainloop()","Window.loop()","Eventloop.window()"},
            {"<class 'float'>","<class 'int'>","NameError: œ is not defined.","0.5"},

    };

    private  String mCorrectAnswer[]={"'h'","Type Error","All of These","s"," a is: 2 b is: 2 c is: 2\n" +
            "\n" +
            "a is: 110 b is: 2 c is: 100","Divided By Zero! Not possible!"," Program displays 15 14 13 12 11 and then raises an index out of range exception.","Dump","Window.mainloop()","<class 'float'>"};

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


    public String getCorrectAnswer(int a){
        String answer=mCorrectAnswer[a];
        return answer;
    }

}

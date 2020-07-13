package com.example.mahima.demo1;

public class QuestionsSQL {
    public String mQuestions[]={
            "What is the full form of SQL ?",
            "What is the subset of  SQL commands used to manipulate oracle database structures..?",
            "Which operation performs pattern matching..?",
            " What operator tests column for absence of data?",
            "Which command is used to change the table storage charachteristics?",
            "In which of the following cases a DML statement is not executed?",
            "Which of the following is not a developers privilege?",
            "What is returned by SUBSTR(TUTORIALS POINT, 1, 9)?",
            "Which of the folllowing is not a DDL command?",
            "A command that helps u change one or more fields in a record?"



    };

    public String mChoices[][]={
            {"Structured Query Language","Structured Query List","Simple Query Language","None of the above"},
            {"Data Definition Language(DDL)","Data Manipulation Language(DML)","Both of above","None of the above"},
            {"BETWEEN operator","LIKE operator","EXISTS operator","None of these"},
            {"EXISTS operator","NOT operator","IS NULL operator","None of these"},
            {"ALTER TABLE","MODIFY TABLE","CHANGE TABLE","All of these"},
            {"When existing rows are modified","When some rows are deleted","When a table is deleted","None of these"},
            {"CREATE USER","CREATE TABLE","CREATE VIEW","CREATE SEQUENCE"},
            {"TUTORIAL","POINT","TUTORIALS","UTORIALS"},
            {"RENAME","REVOKE","GRANT","UPDATE"},
            {"Insert","Modify","Look-up","All of these"},

    };

    private  String mCorrectAnswer[]={"Structured Query Language","Data Definition Language(DDL)","LIKE operator","IS NULL operator","ALTER TABLE","When a table is deleted","CREATE USER","TUTORIALS","UPDATE","Modify"};

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

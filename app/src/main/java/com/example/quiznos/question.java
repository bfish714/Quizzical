package com.example.quiznos;


import android.app.Activity;

public class question extends Activity {
    private int ID;
    private String QUESTION;
    private String ANSWER;
    private String OPT1;
    private String OPT2;
    private String OPT3;
    private String OPT4;
    private String SUB;

    public question() {
        ID = 0;
        QUESTION = "";
        OPT1 = "";
        OPT2 = "";
        OPT3 = "";
        OPT4 = "";
        ANSWER = "";
        SUB = "";
    }
    public question(int id, String question, String answer, String opt1, String opt2, String opt3, String opt4, String sub) {
        ID = id;
        QUESTION = question;
        OPT1 = opt1;
        OPT2 = opt2;
        OPT3 = opt3;
        OPT4 = opt4;
        ANSWER = answer;
        SUB = sub;
    }
    public int getID() {
        return ID;
    }
    public String getQUESTION() {
        return QUESTION;
    }
    public String getopt1() {
        return OPT1;
    }
    public String getopt2() {
        return OPT2;
    }
    public String getopt3() {
        return OPT3;
    }
    public String getopt4() {
        return OPT4;
    }
    public String getANSWER() {
        return ANSWER;
    }
    public String getSUB() {
        return SUB;
    }
    public void setID(int id) {
        ID = id;
    }
    public void setQUESTION(String question) {
        QUESTION = question;
    }
    public void setOPT1(String opt1) {
        OPT1 = opt1;
    }
    public void setOPT2(String opt2) {
        OPT2 = opt2;
    }
    public void setOPT3(String opt3) {
        OPT3 = opt3;
    }
    public void setOPT4(String opt4) {
        OPT4 = opt4;
    }
    public void setSUB(String sub) {
        SUB = sub;
    }
    public void setANSWER(String answer) {
        ANSWER = answer;
    }
}


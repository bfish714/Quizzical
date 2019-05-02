package com.example.quiznos;


import android.app.Activity;

public class user extends Activity {
    private int ID;
    private String NAME;
    private String PASSWORD;


    public user() {
        ID = 0;
        NAME = "";
        PASSWORD = "";

    }
    public user(int id, String name, String password) {
        ID = id;
        NAME = name;
        PASSWORD = password;
    }
    public int getID() {
        return ID;
    }
    public String getName() {
        return NAME;
    }
    public String getPword() {
        return PASSWORD;
    }

    public void setID(int id) {
        ID = id;
    }
    public void setName(String name) {
        NAME = name;
    }
    public void setPword(String password) {
        PASSWORD = password;
    }

}

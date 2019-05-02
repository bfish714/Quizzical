package com.example.quiznos;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by acer on 06-Apr-16.
 */
public class QuizHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "mathsone";
    // tasks table name
    private static final String TABLE_QUEST = "quest";

    // tasks Table Columns names
    private static final String KEY_ID = "qid";
    private static final String KEY_QUES = "question";
    private static final String KEY_ANSWER = "answer"; // correct option
    private static final String choice1 = "choice1";//name of user table
    private static final String choice2 = "choice2";//name of user table
    private static final String choice3 = "choice3";//name of user table
    private static final String choice4 = "choice4";//name of user table
    private static final String subject = "subject";//name of user table
    private static final String math = "math";
////////////////////////////////////////////////////////////////////////////////////////
    private static final String TABLE_USER = "user";
    private static final String USER_ID = "uid";
    private static final String USER_name = "user_name";
    private static final String USER_pword = "password";


    private SQLiteDatabase dbase;
    public QuizHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase = db;
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER + " TEXT, " + choice1 + " TEXT, "
                + choice2 + " TEXT, " + choice3 + " TEXT," + choice4 + " TEXT," + subject + " TEXT)";
        db.execSQL(sql);
        addQuestion();
        sql = "CREATE TABLE IF NOT EXISTS " + TABLE_USER + " ( "
                + USER_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT, " + USER_name
                + " TEXT, " + USER_pword + " TEXT)";
        db.execSQL(sql);
        addUser();

// db.close();
    }
    private void addQuestion() {
        //Math
        question q1 = new question(1, "what is 2 * 11?", "22", "11", "33", "22", "11", "math");
        this.addQuestion(q1);
        question q2 = new question(2, "pi is 3.1_?", "4", "5", "4", "0", "6", "math");
        this.addQuestion(q2);
        question q3 = new question(3, "what is the square root of 9?", "3", "4.5", "2", "9", "3", "math");
        this.addQuestion(q3);
        question q4 = new question(4, "how many digits are in the number 200.00?", "5", "3", "5", "6", "2", "math");
        this.addQuestion(q4);
        question q5 = new question(5, "simplify 8/20?", "2/5", "1/10", "2/5", "4/10", "3/5", "math");
        this.addQuestion(q5);
        question q6 = new question(6, "491/9?", "54.6", "54.6", "55", "51.3", "50", "math");
        this.addQuestion(q6);
        question q7 = new question(7, "express 71/1000 as a decimal?", ".071", ".071", "7.1", ".71", ".0071", "math");
        this.addQuestion(q7);
        question q8 = new question(8, "Round 3.864 to the nearest tenth", "3.9", "3.86", "3.96", "4", "3.9", "math");
        this.addQuestion(q8);
        question q9 = new question(9, "Which is the equivalent decimal number for forty nine thousandths?", ".049", ".0049", ".049", "4900", "4.9", "math");
        this.addQuestion(q9);
        question q10 = new question(10, ".84/.7= ", "1.2", ".12", "12", "1.2", "1.34", "math");
        this.addQuestion(q10);
        question q11 = new question(11, "2.75 + .003 + .158 =", "2.911", "4.36", "2.911", "0.436", "2.938", "math");
        this.addQuestion(q11);
        question q12 = new question(12, "7.86 × 4.6 =", "36.156", "36.216", "351.56", "36.156", "361.56", "math");
        this.addQuestion(q12);
        question q13 = new question(13, "7/20 =", ".35", ".035", ".858", ".35", "3.5", "math");
        this.addQuestion(q13);
        question q14 = new question(14, "Which of the following is the least?", ".015", ".105", ".501", ".015", ".15", "math");
        this.addQuestion(q14);
        question q15 = new question(15, "All of the following are ways to write 25 percent of N EXCEPT", "25N", ".25N", "25N/100", "1/4N", "25 N", "math");
        this.addQuestion(q15);
        question q16 = new question(16, "A soccer team played 160 games and won 65 percent of them. How many games did it win? ", "104", "94", "104", "114", "124", "math");
        this.addQuestion(q16);
        question q17 = new question(17, "32 is 40 percent of what number? ", "80", "12.8", "128", "80", "800", "math");
        this.addQuestion(q17);
        question q18 = new question(18, "313 – 225 =", "1415", "112", "115", "1415", "1115", "math");
        this.addQuestion(q18);
        question q19 = new question(19, "2.75 + .003 + .158 =", "2.911", "4.36", "2.911", "0.436", "2.938", "math");
        this.addQuestion(q19);
        question q20 = new question(20, "24, 41, 58, 75, 92... What's next?", "99", "96", "104", "99", "94", "math");
        this.addQuestion(q20);
        //History
        question q21 = new question(21, "Greek civilization flourished in the year ________ ?", "800 BC", "1200 AD", "800 BC", "100 BC", "O", "history");
        this.addQuestion(q21);
        question q22 = new question(22, "Rome was founded in the year ___ ?", "753 BC", "753 BC", "800 BC", "100 BC", "2019 AD", "history");
        this.addQuestion(q22);
        question q23 = new question(23, "The Eiffel Tower is built in ________.", "1889 AD", "1200 AD", "1889 AD", "1649 AD", "1211 AD", "history");
        this.addQuestion(q23);
        question q24 = new question(24, "World War I began in the year ________ ?", "1914", "1938", "1912", "1929", "1914", "history");
        this.addQuestion(q24);
        question q25 = new question(25, "Bhumibol Adulyadej is the longest-reigning monarch in which country's history?", "Thailand", "Korea", "Sudan", "Thailand", "Turkey", "history");
        this.addQuestion(q25);
        question q26 = new question(26, "The Suez canal opened in the year ______ ?", "1869 AD", "1869 AD", "1349 AD", "1633 AD", "1751 AD", "history");
        this.addQuestion(q26);
        question q27 = new question(27, "New Zeland becomes first country to grant woman to right to vote in the year _____?", "1869", "1349", "1633", "1761", "O", "history");
        this.addQuestion(q27);
        question q28 = new question(28, "Who is considered the Father of the Constitution?", "James Madison", "George Washington", "Benjamin Franklin", "James Madison", "Andrew Jackson", "history");
        this.addQuestion(q28);
        question q29 = new question(29, "In which year Bangladesh was formed as Separate Country?", "1971", "1957", "1971", "1969", "1983", "history");
        this.addQuestion(q29);
        question q30 = new question(30, "This Russian ruler was the first to be crowned Czar?", "Ivan IV", "Ivan IV", "Gregor II", "Ivan III", "Nietsche I", "history");
        this.addQuestion(q30);
        //geography
        question q31 = new question(31, "Which continent does NOT border the Indian Ocean? ", "North America", "Asia", "Africa", "Australia", "North America", "geography");
        this.addQuestion(q31);
        question q32 = new question(32, "Which landmass straddles a mid-ocean ridge? \n", "Iceland", "Madagascar", "Greenland", "Iceland", "Australia", "geography");
        this.addQuestion(q32);
        question q33 = new question(33, "Which region is known by the nickname “Pirate Alley\"?", "Gulf of Aden", "Yellow Sea", "Gulf of Aden", "Arabian Sea", "Okotsk Sea", "geography");
        this.addQuestion(q33);
        question q34 = new question(34, "A semi-enclosed body of water where river water mixes with ocean water is called: ", "Estuary", "Aquafer", "Lake", "Estuary", "Well", "geography");
        this.addQuestion(q34);
        question q35 = new question(35, "Name the strait which connects the Red Sea and the Gulf of Aden and is known as the \"Gate of Tears.\" ", "Mandib", "Berring", "Panama", "Mandib", "Turkey", "geography");
        this.addQuestion(q35);
        question q36 = new question(36, "Name the marginal sea which lies between South Korea and the People's Republic of China. ",  "Yellow Sea", "Yellow Sea", "Gulf of Aden", "Arabian Sea", "Okotsk Sea", "geography");
        this.addQuestion(q36);
        question q37 = new question(37, "Which ocean lies on the east coast of the United States?", "Atlantic", "Pacific", "Eastern", "Atlantic", "Indian", "geography");
        this.addQuestion(q37);
        question q38 = new question(38, "Which is the world's highest mountain?", "Mount Everest", "Kilimanjaro", "K2", "Makalu", "Mount Everest", "geography");
        this.addQuestion(q38);
        question q39 = new question(39, "How many Great Lakes are there?", "5", "3", "4", "5", "6", "geography");
        this.addQuestion(q39);
        question q40 = new question(40, "Which is the longest river in the U.S.?", "Missouri", "Colorado", "Yukon", "Missouri", "Mississippi", "geography");
        this.addQuestion(q40);
        //pop
        question q41 = new question(41, "Who was the first Disney princess?", "Persephone", "Snow White", "Persephone", "Sleeping Beauty", "Mulan", "pop");
        this.addQuestion(q41);
        question q42 = new question(42, "Who was the first actor to portray James Bond on screen?", "Barry Nelson", "Sean Connery", "Daniel Craig", "Barry Nelson", "Pierce Brosnan", "pop");
        this.addQuestion(q42);
        question q43 = new question(43, "Who is Beyonce Married to?", "Jay-Z", "Kanye West", "Dr.Dre", "Brendan Frasier", "Jay-Z", "pop");
        this.addQuestion(q43);
        question q44 = new question(44, "What are fans of Justin Bieber Called? ", "Beliebers", "Beiberacts", "Biebsters", "Beliebers", "Beavers", "pop");
        this.addQuestion(q44);
        question q45 = new question(45, "Name the strait which connects the Red Sea and the Gulf of Aden and is known as the \"Gate of Tears.\" ", "Mandib", "Berring", "Panama", "Mandib", "Turkey", "pop");
        this.addQuestion(q45);
        question q46 = new question(46, "Who won the first American Idol?",  "Kelly Clarkson", "Kelly Clarkson", "Ruben Stutter", "Randy Jackson", "Carrie Underwood", "pop");
        this.addQuestion(q46);
        question q47 = new question(47, "What Golden State Warrior won NBA MVP two years in a row?", "Curry", "Lebron", "Duncan", "Bryant", "Curry", "pop");
        this.addQuestion(q47);
        question q48 = new question(48, "Who is Marhsall Mathers", "Eminem", "Dr.Dre", "Eminem", "Vanilla Ice", "MF Doom", "pop");
        this.addQuestion(q48);
        question q49 = new question(49, "As of December 2018, how many seasons of Survivor have there been?", "37", "32", "33", "37", "41", "pop");
        this.addQuestion(q49);
        question q50 = new question(50, "Who's famous phrase is \'Float like a butterfly, sting like a bee?\'", "Muhammad Ali", "Muhammad Ali", "Mike Tyson", "Joe Frazier", "George Foreman", "pop");
        this.addQuestion(q50);
        //Science
        question q51 = new question(51, "What is the biggest planet in our solar system?", "Jupiter", "Venus", "Sun", "Jupiter", "Earth", "sci");
        this.addQuestion(q51);
        question q52 = new question(52, "What is the chemical symbol for the element oxygen?", "O", "H", "O", "NA", "CL", "sci");
        this.addQuestion(q52);
        question q53 = new question(53, "Another name for a tidal wave is a?", "Tsunami", "Hiroshima", "EarthQuake", "Shojinshu", "Tsunami", "sci");
        this.addQuestion(q53);
        question q54 = new question(54, "What is the name of the long appendage that hangs from an elephants face?", "Trunk", "Branch", "Trunk", "Stalk", "Nose", "sci");
        this.addQuestion(q54);
        question q55 = new question(55, "Pure water has a pH level of a around?", "7", "7", "8", "6.5", "12", "sci");
        this.addQuestion(q55);
        question q56 = new question(56, "How many bones do sharks have in their bodies?",  "0", "212", "112", "34", "0", "sci");
        this.addQuestion(q56);
        question q57 = new question(57, "What famous scientist was awarded the 1921 Nobel Prize in Physics for his work on theoretical physics?", "Einstein", "Currie", "Hawking", "Gustavo", "Einstein", "sci");
        this.addQuestion(q57);
        question q58 = new question(58, "The fear of what animal is known as‘arachnophobia’?", "Spiders", "Ants", "Spiders", "Dogs", "Bears", "sci");
        this.addQuestion(q58);
        question q59 = new question(59, "The molten rock that comes from a volcano after it has erupted is known as what?", "Lava", "Lava", "Magma", "Silt", "Crust", "sci");
        this.addQuestion(q59);
        question q60 = new question(60, "What is the name of the closest star to the earth?", "Sun", "Alpha Centauri", "X01", "Sun", "Gamma Centauri", "sci");
        this.addQuestion(q60);

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
// Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
// Create tables again
        onCreate(db);
    }
    public void addQuestion(question quest) {
// SQLiteDatabase db = this.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put(KEY_QUES, quest.getQUESTION());
            values.put(KEY_ANSWER, quest.getANSWER());
            values.put(choice1, quest.getopt1());
            values.put(choice2, quest.getopt2());
            values.put(choice3, quest.getopt3());
            values.put(choice4, quest.getopt4());
            values.put(subject, quest.getSUB());

            dbase.insert(TABLE_QUEST, null, values);
        }
    private void addUser() {
        user u1 = new user(1, "bfisher14", "yes");
        this.addUser(u1);
    }
    public void addUser(user usr) {
// SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(USER_name, usr.getName());
        values.put(USER_pword, usr.getPword());

        dbase.insert(TABLE_USER, null, values);
    }
    public List<user> getAllUsers() {
        List<user> userList = new ArrayList<user>();
        // Select All Query
        //String selectQuery = "SELECT * FROM " + TABLE_QUEST;
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery("SELECT * FROM "+ TABLE_USER, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                user use = new user();
                use.setID(cursor.getInt(0));
                use.setName(cursor.getString(1));
                use.setPword(cursor.getString(2));
                userList.add(use);
            } while (cursor.moveToNext());
        }
        // return quest list

        return userList;
    }
    public List<question> getAllMathQuestions() {
        List<question> quesList = new ArrayList<question>();
        // Select All Query
        //String selectQuery = "SELECT * FROM " + TABLE_QUEST;
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery("SELECT * FROM "+ TABLE_QUEST+" WHERE subject = 'math'", null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                question quest = new question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPT1(cursor.getString(3));
                quest.setOPT2(cursor.getString(4));
                quest.setOPT3(cursor.getString(5));
                quest.setOPT4(cursor.getString(6));
                quest.setSUB(cursor.getString(7));
                quesList.add(quest);
            } while (cursor.moveToNext());
        }
        // return quest list
       // Collections.shuffle(quesList);

        return quesList;
    }
    public List<question> getAllHistQuestions() {
        List<question> quesList = new ArrayList<question>();
        // Select All Query
        //String selectQuery = "SELECT * FROM " + TABLE_QUEST;
        String history = "history";
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery("SELECT * FROM "+ TABLE_QUEST+" WHERE subject = 'history'", null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                question quest = new question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPT1(cursor.getString(3));
                quest.setOPT2(cursor.getString(4));
                quest.setOPT3(cursor.getString(5));
                quest.setOPT4(cursor.getString(6));
                quest.setSUB(cursor.getString(7));
                quesList.add(quest);
            } while (cursor.moveToNext());
        }
        // return quest list
       // Collections.shuffle(quesList);

        return quesList;
    }
    public List<question> getAllGeoQuestions() {
        List<question> quesList = new ArrayList<question>();
        // Select All Query
        //String selectQuery = "SELECT * FROM " + TABLE_QUEST;
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery("SELECT * FROM "+ TABLE_QUEST+" WHERE subject = 'geography'", null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                question quest = new question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPT1(cursor.getString(3));
                quest.setOPT2(cursor.getString(4));
                quest.setOPT3(cursor.getString(5));
                quest.setOPT4(cursor.getString(6));
                quest.setSUB(cursor.getString(7));
                quesList.add(quest);
            } while (cursor.moveToNext());
        }
        // return quest list
        //Collections.shuffle(quesList);
        //Collections.shuffle(quesList);

        return quesList;
    }
    public List<question> getAllPopQuestions() {
        List<question> quesList = new ArrayList<question>();
        // Select All Query
        //String selectQuery = "SELECT * FROM " + TABLE_QUEST;
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery("SELECT * FROM "+ TABLE_QUEST+" WHERE subject = 'pop'", null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                question quest = new question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPT1(cursor.getString(3));
                quest.setOPT2(cursor.getString(4));
                quest.setOPT3(cursor.getString(5));
                quest.setOPT4(cursor.getString(6));
                quest.setSUB(cursor.getString(7));
                quesList.add(quest);
            } while (cursor.moveToNext());
        }
        // return quest list
       // Collections.shuffle(quesList);

        return quesList;
    }
    public List<question> getAllSciQuestions() {
        List<question> quesList = new ArrayList<question>();
        // Select All Query
        //String selectQuery = "SELECT * FROM " + TABLE_QUEST;
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery("SELECT * FROM "+ TABLE_QUEST+" WHERE subject = 'science'", null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                question quest = new question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPT1(cursor.getString(3));
                quest.setOPT2(cursor.getString(4));
                quest.setOPT3(cursor.getString(5));
                quest.setOPT4(cursor.getString(6));
                quest.setSUB(cursor.getString(7));
                quesList.add(quest);
            } while (cursor.moveToNext());
        }
        // return quest list
        Collections.shuffle(quesList);

        return quesList;
    }
    public List<question> getAllQuestions() {
        List<question> quesList = new ArrayList<question>();
        // Select All Query
        //String selectQuery = "SELECT * FROM " + TABLE_QUEST;
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery("SELECT * FROM "+ TABLE_QUEST, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                question quest = new question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPT1(cursor.getString(3));
                quest.setOPT2(cursor.getString(4));
                quest.setOPT3(cursor.getString(5));
                quest.setOPT4(cursor.getString(6));
                quest.setSUB(cursor.getString(7));
                quesList.add(quest);
            } while (cursor.moveToNext());
        }
        // return quest list
       // Collections.shuffle(quesList);
        return quesList;
    }
}
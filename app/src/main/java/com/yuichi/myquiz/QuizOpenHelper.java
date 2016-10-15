package com.yuichi.myquiz;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Yuichi on 2016/09/22.
 */

public class QuizOpenHelper extends SQLiteOpenHelper{

    public static final String DB_NAME = "myquiz.db";
    public static final int DB_VERSION = 1;

    public static final String CREATE_TABLE_QUIZ =
            "create table " + QuizContract.Quiz.TABLE_NAME + " (" +
                    QuizContract.Quiz._ID + " integer primary key autoincrement, " +
                    QuizContract.Quiz.STAGE_LEVEL + " integer," +
                    QuizContract.Quiz.ANSWER_ID + " integer," +
                    QuizContract.Quiz.QTEXT + " text)";
    public static final String CREATE_TABLE_ANSWER =
            "create table " + AnswerContract.Answer.TABLE_NAME + " (" +
                    AnswerContract.Answer._ID + " integer primary key autoincrement, " +
                    AnswerContract.Answer.STAGE_LEVEL + " integer," +
                    AnswerContract.Answer.ANSWER_ID + " integer," +
                    AnswerContract.Answer.ATEXT + " text)";
    public static final String DROP_TABLE_QUIZ =
            "drop table if exists quiz";
    public static final String DROP_TABLE_ANSWER =
            "drop table i exists answer";

    public QuizOpenHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE_QUIZ);

        sqLiteDatabase.execSQL(CREATE_TABLE_ANSWER);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(DROP_TABLE_QUIZ);

        sqLiteDatabase.execSQL(DROP_TABLE_ANSWER);

        onCreate(sqLiteDatabase);
    }
}

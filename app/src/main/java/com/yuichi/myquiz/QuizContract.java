package com.yuichi.myquiz;

import android.provider.BaseColumns;

/**
 * Created by Yuichi on 2016/09/22.
 */

public final class QuizContract {

    public QuizContract(){}

    public static abstract class Quiz implements BaseColumns {
        public static final String TABLE_NAME = "quiz";
        public static final String STAGE_LEVEL = "stageLevel";
        public static final String ANSWER_ID = "answerId";
        public static final String QTEXT = "qText";
    }
}

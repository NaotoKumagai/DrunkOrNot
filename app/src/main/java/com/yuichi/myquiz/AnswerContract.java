package com.yuichi.myquiz;

import android.provider.BaseColumns;

/**
 * Created by Yuichi on 2016/09/22.
 */

public final class AnswerContract {

    public AnswerContract(){}

    public static abstract class Answer implements BaseColumns {
        public static final String TABLE_NAME = "answer";
        public static final String STAGE_LEVEL = "stageLevel";
        public static final String ANSWER_ID = "answerId";
        public static final String ATEXT = "aText";
    }
}

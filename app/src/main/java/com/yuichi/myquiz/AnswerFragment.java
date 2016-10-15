package com.yuichi.myquiz;

import android.app.Fragment;
import android.os.Bundle;

/**
 * Created by Yuichi on 2016/09/24.
 */

public class AnswerFragment extends Fragment{
    private static final String PARAMETER = "parameter";

    public AnswerFragment(){}

    public static AnswerFragment newInstance(String param){
        AnswerFragment answerFragment = new AnswerFragment();
        Bundle args = new Bundle();
        args.putString(PARAMETER, param);
        answerFragment.setArguments(args);
        return answerFragment;
    }
}

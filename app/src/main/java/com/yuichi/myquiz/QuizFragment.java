package com.yuichi.myquiz;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Yuichi on 2016/09/24.
 */

public class QuizFragment extends Fragment {

    private TextView textView;
    private static final String PARAMETER = "parameter";
    private String mName;

    public QuizFragment(){}

    public static QuizFragment newInstance(String param){
        QuizFragment quizFragment = new QuizFragment();
        Bundle args = new Bundle();
        args.putString(PARAMETER, param);
        quizFragment.setArguments(args);
        return quizFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.quiz_text, container, false);
        textView = (TextView)view.findViewById(R.id.qText);
        textView.setText("");
        Button button = (Button)view.findViewById(R.id.answerButton);
        button.setOnClickListener(buttonOnClickListener);
        return view;
    }

    View.OnClickListener buttonOnClickListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){

        }
    };

}

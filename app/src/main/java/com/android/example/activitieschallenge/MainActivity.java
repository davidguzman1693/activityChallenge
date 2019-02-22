package com.android.example.activitieschallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_STORY = "story";
    public static final String STORY_ONE = "first_story";
    public static final String STORY_TWO = "second_story";
    public static final String STORY_THREE = "third_story";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showText(View view) {
        int id = view.getId();
        Intent intent = new Intent(this, SecondActivity.class);
        switch (id){
            case R.id.text_one_button:
                intent.putExtra(EXTRA_STORY, STORY_ONE);
                break;
            case R.id.text_two_button:
                intent.putExtra(EXTRA_STORY, STORY_TWO);
                break;
            case R.id.text_three_button:
                intent.putExtra(EXTRA_STORY, STORY_THREE);
                break;
        }
        startActivity(intent);
    }
}

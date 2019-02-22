package com.android.example.activitieschallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView storyOne, storyTwo, storyThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        storyOne = findViewById(R.id.text_one_story);
        storyTwo = findViewById(R.id.text_two_story);
        storyThree = findViewById(R.id.text_three_story);
        Intent intent = getIntent();
        String story = intent.getStringExtra(MainActivity.EXTRA_STORY);
        setStoryVisible(story);
    }

    private void setStoryVisible(final String story){
        switch (story){
            case MainActivity.STORY_ONE:
                storyOne.setVisibility(View.VISIBLE);
                break;
            case MainActivity.STORY_TWO:
                storyTwo.setVisibility(View.VISIBLE);
                break;
            case MainActivity.STORY_THREE:
                storyThree.setVisibility(View.VISIBLE);
                break;
        }
    }
}

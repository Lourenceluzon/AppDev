package com.example.appquiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LessonListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_list);

    }

    public void goToSenses(View view) {
        startActivity(new Intent(this, MainActivity.class).putExtra("lesson", "senses"));
    }

    public void goToAlphabets(View view) {
        startActivity(new Intent(this, MainActivity.class).putExtra("lesson", "alphabet"));
    }

    public void goToNumbers(View view) {
        startActivity(new Intent(this, MainActivity.class).putExtra("lesson", "numbers"));
    }
}
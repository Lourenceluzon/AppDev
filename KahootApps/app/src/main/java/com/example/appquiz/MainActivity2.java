package com.example.appquiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void goToQuiz(View view) {
        startActivity(new Intent(this, TestActivity.class));
    }

    public void goToLectures(View view) {
        startActivity(new Intent(this, LessonListActivity.class));
    }
}
package com.example.appquiz;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.appquiz.classes.GlobalVariables;
import com.example.appquiz.classes.Test;

import java.util.ArrayList;

public class TestActivity extends AppCompatActivity {
    private static ArrayList<Test> testArrayList;
    TextView tvAnswer, tvStudentAnswer, tvScore, tvNumber;
    ImageView ivQuestion;
    Button btn1, btn2;
    int position = 0;
    int score = 0;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        GlobalVariables globalVariables = (GlobalVariables) this.getApplication();
        testArrayList = globalVariables.getTest();


        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Getting data");
        progressDialog.setMessage("Loading please wait...");
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                progressDialog.dismiss();
                getQuestion(position);
            }
        }, 1000);
        tvAnswer = findViewById(R.id.tvAnswer);
        ivQuestion = findViewById(R.id.ivQuestion);
        tvStudentAnswer = findViewById(R.id.tvStudentAnswer);
        tvScore = findViewById(R.id.tvScore);
        tvNumber = findViewById(R.id.tvNumber);
        btn1 = findViewById(R.id.btnChoice1);
        btn2 = findViewById(R.id.btnChoice2);


    }

    private void getQuestion(int position) {
        tvScore.setText("Score: " + String.valueOf(score));
        tvAnswer.setText(testArrayList.get(position).getAnswer());
        Glide.with(getApplication()).load(testArrayList.get(position).getQuestion_image()).into(ivQuestion);
        tvNumber.setText("Question " + (position + 1) + "/" + testArrayList.size());
        btn1.setText(testArrayList.get(position).getChoice1());
        btn2.setText(testArrayList.get(position).getChoice2());
    }

    public void submit(View view) {
        if (tvStudentAnswer.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "Choose an answer", Toast.LENGTH_SHORT).show();
        } else {
            if (position + 1 >= testArrayList.size()) {
                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setMessage("Your score is " + String.valueOf(score) + "/" + testArrayList.size());
                alert.setCancelable(false);
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                alert.show();
            } else {
                position++;
                if (tvStudentAnswer.getText().toString().equalsIgnoreCase(tvAnswer.getText().toString())) {
                    score++;
                }
                getQuestion(position);
                tvStudentAnswer.setText("");
                btn2.setBackgroundColor(btn2.getContext().getResources().getColor(R.color.purple_200));
                btn1.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.purple_200));
            }
        }
    }

    public void choice2(View view) {
        tvStudentAnswer.setText(btn2.getText().toString().toLowerCase());
        btn2.setBackgroundColor(btn2.getContext().getResources().getColor(R.color.purple_700));
        btn1.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.purple_200));

    }

    public void choice1(View view) {
        tvStudentAnswer.setText(btn1.getText().toString().toLowerCase());
        btn2.setBackgroundColor(btn2.getContext().getResources().getColor(R.color.purple_200));
        btn1.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.purple_700));
    }
}
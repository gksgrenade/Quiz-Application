package com.gautam.quizapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "com.gautam.quizapplication.NAME";
    TextView question, option1, option2, option3;
    Button result, restart;
    String[] questions = {"What is boiling point of Water?", "What is fridging point of Water?", "Which of the following shows tyndall effect?", "Which is pure substance?", "Which of the following is an alloy?"};
    String[] options1 = {"100 C", "45 C", "Solution", "CaCO3", "Iron"};
    String[] options2 = {"65 C", "0 C", "Suspension", "Sea Water", "Bronze"};
    String[] options3 = {"0 C", "100 C", "Colloid", "Air", "Gold"};
    int[] answer = {1, 2, 3, 1, 2};
    int index = 0, score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question = findViewById(R.id.question);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
//        opt1=findViewById(R.id.button1);
//        opt2=findViewById(R.id.button2);
//        opt3=findViewById(R.id.button3);
        result = findViewById(R.id.button4);
        restart = findViewById(R.id.button5);
        question.setText(questions[index]);
        String op1 = "A." + options1[index];
        String op2 = "B." + options2[index];
        String op3 = "C." + options3[index];
        question.setText(questions[index]);
        option1.setText(op1);
        option2.setText(op2);
        option3.setText(op3);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;
                index = 0;
                String op1 = "A." + options1[index];
                String op2 = "B." + options2[index];
                String op3 = "C." + options3[index];
                question.setText(questions[index]);
                option1.setText(op1);
                option2.setText(op2);
                option3.setText(op3);
            }
        });
        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "clicked option 1", Toast.LENGTH_SHORT).show();
                if (index < questions.length) {
                    if (answer[index] == 1) {
                        score++;
                    }
                    index++;
                    if (index == questions.length) {
                        Toast.makeText(MainActivity.this, "Your score is" + score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    } else {
                        String op1 = "A." + options1[index];
                        String op2 = "B." + options2[index];
                        String op3 = "C." + options3[index];
                        question.setText(questions[index]);
                        option1.setText(op1);
                        option2.setText(op2);
                        option3.setText(op3);
                    }
                }
            }
        });
        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "clicked option 2", Toast.LENGTH_SHORT).show();
                if (index < questions.length) {
                    if (answer[index] == 2) {
                        score++;
                    }
                    index++;
                    if (index == questions.length) {
                        Toast.makeText(MainActivity.this, "Your score is" + score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    } else {
                        String op1 = "A." + options1[index];
                        String op2 = "B." + options2[index];
                        String op3 = "C." + options3[index];
                        question.setText(questions[index]);
                        option1.setText(op1);
                        option2.setText(op2);
                        option3.setText(op3);
                    }
                }
            }
        });
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "clicked option 3", Toast.LENGTH_SHORT).show();
                if (index < questions.length) {
                    if (answer[index] == 3) {
                        score++;
                    }
                    index++;
                    if (index == questions.length) {
                        Toast.makeText(MainActivity.this, "Your score is" + score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    } else {
                        String op1 = "A." + options1[index];
                        String op2 = "B." + options2[index];
                        String op3 = "C." + options3[index];
                        question.setText(questions[index]);
                        option1.setText(op1);
                        option2.setText(op2);
                        option3.setText(op3);
                    }
                }
            }
        });
//        result.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent= new Intent(this,MainActivity2.class);
//                intent.putExtra(EXTRA_NAME,score);
//                startActivity(intent);
//            }
//        });
    }

    public void openresult(View v) {
        Intent intent = new Intent(this, MainActivity2.class);
        String total = Integer.toString(questions.length);
        String marks = score + "/" + total;
        intent.putExtra(EXTRA_NAME, marks);
        startActivity(intent);
    }
}
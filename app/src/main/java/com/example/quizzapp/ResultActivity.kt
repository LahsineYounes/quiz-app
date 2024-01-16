package com.example.quizzapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName = findViewById<TextView>(R.id.tv_name)
        val tvScore = findViewById<TextView>(R.id.tv_score)

        val btnFinish = findViewById<Button>(R.id.btn_finish)

        tvName.text = intent.getStringExtra(Constants.USER_Name)

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        tvScore.text = "Your Score is : $correctAnswers / $totalQuestions"


        btnFinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

    }
}
package com.example.quizzapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var progressBar: ProgressBar?=null
    private var tvProgress: TextView? = null
    private var tvQuestion:TextView? = null
    private var ivImage: ImageView? = null
    private var tvOptionOne:TextView? = null
    private var tvOptionTwo:TextView? = null
    private var tvOptionThree:TextView? = null
    private var tvOptionFour:TextView? = null
    private var buttonSubmit: Button? = null


    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null

    private var mSelectedOptionPosition: Int = 0

    private var mUserName : String? = null

    private var mCorrectAnswers: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_quiz_questions)

        mUserName = intent.getStringExtra(Constants.USER_Name)


        progressBar=findViewById(R.id.progressBar)
        tvProgress = findViewById(R.id.tv_progress)
        tvQuestion = findViewById(R.id.tv_question)
        ivImage = findViewById(R.id.iv_image)
        tvOptionOne = findViewById(R.id.tv_option_one)
        tvOptionTwo = findViewById(R.id.tv_option_two)
        tvOptionThree = findViewById(R.id.tv_option_three)
        tvOptionFour = findViewById(R.id.tv_option_four)

        buttonSubmit = findViewById(R.id.btn_submit)
        mQuestionsList = Constants.getQuestions()


        setQuestion()

        tvOptionOne?.setOnClickListener(this)
        tvOptionTwo?.setOnClickListener(this)
        tvOptionThree?.setOnClickListener(this)
        tvOptionFour?.setOnClickListener(this)

        buttonSubmit?.setOnClickListener (this)
        
    }


    private fun setQuestion() {
        /*
        This method updates the UI with the current question's details. 
        It checks if the user is on the last question to change the submit button text to "FINISH".
        Question text and options, along with the question image, are set here.
        */
        val question: Question = mQuestionsList!![mCurrentPosition - 1]
        defaultOptionsView()
        
    }

    override fun onClick(view: View?) {
        /*
        This method is where you would handle click events for the option TextViews and the submit button.
        (such as validating the selected answer, navigating to the next question, or finishing the quiz).
        */
        when (view?.id) {
            R.id.tv_option_one -> {}
            R.id.tv_option_two -> {}
            R.id.tv_option_three -> {}
            R.id.tv_option_four -> {}
            R.id.btn_submit->{}
        }
    }


    // `answerView` and `selectedOptionView` Methods would typically be used for updating the UI to reflect the selected option and the correct/incorrect status of an attempted question.
    
    private fun answerView(answer: Int, drawableView: Int) {
        when (answer) {
            1 -> {}
            2 -> {}
            3 -> {}
            4 -> {}
        }
    }
    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum
        tv.setTextColor()
        tv.setTypeface()
        tv.background = ContextCompat.getDrawable()
    }


    private fun defaultOptionsView() {
        // This method is particularly useful when navigating to a new question, ensuring that all options are reset before the new question is displayed.
        
        val options = ArrayList<TextView>()
        tvOptionOne?.let {
            options.add(0, it)
        }
        tvOptionTwo?.let {
            options.add(1, it)
        }
        tvOptionThree?.let {
            options.add(2, it)
        }
        tvOptionFour?.let {
            options.add(3,it)
        }

        for (option in options) {}
    }
}

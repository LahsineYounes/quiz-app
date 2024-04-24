package com.example.quizzapp

object Constants {

    const val USER_Name : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"


    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            QuestionNbr, "The_Question", drawable, 
            "answer_1", "answer_2", "answer_3", "answer_4", 
            nbrOfCorrectAnswer
        )

        questionsList.add(que1)

        val que2 = Question(
            QuestionNbr, "The_Question", drawable, 
            "answer_1", "answer_2", "answer_3", "answer_4", 
            nbrOfCorrectAnswer
        )

        questionsList.add(que2)

        val que3 = Question(
            QuestionNbr, "The_Question", drawable, 
            "answer_1", "answer_2", "answer_3", "answer_4", 
            nbrOfCorrectAnswer
        )

        questionsList.add(que3)

        val que4 = Question(
            QuestionNbr, "The_Question", drawable, 
            "answer_1", "answer_2", "answer_3", "answer_4", 
            nbrOfCorrectAnswer
        )

        questionsList.add(que4)

        val que5 = Question(
            QuestionNbr, "The_Question", drawable, 
            "answer_1", "answer_2", "answer_3", "answer_4", 
            nbrOfCorrectAnswer
        )

        questionsList.add(que5)

        val que6 = Question(
            QuestionNbr, "The_Question", drawable, 
            "answer_1", "answer_2", "answer_3", "answer_4", 
            nbrOfCorrectAnswer
        )

        questionsList.add(que6)

        val que7 = Question(
            QuestionNbr, "The_Question", drawable, 
            "answer_1", "answer_2", "answer_3", "answer_4", 
            nbrOfCorrectAnswer
        )

        questionsList.add(que7)

        val que8 = Question(
            QuestionNbr, "The_Question", drawable, 
            "answer_1", "answer_2", "answer_3", "answer_4", 
            nbrOfCorrectAnswer
        )

        questionsList.add(que8)

        val que9 = Question(
            QuestionNbr, "The_Question", drawable, 
            "answer_1", "answer_2", "answer_3", "answer_4", 
            nbrOfCorrectAnswer
        )

        questionsList.add(que9)

        val que10 = Question(
            QuestionNbr, "The_Question", drawable, 
            "answer_1", "answer_2", "answer_3", "answer_4", 
            nbrOfCorrectAnswer
        )

        questionsList.add(que10)

        return questionsList
    }

}

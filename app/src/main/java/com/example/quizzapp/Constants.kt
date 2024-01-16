package com.example.quizzapp

object Constants {

    const val USER_Name : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"


    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.flag_of_morocco,
            "Albania", "China",
            "Morocco", "Colombia", 3
        )

        questionsList.add(que1)

        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.flag_of_botsswana,
            "Argentina", "Botswana",
            "Nicaragua", "Honduras", 2
        )

        questionsList.add(que2)

        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.flag_of_costarica,
            "Panama", "Thailand",
            "Russia", "Costa Rica", 4
        )

        questionsList.add(que3)

        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.flag_of_djibouti,
            "Djibouti", "Uzbekistan",
            "Sierra Leone", "Gabon", 1
        )

        questionsList.add(que4)

        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.flag_of_estonia,
            "Finland", "North Korea",
            "Botswana", "Estonia", 4
        )

        questionsList.add(que5)

        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.flag_of_finland,
            "Iceland", "Finland",
            "Greece", "Estonia", 2
        )

        questionsList.add(que6)

        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.flag_of_greece,
            "Finland", "Norway",
            "Greece", "Uruguay", 3
        )

        questionsList.add(que7)

        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.flag_of_hongkong,
            "Vietnam", "Hong Kong",
            "China", "Tunisia", 2
        )

        questionsList.add(que8)

        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.flag_of_iran,
            "Iran", "Tajikistan",
            "Mexico", "Hungary", 1
        )

        questionsList.add(que9)

        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.flag_of_japan,
            "Canada", "Singapore",
            "Monaco", "Japan", 4
        )

        questionsList.add(que10)

        return questionsList
    }

}
package android.example.myquizapp

object Constants {
    fun getQuestions():ArrayList<Question>{
        val questionsList=ArrayList<Question>()
        val ques1=Question(
            1,
            "What country does this flag belong to?",
             R.drawable.india,
            "Argentina",
            "Pakistan",
            "India",
            "Germany",
            3
        )
        questionsList.add(ques1)
        //Q2
        val ques2=Question(
            2,
            "What country does this flag belong to?",
            R.drawable.pakistan,
            "Pakistan",
            "Mexico",
            "Thailand",
            "Switzerland",
            1
        )
        questionsList.add(ques2)
        //Q3
        val ques3=Question(
            3,
            "What country does this flag belong to?",
            R.drawable.den,
            "Brazil",
            "Russia",
            "Ukraine",
            "Denmark",
            4
        )
        questionsList.add(ques3)
        //Q4
        val ques4=Question(
            4,
            "What country does this flag belong to?",
            R.drawable.az,
            "Spain",
            "Azerbaijan",
            "China",
            "Netherlands",
            2
        )
        questionsList.add(ques4)
        return questionsList
    }
}
package cl.desafiolatam.desafiopregunta.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Question {

    @SerializedName("correct_answer")
    private boolean correctAnswer;
    @SerializedName("incorrect_answer")
    private List<Boolean> incorrectAnswer;
    private String category, type, difficulty, question;

    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getQuestion() {
        return question;
    }

    public boolean isCorrectAnswer() {
        return correctAnswer;
    }

    public List<Boolean> getIncorrectAnswer() {
        return incorrectAnswer;
    }


}

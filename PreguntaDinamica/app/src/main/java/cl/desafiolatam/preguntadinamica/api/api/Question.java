package cl.desafiolatam.preguntadinamica.api.api;

import com.google.gson.annotations.SerializedName;
public class Question {

    private String category;
    private String type;
    private String difficulty;
    private String question;

    @SerializedName("correct_answer")
    private boolean correct_answer;

    @SerializedName("incorrect_answer")
    private boolean incorrect_answer;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isCorrect_answer() {
        return correct_answer;
    }

    public void setCorrect_answer(boolean correct_answer) {
        this.correct_answer = correct_answer;
    }

    public boolean isIncorrect_answer() {
        return incorrect_answer;
    }

    public void setIncorrect_answer(boolean incorrect_answer) {
        this.incorrect_answer = incorrect_answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "category='" + category + '\'' +
                ", type='" + type + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", question='" + question + '\'' +
                ", correct_answer=" + correct_answer +
                ", incorrect_answer=" + incorrect_answer +
                '}';
    }
}


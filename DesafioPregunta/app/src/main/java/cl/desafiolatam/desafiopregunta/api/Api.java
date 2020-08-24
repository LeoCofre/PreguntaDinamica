package cl.desafiolatam.desafiopregunta.api;

import cl.desafiolatam.desafiopregunta.models.Result;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("/api.php?amount=10&category=15&difficulty=easy")
    Call<Result> getAllQuestions();
}

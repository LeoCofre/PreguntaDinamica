package cl.desafiolatam.desafiopregunta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

import cl.desafiolatam.desafiopregunta.api.Api;
import cl.desafiolatam.desafiopregunta.api.RetrofitClient;
import cl.desafiolatam.desafiopregunta.models.Question;
import cl.desafiolatam.desafiopregunta.models.Result;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Mostrar fragmento en Activity
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, new MainFragment())
                .commit();

        Api apiService = RetrofitClient.getInsance().create(Api.class);
        Call<Result>call=apiService.getAllQuestions();
        call.enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                List <Question> questionList = response.body().getResults();
                Toast.makeText(MainActivity.this,questionList.get(0).getQuestion(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {

            }
        });
    }

}

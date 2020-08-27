package cl.desafiolatam.preguntadinamica.view;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.security.acl.Group;

import cl.desafiolatam.preguntadinamica.R;
import cl.desafiolatam.preguntadinamica.model.Pregunta;
import cl.desafiolatam.preguntadinamica.model.PreguntaPojo;
import cl.desafiolatam.preguntadinamica.model.api.Api;
import cl.desafiolatam.preguntadinamica.model.api.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class PreguntaFragment extends Fragment {

    protected Pregunta pregunta;

    public PreguntaFragment() {
        // Required empty public constructor
    }


    public static PreguntaFragment newInstance() {
        PreguntaFragment fragment = new PreguntaFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vista = inflater.inflate(R.layout.fragment_pregunta, container, false);

        return llamarRetrofit(vista);
    }

    public View llamarRetrofit(View vista) {
        Api servicio = RetrofitClient.getRetrofitInstance().create(Api.class);
        Pregunta otraPregunta = null;


        Call<PreguntaPojo> listCall = servicio.llamarPregunta();
        listCall.enqueue(new Callback<PreguntaPojo>() {
            @Override
            public void onResponse(Call<PreguntaPojo> call, Response<PreguntaPojo> response) {
                Log.d("Leo", response.toString());
                pregunta = response.body().getResults().get(0);
                Log.d("Leo", pregunta.toString());
                iniciarVistas(vista);

            }

            @Override
            public void onFailure(Call<PreguntaPojo> call, Throwable t) {
                Log.d("Leo", "onFailure: ");

            }
        });


        return vista;
    }

    public void iniciarVistas(View vista) {
        TextView categoria = vista.findViewById(R.id.Categoria);
        TextView pregunta = vista.findViewById(R.id.Pregunta);
        TextView dificultad = vista.findViewById(R.id.Dificultad);
        RadioGroup botones= vista.findViewById(R.id.botones);
        RadioButton correcto = vista.findViewById(R.id.Correcto);
        RadioButton incorrecto = vista.findViewById(R.id.Incorrecto);
        categoria.setText(this.pregunta.getCategory());
        pregunta.setText(this.pregunta.getQuestion());
        dificultad.setText(this.pregunta.getDifficulty());
        correcto.setText(this.pregunta.getCorrect_answer());
        incorrecto.setText(this.pregunta.getIncorrect_answers().get(0));

    }
}

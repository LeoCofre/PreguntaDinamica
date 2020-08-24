package cl.desafiolatam.preguntadinamica.ui.desafio3;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cl.desafiolatam.preguntadinamica.R;

public class Desafio3Fragment extends Fragment {

    private Desafio3ViewModel mViewModel;

    public static Desafio3Fragment newInstance() {
        return new Desafio3Fragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.desafio3_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(Desafio3ViewModel.class);
        // TODO: Use the ViewModel
    }

}

package es.studium.practicamovil2laverda.boton3;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import es.studium.practicamovil2laverda.R;

public class FragmentGatoImg extends Fragment {


    public FragmentGatoImg() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_gato_img, container, false);
    }

}

package es.studium.practicamovil2laverda.boton3;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import es.studium.practicamovil2laverda.R;


public class FragmentPerroImg extends Fragment {


    public FragmentPerroImg() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
      @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragment_perro_img, container, false);
    }


}

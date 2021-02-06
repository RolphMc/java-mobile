package com.rolph.avaliadorimvelonline_calculadora.view;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.rolph.avaliadorimvelonline_calculadora.R;

public class ResultActivit extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        this.mViewHolder.resultadoValor = findViewById(R.id.resultado_valor);
        Bundle extras = getIntent().getExtras();
        String vO = extras.getString("Chave");
        this.mViewHolder.resultadoValor.setText(vO);

    }
    private static class ViewHolder{
        TextView resultadoValor;

    }
}

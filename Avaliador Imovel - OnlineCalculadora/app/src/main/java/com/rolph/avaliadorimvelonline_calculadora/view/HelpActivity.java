package com.rolph.avaliadorimvelonline_calculadora.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.rolph.avaliadorimvelonline_calculadora.R;

import org.w3c.dom.Text;

public class HelpActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);


        this.mViewHolder.mainTitle = findViewById(R.id.title_help);
        this.mViewHolder.mainText = findViewById(R.id.body_help);

        this.mViewHolder.aplicativo = findViewById(R.id.help_sobre_title);
        this.mViewHolder.desenvolvimentoTitle = findViewById(R.id.help_Desenvolvimento_title);
        this.mViewHolder.objetivoTitle = findViewById(R.id.help_Objetivo_title);
        this.mViewHolder.funcionamentoTitle = findViewById(R.id.help_Funcionamento_title);
        this.mViewHolder.privativaTitle = findViewById(R.id.help_area_privativa_title);
        this.mViewHolder.acabamentoTitle = findViewById(R.id.help_padroes_de_acabamento_title);
        this.mViewHolder.acabamento1 = findViewById(R.id.help_padroes_de_acabamento_1);
        this.mViewHolder.acabamento2 = findViewById(R.id.help_padroes_de_acabamento_2);
        this.mViewHolder.acabamento3 = findViewById(R.id.help_padroes_de_acabamento_3);
        this.mViewHolder.acabamento4 = findViewById(R.id.help_padroes_de_acabamento_4);
        this.mViewHolder.acabamento5 = findViewById(R.id.help_padroes_de_acabamento_5);
        this.mViewHolder.conservacaoTitle = findViewById(R.id.help_estado_de_conservacao_title);
        this.mViewHolder.conservacao1 = findViewById(R.id.help_estado_de_conservacao_1);
        this.mViewHolder.conservacao2 = findViewById(R.id.help_estado_de_conservacao_2);
        this.mViewHolder.conservacao3 = findViewById(R.id.help_estado_de_conservacao_3);
        this.mViewHolder.conservacao4 = findViewById(R.id.help_estado_de_conservacao_4);
        this.mViewHolder.conservacao5 = findViewById(R.id.help_estado_de_conservacao_5);

        //ativar corpo do texto principal
        Bundle extras = getIntent().getExtras();
        String maintitle = extras.getString("help_main_title");
        String mainText = extras.getString("help_main_text");
        this.mViewHolder.mainTitle.setText(maintitle);
        this.mViewHolder.mainText.setText(mainText);

        this.mViewHolder.aplicativo.setOnClickListener(this);
        this.mViewHolder.desenvolvimentoTitle.setOnClickListener(this);
        this.mViewHolder.objetivoTitle.setOnClickListener(this);
        this.mViewHolder.funcionamentoTitle.setOnClickListener(this);
        this.mViewHolder.privativaTitle.setOnClickListener(this);
        this.mViewHolder.acabamentoTitle.setOnClickListener(this);
        this.mViewHolder.acabamento1.setOnClickListener(this);
        this.mViewHolder.acabamento2.setOnClickListener(this);
        this.mViewHolder.acabamento3.setOnClickListener(this);
        this.mViewHolder.acabamento4.setOnClickListener(this);
        this.mViewHolder.acabamento5.setOnClickListener(this);
        this.mViewHolder.conservacaoTitle.setOnClickListener(this);
        this.mViewHolder.conservacao1.setOnClickListener(this);
        this.mViewHolder.conservacao2.setOnClickListener(this);
        this.mViewHolder.conservacao3.setOnClickListener(this);
        this.mViewHolder.conservacao4.setOnClickListener(this);
        this.mViewHolder.conservacao5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent (this, HelpActivity.class);
        String mainTitle = null;
        String mainText = null;

        if(v.getId() == R.id.help_sobre_title){
            mainTitle = getString(R.string.help_sobre_title);
            mainText = getString(R.string.help_sobre_body);
        } if(v.getId() == R.id.help_Desenvolvimento_title){
            mainTitle = getString(R.string.help_Desenvolvimento_title);
            mainText = getString(R.string.help_Desenvolvimento_body);
        } if(v.getId() == R.id.help_Objetivo_title){
            mainTitle = getString(R.string.help_Objetivo_title);
            mainText = getString(R.string.help_Objetivo_body);
        } if(v.getId() == R.id.help_Funcionamento_title){
            mainTitle = getString(R.string.help_Funcionamento_title);
            mainText = getString(R.string.help_Funcionamento_body);
        } if(v.getId() == R.id.help_area_privativa_title){
            mainTitle = getString(R.string.help_area_privativa_title);
            mainText = getString(R.string.help_area_privativa_body);
        } if(v.getId() == R.id.help_padroes_de_acabamento_title){
            mainTitle = getString(R.string.help_padroes_de_acabamento_title);
            mainText = getString(R.string.help_padroes_de_acabamento_body);
        } if(v.getId() == R.id.help_padroes_de_acabamento_1){
            mainTitle = getString(R.string.help_padroes_de_acabamento_1);
            mainText = getString(R.string.help_padroes_de_acabamento_11);
        } if(v.getId() == R.id.help_padroes_de_acabamento_2){
            mainTitle = getString(R.string.help_padroes_de_acabamento_2);
            mainText = getString(R.string.help_padroes_de_acabamento_21);
        } if(v.getId() == R.id.help_padroes_de_acabamento_3){
            mainTitle = getString(R.string.help_padroes_de_acabamento_3);
            mainText = getString(R.string.help_padroes_de_acabamento_31);
        } if(v.getId() == R.id.help_padroes_de_acabamento_4){
            mainTitle = getString(R.string.help_padroes_de_acabamento_4);
            mainText = getString(R.string.help_padroes_de_acabamento_41);
        } if(v.getId() == R.id.help_padroes_de_acabamento_5){
            mainTitle = getString(R.string.help_padroes_de_acabamento_5);
            mainText = getString(R.string.help_padroes_de_acabamento_51);
        } if(v.getId() == R.id.help_estado_de_conservacao_title){
            mainTitle = getString(R.string.help_estado_de_conservação_title);
            mainText = getString(R.string.help_estado_de_conservação_body);
        } if(v.getId() == R.id.help_estado_de_conservacao_1){
            mainTitle = getString(R.string.help_estado_de_conservação_1);
            mainText = getString(R.string.help_estado_de_conservação_11);
        } if(v.getId() == R.id.help_estado_de_conservacao_2){
            mainTitle = getString(R.string.help_estado_de_conservação_2);
            mainText = getString(R.string.help_estado_de_conservação_21);
        } if(v.getId() == R.id.help_estado_de_conservacao_3){
            mainTitle = getString(R.string.help_estado_de_conservação_3);
            mainText = getString(R.string.help_estado_de_conservação_31);
        }  if(v.getId() == R.id.help_estado_de_conservacao_4){
            mainTitle = getString(R.string.help_estado_de_conservação_4);
            mainText = getString(R.string.help_estado_de_conservação_41);
        } if(v.getId() == R.id.help_estado_de_conservacao_5){
            mainTitle = getString(R.string.help_estado_de_conservação_5);
            mainText = getString(R.string.help_estado_de_conservação_51);
        }

        intent.putExtra("help_main_title", mainTitle);
        intent.putExtra("help_main_text", mainText);
        startActivity(intent);
    }

    private static class ViewHolder{
        TextView mainTitle;
        TextView mainText;

        TextView aplicativo;
        TextView desenvolvimentoTitle;
        TextView objetivoTitle;
        TextView funcionamentoTitle;
        TextView privativaTitle;
        TextView acabamentoTitle;
        TextView acabamento1;
        TextView acabamento2;
        TextView acabamento3;
        TextView acabamento4;
        TextView acabamento5;
        TextView conservacaoTitle;
        TextView conservacao1;
        TextView conservacao2;
        TextView conservacao3;
        TextView conservacao4;
        TextView conservacao5;

    }
}

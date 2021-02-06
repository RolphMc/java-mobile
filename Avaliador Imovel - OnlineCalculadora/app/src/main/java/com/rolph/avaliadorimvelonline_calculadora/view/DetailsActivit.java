package com.rolph.avaliadorimvelonline_calculadora.view;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.rolph.avaliadorimvelonline_calculadora.R;
import com.rolph.avaliadorimvelonline_calculadora.support.Calculation;
import com.rolph.avaliadorimvelonline_calculadora.support.LoadElements;

public class DetailsActivit extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {
    /*Ciclo de Vida Activity
    https://developer.android.com/guide/components/activities/activity-lifecycle?hl=pt-br*/

    private LoadElements loadelements = new LoadElements();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_details);

        //MOTIVO
        loadelements.setAreaMotivo((EditText) findViewById(R.id.reason_area_input));
        loadelements.setVagaGaragemMotivo(this, (Spinner) findViewById(R.id.space_parking_input));
        loadelements.setPadraoAcabamentoMotivo(this, (Spinner) findViewById(R.id.finishing_pattern_input));
        loadelements.setEstadoConservacaoMotivo(this, (Spinner) findViewById(R.id.conservation_state_input));

        //AMOSTRA 1
        loadelements.setValorAmostra1((EditText) findViewById(R.id.sample1_value_input));
        loadelements.setAreaAmostra1((EditText) findViewById(R.id.sample1_area_input));
        loadelements.setVagaGaragemAmostra1(this, (Spinner) findViewById(R.id.sample1_Parking_space_input));
        loadelements.setPadraoAcabamentoAmostra1(this, (Spinner) findViewById(R.id.sample1_finishing_pattern_input));
        loadelements.setEstadoConservacaoAmostra1(this, (Spinner) findViewById(R.id.sample1_conservation_state_input));

        //AMOSTRA 2
        loadelements.setValorAmostra2((EditText) findViewById(R.id.sample2_value_input));
        loadelements.setAreaAmostra2((EditText) findViewById(R.id.sample2_area_input));
        loadelements.setVagaGaragemAmostra2(this, (Spinner) findViewById(R.id.sample2_parking_space_input));
        loadelements.setPadraoAcabamentoAmostra2(this, (Spinner) findViewById(R.id.sample2_finishing_pattern_input));
        loadelements.setEstadoConservacaoAmostra2(this, (Spinner) findViewById(R.id.sample2_conservation_state_input));

        //AMOSTRA 3
        loadelements.setValorAmostra3((EditText) findViewById(R.id.sample3_value_input));
        loadelements.setAreaAmostra3((EditText) findViewById(R.id.sample3_area_input));
        loadelements.setVagaGaragemAmostra3(this, (Spinner) findViewById(R.id.sample3_parking_space_input));
        loadelements.setPadraoAcabamentoAmostra3(this, (Spinner) findViewById(R.id.sample3_finishing_pattern_input));
        loadelements.setEstadoConservacaoAmostra3(this, (Spinner) findViewById(R.id.sample3_conservation_state_input));

        loadelements.setCalculateButton((Button) findViewById(R.id.calculate_result));
        loadelements.getCalculateButton().setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.calculate_result) {
            try {
                //MOTIVO
                Double fAMotivo = loadelements.getAreAMotivo();
                Double fVgMotivo = loadelements.getVagaGaragemMotivo();
                Double fPaMotivo = loadelements.getPadraoAcabamentoMotivo();
                Double fEcMotivo = loadelements.getEstadoConservacaoMotivo();

                //AMOSTRA 1
                Double vnhAmostra1 = loadelements.getValorAmostra1();
                Double fAAmostra1 = loadelements.getAreaAmostra1();
                Double fVgAmostra1 = loadelements.getVagaGaragemAmostra1();
                Double fPaAmostra1 = loadelements.getPadraoAcabamentoAmostra1();
                Double fEcAmostra1 = loadelements.getEstadoConservacaoAmostra1();

                //AMOSTRA 2
                Double vnhAmostra2 = loadelements.getValorAmostra2();
                Double fAAmostra2 = loadelements.getAreaAmostra2();
                Double fVgAmostra2 = loadelements.getVagaGaragemAmostra2();
                Double fPaAmostra2 = loadelements.getPadraoAcabamentoAmostra2();
                Double fEcAmostra2 = loadelements.getEstadoConservacaoAmostra2();

                //AMOSTRA 3
                Double vnhAmostra3 = loadelements.getValorAmostra3();
                Double fAAmostra3 = loadelements.getAreaAmostra3();
                Double fVgAmostra3 = loadelements.getVagaGaragemAmostra3();
                Double fPaAmostra3 = loadelements.getPadraoAcabamentoAmostra3();
                Double fEcAmostra3 = loadelements.getEstadoConservacaoAmostra3();

                //HOMOGENEIZAÇÃO
                Calculation calculation = new Calculation();
                Double vhAmostra1 = calculation.homogenization(vnhAmostra1, fAAmostra1, fPaMotivo, fPaAmostra1, fEcMotivo,
                        fEcAmostra1, fVgMotivo, fVgAmostra1, fAMotivo);
                Double vhAmostra2 = calculation.homogenization(vnhAmostra2, fAAmostra2, fPaMotivo, fPaAmostra2, fEcMotivo,
                        fEcAmostra2, fVgMotivo, fVgAmostra2, fAMotivo);
                Double vhAmostra3 = calculation.homogenization(vnhAmostra3, fAAmostra3, fPaMotivo, fPaAmostra3, fEcMotivo,
                        fEcAmostra3, fVgMotivo, fVgAmostra3, fAMotivo);

                //RESULTADO FINAL - VALOR DE OPERAÇÃO
                Intent intent = new Intent(this, ResultActivit.class);
                intent.putExtra("Chave", String.valueOf(calculation.getDispersionCalculation(vhAmostra1, vhAmostra2, vhAmostra3)));
                startActivity(intent);

            } catch (Exception NumberFormatException) {
                new AlertDialog.Builder(this)
                        .setTitle(R.string.alertdialog_title_campos_vazios)
                        .setMessage(R.string.alertdialog_campo_vazio)
                        .setPositiveButton(R.string.alertdialog_ok, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        })
                        .show();
            }
        }
    }

    private double sampleStandart(int valor) {
        if (valor == 1) {
            return 0.7;
        }
        if (valor == 2) {
            return 0.8375;
        }
        if (valor == 3) {
            return 0.975;
        }
        if (valor == 4) {
            return 1.1125;
        }
        if (valor == 5) {
            return 1.25;
        }
        return 0;
    }

    private Integer parkingSpace(String valor) {
        int iValor = Integer.parseInt(valor);
        if (iValor == 0) {
            return 95;
        }
        if (iValor == 1) {
            return 100;
        }
        if (iValor == 2) {
            return 105;
        }
        if (iValor == 3) {
            return 110;
        }
        if (iValor == 4) {
            return 115;
        }
        if (iValor == 5) {
            return 120;
        }
        if (iValor == 6) {
            return 125;
        }
        if (iValor == 7) {
            return 130;
        }
        if (iValor == 8) {
            return 135;
        }
        if (iValor == 9) {
            return 140;
        }
        if (iValor == 10) {
            return 145;
        }
        return 0;
    }

    private double conservationState(int valor) {
        if (valor == 1) {
            return 0.8;
        }
        if (valor == 2) {
            return 0.85;
        }
        if (valor == 3) {
            return 0.90;
        }
        if (valor == 4) {
            return 0.95;
        }
        if (valor == 5) {
            return 1;
        }
        return 0;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}

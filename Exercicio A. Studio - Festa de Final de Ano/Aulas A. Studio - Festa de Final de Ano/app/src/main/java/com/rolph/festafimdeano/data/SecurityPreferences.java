package com.rolph.festafimdeano.data;

import android.content.Context;
import android.content.SharedPreferences;

public class SecurityPreferences {

    /*Funciona de forma SIMILAR a um banco de dados (não é um BD) - armazena
    * informações mesmo depois de a aplicação ter fechado - Se a aplicação for
    * desinstalada, tudo é perdido - Esse recurso apenas grava dados SIMPLES*/

    /* Abaixo temos a criação de uma variável privada "SharedPreferences"
    * privada porque não queremos que nenhuma outra classe acesse ela*/
    private SharedPreferences mSharedPreferences;

    //CONSTRUTOR - para quando essa classe for instanciada

    public SecurityPreferences(Context mContext) {
        this.mSharedPreferences = mContext.getSharedPreferences("FestaFimAno", Context.MODE_PRIVATE);
        //Context MODE_Private - significa que ninguém, fora da aplicação "FestaFimAno" pode acessar tal propriedade
    }

    public void storeString(String key, String value){
        this.mSharedPreferences.edit().putString(key, value).apply();
    }

    public String getStoreString(String key) {
        return this.mSharedPreferences.getString(key, "");
    }

}

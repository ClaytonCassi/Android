package com.example.clayton.trabalhoambientesmoveis;

import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class ImcActivity extends ActionBarActivity implements View.OnClickListener{

    EditText etPeso,etAltura;
    Button btn_limpar, btn_calcular;
    double imc, peso, altura;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);


        etPeso = (EditText)findViewById(R.id.et_peso);
        etAltura= (EditText)findViewById(R.id.et_altura);

        btn_calcular = (Button)findViewById(R.id.btn_calcular);
        btn_limpar = (Button)findViewById(R.id.btn_limpar);


        peso = (Double.parseDouble(etPeso.getText().toString()));
        altura = (Double.parseDouble(etAltura.getText().toString()));
        altura = altura/100;
        imc = peso / (altura*altura);

    }


    @Override
    public void onClick(View v) {
                if (imc < 17 ){
                    AlertDialog.Builder alerta = new AlertDialog.Builder(ImcActivity.this);
                    alerta.setTitle("Resultado do IMC");
                            alerta.setMessage("Seu IMC é de" + imc + "Portanto seu peso está muito abaixo do recomendado");
                    alerta.setNeutralButton("OK", null);
                    alerta.show();

                } else if (imc >= 17 && imc < 18.5 ) {
                    AlertDialog.Builder alerta = new AlertDialog.Builder(ImcActivity.this);
                    alerta.setTitle("Resultado do IMC");
                    alerta.setMessage("Seu IMC é de" + imc + "Portanto seu peso está abaixo do recomendado");
                    alerta.setNeutralButton("OK", null);
                    alerta.show();

                } else if (imc >= 18.5 && imc < 25 ) {
                    AlertDialog.Builder alerta = new AlertDialog.Builder(ImcActivity.this);
                    alerta.setTitle("Resultado do IMC");
                    alerta.setMessage("Seu IMC é de" + imc + "Portanto seu peso está dentro do recomendado");
                    alerta.setNeutralButton("OK", null);
                    alerta.show();

                }                 else if (imc >= 25 && imc < 30 ) {
                    AlertDialog.Builder alerta = new AlertDialog.Builder(ImcActivity.this);
                    alerta.setTitle("Resultado do IMC");
                    alerta.setMessage("Seu IMC é de" + imc + "Portanto seu peso está acima do recomendado");
                    alerta.setNeutralButton("OK", null);
                    alerta.show();

                } else if (imc >= 30 && imc < 35 ) {
                    AlertDialog.Builder alerta = new AlertDialog.Builder(ImcActivity.this);
                    alerta.setTitle("Resultado do IMC");
                    alerta.setMessage("Seu IMC é de" + imc + "Portanto seu peso está  bem acima do recomendado, considerado obesidade I");
                    alerta.setNeutralButton("OK", null);
                    alerta.show();

                }
                else if (imc >= 35 && imc < 40 ) {
                    AlertDialog.Builder alerta = new AlertDialog.Builder(ImcActivity.this);
                    alerta.setTitle("Resultado do IMC");
                    alerta.setMessage("Seu IMC é de" + imc + "Portanto seu peso está  bem acima do recomendado, considerado obesidade II (Severa)");
                    alerta.setNeutralButton("OK", null);
                    alerta.show();

                }  else if (imc >= 40 ) {
                    AlertDialog.Builder alerta = new AlertDialog.Builder(ImcActivity.this);
                    alerta.setTitle("Resultado do IMC");
                    alerta.setMessage("Seu IMC é de" + imc + "Portanto seu peso está  bem acima do recomendado, considerado obesidade III (Morbida)");
                    alerta.setNeutralButton("OK", null);
                    alerta.show();

                }



    }
}

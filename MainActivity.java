package com.example.clayton.trabalhoambientesmoveis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity  implements View.OnClickListener{


    TextView edTelaImc, edTelaCalculadora, edTelaInsta;
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);

        edTelaImc = (TextView) findViewById(R.id.edTelaImc);
        edTelaCalculadora = (TextView) findViewById(R.id.edTelaCalculadora);
       edTelaInsta = (TextView) findViewById(R.id.edTelaInsta);

       /* edTelaImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaimc = new Intent(MainActivity.this, ImcActivity.class);
                startActivity(telaimc);
            }
        });

        */
	}


    @Override
    public void onClick(View v) {
                    if (v == edTelaImc) {
                        Intent telaimc = new Intent(MainActivity.this, ImcActivity.class);
                        startActivity(telaimc);
                    }
    }
}

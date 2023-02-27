package com.example.calculadora_tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonSuma, buttonResta, buttonMulti, buttonDiv;
    EditText editTextN1, editTextN2;
    TextView textView;

    int num1, num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSuma= findViewById(R.id.btn_suma);
        buttonResta= findViewById(R.id.btn_resta);
        buttonMulti= findViewById(R.id.btn_multiplicacion);
        buttonDiv= findViewById(R.id.btn_division);

        editTextN1= findViewById(R.id.numero1);
        editTextN2= findViewById(R.id.numero2);

        textView= findViewById(R.id.respuesta);

        buttonSuma.setOnClickListener(this);
        buttonResta.setOnClickListener(this);
        buttonMulti.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
    }

    public int getIntFromEditText(EditText editText){
        if(editText.getText().toString().equals("")) {
            Toast.makeText(this, "Ingresa un numero ", Toast.LENGTH_SHORT).show();
            return 0;
        }else
            return Integer.parseInt(editText.getText().toString());

    }

    @Override
    public void onClick(View view) {
        num1 = getIntFromEditText(editTextN1);
        num2= getIntFromEditText(editTextN2);

        switch(view.getId()){
            case R.id.btn_suma:
                textView.setText("respuesta = " + (num1 + num2));
                break;
            case R.id.btn_resta:
                textView.setText("respuesta = " + (num1 - num2));
                break;
            case R.id.btn_multiplicacion:
                textView.setText("respuesta = " + (num1 * num2));
                break;
            case R.id.btn_division:
                textView.setText("respuesta = " + ((float)num1 / (float) num2));
                break;
        }



    }
}
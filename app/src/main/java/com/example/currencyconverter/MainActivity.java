package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view){
        Double value=0.0;
        EditText myTextField =  findViewById(R.id.editText2);
        String dollar = myTextField.getText().toString();
        if(!dollar.isEmpty())
            try
            {
                value= Double.parseDouble(dollar);
                // it means it is double
            } catch (Exception e1) {
                // this means it is not double
                e1.printStackTrace();
            }
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        value = value * 0.77;
        String resStr = Double.toString(value);
        goToActivity2(resStr);
    }

    public void goToActivity2(String str){
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("message",str);
        startActivity(intent);
    }

}

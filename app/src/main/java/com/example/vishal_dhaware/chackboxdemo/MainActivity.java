package com.example.vishal_dhaware.chackboxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox android, java, python, php, unity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android = findViewById(R.id.Android);
        java = findViewById(R.id.Java);
        python = findViewById(R.id.Python);
        php = findViewById(R.id.PHP);
        unity = findViewById(R.id.Unity_3D);
        android.setOnClickListener(this);
        java.setOnClickListener(this);
        python.setOnClickListener(this);
        php.setOnClickListener(this);
        unity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Android:
                if (android.isChecked())
                    Toast.makeText(getApplicationContext(),"Android ",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Java:
                if (java.isChecked())
                    Toast.makeText(getApplicationContext(),"Java ",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Python:
                if (python.isChecked())
                    Toast.makeText(getApplicationContext(),"Python ",Toast.LENGTH_SHORT).show();
                break;
            case R.id.PHP:
                if (php.isChecked())
                    Toast.makeText(getApplicationContext(),"Php ",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Unity_3D:
                if (unity.isChecked())
                    Toast.makeText(getApplicationContext(),"Unity 3D ",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
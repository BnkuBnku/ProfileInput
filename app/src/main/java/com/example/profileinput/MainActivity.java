package com.example.profileinput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Name;
    RadioButton MaleRadio;
    RadioButton FemaleRadio;
    Spinner CivilStatus;
    Button Enter;
    Button Display;
    private int count = 1;
    private String ProfileDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = findViewById(R.id.editTextTextPersonName);
        MaleRadio = findViewById(R.id.maleradioButton);
        FemaleRadio = findViewById(R.id.femaleradioButton2);
        CivilStatus = findViewById(R.id.spinner);
        Enter = findViewById(R.id.button);
        Display = findViewById(R.id.button2);


        Enter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(MaleRadio.isChecked()){
                    if(CivilStatus.getSelectedItem().toString().equals("Married")){
                        ProfileDisplay +=    count + "." + "\n" +
                                            "Name - " + Name.getText().toString() + "\n" +
                                            "Gender - Male" + "\n" +
                                            "Status - Married" + "\n" +
                                            "Display - Mr. " + Name.getText().toString() + "\n\n";
                    }
                    else{
                        ProfileDisplay +=    count + "." + "\n" +
                                            "Name - " + Name.getText().toString() + "\n" +
                                            "Gender - Male" + "\n" +
                                            "Status - Single" + "\n" +
                                            "Display - Sir " + Name.getText().toString() + "\n\n" ;
                    }
                    Add();
                    Clear();
                    count++;
                }
                else if(FemaleRadio.isChecked()){
                    if(CivilStatus.getSelectedItem().toString().equals("Married")){
                        ProfileDisplay +=   count + "." + "\n" +
                                            "Name - " + Name.getText().toString() + "\n" +
                                            "Gender - Female" + "\n" +
                                            "Status - Married" + "\n" +
                                            "Display - Mrs. " + Name.getText().toString() + "\n\n";
                    }
                    else{
                        ProfileDisplay +=    count + "." + "\n" +
                                            "Name - " + Name.getText().toString() + "\n" +
                                            "Gender - Female" + "\n" +
                                            "Status - Single" + "\n" +
                                            "Display - Ms. " + Name.getText().toString() + "\n\n";
                    }
                    Add();
                    Clear();
                    count++;
                }
                else{
                    Toast.makeText(MainActivity.this, "Please choose gender identity" ,Toast.LENGTH_SHORT).show();
                }

            }
        });

        Display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,ProfileDisplay, Toast.LENGTH_LONG).show();
            }
        });

    }

    private void Clear(){
        Name.setText("");
        MaleRadio.setChecked(false);
        FemaleRadio.setChecked(false);
    }

    private void Add(){
        Toast.makeText(MainActivity.this, "Profile added!" ,Toast.LENGTH_SHORT).show();
    }
}
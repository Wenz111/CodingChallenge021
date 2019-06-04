package com.example.codingchallenge02_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE =
            "com.example..codingchallenge02_1.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondAcitivity.class);
        String message = "Displaying Text One Activity!";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void launchThirdActivity(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        String message1 = "Displaying Text Two Activity!";
        intent.putExtra(EXTRA_MESSAGE, message1);
        startActivity(intent);
    }

    public void launchFourthActivity(View view) {
        Intent intent = new Intent(this, FourthActivity.class);
        String message2 = "Displaying Text Three Activity!";
        intent.putExtra(EXTRA_MESSAGE, message2);
        startActivity(intent);
    }
}

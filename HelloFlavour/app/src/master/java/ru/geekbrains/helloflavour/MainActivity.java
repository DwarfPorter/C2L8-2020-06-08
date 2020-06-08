package ru.geekbrains.helloflavour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Data data = new Data();
        data.field1 = "ss";
        Toast.makeText(this, data.field1, Toast.LENGTH_SHORT).show();
    }
}
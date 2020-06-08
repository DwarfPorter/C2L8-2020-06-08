package ru.geekbrains.helloflavour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = new Data();
        data.field1 = "ss";
        Toast.makeText(this, data.field1, Toast.LENGTH_SHORT).show();

        Button buttonOk = findViewById(R.id.button);
        buttonOk.setEnabled(true);
    }
}
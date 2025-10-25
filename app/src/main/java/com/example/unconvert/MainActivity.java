package com.example.unconvert;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);

        button.setOnClickListener(v -> {
            String s = editText.getText().toString().trim();
            if (s.isEmpty()) {
                Toast.makeText(MainActivity.this, "Thanks for Using..", Toast.LENGTH_SHORT).show();
                return;
            }

            int kg = Integer.parseInt(s);
            double pound = 2.205 * kg;

            textView.setText("The Corresponding value in Pound is: " + pound);
        });
    }
}

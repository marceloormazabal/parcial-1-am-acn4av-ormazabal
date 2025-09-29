package com.example.marceapp;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etTask;
    private Button btnAdd;
    private LinearLayout containerTasks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTask = findViewById(R.id.etTask);
        btnAdd = findViewById(R.id.btnAdd);
        containerTasks = findViewById(R.id.containerTasks);

        // Evento: click del botón
        btnAdd.setOnClickListener(v -> addTask());
    }

    private void addTask() {
        String text = etTask.getText().toString().trim();
        if (TextUtils.isEmpty(text)) {
            etTask.setError("Escribe algo");
            return;
        }

        // Elemento dinámico creado en Java
        TextView tv = new TextView(this);
        tv.setText(text);
        tv.setTextSize(16); // 16sp
        int pad = (int) getResources().getDimension(R.dimen.space_8);
        tv.setPadding(pad, pad, pad, pad);

        // Click: tachar / destachar
        tv.setOnClickListener(view -> {
            TextView item = (TextView) view;
            int flags = item.getPaintFlags();
            if ((flags & Paint.STRIKE_THRU_TEXT_FLAG) != 0) {
                item.setPaintFlags(flags & (~Paint.STRIKE_THRU_TEXT_FLAG));
            } else {
                item.setPaintFlags(flags | Paint.STRIKE_THRU_TEXT_FLAG);
            }
        });

        // Long click: eliminar
        tv.setOnLongClickListener(view -> {
            containerTasks.removeView(view);
            return true;
        });

        containerTasks.addView(tv);
        etTask.setText("");
    }
}

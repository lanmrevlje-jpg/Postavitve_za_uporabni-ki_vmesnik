package com.example.postavitve_za_uporabniki_vmesnik;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button gumb=findViewById(R.id.button);
        gumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "To je toast", Toast.LENGTH_SHORT).show();
            }
        });

        Button count=findViewById(R.id.button2);
        TextView st=findViewById(R.id.textView2);
        Button zero=findViewById(R.id.button4);
        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                st.setText(String.valueOf(Integer.parseInt(st.getText().toString())+1));
                zero.setBackgroundTintList(
                        android.content.res.ColorStateList.valueOf(
                                android.graphics.Color.parseColor("#FF5555")
                        )
                );
                if(Integer.parseInt(st.getText().toString())%2==0){
                    v.setBackgroundTintList(
                            android.content.res.ColorStateList.valueOf(
                                    android.graphics.Color.parseColor("#550000")
                            )
                    );
                }
                else{
                    v.setBackgroundTintList(
                            android.content.res.ColorStateList.valueOf(
                                    android.graphics.Color.parseColor("#005500")
                            )
                    );
                }
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                st.setText("0");
                v.setBackgroundTintList(
                        android.content.res.ColorStateList.valueOf(
                                android.graphics.Color.parseColor("#666666")
                        )
                );
                count.setBackgroundTintList(
                        android.content.res.ColorStateList.valueOf(
                                android.graphics.Color.parseColor("#0000FF")
                        )
                );
            }
        });

    }
}
package com.example.conversion;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.E1);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conversion();
            }
        });
    }

    public void conversion(){
        String Dirhams = editText.getText().toString();
        if(Dirhams.equals("")){
            Toast.makeText(this, "Saisir un nombre valide", Toast.LENGTH_SHORT).show();

        }else {
            Double Dirhamsdouble = Double.parseDouble(Dirhams);
            Double DollarDouble = Dirhamsdouble * 0.097;
            String Dollar = DollarDouble.toString();
            Toast.makeText(this, "Conversion en Dollar:"+Dollar, Toast.LENGTH_SHORT).show();

        }
    }
}
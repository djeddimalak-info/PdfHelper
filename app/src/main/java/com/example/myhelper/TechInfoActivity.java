package com.example.myhelper;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class TechInfoActivity extends AppCompatActivity {
    Button L;
    Button master2;
    Button startup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.tech_info);
        L= findViewById(R.id.L);
        L.setOnClickListener(V -> {
            Intent intent = new Intent(TechInfoActivity.this, LicenceActivity.class );
            startActivity(intent);
        });
        master2=findViewById(R.id.master2);
        L.setOnClickListener(V -> {
            Intent intent = new Intent(TechInfoActivity.this, Master2Activity.class );
            startActivity(intent);
        });
        startup=findViewById(R.id.startup);
        startup.setOnClickListener(V -> {
            Intent intent = new Intent(TechInfoActivity.this, StartupActivity.class );
            startActivity(intent);
        });
    }
}
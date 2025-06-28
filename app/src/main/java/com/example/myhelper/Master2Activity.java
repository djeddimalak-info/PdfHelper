package com.example.myhelper;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class Master2Activity extends AppCompatActivity {
    Button side;
    Button se;
    Button rs;
    Button ia;
    Button lg;
    Button ga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.master2);
        side= findViewById(R.id.side);
        side.setOnClickListener(V -> {
            Intent intent = new Intent(Master2Activity.this, SideActivity.class );
            startActivity(intent);
        });


        se= findViewById(R.id.se);
        se.setOnClickListener(V -> { //V object de view  marche quand clique et une paratemtrer (synatx) mokhtasara
            Intent intent = new Intent(Master2Activity.this, SemActivity.class );
            startActivity(intent);
        });


        rs= findViewById(R.id.rs);
        side.setOnClickListener(V -> {
            Intent intent = new Intent(Master2Activity.this, RsActivity.class );
            startActivity(intent);
        });

        ia= findViewById(R.id.ia);
        ia.setOnClickListener(V -> {
            Intent intent = new Intent(Master2Activity.this, IaActivity.class );
            startActivity(intent);
        });
        lg= findViewById(R.id.lg);
        lg.setOnClickListener(V -> {
            Intent intent = new Intent(Master2Activity.this, LgActivity.class );
            startActivity(intent);
        });

        ga= findViewById(R.id.ga);
        ga.setOnClickListener(V -> {
            Intent intent = new Intent(Master2Activity.this, GaActivity.class );
            startActivity(intent);
        });
    }
}
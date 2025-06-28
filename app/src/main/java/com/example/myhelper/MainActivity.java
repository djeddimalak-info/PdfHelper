package com.example.myhelper; //  package
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;  //importer les boutons
import androidx.appcompat.app.AppCompatActivity; //  bénéficier des fonctionnalités de compatibilité


public class MainActivity extends AppCompatActivity {  // sous-classe de la classe Activity dans Android.
    // Elle fait partie de la bibliothèque AndroidX et permet d'assurer la compatibilité des
    // applications avec les anciennes versions d'Android tout en offrant des fonctionnalités modernes
    // comme la barre d'action et le support des thèmes Material Design.


    Button btn;   // btn type bouton

    @Override // redéfinit une méthode de la classe parente
    protected void onCreate(Bundle savedInstanceState) { // methode appele creation  l'activité
        super.onCreate(savedInstanceState); // onCreate  pour initialiser act
        setContentView(R.layout.activity_main); // defdu layout  de(activity_main.xml)
        btn = findViewById(R.id.btn);


        btn.setOnClickListener(V -> {  //V object de view  marche quand clique
            // et une paratemtrer (synatx) mokhtasara
            Intent intent = new Intent(MainActivity.this, TechInfoActivity.class ); //intent  un objet permettant de
            // demander une action
            startActivity(intent);
        });





    }



    public void goToLicence(View view) {
        Intent intent = new Intent(MainActivity.this, LicenceActivity.class); // Création d'un Intent pour démarrer LicenceActivity
        startActivity(intent);
    }


    public void goToMaster2(View view) {
        Intent intent = new Intent(MainActivity.this, Master2Activity.class); // Création d'un Intent pour démarrer Master2Activity
        startActivity(intent);
    }

    //   démarrer StartupActivity clique sur le bouton "startup"
    public void goToStartup(View view) {
        Intent intent = new Intent(MainActivity.this, StartupActivity.class); // Création d'un Intent pour démarrer StartupActivity
        startActivity(intent);
    }
}
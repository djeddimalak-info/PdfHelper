package com.example.myhelper; // Déclaration du package dans lequel se trouve cette classe

import android.os.Bundle; // Importation de la classe Bundle pour gérer les données d'état passées lors de la création de l'activité
import androidx.appcompat.app.AppCompatActivity; // Importation de AppCompatActivity pour bénéficier des fonctionnalités de compatibilité

public class StartupActivity extends AppCompatActivity { // Déclaration de la classe StartupActivity qui hérite de AppCompatActivity

    @Override // Indique que cette méthode redéfinit la méthode onCreate() de la classe parente
    protected void onCreate(Bundle savedInstanceState) { // Méthode appelée lors de la création de l'activité
        super.onCreate(savedInstanceState); // Appel de la méthode onCreate de la classe parente pour effectuer les initialisations de base
        setContentView(R.layout.startup); // Définit le layout de l'activité en utilisant le fichier XML startup.xml
    }
}
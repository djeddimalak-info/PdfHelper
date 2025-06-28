package com.example.myhelper; // Déclaration du package de l'application

import android.os.Bundle; // Importation de la classe Bundle pour gérer les données d'état lors de la création de l'activité
import androidx.appcompat.app.AppCompatActivity; // Importation d'AppCompatActivity pour bénéficier des fonctionnalités de compatibilité

public class SemActivity extends AppCompatActivity { // Déclaration de la classe SemActivity qui hérite de AppCompatActivity

    @Override // Indique que la méthode onCreate() redéfinit celle de la classe parente
    protected void onCreate(Bundle savedInstanceState) { // Méthode appelée lors de la création de l'activité
        super.onCreate(savedInstanceState); // Appel de la méthode onCreate de la classe parente pour initialiser l'activité
        setContentView(R.layout.sem); // Définit le layout de l'activité avec le fichier XML sem.xml, qui sera affiché à l'écran
    }
}
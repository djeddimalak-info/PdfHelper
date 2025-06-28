package com.example.myhelper; // Déclaration du package de l'application

import android.os.Bundle; // Importation de Bundle pour gérer les données d'état lors de la création de l'activité
import androidx.appcompat.app.AppCompatActivity; // Importation d'AppCompatActivity pour bénéficier des fonctionnalités de compatibilité

public class RsActivity extends AppCompatActivity { // Déclaration de la classe RsActivity qui hérite de AppCompatActivity

    @Override // Indique que la méthode onCreate() redéfinit celle de la classe parente
    protected void onCreate(Bundle savedInstanceState) { // Méthode appelée lors de la création de l'activité
        super.onCreate(savedInstanceState); // Appel de onCreate() dans la classe parente pour initialiser l'activité
        setContentView(R.layout.rs); // Définit le layout à afficher, ici le fichier rs.xml
    }
}
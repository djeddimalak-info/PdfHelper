package com.example.myhelper; // Déclaration du package de l'application

import android.os.Bundle; // Importation de Bundle pour récupérer l'état de l'activité lors de sa création
import androidx.appcompat.app.AppCompatActivity; // Importation de AppCompatActivity pour bénéficier des fonctionnalités de compatibilité

public class SideActivity extends AppCompatActivity { // Déclaration de la classe SideActivity qui hérite de AppCompatActivity

    @Override // Indique que la méthode suivante redéfinit celle de la classe parente
    protected void onCreate(Bundle savedInstanceState) { // Méthode appelée lors de la création de l'activité
        super.onCreate(savedInstanceState); // Appel de la méthode onCreate de la classe parente pour initialiser correctement l'activité
        setContentView(R.layout.side); // Affecte le layout défini dans side.xml comme interface de cette activité
    }
}
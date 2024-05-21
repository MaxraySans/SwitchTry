/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author matte
 */
public class MaterialiPeso 
{
    public static void main(String[] args) 
    {
        double volume, peso;
        String materiale;
        double pesospecifico;
        Scanner tastiera = new Scanner(System.in);
        System.out.printf("Inserisci il nome del materiale: ");
        materiale = tastiera.nextLine();
        System.out.printf("Inserisci il volume: ");
        volume = tastiera.nextDouble();
        pesospecifico = MetodiPeso.PesoSpecifico(materiale);
        peso = volume * pesospecifico;
        System.out.println("Il peso del materiale inserito sarà di " + peso + " N\n");
    }
}

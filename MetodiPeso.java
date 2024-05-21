/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author matte
 */
public class MetodiPeso 
{
    public static double PesoSpecifico (String materiale)
    {
        materiale = Minuscolo(materiale);
        double pesospecifico = 0;
        switch (materiale)
        {
            case "acqua": pesospecifico = 10.0;
            break;
            case "petrolio": pesospecifico = 8.0;
            break;
            case "vetro": pesospecifico = 25.0;
            break;
        }
        return pesospecifico;
    }
    
    public static String Minuscolo(String T)
    {
        String t;
        t = T.toLowerCase();
        return t;
    }
}

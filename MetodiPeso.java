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
    public static double pesoSpecifico (String materiale)
    {
        materiale = minuscolo(materiale);
        materiale = trimmer(materiale);
        double pesospecifico = 0;
        switch (materiale)
        {
            case "acqua": pesospecifico = 10.0;
            break;
            case "petrolio": pesospecifico = 8.0;
            break;
            case "vetro": pesospecifico = 25.0;
            break;
            default: System.out.printf("Non hai inserito uno materiali tra acqua, petrolio o vetro. \n");
        }
        return pesospecifico;
    }
    
    public static String minuscolo(String T)
    {
        String t;
        t = T.toLowerCase();
        return t;
    }
    
    public static String trimmer(String T)
    {
        String t;
        t = T.trim();
        return t;
    }
}

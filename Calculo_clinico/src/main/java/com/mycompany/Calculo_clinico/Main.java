/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Calculo_clinico;

/**
 *
 * @author PC11
 */
public class Main {
    public static void main(String[] args) {
        Paciente Homem = new Paciente();
        Paciente Mulher1= new Paciente();
        Calculos Mulher = new Calculos(0.1f,0.8f,13.2f);
        
        Homem.peso = 50;
        Homem.sexo = 1;
        Homem.idade = 22;
        
        Mulher1.peso = 7;
        Mulher1.sexo = 0;
        Mulher1.idade = 65;
        
        Homem.Taxa_Metabolica();
        System.out.println("\n");
        
        Mulher.calcularT4();
        System.out.println("\n");
        
        
        
        Mulher.calcularhiper();
        
    }
}

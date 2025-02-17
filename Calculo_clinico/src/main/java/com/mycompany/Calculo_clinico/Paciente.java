/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Calculo_clinico;

/**
 *
 * @author PC11
 */
public class Paciente {
    
    public int sexo;
    public int idade;
    public float peso;
    
    
    // Getter Setter
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    public void checarexames(){
        if(idade < 18){
            System.out.println("Você não tem idades para realizar exames. ");
        }
        
        else{
            System.out.println("Seus exames estão em dia!!");
        }
        
            
    }
    
    
    
     // Sexo 0 == Mulher
    // Sexo 1 == Homem
    public void Taxa_Metabolica(){
        // Taxa das mulheres
        if(sexo == 0){
            if(idade > 18 && idade <= 30 ){
                float metabolismo = (14.818f * peso) + 486.6f;
                
                System.out.println("Sua Taxa metabolica é de: " + metabolismo);
            
            }
            
            if(idade > 30 && idade < 60){
            float metabolismo = (8.126f * peso) + 845.6f;
                System.out.println("Sua Taxa metabolica é de: " + metabolismo);
            
            }
        
            if(idade >= 60){
            float metabolismo = (9.082f * peso) + 658.5f;
                System.out.println("Sua Taxa metabolica é de: " + metabolismo);
            
            }
            
        }
        
        
        
        
        
        // Taxa Metabolica DOS HOMENS
        if(sexo == 1){
            if(idade > 18 && idade <= 30 ){
                float metabolismo = (15.057f * peso) + 692.2f;
                
                System.out.println("Sua Taxa metabolica é de: " + metabolismo);
            
            }
            
            if(idade > 30 && idade < 60){
            float metabolismo = (11.471f * peso) + 873.1f;
                System.out.println("Sua Taxa metabolica é de: " + metabolismo);
            
            }
        
            if(idade >= 60){
            float metabolismo = (11.711f * peso) + 587.7f;
                System.out.println("Sua Taxa metabolica é de: " + metabolismo);
            
            }
            
        }
        
    }
        
}

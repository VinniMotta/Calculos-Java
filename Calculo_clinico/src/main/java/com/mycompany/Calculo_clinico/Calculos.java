/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Calculo_clinico;
/**
 *
 * @author PC11
 */
//Herança
public class Calculos extends Paciente{
    // Construtor
    public Calculos(float TSH, float T4, float metabolismo) {
        this.TSH = TSH;
        this.T4 = T4;
        this.metabolismo = metabolismo;
    }

   
    
    private float TSH;
    private float T4;
    private float metabolismo;

    // Override
    @Override
    public String toString() {
        System.out.println("Override Executado");
        return "Calculos{" + "TSH=" + TSH + ", T4=" + T4 + ", metabolismo=" + metabolismo + '}';
    }

   
    public void calcularT4(){
        if(T4  > 0.7 || 1.8 < T4){
            System.out.println(" Seus niveis estão ótimos");
        
        
        
        }else{ 
            System.out.println(" Vá para um médico seus niveis estão ruins");       
        }
    
    
    }
    
    
    // Método para calcular tiroidismo
    public void calcularhiper(){
        if(TSH < 0.4f){
               System.out.println("Cuidado sua taxa de TSH está abaixo da normal!!! \n Sua Taxa: "+TSH+"mU/L \n Taxa Normal: 0.4mU/L");
        
        }
        if(TSH == 0.4f){
            
         System.out.println("Sua Taxa de TSH está perfeita!");
        }
        if(TSH > 0.4f){
            
        System.out.println("Cuidado! Sua taxa de TSH está acima do normal!!! \n Sua Taxa: "+TSH+"\n Taxa Normal 0.4mU/L");
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
    
    
    

    
    
    
    
    
    
    
    
    
    
 
    
    
   
    
    
    


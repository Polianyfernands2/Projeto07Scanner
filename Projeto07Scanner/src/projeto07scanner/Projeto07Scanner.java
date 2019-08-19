/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto07scanner;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Projeto07Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Classe Scanner deve ser importada de
        //dentro do pacote Java.util.Scanner
        //Definir um Objeto 'entrada' da classe Scanner
        //usando a palavra reserva NEW
        //que é responsavel pela instanciacao de objetos
        //de uma classe JAVA 
        
        String nome = "Moraes";
        Scanner entrada = new Scanner(System.in);
        
        //criar um programa que receba ENTRADA de
        //2 (dois) valor (num1 e num2) e verfique 
        //que o maior e menos numero entre os dois 
        
        int num1, num2;
        System.out.println("Digite o Primeiro Número:");
        num1 = entrada.nextInt();
        System.out.println("Digite o Segundo Número:");
        num2 = entrada.nextInt();
        //valor atribuido a num1 e num2
        System.out.println("Valor NUM1:" + num1);
        System.out.println("Valor NUM2:" + num2);
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_exercicios;

import java.util.Scanner;

/**
 *
 * @author João Vitor Martins Matos
 */
public class Exercicio4 {

    public static void main(String[] args) {
        //Cria um scanner para ler os dados do usuário
        Scanner scanner = new Scanner(System.in);
        
        //Solicita e lê o nome do usuário
        System.out.println(" Por favor, informe o seu nome: ");
        String nome = scanner.next();
        
        //Solicita e lê o endereço do usuário
         System.out.println(" Por favor, informe o seu endereço: ");
         String endereço = scanner.next();
        
        //Fecha o scanner
        scanner.close();
    }
}

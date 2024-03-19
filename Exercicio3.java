/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_exercicios;

import java.util.Scanner;

/**
 *
 * @author João Vitor Martins Matos
 */
public class Exercicio3 {

    public static void main(String[] args) {
        //Cria um scanner para ler o nome do usuário
        Scanner scanner = new Scanner(System.in);
        //Solicita e lê o nome do usuário
        System.out.println(" Por favor, informe o seu nome: ");
        String nome = scanner.next();
        //Escreve uma saudação ao primeiro nome do usuário
        System.out.println(" Olá " + nome + ", seja bem vindo! ");
        //Fecha o scanner
        scanner.close();
    }
}

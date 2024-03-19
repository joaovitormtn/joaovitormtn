/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_exercicios;

import java.util.Scanner;

/**
 *
 * @author João Vitor Martins Matos
 */
public class Exercicio1 {

    public static void main(String[] args) {
        //Cria um scanner para ler os números imputados pelo usuário
        Scanner input = new Scanner(System.in);
        //Solicita e lê o 1° número informado pelo usuário
        System.out.println(" Por favor, digite um numero qualquer: ");
        int num1 = input.nextInt();
        //Solicita e lê o 2° número informado pelo usuário
        System.out.println(" Por favor, digite um segundo numero: ");
        int num2 = input.nextInt();
        //Calcula a soma dos valores informados
        int soma = num1 + num2;
        //Exibe ao usuário o valor da soma entre os números
        System.out.println(" A soma entre " + num1 + " e " + num2 + " e igual a: " + soma);
        System.out.println(" A soma de " + num1 + " + " + num2 + " = " + soma);
    }
}

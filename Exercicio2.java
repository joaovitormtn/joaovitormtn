/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_exercicios;

import java.util.Scanner;

/**
 *
 * @author João Vitor Martins Matos
 */
public class Exercicio2 {

    public static void main(String[] args) {
        //Cria um scanner para ler os números informados pelo usuário
        Scanner input = new Scanner(System.in);
        //Solicita e lê o 1° número informado pelo usuário
        System.out.println(" Por favor, determine o valor de X: ");
        int num1 = input.nextInt();
        //Solicita e lê o 2° número informado pelo usuário
        System.out.println(" Por favor, determine o valor de Y: ");
        int num2 = input.nextInt();
        //Calcula o resto da divisão dos valores informados
        int div = num1 % num2;
        //Exibe ao usuário o valor do resto da divisão dos valores informados
        System.out.println(" O resto da divisão de " + num1 + " e " + num2 + " e igual a: " + div);
       
    }
}

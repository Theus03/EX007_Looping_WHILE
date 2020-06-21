/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercícios;

/**
 *
 * @author Matheus
 */
import java.util.Scanner;
public class Ex007_Looping_While {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius:");
        double c = entrada.nextDouble();
        int i = 1;
        while(i <= 10){
            double f = (9 * c + 160)/5;
            System.out.println(f);
            i++;
            c = c+10;
        }
    }
}

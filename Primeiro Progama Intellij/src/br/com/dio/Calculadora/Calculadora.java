package br.com.dio.Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor:");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor :");
        b = scan.nextInt();

        int somar = somar(a,b);
        int subtrair = subtrair(a,b);
        int dividir = dividir(a,b);
        int multiplicar = multiplicar(a,b);

        System.out.println("Soma :" + somar);
        System.out.println("Subtracao:" + subtrair);
        System.out.println("Divisao :" + dividir);
        System.out.println("Multiplicacao :" + multiplicar);

    }

    public static int somar (int a, int b){
        return a + b;
    }

    public static int subtrair (int a, int b){
        return a - b;
    }
    public static int dividir (int a, int b){
        return a / b;
    }
    public static int multiplicar (int a, int b){
        return a * b;
    }
}

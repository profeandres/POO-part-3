package co.edu.utp.misiontic2022.c2.Ejercicio13_4_b;
import java.util.Scanner;

/*
Construir un programa que permita leer dos números enteros y, basado
en clases, determinar si el 1º número es mayor que el 2º, si el 1º número
es menor que el 2º, si los dos números son iguales y si los dos números
son diferentes
*/
public class principal {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("ingresa dos números enteros \nPrimer número: ");
        int num1= op.nextInt();
        System.out.println("Segundo número: ");
        int num2 =op.nextInt();

        NumeroMayor mayor= new NumeroMayor(num1,num2);
        NumeroMenor menor= new NumeroMenor(num1,num2);
        Igualdad igual=new Igualdad(num1,num2);
        Diferencia diferente=new Diferencia(num1,num2);

        mayor.MostrarDecision();
        menor.MostrarDecision();
        igual.MostrarDecision();
        diferente.MostrarDecision();
        
       
    }
}

package co.edu.utp.misiontic2022.c2.Ejercicio13_4_a;
import java.util.Scanner;

/*
Construir un programa que permita leer dos números enteros y, basado
en clases, calcule la suma de los dos números, la resta de los dos
números, la multiplicación de los dos números y el cociente de los dos
números
*/

public class principal {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Ingresa dos números enteros \nPrimer número: ");
        int num1=op.nextInt();
        System.out.println("Segundo número: ");
        int num2=op.nextInt();
        Adicion suma= new Adicion(num1,num2);
        Sustraccion resta=new Sustraccion(num1,num2);
        Multiplicacion producto= new Multiplicacion(num1,num2);
        Division cociente=new Division(num1,num2);

        System.out.println("\n\nEl resultado de sumar "+num1+" + "+num2+" es: "+suma.resultado);
        System.out.println("\n\nEl resultado de restar "+num1+" - "+num2+" es: "+resta.resultado);
        System.out.println("\n\nEl resultado de multiplicar "+num1+" * "+num2+" es: "+producto.resultado);
        System.out.println("\n\nEl resultado de dividir "+num1+" ÷ "+num2+" es: "+cociente.resultado);
    }    
}

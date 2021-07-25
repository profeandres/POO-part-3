package co.edu.utp.misiontic2022.c2.Ejercicio13_4_c;
import java.util.Scanner;
/*
Construir un programa que permita leer un número entero y, basado en
clases, determinar cuántos dígitos tiene, cuántos dígitos pares tiene,
cuántos dígitos impares tiene, cuántos dígitos primos tiene y cuántas
veces contiene el dígito 6
*/
public class principal {    
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Ingrese dos números enteros \nPrimer número: ");
        int num1=op.nextInt();
        System.out.println("Segundo número: ");
        int num2=op.nextInt();

        CantDigitos digitos1= new CantDigitos(num1);
        CantDigitos digitos2=new CantDigitos(num2);

        CantDigitosPares pares1=new CantDigitosPares(num1);
        CantDigitosPares pares2=new CantDigitosPares(num2);

        CantDigitosImpares impares1= new CantDigitosImpares(num1);
        CantDigitosImpares impares2= new CantDigitosImpares(num2);

        CantDigitosPrimos primos1=new CantDigitosPrimos(num1);
        CantDigitosPrimos primos2=new CantDigitosPrimos(num2);

        digitos1.MostrarDigitos();
        digitos2.MostrarDigitos();

        pares1.MostrarPares();
        pares2.MostrarPares();

        impares1.MostrarImpares();
        impares2.MostrarImpares();

        primos1.MostrarPrimos();
        primos2.MostrarPrimos();
    }
}

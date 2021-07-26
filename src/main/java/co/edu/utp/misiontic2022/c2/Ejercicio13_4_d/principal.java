package co.edu.utp.misiontic2022.c2.Ejercicio13_4_d;
import java.util.Scanner;
/*
Construir un programa que permita leer un número entero de tres
dígitos y, basado en clases, mostrar solamente el 1º dígito, mostrar
solamente el 2º dígito, mostrar solamente el 3º dígito, determinar si
tiene algún dígito repetido y determinar si los tres dígitos son iguales
*/
public class principal {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Digite un número de tres cifras: ");
        int num=op.nextInt();
        if ((String.valueOf(num)).length()==3){
            primerdigito centena=new primerdigito(num);
            segundodigito decena=new segundodigito(num);
            tercerdigito unidad=new tercerdigito(num);
            DigRepetido DigRep = new DigRepetido(num);
            DigIguales DigIgual= new DigIguales(num);
    
            System.out.println("El 1° dígito es: "+centena.MostrarDigito()); 
            System.out.println("El 2° dígito es: "+decena.MostrarDigito());
            System.out.println("El 3° dígito es: "+unidad.MostrarDigito());
            System.out.println(DigRep.MostrarDigito());
            System.out.println(DigIgual.MostrarDigito());

        }else{
            System.out.println("Debe ser un número de tres cifras, intente de nuevo");
        }

    }
}

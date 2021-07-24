package co.edu.utp.misiontic2022.c2.Ejercicio13_4_a;

public class Division {
    private int num1;
    private int num2;
    double resultado;
    
    public Division(int n1,int n2){
        num1=n1;
        num2=n2;
        resultado=(double) (num1*100/num2)/100; 
    }
}

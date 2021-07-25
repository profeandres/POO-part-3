package co.edu.utp.misiontic2022.c2.Ejercicio13_4_b;

public class NumeroMayor {
    int num1;
    int num2;
    boolean decision;

    public NumeroMayor(int n1, int n2){
        num1=n1;
        num2=n2;
        decision=n1>n2;
    }

    public void MostrarDecision(){
        if (decision){
            System.out.println("El número "+num1+" es mayor que "+num2);
        }else {
            System.out.println("El número "+num1+" no es mayor que "+num2);
        }
        
    }
}

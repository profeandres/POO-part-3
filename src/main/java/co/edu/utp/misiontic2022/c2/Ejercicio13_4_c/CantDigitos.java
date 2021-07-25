package co.edu.utp.misiontic2022.c2.Ejercicio13_4_c;

public class CantDigitos {
    int num1;
    int CantNum1;

    public CantDigitos(int n1){
        num1=n1;
        CantNum1=(String.valueOf(n1)).length();
    }

    public void MostrarDigitos(){
        System.out.println("El número "+num1+" tiene "+CantNum1+ " dígitos \n");
    }
}

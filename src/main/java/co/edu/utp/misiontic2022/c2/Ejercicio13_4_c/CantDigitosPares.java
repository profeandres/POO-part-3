package co.edu.utp.misiontic2022.c2.Ejercicio13_4_c;

public class CantDigitosPares {
    int num1;
    int CantDigitos1;
    int cont1=0;

    public CantDigitosPares(int n1){
        num1=n1;
        CantDigitos1= (String.valueOf(num1)).length();
        while (CantDigitos1!=0){
            int dig1= (int) (num1/Math.pow(10, CantDigitos1-1));
            num1=(int) (num1-(dig1*Math.pow(10, CantDigitos1-1)));
            if (dig1%2==0){
                cont1++;
            }
            CantDigitos1--;
        }
        num1=n1;
    }
    public void MostrarPares(){
        System.out.println("El número "+num1+" tiene "+cont1+" digitos pares");
    }
}

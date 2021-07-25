package co.edu.utp.misiontic2022.c2.Ejercicio13_4_c;

public class CantDigitosPrimos {
    int num1;
    int CantDigitos1;
    int cont1;
    int ContPrim1;
    public CantDigitosPrimos(int n1){
        num1=n1;
        CantDigitos1=(String.valueOf(num1)).length();
        while (CantDigitos1!=0){
            int dig1= (int) (num1/Math.pow(10, CantDigitos1-1));
            num1= (int) (num1-dig1*Math.pow(10, CantDigitos1-1));
            ContPrim1=0;
            for (int i=2;i<dig1;i++){
                if (dig1%i==0 & dig1!=2 & dig1!=1){
                    ContPrim1++;
                    break;
                }
            }
            if (ContPrim1==0 | dig1==2){
                cont1++;
            }
            CantDigitos1--;
        }
        num1=n1;
    }
    public void MostrarPrimos() {
        System.out.println("El número "+num1+" tiene "+cont1+" dígitos primos");
    }
}

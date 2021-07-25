package co.edu.utp.misiontic2022.c2.Ejercicio13_4_c;

public class CantDigitos6 {
    int num1;
    int CantDigitos;
    int CantDigitos6;
    public CantDigitos6(int n1){
        num1=n1;
        CantDigitos=(String.valueOf(num1)).length();
        while(CantDigitos!=0){
            int dig=(int) (num1/Math.pow(10, CantDigitos-1));
            CantDigitos6=0;
            if (dig==6){
                CantDigitos6++;
            }
            num1=(int) (num1-dig*Math.pow(10, CantDigitos-1));
            CantDigitos--;
        }
    }
    public void MostrarDigitos6(){
        System.out.println("El número "+num1+" tiene "+CantDigitos6+ "veces el dígito 6");
    }
}

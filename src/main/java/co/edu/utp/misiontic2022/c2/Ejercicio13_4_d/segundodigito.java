package co.edu.utp.misiontic2022.c2.Ejercicio13_4_d;

public class segundodigito {
    private int num;
    private int Dig2;
    
    public segundodigito(int n){
        num=n;
        int dig1=(int) (num/100);
        Dig2=(num-dig1*100)/10;
    }

    public int MostrarDigito(){
        return Dig2;
    }
}

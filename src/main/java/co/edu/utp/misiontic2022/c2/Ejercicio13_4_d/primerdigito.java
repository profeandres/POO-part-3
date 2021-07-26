package co.edu.utp.misiontic2022.c2.Ejercicio13_4_d;

public class primerdigito {
    private int num;
    private int Dig1;

    public primerdigito(int n){
        num=n;
        Dig1=(int) (num/100);
    }

    public int MostrarDigito(){
        return Dig1;
    }
}

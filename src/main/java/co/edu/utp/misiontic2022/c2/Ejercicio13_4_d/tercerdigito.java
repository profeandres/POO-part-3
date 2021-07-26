package co.edu.utp.misiontic2022.c2.Ejercicio13_4_d;

public class tercerdigito {
    private int num;
    private int digs;
    private int Dig3;

    public tercerdigito(int n){
        num=n;
        digs=num/10;
        Dig3=num-digs*10;
    }

    public int MostrarDigito(){
        return Dig3;  
    }
}

package co.edu.utp.misiontic2022.c2.Ejercicio13_4_d;

public class DigIguales {
    private int dig1;
    private int dig2;
    private int dig3;

    
    public DigIguales(int n){
        dig1=n/100;
        dig2=(n-dig1*100)/10;
        dig3=n-(dig1*100)-(dig2*10);
    }

    public String MostrarDigito(){
        if (dig1==dig2 & dig2==dig3){
            return "Los tres dígitos se repiten";
        }else{
            return "Los tres dígitos no son iguales, hay al menos uno diferente";
        } 
    }
}

package co.edu.utp.misiontic2022.c2.Ejercicio13_4_d;

public class DigRepetido {
    private int dig1;
    private int dig2;
    private int dig3;

    public DigRepetido(int n){
        dig1=n/100;
        dig2=(n-dig1*100)/10;
        dig3=n-(n/10)*10;
    }

    public String MostrarDigito(){
        int NumRep=10;
        if (dig1==dig2){
            NumRep=dig1;
        }else if(dig1==dig3){
            NumRep=dig1;
        }else if(dig2==dig3){
            NumRep=dig2;
        }
        if (NumRep!=10){
            return "El número que se repite es: "+NumRep;
        }else{
            return "No hay dígitos que se repitan";
        }

    }
}

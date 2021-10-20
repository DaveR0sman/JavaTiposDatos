package com.generation;

public class Main {

    public static void main(String[] args) {
	// datos primitivos numericos

        String nombre = "David";
        byte num1 = 10;
        short numshort1 = num1;
        int numInt = numshort1;
        short numShort2 = (short) numInt;

        short num2 = 19;
        int num3 = 23;
        long num4 = 15;
    //datos primitivos decimales
        float decimal1 = 10.1223234f;
        double decimal2 = 20.33299190230f;

    // dato primitivo char
        char caracter = 'F';

    //dato primitivo boolean
        boolean verdadero = true;

        byte numByte1 = 120;
        byte numByte2 = 120;
        //short suma = (short) (numByte1 + numByte2);
        //System.out.print(numShort2);
        
        //System.out.println(numInt ;
        //System.out.println(suma);
        
        int numop1 = 50;
        int numop2 = 125;

        int suma = numop2 + numop1;
        int multi = numop2 - numop1;
        float division;
        division = numop2 / numop1;
        int residuo = numop2 % numop1;
        
        
        System.out.println(suma);
        System.out.println(multi);
        System.out.println(division);
        System.out.println(residuo);
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amrra
 */
public class tiposPrimitivosJava {
    public static void main (String args[]){
        
        /*
        byte = 8bits -128to 127
        short = 16bits -32,768 to 32767
        char = 16bits 0 to 65,535
        int = 32bits -2^31 to 2^31-1
        long = 64bits -2^63 to 2^63-1
        float = 32bits 1.4e-045 to 3.4e+038
        double = 64bits 4.9-324 to 1.8e+308
        boolean = 1bit true or false
        */
        System.out.println("TIPOS PRIMITIVOS ENTEROS");
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor minimo int: "+ Integer.MAX_VALUE);
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);
        
        System.out.println("/n /n TIPOS PRIMITIVOS FLOTANTES");
        System.out.println("Valor minimo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo float: " + Float.MAX_VALUE);
        System.out.println("Valor minimo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo double: " + Double.MAX_VALUE);
        
        
    }
}

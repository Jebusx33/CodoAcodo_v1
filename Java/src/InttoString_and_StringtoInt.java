/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus Arias
 */
public class InttoString_and_StringtoInt {
    public static void main(String[] args) {
		
 //Para convertir un String (cadena) a int (entero) hay que emplear el m�todo est�tico de la clase Integer, parseInt
String enteroString = "5";
int entero = Integer.parseInt(enteroString);
System.out.println(entero);

//Para convertir int(entero2) a String s�lo debemos hacer una llamada al m�todo est�tico de la clase Integer, toString
int entero2 = 1;
String enteroString2 = Integer.toString(entero2);       
System.out.println(enteroString2);

//An�logamente para pasar de String(cadena) a double tenemos el m�todo Double.parseDouble
String aString = "5.2";
double aDouble = Double.parseDouble(aString);
System.out.println(aDouble);

//o al rev�s (double a string) llamamos al m�todo Double.toString
double d = 8342342;
System.out.println(Double.toString(d));



	}
}

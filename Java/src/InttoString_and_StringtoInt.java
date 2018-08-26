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
		
 //Para convertir un String (cadena) a int (entero) hay que emplear el método estático de la clase Integer, parseInt
String enteroString = "5";
int entero = Integer.parseInt(enteroString);
System.out.println(entero);

//Para convertir int(entero2) a String sólo debemos hacer una llamada al método estático de la clase Integer, toString
int entero2 = 1;
String enteroString2 = Integer.toString(entero2);       
System.out.println(enteroString2);

//Análogamente para pasar de String(cadena) a double tenemos el método Double.parseDouble
String aString = "5.2";
double aDouble = Double.parseDouble(aString);
System.out.println(aDouble);

//o al revés (double a string) llamamos al método Double.toString
double d = 8342342;
System.out.println(Double.toString(d));



	}
}

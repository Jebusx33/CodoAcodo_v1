/*
2. Realizar un algoritmo que lea un n�mero por teclado. En caso de que
ese n�mero sea 0 o menor que 0, se saldr� del programa
imprimiendo antes un mensaje de error. Si es mayor que 0, se deber�
calcular su cuadrado y la ra�z cuadrada del mismo, visualizando el
n�mero que ha tecleado el usuario y su resultado (?Del numero X, su
potencia es X y su ra�z X? ). Para calcular la ra�z cuadrada se puede
usar la funci�n interna RAIZ(X) que es SQR , y para potencia de POW
Nota: para este ejercicio usar la opci�n gr�fica de
javax.swing.optionpane , de la teor�a dada.

 */
package Comision1852_CodoaCodoTP2;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus Arias
 */
public class T2_ej2 {
    
    public static void main(String[] args) {
  
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
    //En caso de que ese n�mero sea 0 o menor que 0, se saldr� del programa imprimiendo antes un mensaje de error. Si es mayor que 0

  if(numero<=0){
           
    JOptionPane.showMessageDialog(null,"usted ingreso "+numero+
    "\nError el numero tiene que ser mayor a 0",
    "Error",
    JOptionPane.ERROR_MESSAGE);
  }else{
      /*
      Si es mayor que 0, se deber�
calcular su cuadrado y la ra�z cuadrada del mismo, visualizando el
n�mero que ha tecleado el usuario y su resultado (?Del numero X, su
potencia es X y su ra�z X? ). Para calcular la ra�z cuadrada se puede
usar la funci�n interna RAIZ(X) que es SQR , y para potencia de POW
Nota: para este ejercicio usar la opci�n gr�fica de
javax.swing.optionpane , de la teor�a dada.
      */
      
     int n= 2;
     int resultado = (int) Math.pow(numero, numero);
     float resultado1 = (float) Math.sqrt(numero);
     
   
     JOptionPane.showMessageDialog(null,"El numero ingresado es: " + numero+ "\nsu cuadrado es: " +
             resultado+"\nsu raiz es: "+ resultado1);
        
      
  }
        
        
    } 
}

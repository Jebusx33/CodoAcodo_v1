
public class Declaraciones_Operadores {
//main es una clase propia
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5;
int b;
b=7;
int c=b+a;  //suma =12

System.out.println(c);
c++; //incremento +1
System.out.println(c);
c+=6;  //incrementa +6
System.out.println(c);
// declaro la variable dolbe para que me de los valores decimales
double a1=5;
double b1;
b1=7;
double c1=b1/a1; //divicion
System.out.println(c1);

//declaracion de constantes 
final int c2=7;

System.out.println(c2);
// declaro una constante para conventir de cmm a pulgada en un valor fijo
//eJ iva, pi, porcentajes etc

final double apulgadas=2.54;
double cm=6;
double RTA=cm/apulgadas;
System.out.println("En " + cm + " cm hay " + RTA + " pulgadas" );

//imprecion de raiz se utiliza double para declararlo y la clase Math(para hacer calculos)

double raiz=Math.sqrt(9);//sqrt permite utilizar la raiz cuadrada
System.out.println(raiz);

// declarar una varible tipo doble y uso classe Round

double num1=5.58;
int resultado=(int)Math.round(num1); //es un numero long pero poara convertirlo en int se aplica al principio en parentesis
//(int)Math.round(num1) es una refundicion

System.out.println(resultado);

//uso de base y exponente

double base=5;
double exponente=3;

int resultado1=(int)Math.pow(base, exponente);

System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado1);
	}

}

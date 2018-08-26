import javax.swing.*;
public class do_while_Peso_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String genero="";
do{
	genero=JOptionPane.showInputDialog("Introduce tu genero (H/M)");
}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false); //equals no distinge de mayuscula y minusculas

int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce altura"));
int pesoideal=0;
if(genero.equalsIgnoreCase("H")){
}
	else if(genero.equalsIgnoreCase("M")){
		pesoideal=altura-120;
	}
	System.out.println("tu peso ideal es " + pesoideal+"Kg");  
	}

}

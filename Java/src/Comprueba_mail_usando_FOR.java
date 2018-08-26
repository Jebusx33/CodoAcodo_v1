import javax.swing.JOptionPane;

public class Comprueba_mail_usando_FOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//boolean arroba=false;
		int arroba=0;
boolean punto=false;
String mail=JOptionPane.showInputDialog("Introduce mail");
for(int i=0; i<mail.length(); i++ ){
	if(mail.charAt(i)=='@'){
		//arroba=true;
		 arroba++;
	}
	if(mail.charAt(i)=='.'){
		punto=true;
	}
}
 //if(arroba==true)
if(arroba==1 && punto==true)
 {
	 System.out.println("Es correcto");
 }
 else{
	 System.out.println("No es correcto");
 }
	//System.out.println(mail.length());
	}

}

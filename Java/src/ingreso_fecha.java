import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ingreso_fecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   System.out.println("Introduzca la fecha con formato dd/mm/yyyy");
	        Scanner sc = new Scanner(System.in);
	        String fecha = sc.nextLine();
	        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	        Date testDate = null;
	        String date = fecha;
	        try{
	            testDate = df.parse(date);
	            System.out.println("Ahora hemos creado un objeto date con la fecha indicada, "+testDate);
	        } catch (Exception e){ System.out.println("invalid format");}

	        if (!df.format(testDate).equals(date)){
	            System.out.println("invalid date!!");
	        } else {
	            System.out.println("valid date");
		}

		
	}

}

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha_Hora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instanciamos el objeto Calendar
		//en fecha obtenemos la fecha y hora del sistema
		Calendar fecha = new GregorianCalendar();
		//Obtenemos el valor del a�o, mes, d�a,
		//hora, minuto y segundo del sistema
		//usando el m�todo get y el par�metro correspondiente
		int anio = fecha.get(Calendar.YEAR);
		int mes = fecha.get(Calendar.MONTH);
		int dia = fecha.get(Calendar.DAY_OF_MONTH);
		int hora = fecha.get(Calendar.HOUR_OF_DAY);
		int minuto = fecha.get(Calendar.MINUTE);
		int segundo = fecha.get(Calendar.SECOND);
		System.out.println("Fecha Actual: " + dia + "/" + (mes+1) + "/" + anio);
		System.out.printf("Hora Actual: %02d:%02d:%02d %n",hora, minuto, segundo);

	}

}

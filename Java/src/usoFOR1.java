
public class usoFOR1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0, fecha=0;
fecha=2605;

while (fecha<4000) {
	if (fecha >=4000) {
		//menor = n;
		System.out.println("fecha invalida ");
	}	
	
	else if (fecha >=2203 && fecha<=1904) {
			//menor = n;
			System.out.println("ARIES ");
		}
		else if (fecha >=2004 && fecha<=2005) {
			System.out.println("TAURO ");
		}
		else if (fecha >=2105 && fecha<=2006) {
			System.out.println("GEMINIS ");
		}
		else if (fecha >=2106 && fecha<=2207) {
			System.out.println("CANCER ");
		}
		else if (fecha >=2307 && fecha<=2208) {
			System.out.println("LEO ");
		}
		else if (fecha >=2308 && fecha<=2309) {
			System.out.println("VIRGO ");
		}
		else if (fecha >=2409 && fecha<=2210) {
			System.out.println("LIBRA ");
		}
		else if (fecha >=2310 && fecha<=2211) {
			System.out.println("ESCORPIO ");
		}
		
		else if (fecha >=2311 && fecha<=2112) {
			System.out.println("SAGITARIO ");
		}
		
		else if (fecha >=2212 && fecha<=1901) {
			System.out.println("CAPRICORNIO ");
		}
		
		else if (fecha >=2001 && fecha<=1902) {
			System.out.println("ACUARIO ");
		}
		else if (fecha >=2002 && fecha<=2003) {
			System.out.println("PISIS ");
		}
		else{
			System.out.println("usted introdujo una fecha in22valida  ");
		}
	
}
	}

}

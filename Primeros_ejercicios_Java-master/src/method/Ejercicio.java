package method;


public class Ejercicio {
	
	public static final Double PI = 3.14;
	

	public static void main(String[] args) {
				
		// Variables
		
		// Inicio
		System.out.println(segundosEntre(11,20,1,11,2,20));
				
	}
	
//	public static int numeroSolucionesEcuacionSegundoGrado(int a, int b, int c) {
//		
//	}
//	
//	public static Double solucionSumaEcuacionSegundoGrado(int a, int b, int c) {
//		
//	}
//	
//	
//	
//	public static Double solucionRestaEcuacionSegundoGrado(int a, int b, int c) {
//		
//	}	
//	
	public static Double areaCirculo(Double r) {
		double area;
		area=3.14*r*r;
		
		return area;
	
	}
	
	public static Double longitudCirculo(Double r) {
		double longitud;
		longitud=3.14*r*2;
		
		return longitud;
		
	}
	
	public static boolean esMultiplo(int a, int b) {
		boolean resultado=false;
		if (a%b==0) {
			resultado=true;
		}
		
		
		return resultado;
	}
	
	public static int horaMayor(int hora1, int min1, int seg1, int hora2, int min2, int seg2) {
		int resultado;
		if (hora1>12 || hora2>12 || min1>60 || min2>60 || seg1>60 || seg2>60) {
			resultado=-1000;
		}
		else {
			if (hora1>hora2) {
				resultado=1;
			}
			else if (hora1<hora2) {
				resultado=2;
			}
			else {
				if (min1>min2) {
					resultado=1;
				}
				else if (min1<min2) {
					resultado=2;
				}
				else {
					if (seg1>seg2) {
						resultado=1;
					}
					else if (seg1<seg2) {
						resultado=2;
					}
					else {
						resultado=0;
					}
				}
			}
		}
		return resultado;
		
	}
	
	public static int segundosEntre(int hora1, int min1, int seg1, int hora2, int min2, int seg2) {
		int segundos=0;
		if (horaMayor(hora1,min1,seg1,hora2,min2,seg2)==-1000) {
			segundos=-1000;
		}
		if (horaMayor(hora1,min1,seg1,hora2,min2,seg2)==1) {
			while (hora1>hora2) {
				hora1=hora1-1;
				segundos=segundos+3600;
			}
			if (min1>min2) {
				while (min1>min2) {
					min1=min1-1;
					segundos=segundos+60;
				}
			}
			else {
				while (min1<min2) {
					min1=min1+1;
					segundos=segundos-60;
				}
			}
			if (seg1>seg2) {
				while (seg1>seg2) {
					seg1=seg1-1;
					segundos=segundos+1;
				}
			}
			else {
				while (seg1<seg2) {
					seg1=seg1+1;
					segundos=segundos-1;
				}
			}
		}
		else if (horaMayor(hora1,min1,seg1,hora2,min2,seg2)==2) {
			while (hora2>hora1) {
				hora2=hora2-1;
				segundos=segundos+3600;
			}
			if (min2>min1) {
				while (min2>min1) {
					min2=min2-1;
					segundos=segundos+60;
				}
			}
			else {
				while (min2<min1) {
					min2=min2+1;
					segundos=segundos-60;
				}
			}
			if (seg2>seg1) {
				while (seg2>seg1) {
					seg2=seg2-1;
					segundos=segundos+1;
				}
			}
			else {
				while (seg2<seg1) {
					seg2=seg2+1;
					segundos=segundos-1;
				}
			}
		}
			
			
		return segundos;
				
		
	}
	
//	public static int maximoComunDivisor(int a, int b) {
//		
//	}
	
//	public static int minimoComunMultiplo(int a, int b) {
//		
//	}
	
//	public static String binario(int num) {
//		
//	}
	
//	public static int decimalcondition(String num) {
//		condition
//	}
}

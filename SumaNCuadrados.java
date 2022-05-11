
public class SumaNCuadrados {
	
	public static void main (String []args) {
		int num= Utilidades.leerEntero("ingrese el numero al que se desea llegar: ");
		String suma= SumaNCuadradosEnterosPos(num);
		Utilidades.imprimir("la suma de los primeros "+num+" enteros al cuadrado es: "+suma);
		
	}
	
	public static String SumaNCuadradosEnterosPos(int num) {
		String suma="";
		int sumatoria=0;
		for (int i=1; i<=num; i++) {
			if(i<num) {
			suma+="("+Math.pow(i, 2)+")+";
			}else {
				suma+="("+Math.pow(i, 2)+")=";
			}
			sumatoria+=Math.pow(i, 2);
		}
		suma+=sumatoria;
		return suma;
	}
}

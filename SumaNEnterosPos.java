

public class SumaNEnterosPos {

    public static void main(String []args){
    	int num= Utilidades.leerEntero("ingrese la cantidad de numeros enteros que desea comprobar: ");
    	for (int i=1; i<=num; i++) {
    		sumatoriaNPrimerosEnterosPos(i);
    	}
    }

    public static void sumatoriaNPrimerosEnterosPos( int num){
        int sum= (num*(num+1))/2;
        Utilidades.imprimir("("+num+")*("+num+"+1))/2="+sum+"\n");
    }
}

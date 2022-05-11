
public class SumaNImpares {
	
    public static void main(String []args){
    	int num= Utilidades.leerEntero("ingrese la cantidad de numeros enteros que desea comprobar: ");
    	String suma= sumatoriaNPrimerosImparesPos(num);
    	Utilidades.imprimir(suma);
    }

    public static String sumatoriaNPrimerosImparesPos( int num){
        int sum=0; String suma="";
    	for (int i=1; i<=num; i++) {
        if (num%2!=0) {
    	sum+=i;
    	if(i<num) {
    		suma+=i+"+";	
    	}else {
    		suma+=i+"=";
    	}
        }
    }
    	suma+=sum;
    	return suma;
    	}
}

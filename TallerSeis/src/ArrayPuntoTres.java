
public class ArrayPuntoTres {
	public static void main(String[] args) {
	long[][] arreglo = new long[4][3] ;

	for (int i = 0; i < arreglo.length; i++) {
	    for (int j = 0; j < arreglo[i].length; j++) {
	        arreglo[i][j] = 5;
	    }
	}
	
	for (int i = 0; i < arreglo.length; i++) {
        for (int j = 0; j < arreglo[i].length; j++) {
            System.out.print(arreglo[i][j] + " ");
        }
        System.out.println();
}
}
}

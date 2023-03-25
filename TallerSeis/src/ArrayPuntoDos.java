
public class ArrayPuntoDos {


	    public static void main(String[] args) {
	        
	      
	        float[][] precios = new float[10][3];
	        
	       
	        precios[0][0] = 1f;
	        precios[0][1] = 2f;
	        precios[0][2] = 3f;
	        precios[1][0] = 4f;
	        precios[1][1] = 5f;
	        precios[1][2] = 6f;
	        precios[2][0] = 7f;
	        precios[2][2] = 8f;
	        precios[2][1] = 9f;
	        precios[2][1] = 185.2f;
	        precios[3][0] = 225.8f;
	        precios[3][1] = 330.7f;
	        precios[3][2] = 444.75f;
	        precios[4][0] = 55.0f;
	        precios[4][1] = 66.25f;
	        precios[4][2] = 77.5f;
	        precios[5][0] = 88.25f;
	        precios[5][2] = 99.5f;
	        precios[5][1] = 222.25f;
	        precios[6][0] = 3332f;
	        precios[6][1] = 444.8f;
	        precios[6][2] = 555.7f;
	        precios[7][2] = 666.75f;
	        precios[7][0] = 777.0f;
	        precios[7][1] = 888.25f;
	        precios[8][2] = 999.5f;
	        precios[8][0] = 1111.25f;
	        precios[8][1] = 81.5f;
	        precios[9][0] = 9.25f;
	        precios[9][1] = 1032f;
	        precios[9][2] = 9.25f;
	        precios[9][1] = 1032f;
	      
	        // Mostrar los valores del array
	        System.out.println("Los precios son: ");
	        for(int i = 0; i < precios.length; i++) {
	            for(int j = 0; j < precios[i].length; j++) {
	                System.out.print(+ precios[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}

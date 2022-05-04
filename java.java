package busquedabinaria;


/**
 * 
 * @author carmen
 * @version 1.0 03/05/22
 */

public class busquedabinaria {
	public static int contador;

	
	/**Main que genera el vector en el que posteriormente buscará un número específico y devolverá su posición.
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		int[] v = new int[40000000];

		for(int j=0;j<v.length; j++) {

			v[j] = j;

		}

		int busca = 3447;

		System.out.print("Valor: " + buscab(v,busca) + " encontrado en el intento " + contador);

	}
	
	/**Busca el número dentro del vector, siempre que lo encuentra devuelve 0; si devuelve -1 es porque el número no está en el vector.
	 * 
	 * @param vector
	 * @param valorabuscar
	 * @return
	 */
	public static int buscab(int[] vector, int valorabuscar) {

		int mitad, inferior = 0;

		int superior = vector.length - 1;

		contador = 0;

		do {

			contador++;

			mitad = (inferior + superior) >>> 1;

			if(valorabuscar > vector[mitad]) {

				inferior = mitad + 1;

			} else {

				superior = mitad - 1;

			}

		} while(vector[mitad] != valorabuscar && inferior <= superior);

		if(vector[mitad] == valorabuscar) {

			return mitad;

		} else {

			return -1;

		}

	}

}

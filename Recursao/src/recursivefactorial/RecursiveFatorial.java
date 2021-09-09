/**
 * 
 */
package recursivefactorial;

/**
 * @author vveloso
 *
 */
public class RecursiveFatorial {
	
	public static int recursiveFactorial(int n) {
		// função fatorial recursiva
		if (n == 0) {
			return 1; // caso base
		
		} else {
			return n * recursiveFactorial(n - 1); // caso recursivo
		}
	}
}
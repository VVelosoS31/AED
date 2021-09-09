/**
 * 
 */
package reversearray;

/**
 * @author vveloso
 *
 */
public class ReverseArray {
	public static int[] reverseArray(int[]A, int i, int j) {
		if (i < j) {
			int t = A[i];
			A[i] = A[j];
			A[j] = t;
			reverseArray(A, i++, j--);
		}
		
		return A;
	}
}
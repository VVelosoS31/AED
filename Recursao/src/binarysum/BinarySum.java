/**
 * 
 */
package binarysum;

/**
 * @author vveloso
 *
 */
public class BinarySum {
	public static int binarySum(int[]A, int i, int n) {
		if(n == 1) {
			return A[i];
		}
		
		return binarySum(A, i, n/2) + binarySum(A, i + (n/2), n/2);
	}

}
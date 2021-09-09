/**
 * 
 */
package iterativereversearray;

/**
 * @author vveloso
 *
 */
public class IterativeReverseArray {
	public static int[] interativeReverseArray(int[]A, int i, int j) {
		while(i < j) {
			int t = A[i];
			A[i] = A[j];
			A[j] = t;
			
			i ++;
			j --;
		}
		
		return A;
		
	}

}

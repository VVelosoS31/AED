/**
 * 
 */
package linearfibonacci;

/**
 * @author vveloso
 *
 */
public class LinearFibonacci {
	public  Valores linearFibonacci(int k) {
		Valores v = new Valores();
		
		if(k <= 1) {
			v.setX(k);
			v.setY(0);
			return v;
		}else {
			int i = linearFibonacci(k);
			int j = linearFibonacci(k-1);
			
			
			v.setX(i+j);
			v.setY(i);
		}
		return v;
	}
}

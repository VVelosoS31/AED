/**
 * 
 */

/**
 * @author vveloso
 *
 */
public class Arranjo {
	Integer[] ls = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
	public Integer menor() {
		int menor = 1000;
		for(int x : ls) {
			if(x < menor) {
				menor = x;
			}
		}
		return menor;
	}

	public Integer maior() {
		int maior = 0;
		for(int x: ls) {
			if(x > maior) {
				maior = x;
			}
		}
		return maior;
	}

	public Integer soma() {
		int soma = 0;
		for(int x : ls) {
			soma += x;
		}
		return soma;
	}

	public Integer repeticoes(int i) {
		int qtd = 0;
		for(int x : ls) {
			if(x == i) {
				qtd += 1;
			}
		}
		return qtd;
	}

}

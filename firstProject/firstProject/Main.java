/**
 * 
 */
package firstProject;

import java.util.Scanner;

/**
 * @author vveloso
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Qual o seu nome?"); // usando println
		
		//Ler uma string do console usando a biblioteca Scanner.
		Scanner name = new Scanner(System.in);
		String nome = name.nextLine();
		
		//Exibir uma string formatada com o printf
		System.out.printf("Olá %s, seja bem vindo!", nome);
		
		}

}

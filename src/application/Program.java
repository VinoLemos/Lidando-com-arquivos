package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = null;
		//Arquivo criado recebendo como parametro o caminho para o arquivo em disco
		File file = new File("/home/vino/Documents/Teste.txt");//Alterar caminho do arquivo conforme necessário
		
		try {
			//Atribui o arquivo ao Scanner para que possa ser lido
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
					
		}
		catch (IOException e) {
			System.out.println("Eror: " + e.getMessage());
		}
		finally {
			//Fecha o scanner caso ele tenha recebido algum parâmetro
			if (sc != null) {
			sc.close();
			}
		}
	}

}

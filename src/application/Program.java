package application;

import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o caminho da pasta: ");
		String pastaCam = sc.nextLine();
		
		//Instancia um arquivo recebendo o caminho de uma pasta
		File caminho = new File(pastaCam);
		
		//Cria um vetor de arquivos, e lista só os objetos que forem diretórios
		File[] pastas = caminho.listFiles(File::isDirectory);
		
		System.out.println();
		System.out.println("Pastas: ");
		
		for (File pasta : pastas) {
			System.out.println(pasta);
		}
		//Vetor de arquvos que retorna tudo aquilo que for arquivo em um diretório
		File[] arquivos = caminho.listFiles(File::isFile);
		
		System.out.println();
		System.out.println("Arquivos: ");
		
		for (File arquivo : arquivos) {
			System.out.println(arquivo);
		}
		
		System.out.println();
		//Cria um novo diretorio, com o nome definido nos parametros do arquivo (diretorio criado a partir da função mkdir())
		boolean sucesso = new File(pastaCam + "\\subdiretorio").mkdir();
		System.out.println("Diretorio criado com sucesso - " + sucesso);
		
		sc.close();
	}
}

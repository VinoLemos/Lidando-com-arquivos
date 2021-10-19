package application;

import java.io.File;
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
		
		System.out.println();
		System.out.println("---------------------------------------------------------");
		
		System.out.println("Obtendo informações de um arquivo");
		
		File file = new File("/home/vino/Documents/Teste.txt");
		
		System.out.println("getName: " + file.getName());//Retorna o nome do arquivo
		System.out.println("getParent: " + file.getParent());//Retorna o caminho do arquivo
		System.out.println("getPath: " + file.getPath());//Retorna o caminho com nome do arquivo
		System.out.println("getFreeSpace: " + file.getFreeSpace());//Retorna o espaço livre do arquivo
		
		sc.close();
	}
}

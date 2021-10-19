package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
		
		System.out.println("Informe o caminho do arquivo: ");
		String caminho = sc.nextLine();
		//Caso o arquivo não exista no diretório informado, ele será criado automaticamente
		
		
		//Instancia um BufferedWriter recebendo um FileWriter como parametro
		//Sem o parametro true, a cada vez que o programa for executado, ele substituirá todo o conteudo do arquivo
		//Com o parametro true, ele acrescentará ao final do arquivo todo o conteúdo que lhe for direcionado
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))){
			for (String line: lines) {
				bw.write(line);//Escreve o conteúdo do array de strings dentro do arquivo
				bw.newLine();//Quebra de linha
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	
	}
}

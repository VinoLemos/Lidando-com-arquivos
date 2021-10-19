package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String path = "/home/vino/Documents/Teste.txt";//Alterar conforme necessário
		FileReader fr = null; // Sequencia de leitura a partir de um arquivo
		BufferedReader br = null; // Instanciado a partir do FileReader, implementando algumas otimizações
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e){
			System.out.println("Error: " + e.getMessage());	
		}
		finally {
			try {
				if (br != null) {
					br.close();	
				}
				if (fr != null) {
					fr.close();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	
	//Utilizando bloco try with resources para instanciar um BufferedReader recebendo um FileReader como parâmetro

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o caminho do arquivo: ");
		String path = sc.nextLine();//Recebe o caminho do arquivo
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e){
			System.out.println("Error: " + e.getMessage());	
		}

	sc.close();	
	}
}

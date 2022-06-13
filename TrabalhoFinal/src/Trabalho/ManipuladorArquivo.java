package Trabalho;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

import java.util.ArrayList;

public class ManipuladorArquivo {
	
	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while (true) {
			if (linha != null) {
				System.out.println(linha);

			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
	}

	public static void escritor(String path) throws IOException {
		
		ArrayList < String > texto = new  ArrayList < String >();
			
		BufferedWriter  escrever = new  BufferedWriter ( new  FileWriter ( path ));
			
		String  t = "", o = "", ec = "", s = "", d = "";
		
		JOptionPane.showInputDialog("título");
		System.out.println(t);
		
		JOptionPane.showInputDialog("objetivo");
		System.out.println(o);
		
		JOptionPane.showInputDialog("endereço completo");
		System.out.println(ec);
		
		
		JOptionPane.showInputDialog("data de início");
		System.out.println(d);
		
		
		JOptionPane.showInputDialog("status.");
        System.out.println(s);
        
		
        JOptionPane.showMessageDialog(null, "Inserido com Sucesso");
		
		escrever.append(texto + "\n");
	
		escrever.close();
		System.out.println("Criado com sucesso");
		
	}
	
	public static void escritora(String path) throws IOException {
		
		ArrayList < String > texto = new  ArrayList < String >();
			
		BufferedWriter  escrever = new  BufferedWriter ( new  FileWriter ( path ));
			
		String  t = "", o = "", ec = "", s = "", d = "";
		
		JOptionPane.showInputDialog("data");
		System.out.println(t);
		
		JOptionPane.showInputDialog(" hora");
		System.out.println(o);
		
		JOptionPane.showInputDialog("endereço completo");
		System.out.println(ec);
		
		
		JOptionPane.showInputDialog("descrição e ação");
		System.out.println(d);
        
		
        JOptionPane.showMessageDialog(null, "Inserido com Sucesso");
		
		escrever.append(texto + "\n");
	
		escrever.close();
		System.out.println("Criado com sucesso");
}	
}

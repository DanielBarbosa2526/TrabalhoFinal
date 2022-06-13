package Trabalho;

import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class PArquivo extends JFrame {

	private JPanel contentPane;
	private JTextField Txtop;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PArquivo frame = new PArquivo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PArquivo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel DadosP = new JLabel("Digite 1 - Cadastrar dados de um Projeto Social");
		DadosP.setBounds(28, 41, 314, 14);
		contentPane.add(DadosP);
		
		JLabel AgendaP = new JLabel("Digite 2 - Cadastrar agenda do Projeto Social");
		AgendaP.setBounds(28, 96, 217, 14);
		contentPane.add(AgendaP);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		
				String nome = "";
				int op1 = Integer.parseInt(Txtop.getText()); 
				
				switch(op1) {
				case 1:
					try {
						ManipuladorArquivo.escritor(nome);
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
				break;
				case 2:
					try {
						ManipuladorArquivo.escritora(nome);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				break;	
			}
				
				Path dir = Paths.get("C:", "teste");

				
				Path path = dir.resolve("AulaLP.doc");
				
				System.out.println(path);
			}
		});
		btnNewButton.setBounds(177, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		Txtop = new JTextField();
		Txtop.setBounds(177, 158, 89, 20);
		contentPane.add(Txtop);
		Txtop.setColumns(10);
	}
}

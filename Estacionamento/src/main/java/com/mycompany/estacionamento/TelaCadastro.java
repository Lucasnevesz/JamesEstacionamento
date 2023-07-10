package com.mycompany.estacionamento;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class TelaCadastro extends PrecosEstacionamento{

	private JFrame frame;	
	
	public static void main(String[] args) {
		TelaCadastro window = new TelaCadastro();
		window.frame.setVisible(true);
	}
	
	public TelaCadastro() {
		iniciar();
	}

	private void iniciar() {
		
		

		//#Cria a Janela.
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setLocationRelativeTo(null);
		frame.setSize(600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);
		panel.setLayout(null);
		
		frame.getContentPane().add(panel);
		
		//#Cria o Titulo da tela
		
		JLabel lblNewLabel = new JLabel("Cadastro de clientes");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(203, 33, 186, 14);
		panel.add(lblNewLabel);
		
		//#Cria area de texto para colocar o nome do cliente.
		
            
		JLabel lblNewLabel_1 = new JLabel("Nome Cliente");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(23, 65, 125, 20);
		panel.add(lblNewLabel_1);
		
                
		JTextArea areaTexto = new JTextArea(); 
		areaTexto.setBounds(23, 89, 125, 20);
		panel.add(areaTexto);
		
		//#Cria area de combobox para colocar o tipo de veiculo
		
		JLabel lblNewLabel_2 = new JLabel("Veiculo");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(23, 127, 125, 20);
		panel.add(lblNewLabel_2);
		
		JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] {"Carro", "Moto"}));
		comboBox.setBounds(23, 150, 138, 22);
		panel.add(comboBox);
		
		
		//#Cria area de Texto para colocar a marca

		JLabel lblNewLabel_3 = new JLabel("Marca");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(250, 65, 125, 20);
		panel.add(lblNewLabel_3);
		
		JTextArea areaTexto_2 = new JTextArea(); 
		areaTexto_2.setBounds(250, 89, 125, 20);
		panel.add(areaTexto_2);
		
		//#Cria area de Texto para colocar a cor
		
		JLabel lblNewLabel_4 = new JLabel("Cor");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(250, 127, 125, 20);
		panel.add(lblNewLabel_4);
		
		JTextArea areaTexto_4 = new JTextArea(); 
		areaTexto_4.setBounds(250, 150, 138, 22);
		panel.add(areaTexto_4);
		
		//#Cria area de Texto para colocar o modelo
		
		JLabel lblNewLabel_5 = new JLabel("Modelo");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(430, 65, 125, 20);
		panel.add(lblNewLabel_5);
		
		JTextArea areaTexto_5 = new JTextArea(); 
		areaTexto_5.setBounds(430, 89, 125, 20);
		panel.add(areaTexto_5);
		
		
		//#Cria area que diz se a pessoa está ativa ou não.
		
		JLabel lblNewLabel_6 = new JLabel("Telefone");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(430, 127, 125, 20);
		panel.add(lblNewLabel_6);
		
		JTextArea areaTexto_6 = new JTextArea();
		areaTexto_6.setBounds(430, 150, 138, 22);
		panel.add(areaTexto_6);
		
		
		//#Cria o seperador na tela
		
		JSeparator separador = new JSeparator();
		separador.setForeground(Color.BLUE);
		separador.setBounds(12, 196, 525, 8);
		panel.add(separador);
		
		
		 //Cria botão de cadastro
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(23, 210, 106, 23);
		panel.add(btnNewButton);
		
		 //Cria botão de Limpar
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.setBounds(23, 240, 106, 23);
		panel.add(btnNewButton_1);
		
		//# Dropdown de menu
		
		JMenuBar barraMenu = new JMenuBar();
		barraMenu.setBackground(Color.DARK_GRAY);
		barraMenu.setBounds(0, 0, 533, 22);
		panel.add(barraMenu);		
		
		JMenu menu = new JMenu("Menu");
		menu.setForeground(Color.WHITE);
		menu.setBackground(Color.DARK_GRAY);
		barraMenu.add(menu);
		
		JMenuItem itemMenu = new JMenuItem("Sair");
		menu.add(itemMenu);
		
		frame.setVisible(true);
	}

}
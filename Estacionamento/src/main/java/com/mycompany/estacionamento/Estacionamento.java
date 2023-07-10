
package com.mycompany.estacionamento;
import java.util.Scanner;

public class Estacionamento {

    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);
       
        CadastroVeiculo[] veiculos = new CadastroVeiculo[2];
        
        for (int i = 0; i < 1; i++) {
        veiculos[i] = CadastroVeiculo.CriarCadastro(scanner);
        
        }
        veiculos[0].ExibirCadastro();
        //veiculos[1].ExibirCadastro();
        //veiculos[0].ValorCobrado();
    } 
}

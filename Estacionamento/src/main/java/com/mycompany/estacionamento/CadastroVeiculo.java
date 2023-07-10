package com.mycompany.estacionamento;


import java.util.Scanner;


public class CadastroVeiculo extends TempoValor{
   
    private int id;
    private String placaVeiculo;
    private String corVeiculo;
    private String marcaVeiculo;
    private String tipoVeiculo;
    private String nomeCliente;
    private String telefoneCliente;
     
    
    
    
    //Construtor da classe CadastroVeiculo
    public CadastroVeiculo(int id, String placaVeiculo, String corVeiculo, String marcaVeiculo, String tipoVeiculo, String nomeCliente, String telefoneCliente, int dataHoraEntrada1, int dataHoraSaida1) {
        
        this.id = id;
        this.placaVeiculo = placaVeiculo;
        this.corVeiculo = corVeiculo;
        this.marcaVeiculo = marcaVeiculo;
        this.tipoVeiculo = tipoVeiculo;
        this.nomeCliente = nomeCliente;
        this.telefoneCliente = telefoneCliente;
        this.dataHoraEntrada = dataHoraEntrada1;
        this.dataHoraSaida = dataHoraSaida1;
        
        
    }

   // Métodos getters e setters para acessar os atributos
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getPlacaVeiculo() {
        return placaVeiculo;
    }
    
    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }
    
    public String getCorVeiculo() {
        return corVeiculo;
    }
    
    public void setCorVeiculo(String corVeiculo) {
        this.corVeiculo = corVeiculo;
    }
    
    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }
    
    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }
    
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
    
    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }
    
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    public String getTelefoneCliente() {
        return telefoneCliente;
    }
    
    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }
    
    void ExibirCadastro(){
        System.out.println("ID: " + this.id);
        System.out.println("Placa: " + this.placaVeiculo);
        System.out.println("Cor: " + this.corVeiculo);
        System.out.println("Marca: " + this.marcaVeiculo);
        System.out.println("Tipo: " + this.tipoVeiculo);
        System.out.println("Nome do cliente: " + this.nomeCliente);
        System.out.println("Telefone do cliente: " + this.telefoneCliente);
        System.out.println("Horário de entrada: " + this.dataHoraEntrada);
        System.out.println("Horário de saída: " + this.dataHoraSaida);
    }
    
    public static CadastroVeiculo CriarCadastro(Scanner scanner) {
        System.out.print("Informe o ID do veículo:");
        int id = scanner.nextInt();
        
        System.out.print("Informe a placa do veículo:");
        String placaVeiculo = scanner.next();
        
        System.out.print("Informe a cor do veículo:");
        String corVeiculo = scanner.next();
        
        System.out.print("Informe a marca do veículo:");
        String marcaVeiculo = scanner.next();
        
        System.out.print("Informe o tipo do veículo:");
        String tipoVeiculo = scanner.next();
        
        System.out.print("Informe o nome do cliente:");
        String nomeCliente = scanner.next();
        
        System.out.print("Informe o telefone do cliente:");
        String telefoneCliente = scanner.next();
        
        System.out.print("Informe o horário de entrada:");
        int dataHoraEntrada = scanner.nextInt();
        
        System.out.print("Informe o horário de saída:");
        int dataHoraSaida = scanner.nextInt();
        
        return new CadastroVeiculo(id, placaVeiculo, corVeiculo, marcaVeiculo, tipoVeiculo,
                                   nomeCliente, telefoneCliente, dataHoraEntrada, dataHoraSaida);
    }
    
    void ValorCobrado(){
        int restohora;
        double valor;
        
        if(tipoVeiculo.equals("carro")){
            restohora = this.dataHoraSaida - this.dataHoraEntrada;
            if (restohora>=10){
                valor = carroDiaria;
                System.out.print("O valor a ser pago do estacionamento é: R$"+valor);
            } else if(restohora<=9){
                valor = restohora * carroHora;
                System.out.print("O valor a ser pago do estacionamento é: R$"+valor);
            }
            
        } else if (tipoVeiculo.equals("moto")) {
            restohora = this.dataHoraSaida - this.dataHoraEntrada;
            if (restohora>=10) {
                valor = motoDiaria;
                System.out.println("O valor a ser pago do estacionamento é: R$"+valor);
            } else if(restohora<=9){
                valor = restohora * motoHora;
                System.out.print("O valor a ser pago do estacionamento é: R$"+valor);
            }
        }
    }
    
}

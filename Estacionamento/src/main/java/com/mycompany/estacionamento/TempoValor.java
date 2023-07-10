package com.mycompany.estacionamento;

public class TempoValor extends TelaCadastro {
    
    public int id;
    public int dataHoraEntrada;
    public int dataHoraSaida;
    public String placa;
    public String tipoEstadia;
    public int vagaEstacionada;
    public Double valorPagamento;
    public String tipoPagamento;
    public int vagaUsada;
    public int ativo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public void setDataHoraEntrada(int dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public int getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(int dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoEstadia() {
        return tipoEstadia;
    }

    public void setTipoEstadia(String tipoEstadia) {
        this.tipoEstadia = tipoEstadia;
    }

    public int getVagaEstacionada() {
        return vagaEstacionada;
    }

    public void setVagaEstacionada(int vagaEstacionada) {
        this.vagaEstacionada = vagaEstacionada;
    }

    public Double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(Double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public int getVagaUsada() {
        return vagaUsada;
    }

    public void setVagaUsada(int vagaUsada) {
        this.vagaUsada = vagaUsada;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }
    
}

 
   
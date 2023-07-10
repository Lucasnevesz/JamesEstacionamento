package com.mycompany.estacionamento;

public class PrecosEstacionamento{
   
    public int id;
    public Double carroHora = 3.00;
    public Double carroDiaria = 20.00;
    public Double carroMensal = 200.00;
    public Double motoHora = 1.50;
    public Double motoDiaria = 10.00;
    public Double motoMensal = 100.00;

    public int getId() {
        return id;
    }

   
    public void setId(int id) {
        this.id = id;
    }

    
    public Double getCarroHora() {
        return carroHora;
    }

    
    public void setCarroHora(Double carroHora) {
        this.carroHora = carroHora;
    }

   
    public Double getCarroDiaria() {
        return carroDiaria;
    }

    
    public void setCarroDiaria(Double carroDiaria) {
        this.carroDiaria = carroDiaria;
    }

    
    public Double getCarroMensal() {
        return carroMensal;
    }

    
    public void setCarroMensal(Double carroMensal) {
        this.carroMensal = carroMensal;
    }

   
    public Double getMotoHora() {
        return motoHora;
    }


    public void setMotoHora(Double motoHora) {
        this.motoHora = motoHora;
    }

   
    public Double getMotoDiaria() {
        return motoDiaria;
    }

   
    public void setMotoDiaria(Double motoDiaria) {
        this.motoDiaria = motoDiaria;
    }

  
    public Double getMotoMensal() {
        return motoMensal;
    }


    public void setMotoMensal(Double motoMensal) {
        this.motoMensal = motoMensal;
    }
}

package com.objetos;

public class Director extends Empleado {

    @Override

    public int getDiasVacaciones(){
        return 30;
    }

    public Director(){

        // int salMinimo = super.getSalarioMinimo();
        // this.setSalarioMinimo(salMinimo + 200);

        this.setSalarioMinimo(super.getSalarioMinimo() + 200);
    }

   
    
}

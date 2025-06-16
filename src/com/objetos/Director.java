package com.objetos;

public class Director extends Empleado {

    public Director(){

        // int salMinimo = super.getSalarioMinimo();
        // this.setSalarioMinimo(salMinimo + 200);

        this.setSalarioMinimo(super.getSalarioMinimo() + 200);
    }
    
}

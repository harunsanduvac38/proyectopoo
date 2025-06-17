package com.objetos;

public class Director extends Empleado {

    // @Override
    // public void metodoFinal() {
    //     System.out.println("Soy un método final director!");
    // }



    @Override
    public int getDiasVacaciones(){
        System.out.println("vacaciones de director");
        return super.getDiasVacaciones() + 8;
    }
    

    // IMPLEMENTA
    public int getDiasVacaciones(int diasExtra){
        return 30 + diasExtra;
    }

    public Director(){

        // int salMinimo = super.getSalarioMinimo();
        // this.setSalarioMinimo(salMinimo + 200);

        this.setSalarioMinimo(super.getSalarioMinimo() + 200);
    }




   
    
}

package com.objetos;

public class Empleado extends Persona {
    public Empleado(){

        // Estamos llamando al constructor vacio de persona
        super();
        System.out.println("Constructor de Empleado");
    }

    // public Empleado(String nombre, String apellidos){
    //     // Podemos llamar al constructor con parametros de persona:
    //     super(nombre, apellidos);
    //     System.out.println("Constructor con nombre y apellidos Empleado");
    // }
    // Implementar algo en el empleado

    private int sueldo;

    public int getSueldo(){
        return this.sueldo;
    }

    public void setSueldo(int sueldo){
        this.sueldo=sueldo;
    }



}

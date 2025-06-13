package com.objetos;

public class Persona {
    // debemos declarar las variables privadas de cada propiedad
    private String nombre;
    private String apellidos;
    private int edad;

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        // debemos controlar la edad y realizar la acción que más nos guste
        // 1)error silencioso: El programador no sabe que ha hecho algo mal, simplemente lo soluciono yo aquí
        if(edad < 0){
            this.edad = 0;
        }else {
            this.edad = edad;
        }
        
    }

    // Por cada propiedad tenemos dos metodos  (Get y Set) y get para recuperar, set para almacenar

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellidos(){
        return this.apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    
}

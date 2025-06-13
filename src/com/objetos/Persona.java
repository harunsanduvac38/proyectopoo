package com.objetos;

import java.util.Scanner;

public class Persona {
    // debemos declarar las variables privadas de cada propiedad
    private String nombre;
    private String apellidos;
    private int edad;

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) throws Exception {
        // debemos controlar la edad y realizar la acción que más nos guste
      // 1)error silencioso: El programador no sabe que ha hecho algo mal, simplemente lo soluciono yo aquí
        // if(edad < 0){
        //     this.edad = 0;
        // }else {
        //     this.edad = edad;
        // }
        
      // 2)Error grave : El programador sabe que eesto le puede dar un error, que lo controle.

        if(edad < 0){
            throw new Exception ("La edad no puede ser negativa");
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

    public enum tipoGenero {
        FEMENINO, MASCULINO, OTROS
    }

    private tipoGenero genero;

    public tipoGenero getGenero(){
        return this.genero;
    }

    public void setGenero(tipoGenero genero){
        this.genero = genero;
    }

    public String getNombreCompleto(){
        return this.nombre + " " + this.apellidos;
    }

    public String getNombreCompleto(int numero){
        return this.nombre.toUpperCase() + " " + this.apellidos.toUpperCase();
    }

    public String getNombreCompleto(boolean orden){
        return this.apellidos + ", " + this.nombre;
    }

    public String getNombreCompleto(String separador){
        return this.nombre + separador + this.apellidos;
    }

    
    public void getNombreCompleto(int num1, int num2){ //otro ejemplo
        int suma = num1 + num2;
    }

    public int getNomberCompleto(String a, int b){  //otro ejemplo
        return 19;
    }





    private int dni;
    

    public int getDni(){
        return this.dni;
    }

    public void setDni (int dni){
        this.dni=dni;
    }


    public char calcularLetra (){

        String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKET";
        int resultado = (dni - (dni/23) * 23);
        char letra = letrasDni.charAt(resultado);
        return letra;
        
    }




    
}

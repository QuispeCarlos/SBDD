/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author LENOVO
 */
public class Empleado {

    public Empleado(String cedula, String nombre, String apellido,int edad)
    {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad=edad;
        
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    private String cedula, nombre, apellido;
    private int edad;
    
}

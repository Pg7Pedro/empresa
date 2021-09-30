/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author gemam
 */
public class Empleados extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contador;

    public Empleados() {
        this.idEmpleado = ++Empleados.contador;
    }

    
    
    public Empleados(String nombre, double sueldo) {
        this();
        this.nombre= nombre;
        this.sueldo=sueldo;
        
    }

    public Empleados(double sueldo, String nombre, String direccion, char genero, int edad) {
        super(nombre, direccion, genero, edad);
        this.sueldo = sueldo;
        //this.idEmpleado=++Empleados.contador;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getContador() {
        return contador;
    }

    @Override
    public String toString() {
        return "Empleados{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + " , " + super.toString()+'}';
    }

    
    
    
}


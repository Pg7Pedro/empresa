/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.Date;

/**
 *
 * @author gemam
 */
public class Cliente extends Persona{
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorc;

    public Cliente() {
    }

   

    public Cliente(Date fechaRegistro, boolean vip, String nombre, String direccion, char genero, int edad) {
        super(nombre, direccion, genero, edad);
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
        this.idCliente = ++Cliente.contadorc;
        
        
    }

    

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", fechaRegistro=" + fechaRegistro + ", vip=" + vip + '}';
    }
    
    
    
    
}

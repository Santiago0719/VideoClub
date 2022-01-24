/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Samsung
 */
public class recibodevolucion {
    private int Iddevolucion;
    private Date fechadevolucion;
    private int Idprestamo;

    public recibodevolucion() {
    }

    public recibodevolucion(int Iddevolucion, Date fechadevolucion, int Idprestamo) {
        this.Iddevolucion = Iddevolucion;
        this.fechadevolucion = fechadevolucion;
        this.Idprestamo = Idprestamo;
    }

    public int getIddevolucion() {
        return Iddevolucion;
    }

    public Date getFechadevolucion() {
        return fechadevolucion;
    }

    

    public int getIdprestamo() {
        return Idprestamo;
    }

    public void setIddevolucion(int Iddevolucion) {
        this.Iddevolucion = Iddevolucion;
    }

    public void setFechadevolucion(Date fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }

   

    public void setIdprestamo(int Idprestamo) {
        this.Idprestamo = Idprestamo;
    }
    
    
}

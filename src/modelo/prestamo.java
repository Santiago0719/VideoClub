/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Samsung
 */
public class prestamo {
    private int Idprestamo;
    private Date fechaprestamo;
    private String Idsocio;
    private String Idproducto;
    private int costoproducto;

    public prestamo() {
    }

    public prestamo(int Idprestamo, Date fechaprestamo, String Idsocio, String Idproducto, int costoproducto) {
        this.Idprestamo = Idprestamo;
        this.fechaprestamo = fechaprestamo;
        this.Idsocio = Idsocio;
        this.Idproducto = Idproducto;
        this.costoproducto = costoproducto;
    }

    public int getIdprestamo() {
        return Idprestamo;
    }

    public Date getFechaprestamo() {
        return fechaprestamo;
    }


    public String getIdsocio() {
        return Idsocio;
    }

    public String getIdproducto() {
        return Idproducto;
    }

    public int getCostoproducto() {
        return costoproducto;
    }

    public void setIdprestamo(int Idprestamo) {
        this.Idprestamo = Idprestamo;
    }

    public void setFechaprestamo(Date fechaprestamo) {
        this.fechaprestamo = fechaprestamo;
    }

   

    public void setIdsocio(String Idsocio) {
        this.Idsocio = Idsocio;
    }

    public void setIdproducto(String Idproducto) {
        this.Idproducto = Idproducto;
    }

    public void setCostoproducto(int costoproducto) {
        this.costoproducto = costoproducto;
    }
    
    
}

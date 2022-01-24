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
public class videoprestamo {
    private String codigoproducto;
    private String tipoproducto;
    private String nombreproducto;
    private int Idcategoria;
    private Date fechalanzamiento;

    public videoprestamo() {
    }

    public videoprestamo(String codigoproducto, String tipoproducto, String nombreproducto, int Idcategoria, Date fechalanzamiento) {
        this.codigoproducto = codigoproducto;
        this.tipoproducto = tipoproducto;
        this.nombreproducto = nombreproducto;
        this.Idcategoria = Idcategoria;
        this.fechalanzamiento = fechalanzamiento;
    }

    public String getCodigoproducto() {
        return codigoproducto;
    }

    public String getTipoproducto() {
        return tipoproducto;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public int getIdcategoria() {
        return Idcategoria;
    }

    public Date getFechalanzamiento() {
        return fechalanzamiento;
    }

    

    public void setCodigoproducto(String codigoproducto) {
        this.codigoproducto = codigoproducto;
    }

    public void setTipoproducto(String tipoproducto) {
        this.tipoproducto = tipoproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public void setIdcategoria(int Idcategoria) {
        this.Idcategoria = Idcategoria;
    }

    public void setFechalanzamiento(Date fechalanzamiento) {
        this.fechalanzamiento = fechalanzamiento;
    }

    
    
    
}

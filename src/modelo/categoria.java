/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Samsung
 */
public class categoria {
    private int Idcategoria;
    private String descripcion;

    public categoria() {
    }

    public categoria(int Idcategoria, String descripcion) {
        this.Idcategoria = Idcategoria;
        this.descripcion = descripcion;
    }

    public int getIdcategoria() {
        return Idcategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setIdcategoria(int Idcategoria) {
        this.Idcategoria = Idcategoria;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}

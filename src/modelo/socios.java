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
public class socios {
    private String identicicacion;
    private String nombre;
    private String apellidos;
    private Date fechanacimiento;
    private String celular;
    private String direccion;
    private String correo;

    public socios() {
    }

    public socios(String identicicacion, String nombre, String apellidos, Date fechanacimiento, String celular, String direccion, String correo) {
        this.identicicacion = identicicacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechanacimiento = fechanacimiento;
        this.celular = celular;
        this.direccion = direccion;
        this.correo = correo;
    }

    public String getIdenticicacion() {
        return identicicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

   

    public String getCelular() {
        return celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setIdenticicacion(String identicicacion) {
        this.identicicacion = identicicacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}

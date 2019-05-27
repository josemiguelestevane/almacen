/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Estevane
 */
public class Clase_PSM {
    private String codigo;
    private String descripcion;
    private String disponible;
    private String conteo;
    private Object estatus;

    public Clase_PSM(String codigo, String descripcion, String disponible, String conteo, Object estatus) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.disponible = disponible;
        this.conteo = conteo;
        this.estatus = estatus;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    public String getConteo() {
        return conteo;
    }

    public void setConteo(String conteo) {
        this.conteo = conteo;
    }

    public Object getEstatus() {
        return estatus;
    }

    public void setEstatus(Object estatus) {
        this.estatus = estatus;
    }

   
   
    
}

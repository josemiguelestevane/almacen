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
public class Clase_REQ {
    private String fecha;
    private String dpto;
    private Object departamento;
    private String req;
    private String cantidad;
    private Object estatus;
    private String unidad;
    private String descripcion;

    public Clase_REQ(String fecha, String dpto, Object departamento, String req, String cantidad, Object estatus, String unidad, String descripcion) {
        this.fecha = fecha;
        this.dpto = dpto;
        this.departamento =departamento;
        this.req = req;
        this.cantidad = cantidad;
        this.estatus = estatus;
        this.unidad = unidad;
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public Object getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Object departamento) {
        this.departamento = departamento;
    }

    public String getReq() {
        return req;
    }

    public void setReq(String req) {
        this.req = req;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public Object getEstatus() {
        return estatus;
    }

    public void setEstatus(Object estatus) {
        this.estatus = estatus;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}    
    
   
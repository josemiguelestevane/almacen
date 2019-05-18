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
    private int codigo;
    private String descripcion;
    private int disponible;
    private int conteo;

    public Clase_PSM(int codigo, String descripcion, int disponible, int conteo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.disponible = disponible;
        this.conteo = conteo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }

    public int getConteo() {
        return conteo;
    }

    public void setConteo(int conteo) {
        this.conteo = conteo;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author appleapple
 */
public class Clase_INV {
    private Object codigo;
    private Object conteo;

    public Clase_INV(Object codigo, Object conteo) {
        this.codigo = codigo;
        this.conteo = conteo;
    }

    public Object getCodigo() {
        return codigo;
    }

    public void setCodigo(Object codigo) {
        this.codigo = codigo;
    }

    public Object getConteo() {
        return conteo;
    }

    public void setConteo(Object conteo) {
        this.conteo = conteo;
    }
  
}

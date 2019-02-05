/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorfinal;

import java.util.ArrayList;

/**
 *
 * @author MrCante
 */
public class Nodo {
    public String Etiqueta; //ETIQUETA DEL NODO
    public ArrayList<Nodo> hijos = new ArrayList<>(); //LISTA DE NODOS DE TIPO NODO
    public String valor; //VALOR QUE CONTENDRÁ
    public int idNod; //CORRELATIVO
    
    public Nodo(String etiqueta){
        setEtiqueta(etiqueta);
        hijos = new ArrayList<>();
        setIdNod(0);
    }
    
    public void AddHijos(Nodo hijo){
        hijos.add(hijo);
    }

    public String getEtiqueta() {
        return Etiqueta;
    }

    public void setEtiqueta(String Etiqueta) {
        this.Etiqueta = Etiqueta;
    }

    public ArrayList<Nodo> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Nodo> hijos) {
        this.hijos = hijos;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getIdNod() {
        return idNod;
    }

    public void setIdNod(int idNod) {
        this.idNod = idNod;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

public class Citas{
    private String Fecha, Hora, Descripcion;

    public Citas(String Fecha, String Hora, String Descripcion){
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.Descripcion = Descripcion;
    }

    public void SetFecha(String Fecha){
        this.Fecha = Fecha;
    }

    public String GetFecha(){
        return Fecha;
    }

    public void SetHora(String Hora){
        this.Hora = Hora;
    }

    public String GetHora(){
        return Hora;
    }

    public void SetDescripcion(String Descripcion){
        this.Descripcion = Descripcion;
    }
    
    public String GetDescripcion(){
        return Descripcion;
    }
}
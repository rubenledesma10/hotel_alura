
package com.mycompany.hotel_alura.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Huespedes implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_huesped;
    private String nombre;
    private String apellido;
    private String fecha_nac;
    private String nacionalidad;
    private String telefono;
    @OneToOne
    private Reservas unReser;

    public Huespedes() {
    }

    public Huespedes(int id_huesped, String nombre, String apellido, String fecha_nac, String nacionalidad, String telefono, Reservas unReser) {
        this.id_huesped = id_huesped;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
        this.unReser = unReser;
    }

    public int getId_huesped() {
        return id_huesped;
    }

    public void setId_huesped(int id_huesped) {
        this.id_huesped = id_huesped;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Reservas getUnReser() {
        return unReser;
    }

    public void setUnReser(Reservas unReser) {
        this.unReser = unReser;
    }

}

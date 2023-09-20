
package com.mycompany.hotel_alura.persistencia;

import com.mycompany.hotel_alura.logica.Huespedes;
import com.mycompany.hotel_alura.logica.Reservas;
import com.mycompany.hotel_alura.logica.Usuario;
import com.mycompany.hotel_alura.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    HuespedesJpaController huespJPA = new HuespedesJpaController();
    ReservasJpaController reserJPA = new ReservasJpaController();
    UsuarioJpaController usuJPA = new UsuarioJpaController();

    public void crearUsuario(Usuario usu) {
        usuJPA.create(usu);
    }

    public List<Usuario> traerUsuarios() {
        List<Usuario> listaUsuarios = usuJPA.findUsuarioEntities();
        return listaUsuarios;
    }

    public void crearReserva(Reservas reservas, Huespedes huespedes) {
        reserJPA.create(reservas);
        huespJPA.create(huespedes);
    }

    public List<Huespedes> traerHuespedes() {
        return huespJPA.findHuespedesEntities();
    }

    public List<Reservas> traerReservas() {
        return reserJPA.findReservasEntities();
    }

    public Huespedes traerHuesped(int id_huesped) {
        return huespJPA.findHuespedes(id_huesped);
    }

    public Reservas buscarHuesped(int id_reserva) {
        return reserJPA.findReservas(id_reserva);
    }

    public void editarHuesped(Huespedes huesped) {
        try {
            huespJPA.edit(huesped);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarReserva(Reservas reser) {
        try {
            reserJPA.edit(reser);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarHuesped(int id_huesped) {
        try {
            huespJPA.destroy(id_huesped);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarReserva(int id_reserva) {
        try {
            reserJPA.destroy(id_reserva);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

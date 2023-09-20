package com.mycompany.hotel_alura.logica;

import com.mycompany.hotel_alura.persistencia.ControladoraPersistencia;
import java.util.Date;
import java.util.List;

public class ControladoraLogica {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearUsuario(String nombreUsuario, String contrasenia) {
        Usuario usu = new Usuario();
        usu.setNombreUsuario(nombreUsuario);
        usu.setContrasenia(contrasenia);
        controlPersis.crearUsuario(usu);
    }

    public Usuario validarUsuario(String usuario, String contrasenia) {
        Usuario usr = null;
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        for (Usuario usu : listaUsuarios) {
            if (usu.getNombreUsuario().equals(usuario)) {
                if (usu.getContrasenia().equals(contrasenia)) {
                    usr = usu;
                    return usr;
                } else {
                    usr = null;
                    return usr;
                }
            } else {
                usr = null;
            }
        }

        return usr;
    }

    public void crearReserva(Date fecha_ingreso, Date fecha_salida, Double valor, String formaPago, String nombre, String apellido, String fecha_nac, String nacionalidad, String telefono) {

        Reservas reservas = new Reservas();

        reservas.setFecha_entrada(fecha_ingreso);
        reservas.setFecha_salida(fecha_salida);
        reservas.setValor(valor);
        reservas.setForma_pago(formaPago);

        Huespedes huespedes = new Huespedes();
        huespedes.setNombre(nombre);
        huespedes.setApellido(apellido);
        huespedes.setFecha_nac(fecha_nac);
        huespedes.setNacionalidad(nacionalidad);
        huespedes.setTelefono(telefono);
        huespedes.setUnReser(reservas);

        controlPersis.crearReserva(reservas, huespedes);

    }

    public List<Huespedes> traerHuespedes() {
        return controlPersis.traerHuespedes();
    }

    public List<Reservas> traerReservas() {
        return controlPersis.traerReservas();
    }

    public Huespedes traerHuesped(int id_huesped) {
        return controlPersis.traerHuesped(id_huesped);
    }

    public void editarDatos(Huespedes huesped, Date fecha_ingreso, Date fecha_salida, Double valor, String formaPago, String nombre, String apellido, Date fecha_nacimiento, String fecha_nac, String nacionalidad, String telefono) {

        huesped.setApellido(apellido);
        huesped.setFecha_nac(fecha_nac);
        huesped.setNacionalidad(nacionalidad);
        huesped.setNombre(nombre);
        huesped.setTelefono(telefono);
        controlPersis.editarHuesped(huesped);

        Reservas reser = this.buscarHuesped(huesped.getUnReser().getId_reserva());
        reser.setFecha_entrada(fecha_ingreso);
        reser.setFecha_salida(fecha_salida);
        reser.setForma_pago(formaPago);
        reser.setValor(valor);
        this.editarReserva(reser);
        

    }

    private Reservas buscarHuesped(int id_reserva) {
        return controlPersis.buscarHuesped(id_reserva);
    }

    private void editarReserva(Reservas reser) {
        controlPersis.editarReserva(reser);
    }

    public void borrarHuesped(int id_huesped) {
        controlPersis.borrarHuesped(id_huesped);
    }

    public void borrarReserva(int id_reserva) {
        controlPersis.borrarReserva(id_reserva);
    }

}

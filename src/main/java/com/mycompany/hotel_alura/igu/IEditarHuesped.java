package com.mycompany.hotel_alura.igu;

import com.mycompany.hotel_alura.logica.ControladoraLogica;
import com.mycompany.hotel_alura.logica.Huespedes;
import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class IEditarHuesped extends javax.swing.JFrame {

    ControladoraLogica control = null;
    Huespedes huesped = new Huespedes();

    public IEditarHuesped(int id_huesped) {
        control = new ControladoraLogica();
        initComponents();
        cargarHuesped(id_huesped);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fechaIngresoEdit = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        fechaSalidaEdit = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbFormasPago = new javax.swing.JComboBox<>();
        btnEditar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        fechaNac = new com.toedter.calendar.JDateChooser();
        txtApellido = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbNacionalidad = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ledes\\OneDrive\\Escritorio\\Facultad\\Programacion\\ONE\\2. Java\\hotel_alura\\imagenes\\aH-40px.png")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Datos de Reserva");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Fecha de Ingreso:");

        fechaIngresoEdit.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaIngresoEditPropertyChange(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Fecha de Salida:");

        fechaSalidaEdit.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaSalidaEditPropertyChange(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Valor de la Reserva:");

        txtValor.setEditable(false);
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Forma de Pago:");

        cmbFormasPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta de Crédito", "Tarjeta de Débito", "Efectivo" }));

        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\ledes\\OneDrive\\Escritorio\\Facultad\\Programacion\\ONE\\2. Java\\hotel_alura\\imagenes\\disquete.png")); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnVolver.setIcon(new javax.swing.ImageIcon("C:\\Users\\ledes\\OneDrive\\Escritorio\\Facultad\\Programacion\\ONE\\2. Java\\hotel_alura\\imagenes\\volver.png")); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Datos Huespéd");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Nombre:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Apellido:");

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Fecha Nac:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Nacionalidad:");

        cmbNacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afganistán", "Alemania", "Arabia Saudita", "Argentina", "Australia", "Bélgica", "Bolivia", "Brasil", "Camboya", "Canadá", "Chile", "China", "Colombia", "Corea", "Costa Rica", "Cuba", "Dinamarca", "Ecuador", "Egipto", "El Salvador", "Escocia", "España", "Estados Unidos", "Estonia", "Etiopia", "Filipinas", "Finlandia", "Francia", "Gales", "Grecia", "Guatemala", "Haití", "Holanda", "Honduras", "Indonesia", "Inglaterra", "Irak", "Irán", "Irlanda", "Israel", "Italia", "Japón", "Jordania", "Laos", "Letonia", "Lituania", "Malasia", "Marruecos", "México", "Nicaragua", "Noruega", "Nueva Zelanda", "Nueva Zelandia", "Panamá", "Paraguay", "Perú", "Polonia", "Portugal", "Puerto Rico", "Republica Dominicana", "Rumania", "Rusia", "Suecia", "Suiza", "Tailandia", "Taiwán", "Turquía", "Ucrania", "Uruguay", "Venezuela", "Vietnam" }));
        cmbNacionalidad.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Teléfono:");

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\ledes\\OneDrive\\Escritorio\\Facultad\\Programacion\\ONE\\2. Java\\hotel_alura\\imagenes\\registro.png")); // NOI18N

        jLabel15.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 153));
        jLabel15.setText("Editar Datos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fechaIngresoEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fechaSalidaEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbFormasPago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(cmbNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10))
                        .addGap(44, 44, 44))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel15))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel14)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(44, 44, 44))
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(cmbNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVolver)
                            .addComponent(btnEditar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(fechaIngresoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(fechaSalidaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(cmbFormasPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fechaIngresoEditPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaIngresoEditPropertyChange
        cargarValor(fechaIngresoEdit, fechaSalidaEdit);
    }//GEN-LAST:event_fechaIngresoEditPropertyChange

    private void fechaSalidaEditPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaSalidaEditPropertyChange
        cargarValor(fechaIngresoEdit, fechaSalidaEdit);
    }//GEN-LAST:event_fechaSalidaEditPropertyChange

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
    }//GEN-LAST:event_txtValorActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            Date fecha_ingreso = fechaIngresoEdit.getDate();
            Date fecha_salida = fechaSalidaEdit.getDate();
            Double valor = Double.parseDouble(txtValor.getText());
            String formaPago = (String) cmbFormasPago.getSelectedItem();
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            Date fecha_nacimiento = fechaNac.getDate();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            String fecha_nac = formatoFecha.format(fecha_nacimiento);
            String nacionalidad = (String) cmbNacionalidad.getSelectedItem();
            String telefono = txtTelefono.getText();

            control.editarDatos(huesped, fecha_ingreso, fecha_salida, valor, formaPago, nombre, apellido, fecha_nacimiento, fecha_nac,
                    nacionalidad, telefono);

            mostrarMensaje("Edicion exitosa", "Info", "Exito al editar");
            this.dispose();
            IBusqueda busqueda = new IBusqueda();
            busqueda.setVisible(true);
            busqueda.setLocationRelativeTo(null);
        } catch (NumberFormatException e) {
            mostrarMensaje("Campos de datos vacios, complete todos los datos", "Error", "Error al editar la reserva");
        } catch (NullPointerException n) {
            mostrarMensaje("Campos de datos vacios, complete todos los datos", "Error", "Error al editar la reserva");
        }


    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        IBusqueda busqueda = new IBusqueda();
        busqueda.setVisible(true);
        busqueda.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
    }//GEN-LAST:event_txtApellidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbFormasPago;
    private javax.swing.JComboBox<String> cmbNacionalidad;
    private com.toedter.calendar.JDateChooser fechaIngresoEdit;
    private com.toedter.calendar.JDateChooser fechaNac;
    private com.toedter.calendar.JDateChooser fechaSalidaEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    private void cargarValor(JDateChooser fechaIngresoEdit, JDateChooser fechaSalidaEdit) {
        if (fechaIngresoEdit.getDate() != null && fechaSalidaEdit.getDate() != null) {
            Calendar inicio = fechaIngresoEdit.getCalendar();
            Calendar fin = fechaSalidaEdit.getCalendar();
            int dias = -1; //-1 para contar a partir del dia siguiente
            int precio = 1000;
            double valor;

            while (inicio.before(fin) || inicio.equals(fin)) {
                dias++;
                inicio.add(Calendar.DATE, 1); //1 porque es la cantidad de dias que van a ser aumentados
            }

            valor = dias * precio;
            String valorTotal = Double.toString(valor);
            txtValor.setText(valorTotal);
        }
    }

    private void cargarHuesped(int id_huesped) {
        huesped = control.traerHuesped(id_huesped);
        fechaIngresoEdit.setDate(huesped.getUnReser().getFecha_entrada());
        fechaSalidaEdit.setDate(huesped.getUnReser().getFecha_salida());
        txtValor.setText(String.valueOf(huesped.getUnReser().getValor()));
        if (huesped.getUnReser().getForma_pago().equals("Tarjeta de Crédito")) {
            cmbFormasPago.setSelectedIndex(0);
        }
        if (huesped.getUnReser().getForma_pago().equals("Tarjeta de Débito")) {
            cmbFormasPago.setSelectedIndex(1);
        }
        if (huesped.getUnReser().getForma_pago().equals("Efectivo")) {
            cmbFormasPago.setSelectedIndex(2);
        }
        txtNombre.setText(huesped.getNombre());
        txtApellido.setText(huesped.getApellido());
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        try {
            fechaNac.setDate(formatoFecha.parse(huesped.getFecha_nac()));
        } catch (ParseException ex) {
            Logger.getLogger(IEditarHuesped.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtTelefono.setText(huesped.getTelefono());
        if (huesped.getNacionalidad().equals("Afganistán")) {
            cmbNacionalidad.setSelectedIndex(0);
        }
        if (huesped.getNacionalidad().equals("Alemania")) {
            cmbNacionalidad.setSelectedIndex(1);
        }
        if (huesped.getNacionalidad().equals("Arabia Saudita")) {
            cmbNacionalidad.setSelectedIndex(2);
        }
        if (huesped.getNacionalidad().equals("Argentina")) {
            cmbNacionalidad.setSelectedIndex(3);
        }
        if (huesped.getNacionalidad().equals("Australia")) {
            cmbNacionalidad.setSelectedIndex(4);
        }
        if (huesped.getNacionalidad().equals("Bélgica")) {
            cmbNacionalidad.setSelectedIndex(5);
        }
        if (huesped.getNacionalidad().equals("Bolivia")) {
            cmbNacionalidad.setSelectedIndex(6);
        }
        if (huesped.getNacionalidad().equals("Brasil")) {
            cmbNacionalidad.setSelectedIndex(7);
        }
        if (huesped.getNacionalidad().equals("Camboya")) {
            cmbNacionalidad.setSelectedIndex(8);
        }
        if (huesped.getNacionalidad().equals("Tarjeta de Crédito")) {
            cmbNacionalidad.setSelectedIndex(9);
        }
        if (huesped.getNacionalidad().equals("Tarjeta de Débito")) {
            cmbNacionalidad.setSelectedIndex(10);
        }
        if (huesped.getNacionalidad().equals("Efectivo")) {
            cmbNacionalidad.setSelectedIndex(11);
        }
        if (huesped.getNacionalidad().equals("Canadá")) {
            cmbNacionalidad.setSelectedIndex(12);
        }
        if (huesped.getNacionalidad().equals("Chile")) {
            cmbNacionalidad.setSelectedIndex(13);
        }
        if (huesped.getNacionalidad().equals("China")) {
            cmbNacionalidad.setSelectedIndex(14);
        }
        if (huesped.getNacionalidad().equals("Colombia")) {
            cmbNacionalidad.setSelectedIndex(15);
        }
        if (huesped.getNacionalidad().equals("Corea")) {
            cmbNacionalidad.setSelectedIndex(16);
        }
        if (huesped.getNacionalidad().equals("Cuba")) {
            cmbNacionalidad.setSelectedIndex(17);
        }
        if (huesped.getNacionalidad().equals("Dinamarca")) {
            cmbNacionalidad.setSelectedIndex(18);
        }
        if (huesped.getNacionalidad().equals("Ecuador")) {
            cmbNacionalidad.setSelectedIndex(19);
        }
        if (huesped.getNacionalidad().equals("Egipto")) {
            cmbNacionalidad.setSelectedIndex(20);
        }
        if (huesped.getNacionalidad().equals("El Salvador")) {
            cmbNacionalidad.setSelectedIndex(21);
        }
        if (huesped.getNacionalidad().equals("Escocia")) {
            cmbNacionalidad.setSelectedIndex(22);
        }
        if (huesped.getNacionalidad().equals("España")) {
            cmbNacionalidad.setSelectedIndex(23);
        }
        if (huesped.getNacionalidad().equals("Estados Unidos")) {
            cmbNacionalidad.setSelectedIndex(24);
        }
        if (huesped.getNacionalidad().equals("Estonia")) {
            cmbNacionalidad.setSelectedIndex(25);
        }
        if (huesped.getNacionalidad().equals("Etiopia")) {
            cmbNacionalidad.setSelectedIndex(26);
        }
        if (huesped.getNacionalidad().equals("Filipinas")) {
            cmbNacionalidad.setSelectedIndex(27);
        }
        if (huesped.getNacionalidad().equals("Finlandia")) {
            cmbNacionalidad.setSelectedIndex(28);
        }
        if (huesped.getNacionalidad().equals("Francia")) {
            cmbNacionalidad.setSelectedIndex(29);
        }
        if (huesped.getNacionalidad().equals("Gales")) {
            cmbNacionalidad.setSelectedIndex(30);
        }
        if (huesped.getNacionalidad().equals("Grecia")) {
            cmbNacionalidad.setSelectedIndex(31);
        }
        if (huesped.getNacionalidad().equals("Guatemala")) {
            cmbNacionalidad.setSelectedIndex(32);
        }
        if (huesped.getNacionalidad().equals("Haití")) {
            cmbNacionalidad.setSelectedIndex(33);
        }
        if (huesped.getNacionalidad().equals("Holanda")) {
            cmbNacionalidad.setSelectedIndex(34);
        }
        if (huesped.getNacionalidad().equals("Honduras")) {
            cmbNacionalidad.setSelectedIndex(35);
        }
        if (huesped.getNacionalidad().equals("Indonesia")) {
            cmbNacionalidad.setSelectedIndex(36);
        }
        if (huesped.getNacionalidad().equals("Inglaterra")) {
            cmbNacionalidad.setSelectedIndex(37);
        }
        if (huesped.getNacionalidad().equals("Irak")) {
            cmbNacionalidad.setSelectedIndex(38);
        }
        if (huesped.getNacionalidad().equals("Irán")) {
            cmbNacionalidad.setSelectedIndex(39);
        }
        if (huesped.getNacionalidad().equals("Irlanda")) {
            cmbNacionalidad.setSelectedIndex(40);
        }
        if (huesped.getNacionalidad().equals("Israel")) {
            cmbNacionalidad.setSelectedIndex(41);
        }
        if (huesped.getNacionalidad().equals("Italia")) {
            cmbNacionalidad.setSelectedIndex(42);
        }
        if (huesped.getNacionalidad().equals("Japón")) {
            cmbNacionalidad.setSelectedIndex(43);
        }
        if (huesped.getNacionalidad().equals("Jordania")) {
            cmbNacionalidad.setSelectedIndex(44);
        }
        if (huesped.getNacionalidad().equals("Laos")) {
            cmbNacionalidad.setSelectedIndex(45);
        }
        if (huesped.getNacionalidad().equals("Letonia")) {
            cmbNacionalidad.setSelectedIndex(46);
        }
        if (huesped.getNacionalidad().equals("Lituania")) {
            cmbNacionalidad.setSelectedIndex(47);
        }
        if (huesped.getNacionalidad().equals("Malasia")) {
            cmbNacionalidad.setSelectedIndex(48);
        }
        if (huesped.getNacionalidad().equals("Marruecos")) {
            cmbNacionalidad.setSelectedIndex(49);
        }
        if (huesped.getNacionalidad().equals("México")) {
            cmbNacionalidad.setSelectedIndex(50);
        }
        if (huesped.getNacionalidad().equals("Nicaragua")) {
            cmbNacionalidad.setSelectedIndex(51);
        }
        if (huesped.getNacionalidad().equals("Noruega")) {
            cmbNacionalidad.setSelectedIndex(52);
        }
        if (huesped.getNacionalidad().equals("Nueva Zelanda")) {
            cmbNacionalidad.setSelectedIndex(53);
        }
        if (huesped.getNacionalidad().equals("Panamá")) {
            cmbNacionalidad.setSelectedIndex(54);
        }
        if (huesped.getNacionalidad().equals("Paraguay")) {
            cmbNacionalidad.setSelectedIndex(55);
        }
        if (huesped.getNacionalidad().equals("Perú")) {
            cmbNacionalidad.setSelectedIndex(56);
        }
        if (huesped.getNacionalidad().equals("Polonia")) {
            cmbNacionalidad.setSelectedIndex(57);
        }
        if (huesped.getNacionalidad().equals("Portugal")) {
            cmbNacionalidad.setSelectedIndex(58);
        }
        if (huesped.getNacionalidad().equals("Puerto Rico")) {
            cmbNacionalidad.setSelectedIndex(59);
        }
        if (huesped.getNacionalidad().equals("Republica Dominicana")) {
            cmbNacionalidad.setSelectedIndex(60);
        }
        if (huesped.getNacionalidad().equals("Rumania")) {
            cmbNacionalidad.setSelectedIndex(61);
        }
        if (huesped.getNacionalidad().equals("Rusia")) {
            cmbNacionalidad.setSelectedIndex(62);
        }
        if (huesped.getNacionalidad().equals("Suecia")) {
            cmbNacionalidad.setSelectedIndex(63);
        }
        if (huesped.getNacionalidad().equals("Suiza")) {
            cmbNacionalidad.setSelectedIndex(64);
        }
        if (huesped.getNacionalidad().equals("Tailandia")) {
            cmbNacionalidad.setSelectedIndex(65);
        }
        if (huesped.getNacionalidad().equals("Taiwán")) {
            cmbNacionalidad.setSelectedIndex(66);
        }
        if (huesped.getNacionalidad().equals("Ucrania")) {
            cmbNacionalidad.setSelectedIndex(67);
        }
        if (huesped.getNacionalidad().equals("Uruguay")) {
            cmbNacionalidad.setSelectedIndex(68);
        }
        if (huesped.getNacionalidad().equals("Venezuela")) {
            cmbNacionalidad.setSelectedIndex(69);
        }
        if (huesped.getNacionalidad().equals("Vietnam")) {
            cmbNacionalidad.setSelectedIndex(70);
        }
    }

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialogo = optionPane.createDialog(titulo);
        dialogo.setAlwaysOnTop(true);
        dialogo.setVisible(true);
    }

}

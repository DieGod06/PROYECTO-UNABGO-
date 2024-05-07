
import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Usuario
 */
public class ReservaEventos extends javax.swing.JFrame {

    public ReservaEventos() {
        initComponents();
        horasLibresCRUD = new HorasLibresCRUD();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Checker1 = new javax.swing.JPanel();
        Check1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Checker2 = new javax.swing.JPanel();
        Check2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        VolverHL = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        DarseBajaBtn = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(233, 164, 39));
        jPanel2.setPreferredSize(new java.awt.Dimension(1080, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/20240428_145843 (2).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(120, 120));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sistema de Gestión de Horas Libres");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(556, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 120));

        jPanel3.setBackground(new java.awt.Color(233, 142, 45));
        jPanel3.setPreferredSize(new java.awt.Dimension(120, 580));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        bg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, 600));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/UNABFONDOO.jpg"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(378, 959));
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 280, 600));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setText("Eventos disponibles:");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        Checker1.setBackground(new java.awt.Color(255, 255, 255));
        Checker1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Checker1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Checker1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Checker1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Checker1MouseExited(evt);
            }
        });

        Check1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        Check1.setText("✓");

        javax.swing.GroupLayout Checker1Layout = new javax.swing.GroupLayout(Checker1);
        Checker1.setLayout(Checker1Layout);
        Checker1Layout.setHorizontalGroup(
            Checker1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Checker1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Check1)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        Checker1Layout.setVerticalGroup(
            Checker1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Checker1Layout.createSequentialGroup()
                .addComponent(Check1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(Checker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 40, 20));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("Evento 2 / 5:00 - 6:00 (12 Mayo)");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        Checker2.setBackground(new java.awt.Color(255, 255, 255));
        Checker2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Checker2.setPreferredSize(new java.awt.Dimension(20, 20));
        Checker2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Checker2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Checker2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Checker2MouseExited(evt);
            }
        });

        Check2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        Check2.setText("✓");

        javax.swing.GroupLayout Checker2Layout = new javax.swing.GroupLayout(Checker2);
        Checker2.setLayout(Checker2Layout);
        Checker2Layout.setHorizontalGroup(
            Checker2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Checker2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Check2)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        Checker2Layout.setVerticalGroup(
            Checker2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Checker2Layout.createSequentialGroup()
                .addComponent(Check2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(Checker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 40, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("tienes agendados:");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, -1, -1));

        VolverHL.setBackground(new java.awt.Color(233, 164, 39));
        VolverHL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VolverHL.setPreferredSize(new java.awt.Dimension(180, 30));
        VolverHL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolverHLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VolverHLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VolverHLMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("VOLVER A GESTIÓN");

        javax.swing.GroupLayout VolverHLLayout = new javax.swing.GroupLayout(VolverHL);
        VolverHL.setLayout(VolverHLLayout);
        VolverHLLayout.setHorizontalGroup(
            VolverHLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VolverHLLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(25, 25, 25))
        );
        VolverHLLayout.setVerticalGroup(
            VolverHLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VolverHLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        bg.add(VolverHL, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        DarseBajaBtn.setBackground(new java.awt.Color(233, 164, 39));
        DarseBajaBtn.setPreferredSize(new java.awt.Dimension(180, 30));
        DarseBajaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DarseBajaBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DarseBajaBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DarseBajaBtnMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DARSE DE BAJA");

        javax.swing.GroupLayout DarseBajaBtnLayout = new javax.swing.GroupLayout(DarseBajaBtn);
        DarseBajaBtn.setLayout(DarseBajaBtnLayout);
        DarseBajaBtnLayout.setHorizontalGroup(
            DarseBajaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DarseBajaBtnLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel8)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        DarseBajaBtnLayout.setVerticalGroup(
            DarseBajaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DarseBajaBtnLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        bg.add(DarseBajaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setText("Evento 1 / 4:00 - 5:00 (10 Mayo)");
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setText("Consulta aquí los eventos que ");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Checker1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Checker1MouseEntered
        Checker1.setBackground(new Color(45, 186, 58));
        Check1.setForeground(Color.white);
    }//GEN-LAST:event_Checker1MouseEntered

    private void Checker1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Checker1MouseExited
        Checker1.setBackground(Color.white);
        Check1.setForeground(Color.black);
    }//GEN-LAST:event_Checker1MouseExited

    private void Checker2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Checker2MouseEntered
        Checker2.setBackground(new Color(45, 186, 58));
        Check2.setForeground(Color.white);
    }//GEN-LAST:event_Checker2MouseEntered

    private void Checker2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Checker2MouseExited
        Checker2.setBackground(Color.white);
        Check2.setForeground(Color.black);
    }//GEN-LAST:event_Checker2MouseExited

    private void Checker1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Checker1MouseClicked
        String eventoReservado = "Evento 1 / 4:00 - 5:00 (10 Mayo)";
        if (EventosReservadosModelo.agregarEventoReservado(eventoReservado)) {
            JOptionPane.showMessageDialog(this, "Haz reservado con éxito, el evento te espera!");
        } else {
            JOptionPane.showMessageDialog(this, "Ya reservaste este evento anteriormente.");
        }
    }//GEN-LAST:event_Checker1MouseClicked

    private void Checker2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Checker2MouseClicked
        String eventoReservado = "Evento 2 / 5:00 - 6:00 (12 Mayo)";
        if (EventosReservadosModelo.agregarEventoReservado(eventoReservado)) {
            JOptionPane.showMessageDialog(this, "Haz reservado con éxito, el evento te espera!");
        } else {
            JOptionPane.showMessageDialog(this, "Ya reservaste este evento anteriormente.");
        }
    }//GEN-LAST:event_Checker2MouseClicked

    private void VolverHLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverHLMouseEntered
        VolverHL.setBackground(new Color(237, 182, 82));
    }//GEN-LAST:event_VolverHLMouseEntered

    private void VolverHLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverHLMouseExited
        VolverHL.setBackground(new Color(233, 164, 39));
    }//GEN-LAST:event_VolverHLMouseExited

    private void VolverHLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverHLMouseClicked
        HorasLibresCRUD abrir = new HorasLibresCRUD();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VolverHLMouseClicked

    private void DarseBajaBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DarseBajaBtnMouseEntered
        DarseBajaBtn.setBackground(new Color(231, 0, 18));
    }//GEN-LAST:event_DarseBajaBtnMouseEntered

    private void DarseBajaBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DarseBajaBtnMouseExited
        DarseBajaBtn.setBackground(new Color(233, 164, 39));
    }//GEN-LAST:event_DarseBajaBtnMouseExited

    private String eventoSeleccionado;
    private HorasLibresCRUD horasLibresCRUD;


    private void DarseBajaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DarseBajaBtnMouseClicked
        String[] opcionesEventos = EventosReservadosModelo.getEventosReservados().toArray(new String[0]);
        eventoSeleccionado = (String) JOptionPane.showInputDialog(this, "Selecciona el evento del que quieres darte de baja: ", "Dar de baja evento", JOptionPane.PLAIN_MESSAGE, null, opcionesEventos, opcionesEventos[0]);

        if (eventoSeleccionado != null) {
            EventosReservadosModelo.eliminarEventoReservado(eventoSeleccionado);
            horasLibresCRUD.actualizarEventosReservados();
            JOptionPane.showMessageDialog(this, "Te has dado de baja del evento seleccionado");
        }
    }//GEN-LAST:event_DarseBajaBtnMouseClicked

    //calendario

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservaEventos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Check1;
    private javax.swing.JLabel Check2;
    private javax.swing.JPanel Checker1;
    private javax.swing.JPanel Checker2;
    private javax.swing.JPanel DarseBajaBtn;
    private javax.swing.JPanel VolverHL;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

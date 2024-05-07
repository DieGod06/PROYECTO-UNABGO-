
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class HorasLibresCRUD extends javax.swing.JFrame {

    public HorasLibresCRUD() {
        initComponents();
        actualizarEventosReservados();
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent){
                ArchivoEventosReservados.guardarEventosReservados(EventosReservadosModelo.getEventosReservados());
            }
        });
    }
    
    public void actualizarEventosReservados(){
        Set<String> eventosReservados = EventosReservadosModelo.getEventosReservados();
        EventosReservados.setListData(eventosReservados.toArray(new String[0]));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        bg = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        InfoHorasLibresBtn = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        HorasCompletadas1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ReservaEventoBtn = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EventosReservados = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(233, 164, 39));
        jPanel2.setPreferredSize(new java.awt.Dimension(1080, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/20240428_145843 (2).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sistema de Gestión de Horas Libres");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 550, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 120));

        jPanel3.setBackground(new java.awt.Color(233, 142, 45));
        jPanel3.setPreferredSize(new java.awt.Dimension(120, 600));

        InfoHorasLibresBtn.setBackground(new java.awt.Color(255, 255, 255));
        InfoHorasLibresBtn.setPreferredSize(new java.awt.Dimension(180, 30));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setText("OBTEN HORAS");

        javax.swing.GroupLayout InfoHorasLibresBtnLayout = new javax.swing.GroupLayout(InfoHorasLibresBtn);
        InfoHorasLibresBtn.setLayout(InfoHorasLibresBtnLayout);
        InfoHorasLibresBtnLayout.setHorizontalGroup(
            InfoHorasLibresBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoHorasLibresBtnLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InfoHorasLibresBtnLayout.setVerticalGroup(
            InfoHorasLibresBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoHorasLibresBtnLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(InfoHorasLibresBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(InfoHorasLibresBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(524, Short.MAX_VALUE))
        );

        bg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, 600));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setText("Bienvenido a la gestión de sus horas libres.");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/UNABFONDOO.jpg"))); // NOI18N
        jLabel4.setToolTipText("");
        jLabel4.setPreferredSize(new java.awt.Dimension(378, 959));
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 280, 600));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("A continuación se muestran las horas libres que ha completado:");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 313, 100, 0));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("Horas completadas:");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setText("Eventos pendientes:");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 293, 230, 10));

        HorasCompletadas1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        HorasCompletadas1.setText("0");
        bg.add(HorasCompletadas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setText("¿Quieres asistir a alguno de los eventos disponibles?");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, -1, -1));

        ReservaEventoBtn.setBackground(new java.awt.Color(233, 164, 39));
        ReservaEventoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReservaEventoBtn.setPreferredSize(new java.awt.Dimension(180, 30));
        ReservaEventoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReservaEventoBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReservaEventoBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReservaEventoBtnMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("UNABGO!");

        javax.swing.GroupLayout ReservaEventoBtnLayout = new javax.swing.GroupLayout(ReservaEventoBtn);
        ReservaEventoBtn.setLayout(ReservaEventoBtnLayout);
        ReservaEventoBtnLayout.setHorizontalGroup(
            ReservaEventoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReservaEventoBtnLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(58, 58, 58))
        );
        ReservaEventoBtnLayout.setVerticalGroup(
            ReservaEventoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReservaEventoBtnLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        bg.add(ReservaEventoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, -1, -1));

        EventosReservados.setBorder(null);
        EventosReservados.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(EventosReservados);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 330, -1));

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


    private void ReservaEventoBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReservaEventoBtnMouseEntered
        ReservaEventoBtn.setBackground(new Color(237, 182, 82));
    }//GEN-LAST:event_ReservaEventoBtnMouseEntered

    private void ReservaEventoBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReservaEventoBtnMouseExited
        ReservaEventoBtn.setBackground(new Color(233, 164, 39));
    }//GEN-LAST:event_ReservaEventoBtnMouseExited

    private void ReservaEventoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReservaEventoBtnMouseClicked
        ReservaEventos abrir = new ReservaEventos();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ReservaEventoBtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HorasLibresCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HorasLibresCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HorasLibresCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HorasLibresCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HorasLibresCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> EventosReservados;
    private javax.swing.JLabel HorasCompletadas1;
    private javax.swing.JPanel InfoHorasLibresBtn;
    private javax.swing.JPanel ReservaEventoBtn;
    private javax.swing.JPanel bg;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}

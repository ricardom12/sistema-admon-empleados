/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residencia;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.pdf.PdfPTable;
/**
 *
 * @author Famil
 */
public class Vizualisador extends javax.swing.JFrame {

    
    DefaultTableModel Tv;
    PdfPTable tabla = new PdfPTable(8);
    int salida,horas_trabajadas,horas_extra;
    
    /**
     * Creates new form Vizualisador
     */
    public Vizualisador() {
        initComponents();
        DateFormat df = DateFormat.getDateInstance();
        Date FechaActual=new Date();
        fecha1.setDate(FechaActual);
        fecha2.setDate(FechaActual);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Nombretxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_V = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Totaltxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fecha1 = new com.toedter.calendar.JDateChooser();
        fecha2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Horas Registradas");

        Nombretxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Nombretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombretxtActionPerformed(evt);
            }
        });
        Nombretxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NombretxtKeyReleased(evt);
            }
        });

        Tabla_V.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabla_V);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Desde:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Hasta:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseño/Cerrar_btn_1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseño/Generar_btn.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Totaltxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Totaltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotaltxtActionPerformed(evt);
            }
        });
        Totaltxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TotaltxtKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Total:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(35, 35, 35)
                .addComponent(Totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fecha1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)
        );

        cargartabla_v();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombretxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombretxtActionPerformed

    private void NombretxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombretxtKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            cargartabla_v_manual();
        }
    }//GEN-LAST:event_NombretxtKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Visualizar l = new Visualizar();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Date FechaActual=new Date();
        String D = new SimpleDateFormat("yyyy-MM-dd").format(FechaActual);
        GenerarPdf g = new GenerarPdf();
        String texto="              "+Nombretxt.getText()+"                  Juan Pablo Naranjo \n \n \n        ____________________           ____________________";
        g.generarPdf("Nomina de Pago","Firmas de recibido", texto, "Nomina de "+Nombretxt.getText()+". Fecha:"+D, "C:cablesur.jpg", "C:/Nominas/N"+Nombretxt.getText()+D+".pdf",tabla);        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TotaltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotaltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotaltxtActionPerformed

    private void TotaltxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TotaltxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_TotaltxtKeyReleased

    
    public void cargartabla_v(){
        try{
            tabla.setWidthPercentage(100);
            String titulos[] = {"Nombre","Apellido","Dia laborado","Hora Entrada","Hora salida","Horas trabajadas","Horas Extras","Pago"};
            Tv = new DefaultTableModel(null,titulos);
            tabla.addCell("Nombre");
            tabla.addCell("Apellido");
            tabla.addCell("Dia laborado");
            tabla.addCell("Hora entrada");
            tabla.addCell("Hora salida");
            tabla.addCell("Horas trabajadas");
            tabla.addCell("Horas extras");
            tabla.addCell("Pago");
            Tabla_V.setModel(Tv);
            this.Tabla_V.setModel(Tv);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al Obtener los datos","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void cargartabla_v_manual(){
        try{
            String D = new SimpleDateFormat("yyyy-MM-dd").format(fecha1.getDate());
            String H = new SimpleDateFormat("yyyy-MM-dd").format(fecha2.getDate());
            String titulos[] = {"Nombre","Apellido","Dia laborado","Hora Entrada","Hora salida","Horas trabajadas","Horas Extras","Pago"};
            Tv = new DefaultTableModel(null,titulos);
            String fila[] = new String[8];
            tabla = new PdfPTable(8);
            tabla.setWidthPercentage(100);
            tabla.addCell("Nombre");
            tabla.addCell("Apellido");
            tabla.addCell("Dia laborado");
            tabla.addCell("Hora entrada");
            tabla.addCell("Hora salida");
            tabla.addCell("Horas trabajadas");
            tabla.addCell("Horas extras");
            tabla.addCell("Pago");
            sql obj = new sql();
            String consulta = "SELECT empleados.nombre,empleados.apellido_p,hora_entrada.fecha,hora_entrada.hora_entrada,hora_salida.hora_salida,empleados.sueldo,empleados.sueldo_hrExtra FROM empleados INNER JOIN hora_entrada ON empleados.id_empleado=hora_entrada.id_empleado INNER JOIN hora_salida ON hora_entrada.clave=hora_salida.clave WHERE empleados.nombre='"+Nombretxt.getText()+"' AND hora_entrada.fecha BETWEEN '"+D+"' AND '"+H+"'";
            ResultSet r;
            r = obj.Listar(consulta, "root", "", "cablesur");
            while (r.next()){
                fila[0] = r.getString(1);
                tabla.addCell(r.getString(1));
                fila[1] = r.getString(2);
                tabla.addCell(r.getString(2));
                fila[2] = r.getString(3);
                tabla.addCell(r.getString(3));
                fila[3] = r.getString(4);
                tabla.addCell(r.getString(4));
                fila[4] = r.getString(5);
                tabla.addCell(r.getString(5));
                String hora1 = r.getString(4);
                hora1 = hora1.replaceAll(":", "");
                int entrada = Integer.parseInt(hora1)/10000;
                if(entrada!=8){
                    String hora2 = r.getString(5);
                    hora2 = hora2.replaceAll(":", "");
                    salida = Integer.parseInt(hora2)/10000;
                    horas_trabajadas = salida - entrada;
                    horas_extra = horas_trabajadas - 2; 
                }else{
                    String hora2 = r.getString(5);
                    hora2 = hora2.replaceAll(":", "");
                    salida = Integer.parseInt(hora2)/10000;
                    horas_trabajadas = salida - entrada;
                    horas_extra = horas_trabajadas - 6;
                }
                fila[5] = horas_trabajadas+"";
                tabla.addCell(horas_trabajadas+"");
                fila[6] = horas_extra+"";
                tabla.addCell(horas_extra+"");
                int pago = (horas_trabajadas-horas_extra)*(Integer.parseInt(r.getString(6))/48);
                int pagox = horas_extra * Integer.parseInt(r.getString(7));
                int total = pago+pagox;
                fila[7] = total+"";
                tabla.addCell(total+"");
                Tv.addRow(fila);
            }
            Tabla_V.setModel(Tv);
            this.Tabla_V.setModel(Tv);
            double sumatorial=0.0;
            int totalRow=Tabla_V.getRowCount();
            totalRow-=1;
            for(int i=0;i<=(totalRow);i++)
            {
                double sumatoria= Double.parseDouble(String.valueOf(Tabla_V.getValueAt(i,7)));
                sumatorial+=sumatoria;

                Totaltxt.setText(""+sumatorial);
            }
            tabla.addCell("");
            tabla.addCell("");
            tabla.addCell("");
            tabla.addCell("");
            tabla.addCell("");
            tabla.addCell("");
            tabla.addCell("Total");
            tabla.addCell(sumatorial+"");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al Obtener los datos","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }
    
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
            java.util.logging.Logger.getLogger(Vizualisador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vizualisador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vizualisador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vizualisador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vizualisador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nombretxt;
    private javax.swing.JTable Tabla_V;
    private javax.swing.JTextField Totaltxt;
    private com.toedter.calendar.JDateChooser fecha1;
    private com.toedter.calendar.JDateChooser fecha2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

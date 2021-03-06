package Vista;

import DAO.ItemVentaDAO;
import DAO.TurnoDAO;
import Modelo.ItemVenta;
import Modelo.Turno;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ventanaDetalleCaja extends javax.swing.JFrame 
{
    Turno elTurno = new Turno();
    TurnoDAO tDAO = new TurnoDAO();
    ItemVentaDAO itDAO = new ItemVentaDAO();
    DefaultTableModel modelo;
    TableColumnModel tcm;
            
    public ventanaDetalleCaja() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);   //centra la ventana         
        
        modelo = new DefaultTableModel();
        modelo.addColumn("Detalle");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Entrada");
        modelo.addColumn("Salida");

        this.tablaDetalleCaja.setModel(modelo);

        tcm = tablaDetalleCaja.getColumnModel();
        tcm.getColumn(0).setPreferredWidth(300);
        tcm.getColumn(1).setPreferredWidth(80);
        tcm.getColumn(2).setPreferredWidth(80);
        tcm.getColumn(3).setPreferredWidth(80);
        
        //llenarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalleCaja = new javax.swing.JTable();
        txfdTotalVenta = new javax.swing.JTextField();
        txfdTotalCaja = new javax.swing.JTextField();
        btnCargarES = new javax.swing.JButton();
        btnVolverDC = new javax.swing.JButton();
        labImagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Icono_salir_blanco.png"))); // NOI18N
        btnSalir.setToolTipText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 30, 30));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Detalle de caja");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Venta: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 80, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total caja:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 110, -1));

        tablaDetalleCaja = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false;
            }
        };
        tablaDetalleCaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaDetalleCaja.setFocusable(false);
        tablaDetalleCaja.getTableHeader().setResizingAllowed(false);
        tablaDetalleCaja.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaDetalleCaja);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 930, 360));

        txfdTotalVenta.setEditable(false);
        txfdTotalVenta.setBackground(new java.awt.Color(0, 153, 51));
        txfdTotalVenta.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfdTotalVenta.setForeground(new java.awt.Color(255, 255, 255));
        txfdTotalVenta.setText("$");
        txfdTotalVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txfdTotalVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 80, 30));

        txfdTotalCaja.setBackground(new java.awt.Color(0, 0, 204));
        txfdTotalCaja.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        txfdTotalCaja.setForeground(new java.awt.Color(255, 255, 255));
        txfdTotalCaja.setText("$");
        txfdTotalCaja.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txfdTotalCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 80, 30));

        btnCargarES.setText("Cargar entrada/salida");
        btnCargarES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarESActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargarES, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 240, 100));

        btnVolverDC.setText("Volver");
        btnVolverDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverDCActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolverDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, 240, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 950, 490));

        labImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/petroleo 2 grande.png"))); // NOI18N
        getContentPane().add(labImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        ventanaVenta vVenta = new ventanaVenta();
        vVenta.setVisible(true);    //hace visible una ventana
        dispose();  //cierra la ventana que deja
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVolverDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverDCActionPerformed
        ventanaVenta vVenta = new ventanaVenta();
        vVenta.setVisible(true);    //hace visible una ventana
        dispose();  //cierra la ventana que deja
    }//GEN-LAST:event_btnVolverDCActionPerformed

    private void btnCargarESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarESActionPerformed
        ventanaCargarES vCargarES = new ventanaCargarES();
        vCargarES.setVisible(true);    //hace visible una ventana
        dispose();  //cierra la ventana que deja
    }//GEN-LAST:event_btnCargarESActionPerformed
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new ventanaDetalleCaja().setVisible(true);
            }
        });
    }

    public void llenarTabla()   //Con el contenido de la listaVentas que tiene el turno
    {        
        modelo = new DefaultTableModel();
        //List<> listaMovimientos = elTurno.getListaMovimientos;
        String[] datos = new String[4];
        
        /*if (listaMovimientos.size() == 0)
        {
            modelo = new DefaultTableModel();
            modelo.addColumn("Detalle");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Entrada");
            modelo.addColumn("Salida");

            this.tablaDetalleCaja.setModel(modelo);

            tcm = tablaDetalleCaja.getColumnModel();
            tcm.getColumn(0).setPreferredWidth(300);
            tcm.getColumn(1).setPreferredWidth(80);
            tcm.getColumn(2).setPreferredWidth(80);
            tcm.getColumn(3).setPreferredWidth(80);
        }
        else
        {
            modelo.addColumn("Detalle");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Entrada");
            modelo.addColumn("Salida");

            for (ItemVenta v : listaMovimientos)
            {
                datos[0] = String.valueOf(v.getProducto());
                datos[1] = String.valueOf(v.getCantidad());
                datos[2] = String.valueOf("Valor de entrada"); //v.);  //valor de entrada
                datos[3] = String.valueOf("Valor de salida"); //v.);  //valor de salida

                modelo.addRow(datos);
            }

            tablaDetalleCaja.setModel(modelo);

            tcm = tablaDetalleCaja.getColumnModel();

            tcm.getColumn(0).setPreferredWidth(300);
            tcm.getColumn(1).setPreferredWidth(80);
            tcm.getColumn(2).setPreferredWidth(80);
            tcm.getColumn(3).setPreferredWidth(80);
        }*/
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarES;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolverDC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labImagenFondo;
    private javax.swing.JTable tablaDetalleCaja;
    private javax.swing.JTextField txfdTotalCaja;
    private javax.swing.JTextField txfdTotalVenta;
    // End of variables declaration//GEN-END:variables
}
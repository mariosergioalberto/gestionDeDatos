package vistas;

import controladores.ControlFrameMarcas;
import javax.swing.JTable;

public class FrameMarcas extends javax.swing.JDialog {

    public static final String BTN_NUEVO = "nuevo";
    public static final String BTN_ELIMINAR = "eliminar";
    public static final String BTN_SALIR = "salir";

    public FrameMarcas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        btnNuevo.setActionCommand(BTN_NUEVO);
        btnEliminar.setActionCommand(BTN_ELIMINAR);
        btnSalir.setActionCommand(BTN_SALIR);
        this.setLocationRelativeTo(null);
    }

    public FrameMarcas(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        btnNuevo.setActionCommand(BTN_NUEVO);
        btnEliminar.setActionCommand(BTN_ELIMINAR);
        btnSalir.setActionCommand(BTN_SALIR);
        this.setLocationRelativeTo(null);
    }

    public void ejecutar() {
        this.setVisible(true);
    }

    public void setControlador(ControlFrameMarcas control) {
        btnNuevo.addActionListener(control);
        btnEliminar.addActionListener(control);
        btnSalir.addActionListener(control);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMarcas = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualizacion de la tabla marcas");
        setResizable(false);

        tablaMarcas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Marca"
            }
        ));
        jScrollPane2.setViewportView(tablaMarcas);

        btnSalir.setText("Cancelar");

        btnNuevo.setText("Agregar");

        btnEliminar.setText("Eliminar");

        jLabel1.setText("Tabla de marcas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(119, 119, 119))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaMarcas;
    // End of variables declaration//GEN-END:variables

    public JTable getTablaMarcas() {
        return tablaMarcas;
    }

    public void setTablaMarcas(JTable tablaMarcas) {
        this.tablaMarcas = tablaMarcas;
    }
}

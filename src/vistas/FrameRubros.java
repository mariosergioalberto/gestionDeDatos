package vistas;

import controladores.ControlFrameRubros;
import javax.swing.JTable;

public class FrameRubros extends javax.swing.JDialog {

    public static final String BTN_NUEVO = "nuevo";
    public static final String BTN_ELIMINAR = "eliminar";
    public static final String BTN_SALIR = "salir";

    public FrameRubros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        btnNuevo.setActionCommand(BTN_NUEVO);
        btnEliminar.setActionCommand(BTN_ELIMINAR);
        btnSalir.setActionCommand(BTN_SALIR);
        this.setLocationRelativeTo(null);
    }

    public FrameRubros(java.awt.Dialog parent, boolean modal) {
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

    public void setControlador(ControlFrameRubros control) {
        btnNuevo.addActionListener(control);
        btnEliminar.addActionListener(control);
        btnSalir.addActionListener(control);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tablaRubros = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualizacion de la tabla rubros");

        tablaRubros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Rubro"
            }
        ));
        jScrollPane2.setViewportView(tablaRubros);

        btnSalir.setText("Cancelar");

        btnNuevo.setText("Agregar");

        btnEliminar.setText("Eliminar");

        jLabel1.setText("Tabla de rubros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar))
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaRubros;
    // End of variables declaration//GEN-END:variables

    public JTable getTablaRubros() {
        return tablaRubros;
    }

    public void setTablaRubros(JTable tablaRubros) {
        this.tablaRubros = tablaRubros;
    }
}

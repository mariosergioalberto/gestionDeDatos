package vistas;

import controladores.ControlFrameNuevoArticulo;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class FrameNuevoArticulo extends javax.swing.JDialog {

    public static final String BTN_NUEVO_RUBRO = "nuevoRubro";
    public static final String BTN_NUEVA_MARCA = "nuevoMarca";
    public static final String BTN_GUARDAR = "guardar";
    public static final String BTN_CANCELAR = "cancelar";

    public FrameNuevoArticulo(java.awt.Dialog parent, boolean modal) {
        super(parent, "Nuevo articulo", modal);
        initComponents();
        this.setLocationRelativeTo(null);
        btnNuevaMarca1.setActionCommand(BTN_NUEVA_MARCA);
        btnNuevoRubro1.setActionCommand(BTN_NUEVO_RUBRO);
        btnGuardar.setActionCommand(BTN_GUARDAR);
        btnCancelar.setActionCommand(BTN_CANCELAR);
    }

    public void ejecutar() {
        this.setVisible(true);
    }

    public void setControlador(ControlFrameNuevoArticulo control) {
        btnNuevoRubro1.addActionListener(control);
        btnNuevaMarca1.addActionListener(control);
        btnGuardar.addActionListener(control);
        btnCancelar.addActionListener(control);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        comboMarca = new javax.swing.JComboBox<>();
        btnNuevaMarca = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        comboRubro = new javax.swing.JComboBox<>();
        btnNuevoRubro = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtStockMin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboMarca1 = new javax.swing.JComboBox<>();
        btnNuevaMarca1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        comboRubro1 = new javax.swing.JComboBox<>();
        btnNuevoRubro1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtStock1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtStockMin1 = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtPrecio = new javax.swing.JTextField();

        jLabel4.setText("Marca:");

        comboMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnNuevaMarca.setText("Nueva");

        jLabel5.setText("Rubro:");

        comboRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnNuevoRubro.setText("Nuevo");

        jLabel10.setText("Stock:");

        jLabel11.setText("Stock Min.:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Articulo");
        setResizable(false);

        jLabel1.setText("Nuevo articulo");

        jLabel2.setText("Codigo:");

        txtCodigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCodigo.setEnabled(false);

        jLabel3.setText("Descripcion:");

        jLabel6.setText("Marca:");

        comboMarca1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnNuevaMarca1.setText("Nueva");

        jLabel7.setText("Rubro:");

        comboRubro1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnNuevoRubro1.setText("Nuevo");

        jLabel8.setText("Precio:");

        jLabel9.setText("Costo:");

        jLabel12.setText("Stock:");

        jLabel13.setText("Stock Min.:");

        btnGuardar.setText("Guardar");

        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comboRubro1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(btnNuevoRubro1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comboMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(btnNuevaMarca1))
                                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtPrecio)
                                            .addComponent(txtStock1, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtStockMin1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(191, 191, 191))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevaMarca1)
                    .addComponent(comboMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnNuevoRubro1)
                    .addComponent(comboRubro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(txtStock1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStockMin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevaMarca;
    private javax.swing.JButton btnNuevaMarca1;
    private javax.swing.JButton btnNuevoRubro;
    private javax.swing.JButton btnNuevoRubro1;
    private javax.swing.JComboBox<String> comboMarca;
    private javax.swing.JComboBox<String> comboMarca1;
    private javax.swing.JComboBox<String> comboRubro;
    private javax.swing.JComboBox<String> comboRubro1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtStock1;
    private javax.swing.JTextField txtStockMin;
    private javax.swing.JTextField txtStockMin1;
    // End of variables declaration//GEN-END:variables

    public JComboBox<String> getComboMarca() {
        return comboMarca1;
    }

    public void setComboMarca(JComboBox<String> comboMarca) {
        this.comboMarca1 = comboMarca;
    }

    public JComboBox<String> getComboRubro() {
        return comboRubro1;
    }

    public void setComboRubro(JComboBox<String> comboRubro) {
        this.comboRubro1 = comboRubro;
    }

    public int getTxtCodigo() {
        return Integer.parseInt(txtCodigo.getText());
    }

    public void setTxtCodigo(String txtCodigo) {
        this.txtCodigo.setText(txtCodigo);
    }

    public float getTxtCosto() {
        return Float.parseFloat(txtCosto.getText());
    }

    public void setTxtCosto(String txtCosto) {
        this.txtCosto.setText(txtCosto);
    }

    public String getTxtDescripcion() {
        return txtDescripcion.getText();
    }

    public void setTxtDescripcion(String txtDescripcion) {
        this.txtDescripcion.setText(txtDescripcion);
    }

    public float getTxtPrecio() {
        return Float.parseFloat(txtPrecio.getText());
    }

    public void setTxtPrecio(String txtPrecio) {
        this.txtPrecio.setText(txtPrecio);
    }

    public int getTxtStock1() {
        return Integer.parseInt(txtStock1.getText());
    }

    public void setTxtStock1(String txtStock1) {
        this.txtStock1.setText(txtStock1);
    }

    public int getTxtStockMin1() {
        return Integer.parseInt(txtStockMin1.getText());
    }

    public void setTxtStockMin1(String txtStockMin1) {
        this.txtStockMin1.setText(txtStockMin1);
    }

    public String getRubroSeleccionado() {
        return String.valueOf(comboRubro1.getSelectedItem());
    }

    public String getMarcaSeleccionada() {
        return String.valueOf(comboMarca1.getSelectedItem());
    }

    public void limpiarPantalla() {
        int nuevoId = getTxtCodigo() + 1;
        setTxtDescripcion("");
        setTxtCodigo(nuevoId + "");
        comboMarca1.setSelectedIndex(0);
        comboRubro1.setSelectedIndex(0);
        setTxtPrecio("");
        setTxtCosto("");
        setTxtStock1("");
        setTxtStockMin1("");
    }
}

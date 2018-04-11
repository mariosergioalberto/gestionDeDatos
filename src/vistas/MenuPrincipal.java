package vistas;

import controladores.ControlMenuPrincipal;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MenuPrincipal extends javax.swing.JFrame {

    /*botones*/
    public static final String BTN_ARTICULOS = "articulos";
    public static final String BTN_COMPRAS = "compras";
    public static final String BTN_VENTAS = "ventas";
    public static final String BTN_CONSULTAR_VENTAS = "consultarVentas";
    public static final String BTN_LIQUIDACION = "liquidacion";
    public static final String BTN_EMPLEADOS = "empleados";
    /*menues*/
    public static final String MENU_ABM_ARTICULO = "abmArticulo";
    public static final String MENU_ACTUALIZAR_PRECIO_ARTICULO = "actualizarPrecios";
    public static final String MENU_ABM_CLIENTE = "abmCliente";
    public static final String MENU_ABM_PROVEEDORES = "abmProveedores";
    public static final String MENU_INGRESO_DE_MERCADERIA = "IngresoDeCompra";
    public static final String MENU_CONSULTAR_COMPRAS = "consultarCompra";
    public static final String MENU_FACTURA = "factura";
    public static final String MENU_CONSULTAR_VENTAS = "consultarVentas";
    public static final String MENU_LIQUIDACION = "liquidacion";
    public static final String MENU_GESTION_CONCEPTOS = "gestionConceptos";
    public static final String MENU_GESTION_PUESTOS = "gestionPuestos";
    public static final String MENU_GESTION_EMPLEADOS = "gestionEmpleados";
    public static final String MENU_GESTION_USUARIOS = "gestionUsuarios";
    public static final String MENU_ABM_MARCAS = "gestionDeMarcas";
    public static final String MENU_ABM_RUBROS = "gestionDeRubros";
    public static final String MENU_SALIR = "salir";

    public MenuPrincipal() {
        initComponents();
        fecha();
        /*botones*/
        btnArticulos.setActionCommand(BTN_ARTICULOS);
        btnCompras.setActionCommand(BTN_COMPRAS);
        btnVentas.setActionCommand(BTN_VENTAS);
        btnConsultarVentas.setActionCommand(BTN_CONSULTAR_VENTAS);
        btnLiquidacion.setActionCommand(BTN_LIQUIDACION);
        btnEmpleados.setActionCommand(BTN_EMPLEADOS);
        /*menues*/
        mAgregarModificarArticulo.setActionCommand(MENU_ABM_ARTICULO);
        mActualizarPrecios.setActionCommand(MENU_ACTUALIZAR_PRECIO_ARTICULO);
        mAgregarModificarCliente.setActionCommand(MENU_ABM_CLIENTE);
        mAgregarModificarProveedor.setActionCommand(MENU_ABM_PROVEEDORES);
        mIngresoDeMercaderia.setActionCommand(MENU_INGRESO_DE_MERCADERIA);
        mConsultarCompras.setActionCommand(MENU_CONSULTAR_COMPRAS);
        mFactura.setActionCommand(MENU_FACTURA);
        mConsultarVentas.setActionCommand(MENU_CONSULTAR_VENTAS);
        mLiquidacion.setActionCommand(MENU_LIQUIDACION);
        mGestionConceptos.setActionCommand(MENU_GESTION_CONCEPTOS);
        mGestionPuestos.setActionCommand(MENU_GESTION_PUESTOS);
        mGestionEmpleados.setActionCommand(MENU_GESTION_EMPLEADOS);
        mGestionUsuarios.setActionCommand(MENU_GESTION_USUARIOS);
        mMarcas.setActionCommand(MENU_ABM_MARCAS);
        mRubros.setActionCommand(MENU_ABM_RUBROS);
        mSalir.setActionCommand(MENU_SALIR);
    }

    public void ejecutar() {
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public void setControlador(ControlMenuPrincipal control) {
        /*botones*/
        btnArticulos.addActionListener(control);
        btnCompras.addActionListener(control);
        btnVentas.addActionListener(control);
        btnConsultarVentas.addActionListener(control);
        btnLiquidacion.addActionListener(control);
        btnEmpleados.addActionListener(control);
        /*menues*/
        mAgregarModificarArticulo.addActionListener(control);
        mActualizarPrecios.addActionListener(control);
        mAgregarModificarCliente.addActionListener(control);
        mAgregarModificarProveedor.addActionListener(control);
        mIngresoDeMercaderia.addActionListener(control);
        mConsultarCompras.addActionListener(control);
        mFactura.addActionListener(control);
        mConsultarVentas.addActionListener(control);
        mLiquidacion.addActionListener(control);
        mGestionConceptos.addActionListener(control);
        mGestionEmpleados.addActionListener(control);
        mGestionPuestos.addActionListener(control);
        mGestionUsuarios.addActionListener(control);
        mMarcas.addActionListener(control);
        mRubros.addActionListener(control);
        mSalir.addActionListener(control);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnArticulos = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnConsultarVentas = new javax.swing.JButton();
        btnCompras = new javax.swing.JButton();
        btnLiquidacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        btnEmpleados = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mAgregarModificarArticulo = new javax.swing.JMenuItem();
        mActualizarPrecios = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mAgregarModificarCliente = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mAgregarModificarProveedor = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        mIngresoDeMercaderia = new javax.swing.JMenuItem();
        mConsultarCompras = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mFactura = new javax.swing.JMenuItem();
        mConsultarVentas = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        mLiquidacion = new javax.swing.JMenuItem();
        mGestionConceptos = new javax.swing.JMenuItem();
        mGestionPuestos = new javax.swing.JMenuItem();
        mGestionEmpleados = new javax.swing.JMenuItem();
        jMenu = new javax.swing.JMenu();
        mGestionUsuarios = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        mMarcas = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        mRubros = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        mSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setModalExclusionType(null);
        setResizable(false);

        btnArticulos.setText("Articulos");

        btnVentas.setText("Ventas");

        btnConsultarVentas.setText("Consulta de ventas");

        btnCompras.setText("Compras");

        btnLiquidacion.setText("Liquidacion");

        jLabel1.setText("Usuario");

        lblFecha.setText("Fecha");

        btnEmpleados.setText("Empleados");

        jMenu1.setText("Articulos");

        mAgregarModificarArticulo.setText("Agregar/Modificar");
        jMenu1.add(mAgregarModificarArticulo);

        mActualizarPrecios.setText("Actualizar precios");
        jMenu1.add(mActualizarPrecios);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Clientes");

        mAgregarModificarCliente.setText("Agregar/Modificar");
        jMenu2.add(mAgregarModificarCliente);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Proveedores");

        mAgregarModificarProveedor.setText("Agregar/Modificar");
        jMenu3.add(mAgregarModificarProveedor);

        jMenuBar1.add(jMenu3);

        jMenu9.setText("Compras");

        mIngresoDeMercaderia.setText("Ingreso de mercaderia");
        jMenu9.add(mIngresoDeMercaderia);

        mConsultarCompras.setText("Consultar compras");
        jMenu9.add(mConsultarCompras);

        jMenuBar1.add(jMenu9);

        jMenu4.setText("Ventas");

        mFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        mFactura.setText("Facturas");
        jMenu4.add(mFactura);

        mConsultarVentas.setText("Consultar ventas");
        jMenu4.add(mConsultarVentas);

        jMenuItem10.setText("Salida de mercaderia");
        jMenu4.add(jMenuItem10);

        jMenuItem11.setText("Consulta de salidas");
        jMenu4.add(jMenuItem11);

        jMenuBar1.add(jMenu4);

        jMenu7.setText("Reportes");

        jMenu10.setText("Ventas");

        jMenuItem14.setText("Resumen del dia");
        jMenu10.add(jMenuItem14);

        jMenuItem15.setText("Resumen entre fechas");
        jMenu10.add(jMenuItem15);

        jMenu7.add(jMenu10);

        jMenuBar1.add(jMenu7);

        jMenu12.setText("Personal");

        mLiquidacion.setText("Liquidacion");
        jMenu12.add(mLiquidacion);

        mGestionConceptos.setText("Gestion de conceptos");
        jMenu12.add(mGestionConceptos);

        mGestionPuestos.setText("Gestion de puestos");
        jMenu12.add(mGestionPuestos);

        mGestionEmpleados.setText("Gestion de empleados");
        jMenu12.add(mGestionEmpleados);

        jMenuBar1.add(jMenu12);

        jMenu.setText("Administracion");

        mGestionUsuarios.setText("Usuarios");
        mGestionUsuarios.setInheritsPopupMenu(true);
        jMenu.add(mGestionUsuarios);

        jMenu11.setText("Tablas auxiliares");

        jMenuItem17.setText("Detalles de gastos");
        jMenu11.add(jMenuItem17);

        jMenuItem18.setText("Detalles de ingresos");
        jMenu11.add(jMenuItem18);

        mMarcas.setText("Marcas");
        jMenu11.add(mMarcas);

        jMenuItem20.setText("Motivos de salida");
        jMenu11.add(jMenuItem20);

        mRubros.setText("Rubros");
        jMenu11.add(mRubros);

        jMenuItem22.setText("Ajustes de stock");
        jMenu11.add(jMenuItem22);

        jMenu.add(jMenu11);

        jMenuBar1.add(jMenu);

        jMenu8.setText("Salida");

        mSalir.setText("Salir");
        jMenu8.add(mSalir);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCompras, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(btnArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblFecha)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(btnLiquidacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnConsultarVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(btnConsultarVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                    .addComponent(btnArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnLiquidacion, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblFecha)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArticulos;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnConsultarVentas;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnLiquidacion;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JMenuItem mActualizarPrecios;
    private javax.swing.JMenuItem mAgregarModificarArticulo;
    private javax.swing.JMenuItem mAgregarModificarCliente;
    private javax.swing.JMenuItem mAgregarModificarProveedor;
    private javax.swing.JMenuItem mConsultarCompras;
    private javax.swing.JMenuItem mConsultarVentas;
    private javax.swing.JMenuItem mFactura;
    private javax.swing.JMenuItem mGestionConceptos;
    private javax.swing.JMenuItem mGestionEmpleados;
    private javax.swing.JMenuItem mGestionPuestos;
    private javax.swing.JMenuItem mGestionUsuarios;
    private javax.swing.JMenuItem mIngresoDeMercaderia;
    private javax.swing.JMenuItem mLiquidacion;
    private javax.swing.JMenuItem mMarcas;
    private javax.swing.JMenuItem mRubros;
    private javax.swing.JMenuItem mSalir;
    // End of variables declaration//GEN-END:variables

    public void fecha() {
        Calendar hoy = Calendar.getInstance();

        int dia = hoy.get(Calendar.DAY_OF_MONTH);
        int mes = hoy.get(Calendar.MONTH) + 1;
        int año = hoy.get(Calendar.YEAR);

        lblFecha.setText(dia + "/" + mes + "/" + año);
    }
}

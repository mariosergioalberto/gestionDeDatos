package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import persistencia.Conector;
import vistas.ActualizarPrecios;
import vistas.MenuPrincipal;

public class ControlMenuPrincipal implements ActionListener {

    private MenuPrincipal menuPrincipal;
    private ActualizarPrecios actulizarPrecios;
    private ControlMenuArticulos controlMenuArticulos;
    private ControlActualizarPrecios controlActualizarPrecios;
    private ControlMenuClientes controlMenuClientes;
    private ControlMenuProveedores controlMenuProveedores;
    private ControlMenuConceptos controlMenuConceptos;
    private ControlMenuEmpleados controlMenuEmpleados;
    private ControlMenuPuestos controlMenuPuestos;
    private ControlMenuUsuarios controlMenuUsuarios;
    private ControlFrameIngresoDeMercaderia controlFrameIngresoDeMercaderia;
    private ControlFrameConsultarCompras controlFrameConsultarCompras;
    private ControlFrameFactura controlFrameFactura;
    private ControlFrameConsultarVentas controlFrameConsultarVentas;
    private ControlFrameMarcas controlFrameMarcas;
    private ControlFrameRubros controlFrameRubros;
    private Conector con;

    public ControlMenuPrincipal(Conector con) {
        this.menuPrincipal = new MenuPrincipal();
        this.menuPrincipal.ejecutar();
        menuPrincipal.setControlador(this);
        this.con = con;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*BOTONES*/
        if (e.getActionCommand().equals(menuPrincipal.BTN_ARTICULOS)) {
            controlMenuArticulos = new ControlMenuArticulos(menuPrincipal);
        }
        if (e.getActionCommand().equals(menuPrincipal.BTN_COMPRAS)) {
            controlFrameIngresoDeMercaderia = new ControlFrameIngresoDeMercaderia(menuPrincipal);
        }
        if (e.getActionCommand().equals(menuPrincipal.BTN_VENTAS)) {
            controlFrameFactura = new ControlFrameFactura(menuPrincipal);
        }
        if(e.getActionCommand().equals(menuPrincipal.BTN_EMPLEADOS)) {
            controlMenuEmpleados = new ControlMenuEmpleados(menuPrincipal);
        }
        if(e.getActionCommand().equals(menuPrincipal.BTN_LIQUIDACION)) {
            System.out.println("BOTON LIQUIDACION");
        }

        /*MENUES*/
        if (e.getActionCommand().equals(menuPrincipal.MENU_ABM_ARTICULO)) {
            controlMenuArticulos = new ControlMenuArticulos(menuPrincipal);
        }
        if (e.getActionCommand().equals(menuPrincipal.MENU_ACTUALIZAR_PRECIO_ARTICULO)) {
            controlActualizarPrecios = new ControlActualizarPrecios(menuPrincipal);
        }
        if (e.getActionCommand().equals(menuPrincipal.MENU_ABM_CLIENTE)) {
            controlMenuClientes = new ControlMenuClientes(menuPrincipal);
        }
        if (e.getActionCommand().equals(menuPrincipal.MENU_ABM_PROVEEDORES)) {
            controlMenuProveedores = new ControlMenuProveedores(menuPrincipal);
        }
        if (e.getActionCommand().equals(menuPrincipal.MENU_GESTION_CONCEPTOS)) {
            controlMenuConceptos = new ControlMenuConceptos(menuPrincipal);
        }
        if (e.getActionCommand().equals(menuPrincipal.MENU_GESTION_EMPLEADOS)) {
            controlMenuEmpleados = new ControlMenuEmpleados(menuPrincipal);
        }
        if (e.getActionCommand().equals(menuPrincipal.MENU_GESTION_PUESTOS)) {
            controlMenuPuestos = new ControlMenuPuestos(menuPrincipal);
        }
        if (e.getActionCommand().equals(menuPrincipal.MENU_GESTION_USUARIOS)) {
            controlMenuUsuarios = new ControlMenuUsuarios(menuPrincipal);
        }
        if (e.getActionCommand().equals(menuPrincipal.MENU_INGRESO_DE_MERCADERIA)) {
            controlFrameIngresoDeMercaderia = new ControlFrameIngresoDeMercaderia(menuPrincipal);
        }
        if (e.getActionCommand().equals(menuPrincipal.MENU_CONSULTAR_COMPRAS)) {
            controlFrameConsultarCompras = new ControlFrameConsultarCompras(menuPrincipal);
        }
        if (e.getActionCommand().equals(menuPrincipal.MENU_FACTURA)) {
            controlFrameFactura = new ControlFrameFactura(menuPrincipal);
        }
        if (e.getActionCommand().equals(menuPrincipal.MENU_CONSULTAR_VENTAS)) {
            controlFrameConsultarVentas = new ControlFrameConsultarVentas(menuPrincipal);
        }
        if (e.getActionCommand().equals(menuPrincipal.MENU_ABM_MARCAS)) {
            controlFrameMarcas = new ControlFrameMarcas(menuPrincipal);
        }
        if (e.getActionCommand().equals(menuPrincipal.MENU_ABM_RUBROS)) {
            controlFrameRubros = new ControlFrameRubros(menuPrincipal);
        }
        if (e.getActionCommand().equals(menuPrincipal.MENU_SALIR)) {
            System.exit(0);
        }
    }
}

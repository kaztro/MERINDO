package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Consulta extends JFrame {
    public JLabel lblNombre, lblDirector, lblPais, lblClasificacion, lblAño, lblEn_proyeccion;

    public JTextField nombre, director, pais, año;
    public JComboBox clasificacion;

    ButtonGroup en_proyeccion = new ButtonGroup();
    public JRadioButton no;
    public JRadioButton si;
    public JTable resultados;

    public JPanel table;

    public JButton buscar, eliminar, insertar, limpiar, actualizar;

    private static final int ANCHOC = 130, ALTOC = 30;

    DefaultTableModel tm;

    public Consulta() {
        super("Inventario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        agregarLabels();
        formulario();
        //llenarTabla();
        Container container = getContentPane();
        container.add(lblNombre);
        container.add(lblDirector);
        container.add(lblPais);
        container.add(lblClasificacion);
        container.add(lblAño);
        container.add(lblEn_proyeccion);
        container.add(nombre);
        container.add(clasificacion);
        container.add(director);
        container.add(pais);
        container.add(año);
        container.add(si);
        container.add(no);
        container.add(buscar);
        container.add(insertar);
        container.add(actualizar);
        container.add(eliminar);
        container.add(limpiar);
        container.add(table);
        setSize(600, 600);
        //eventos();
    }

    public final void agregarLabels() {
        lblNombre = new JLabel("Nombre");
        lblDirector = new JLabel("Director");
        lblPais = new JLabel("País");
        lblEn_proyeccion = new JLabel("En Proyeccion");
        lblClasificacion = new JLabel("Clasificacion");
        lblAño = new JLabel("Año");
        lblNombre.setBounds(10, 10, ANCHOC, ALTOC);
        lblDirector.setBounds(10, 60, ANCHOC, ALTOC);
        lblPais.setBounds(10, 100, ANCHOC, ALTOC);
        lblEn_proyeccion.setBounds(10, 140, ANCHOC, ALTOC);
        lblClasificacion.setBounds(10, 30, ANCHOC, ALTOC);
        lblAño.setBounds(10, 38, ANCHOC, ALTOC);
    }

    public final void formulario() {
        clasificacion = new JComboBox();
        director = new JTextField();
        nombre = new JTextField();
        pais = new JTextField();
        año = new JTextField();
        si = new JRadioButton("si", true);
        no = new JRadioButton("no");
        resultados = new JTable();
        buscar = new JButton("Buscar");
        insertar = new JButton("Insertar ");
        eliminar = new JButton("Eliminar");
        actualizar = new JButton("Actualizar");
        limpiar = new JButton("limpiar");
        
        table = new JPanel();
        
        clasificacion.addItem("PG-13");
        clasificacion.addItem("R");
        clasificacion.addItem("G");
        
        director.setBounds(140, 10, ANCHOC, ALTOC);
        nombre.setBounds(140, 12, ANCHOC, ALTOC);
        pais.setBounds(140, 14, ANCHOC, ALTOC);
        año.setBounds(140, 16, ANCHOC, ALTOC);
    }
}

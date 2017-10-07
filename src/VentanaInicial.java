import java.awt.*;
import java.util.ArrayList;
import java.util.*;

import javax.swing.*;

public class VentanaInicial extends JFrame {
	public LinkedHashMap listPersona;
	PanelCentral obj_panelcentral;
		
	public VentanaInicial() {
		super("Mi ventana principal");
		listPersona = new LinkedHashMap();
		inicio();
		componente();
		pack();
        setLocationRelativeTo( null );
	}
	
	private VentanaInicial inicio(){
		Dimension dims = new Dimension(500, 550);
		this.setSize(dims);
		this.setPreferredSize(dims);
		this.getContentPane( ).setLayout( new BorderLayout( ) );
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return this;
	}
	
	private void componente() {
		
		PanelIzquierdo obj_panelizquierdo = new PanelIzquierdo(this);
		add(obj_panelizquierdo, BorderLayout.WEST);
		
		obj_panelcentral = new PanelCentral();
		add(obj_panelcentral, BorderLayout.CENTER);
		
	}
	
	public void  agregarPersona(String _nombre, String _apellido) {
		Persona obj = new Persona(_nombre,_apellido);
		listPersona.put(_nombre,obj);
		actualizarTabla();
	}
	
	public void actualizarTabla() {
		obj_panelcentral.refrescarLista(listPersona);
	}
	
}

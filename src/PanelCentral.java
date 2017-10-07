import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.util.*;

public class PanelCentral extends JPanel {
		
	private DefaultTableModel referencia_tabla_model;
	public String [] columnas = {"Nombre","Apellido"};
	private Object[][] tableContents;
	private JTable tabla_vehiculos;
	
	public PanelCentral() {
		
		setLayout(new BorderLayout());		
		Border borde1 = BorderFactory.createTitledBorder("Contenido");
		setBorder (borde1);
		
		tableContents = new Object[0][0];
		referencia_tabla_model = new DefaultTableModel(tableContents, columnas);
		tabla_vehiculos = new JTable(referencia_tabla_model);
		this.add(new JScrollPane(tabla_vehiculos), BorderLayout.CENTER);
		
		
	}
	
	public void refrescarLista(LinkedHashMap referenciaArraList) {
		
		if(referenciaArraList.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No hay elementos en el arraylist","Mensaje",JOptionPane.WARNING_MESSAGE);
		}
		else {		

			// Get a set of the entries
		      Set set = referenciaArraList.entrySet();
		      
		      // Get an iterator
		      Iterator ii = set.iterator();
 
			tableContents = new Object[referenciaArraList.size()][2];
			 int i=0; 
			 while(ii.hasNext()) {
				Map.Entry me = (Map.Entry)ii.next();
				Persona obj = (Persona) me.getValue();
				tableContents[i][0] = obj.getNombre();
				tableContents[i][1] = obj.getApellido();
				i++;
			  }
			

			referencia_tabla_model.setDataVector(tableContents, columnas);
	

		}
		
	}
	
}

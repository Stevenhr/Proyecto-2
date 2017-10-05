import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class PanelIzquierdo extends JPanel implements ActionListener{
		
	
	private GridBagConstraints c;
	private Insets in;
	
	private JLabel Jl_nombre;
	private JLabel Jl_apellido;
	private JButton Jbt_agregar;
	private JTextField Jtf_nombre;
	private JTextField Jtf_apellido;
	private VentanaInicial referenciaVentaPrincipal;
		
	public PanelIzquierdo(VentanaInicial _referenciaVentaPrincipal) {

		referenciaVentaPrincipal=_referenciaVentaPrincipal;
		
		setLayout(new GridBagLayout());
		Border borde1 = BorderFactory.createTitledBorder("Formulario");
		setBorder (borde1);
		
		Jl_nombre= new JLabel("Nombre: ");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=0;
        c.fill = GridBagConstraints.BOTH; 
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( Jl_nombre,c);
        
        
        Jtf_nombre = new JTextField();
        c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=1;
        c.fill=GridBagConstraints.BOTH;
        in = new Insets(5, 10, 5, 10);
        c.insets= in;
        add(Jtf_nombre,c);
        
        
        Jl_apellido = new JLabel("Apellido: ");
        c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=2;
        c.fill = GridBagConstraints.BOTH;
        in = new Insets(5, 10, 5, 10);
        c.insets=in;
        add(Jl_apellido,c);
        		
        
        Jtf_apellido = new JTextField();
        c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=3;
        c.fill = GridBagConstraints.BOTH;
        in = new Insets(5, 10, 5, 10);
        c.insets= in;
        add(Jtf_apellido,c);
        
        Jbt_agregar = new JButton("Agregar");
        Jbt_agregar.addActionListener(this);
        Jbt_agregar.setActionCommand("a");
        c=new GridBagConstraints();
        c.gridx=0;
        c.gridy=4;
        c.fill = GridBagConstraints.BOTH;
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;
        add(Jbt_agregar,c);
        
        
        
        
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Hola ...");
		referenciaVentaPrincipal.agregarPersona(Jtf_nombre.getText(), Jtf_apellido.getText());
		JOptionPane.showMessageDialog(null,"Persona agregada. ","Mensaje",JOptionPane.INFORMATION_MESSAGE);
	}
	
}

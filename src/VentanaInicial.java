import java.awt.*;
import javax.swing.*;

public class VentanaInicial extends JFrame {

	public VentanaInicial() {
		super("Mi ventana principal");
		inicio();
		componente();
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
		
		
	}
	
}

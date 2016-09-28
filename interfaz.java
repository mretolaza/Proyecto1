import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Interfaz {

	private JFrame frame;

	/**
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 645, 428);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 183, 227);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnPrueba = new JButton("Prueba");
		btnPrueba.setBounds(58, 5, 67, 183);
		panel.add(btnPrueba);
	}
}

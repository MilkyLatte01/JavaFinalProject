import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CheckOutPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckOutPage frame = new CheckOutPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	JLabel logo;
	public CheckOutPage() {
		ImageIcon Coffeelogo = new ImageIcon("D:\\Project Picture\\CoffeeLogoResize.jpg");
		
		logo =new JLabel();
		logo.setBounds(195, 11, 234, 194);
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setIcon(Coffeelogo);
		
		//Frame Zone
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,600);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(219, 184, 142));
		panel.setBounds(0, 0, 584, 561);
		contentPane.add(panel);
		panel.add(logo);
	}

}

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class HotDrinkPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotDrinkPage frame = new HotDrinkPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	JLabel logo;
	JFrame frame;
	
	
	public HotDrinkPage(){
		
		ImageIcon Coffeelogo = new ImageIcon("D:\\Project Picture\\CoffeeLogoResize.jpg");
		
		
		logo =new JLabel();
		logo.setBounds(195, 11, 234, 194);
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setIcon(Coffeelogo);
				
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(219, 184, 142));
		panel.setBounds(0, 0, 584, 561);
		panel.add(logo);
		
		//Frame Zone
		frame=new JFrame();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		frame.setVisible(true);
		frame.add(panel);
		
		
	}

}

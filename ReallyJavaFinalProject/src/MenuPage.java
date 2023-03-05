import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPage extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPage frame = new MenuPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	JFrame frame;
	JLabel logo1;
	JLabel logo2;
	private JPanel panel;
	private JButton btnLogout;
	
	public MenuPage() {
		
		//JLabel Zone
		ImageIcon Coffeelogo = new ImageIcon("D:\\Project Picture\\CoffeeLogoResize.jpg");
		ImageIcon hotCoffee=new ImageIcon("D:\\Project Picture\\01.png");
		
		logo1 =new JLabel();
		logo1.setBounds(195, 11, 234, 194);
		logo1.setHorizontalAlignment(SwingConstants.CENTER);
		logo1.setIcon(Coffeelogo);
		
		logo2 = new JLabel();
		logo2.setBounds(20, 101, 276, 250);
		logo2.setHorizontalAlignment(SwingConstants.CENTER);
		logo2.setIcon(hotCoffee);
		
		//JPanel Zone
		panel = new JPanel();
		panel.setBackground(new Color(219, 184, 142));
		panel.setBounds(-16, -25, 600, 600);
		panel.setLayout(null);
		
		panel.add(logo2);
		panel.add(logo1);
		
		//JFrame Zone
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		frame.setVisible(true);
		frame.setSize(600,600);
		frame.setResizable(false);			
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(panel);
		
		JButton btnHotDrink = new JButton("Hot Drink");
		btnHotDrink.setFont(new Font("MV Boli", Font.PLAIN, 25));
		btnHotDrink.setBounds(78, 356, 173, 86);
		btnHotDrink.addActionListener(this);
		btnHotDrink.setFocusable(false);
		panel.add(btnHotDrink);
		
		JButton btnColdDrink = new JButton("Cold Drink");
		btnColdDrink.setFont(new Font("MV Boli", Font.PLAIN, 25));
		btnColdDrink.setBounds(375, 356, 173, 86);
		btnColdDrink.addActionListener(this);
		btnColdDrink.setFocusable(false);
		panel.add(btnColdDrink);
		
		btnLogout = new JButton("Log-out");
		btnLogout.setFont(new Font("MV Boli", Font.PLAIN, 25));
		btnLogout.setFocusable(false);
		btnLogout.addActionListener(this);
		btnLogout.setBounds(225, 462, 173, 86);
		panel.add(btnLogout);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnLogout) {
			LogInPage logInPage =new LogInPage();
			frame.dispose();
			
		}
		
		
	}
}

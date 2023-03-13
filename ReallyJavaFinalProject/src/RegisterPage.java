import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class RegisterPage extends JFrame implements ActionListener {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPage frame = new RegisterPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	JFrame jframe;
	JButton btnOk;
	JButton btnCancel;
	JLabel logo;
	private JLabel lblNewLabel;
	private JTextField nameTF;
	private JTextField telephoneTF;
	private JPasswordField passwordField;
	
	public RegisterPage() {
		
		
		
		ImageIcon Coffeelogo = new ImageIcon("D:\\Project Picture\\CoffeeLogoResize.jpg");
		
		logo =new JLabel();
		logo.setBounds(183, 5, 234, 194);
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setIcon(Coffeelogo);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(219, 184, 142));
		panel.setBounds(0, 0, 584, 561);
		panel.setLayout(null);
		panel.add(logo);
		
		lblNewLabel = new JLabel("Registeration");
		lblNewLabel.setFont(new Font("MV Boli", Font.BOLD, 30));
		lblNewLabel.setBounds(193, 193, 203, 60);
		panel.add(lblNewLabel);
		
		nameTF = new JTextField();
		nameTF.addFocusListener(new FocusAdapter(){
			@Override
			public void focusGained(FocusEvent e) {
				if(nameTF.getText().equals("Please enter your full name")) {
					nameTF.setText(null);
					nameTF.requestFocus();
					nameTF.setFont(new Font("MV Boli",Font.PLAIN,20));
					nameTF.setForeground(Color.black);			
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(nameTF.getText().length()==0) {
					nameTF.setFont(new Font("MV Boli",Font.PLAIN,20));
					nameTF.setForeground(Color.gray);
					nameTF.setText("Please enter your full name");
				}
			}
		});
		nameTF.setBounds(82, 264, 445, 44);
		nameTF.setColumns(10);
		panel.add(nameTF);
		
		telephoneTF = new JTextField();
		telephoneTF.addFocusListener(new FocusAdapter(){
			@Override
			public void focusGained(FocusEvent e) {
				if(telephoneTF.getText().equals("Please enter your telephone number")) {
					telephoneTF.setText(null);
					telephoneTF.requestFocus();
					telephoneTF.setFont(new Font("MV Boli",Font.PLAIN,20));
					telephoneTF.setForeground(Color.black);			
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(telephoneTF.getText().length()==0) {
					telephoneTF.setFont(new Font("MV Boli",Font.PLAIN,20));
					telephoneTF.setForeground(Color.gray);
					telephoneTF.setText("Please enter your telephone number");
				}
			}
		});
		telephoneTF.setColumns(10);
		telephoneTF.setBounds(82, 340, 445, 44);
		panel.add(telephoneTF);
		
		passwordField = new JPasswordField();
		passwordField.addFocusListener(new FocusAdapter(){
			@Override
			public void focusGained(FocusEvent e) {
				String password=new String(passwordField.getPassword());
				if(password.equals("Please enter your password")) {
					passwordField.setText(null);
					passwordField.requestFocus();
					passwordField.setFont(new Font("MV Boli",Font.PLAIN,20));
					passwordField.setForeground(Color.black);			
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				String password=new String(passwordField.getPassword());
				if(password.length()==0) {
					passwordField.setFont(new Font("MV Boli",Font.PLAIN,20));
					passwordField.setForeground(Color.gray);
					passwordField.setText("Please enter your password");
				}
			}
		});
		passwordField.setBounds(82, 414, 445, 44);
		panel.add(passwordField);
		
		btnOk = new JButton("Ok");
		btnOk.setFont(new Font("MV Boli", Font.PLAIN, 25));
		btnOk.addActionListener(this);
		btnOk.setBounds(82, 486, 138, 45);
		panel.add(btnOk);
		
		btnCancel = new JButton("Cancel\r\n");
		btnCancel.setFont(new Font("MV Boli", Font.PLAIN, 25));
		btnCancel.addActionListener(this);
		btnCancel.setBounds(389, 486, 138, 45);
		panel.add(btnCancel);
		
		//Frame Zone
		jframe = new JFrame();
		jframe.setResizable(false);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(600,600);
		jframe.setVisible(true);
		jframe.getContentPane().add(panel);
		jframe.setTitle("Coffee Store");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnOk) {
			try {
				FileWriter data = new FileWriter("E:/Sign Up Sheet.txt",true);
				PrintWriter write = new PrintWriter(data);
				write.println(nameTF.getText()+" "+telephoneTF.getText()+" "+passwordField.getText());
				write.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(null,"Register Complete","Complete", JOptionPane.PLAIN_MESSAGE);
			new MenuPage();
			jframe.dispose();			
		}
		
		if(e.getSource()==btnCancel) {
			new LogInPage();
			jframe.dispose();
		}
	}
	
}

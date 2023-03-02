import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{
    final private Font mainFont = new Font("Segoe print",Font.BOLD,18);
    JTextField tfFirstName,tfLastName;

    public void initialize(){
        /*Form Pannel */
        JLabel lbFirstName = new JLabel("First Name");
        lbFirstName.setFont(mainFont);
        tfFirstName=new JTextField();
        tfFirstName.setFont(mainFont);

        JLabel lbLastName=new JLabel("Last Name");
        lbLastName.setFont(mainFont);
        tfLastName=new JTextField();
        tfLastName.setFont(mainFont);



        JPanel mainPanel= new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128,128,255));


        setTitle("Welcome");
        setSize(500,700);
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }
    
}

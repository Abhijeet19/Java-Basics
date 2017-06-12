import java.sql.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class LoginTest {
	
	Connection con;
	Statement st;
	ResultSet rs;
	
	JFrame f = new JFrame("User Login");
	JLabel l = new JLabel("User Name: ");
	JLabel l1 = new JLabel("Password");
	JTextField t = new JTextField(10);
	JTextField t1 = new JTextField(10);

	JButton b = new JButton("Login");
	
	
	public LoginTest() {
		connect();
		frame();
	}
	
	public void connect() {
		try {
			String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
			Class.forName(driver);
			
			String db = "Jdbc:Odbc:db11";
			con = DriverManager.getConnection(db);
			st = con.createStatement();
				
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void frame() {
		f.setSize(600,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		JPanel p = new JPanel();
		p.add(l);
		p.add(t);
		p.add(l1);
		p.add(t1);
		p.add(b);
		f.add(p);
		
		
	}
	
	public static void main(String[] args) {
		new LoginTest();
	}
	
	

}

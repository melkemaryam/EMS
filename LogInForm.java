/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class LogInForm extends JFrame {

        private JMenuBar menuBar;
	private JLabel LogIn;
	private JButton LogInButton;
	private JLabel NewUserLabel;
	private JPasswordField PassFieldLogIn;
	private JLabel PasswordLabel;
	private JButton RegisterButton;
	private JTextField StudentID;
	private JLabel StudentIDLabel;
	private JComboBox UserTypeBox;
	private JLabel UserTypeLabel;
	int hello;

	
	Connection conn;
	PreparedStatement pst;
	ResultSet rs;
	
	
	
	

	//Constructor 
	public LogInForm(){

		this.setTitle("LogInForm");
		this.setSize(500,400);
		//menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(500,400));
		contentPane.setBackground(new Color(192,192,192));


		LogIn = new JLabel();
		LogIn.setBounds(201,24,90,35);
		LogIn.setBackground(new Color(214,217,223));
		LogIn.setForeground(new Color(0,0,0));
		LogIn.setEnabled(true);
		LogIn.setFont(new Font("SansSerif",0,20));
		LogIn.setText("Log In");
		LogIn.setVisible(true);

		LogInButton = new JButton();
		LogInButton.setBounds(199,244,90,35);
		LogInButton.setBackground(new Color(214,217,223));
		LogInButton.setForeground(new Color(0,0,0));
		LogInButton.setEnabled(true);
		LogInButton.setFont(new Font("sansserif",0,12));
		LogInButton.setText("Log In");
		LogInButton.setVisible(true);
		//Set methods for mouse events
		//Call defined methods
		LogInButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				logIn(evt);
			}
		});


		NewUserLabel = new JLabel();
		NewUserLabel.setBounds(188,286,132,28);
		NewUserLabel.setBackground(new Color(214,217,223));
		NewUserLabel.setForeground(new Color(0,0,0));
		NewUserLabel.setEnabled(true);
		NewUserLabel.setFont(new Font("sansserif",0,12));
		NewUserLabel.setText("Are you a new user?");
		NewUserLabel.setVisible(true);

		PassFieldLogIn = new JPasswordField();
		PassFieldLogIn.setBounds(259,136,90,35);
		PassFieldLogIn.setBackground(new Color(214,217,223));
		PassFieldLogIn.setForeground(new Color(0,0,0));
		PassFieldLogIn.setEnabled(true);
		PassFieldLogIn.setFont(new Font("sansserif",0,12));
		PassFieldLogIn.setVisible(true);

		PasswordLabel = new JLabel();
		PasswordLabel.setBounds(120,140,90,35);
		PasswordLabel.setBackground(new Color(214,217,223));
		PasswordLabel.setForeground(new Color(0,0,0));
		PasswordLabel.setEnabled(true);
		PasswordLabel.setFont(new Font("sansserif",0,12));
		PasswordLabel.setText("Password");
		PasswordLabel.setVisible(true);

		RegisterButton = new JButton();
		RegisterButton.setBounds(201,325,90,35);
		RegisterButton.setBackground(new Color(214,217,223));
		RegisterButton.setForeground(new Color(0,0,0));
		RegisterButton.setEnabled(true);
		RegisterButton.setFont(new Font("sansserif",0,12));
		RegisterButton.setText("Register");
		RegisterButton.setVisible(true);
		//Set action for button click
		//Call defined method

		RegisterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				goToRegister(evt);

			}
		});
                        

		StudentID = new JTextField();
		StudentID.setBounds(257,91,90,35);
		StudentID.setBackground(new Color(255,255,255));
		StudentID.setForeground(new Color(0,0,0));
		StudentID.setEnabled(true);
		StudentID.setFont(new Font("sansserif",0,12));
		StudentID.setText("");
		StudentID.setVisible(true);

		StudentIDLabel = new JLabel();
		StudentIDLabel.setBounds(123,92,90,35);
		StudentIDLabel.setBackground(new Color(214,217,223));
		StudentIDLabel.setForeground(new Color(0,0,0));
		StudentIDLabel.setEnabled(true);
		StudentIDLabel.setFont(new Font("sansserif",0,12));
		StudentIDLabel.setText("Student ID");
		StudentIDLabel.setVisible(true);
		
		UserTypeBox = new JComboBox();
		UserTypeBox.setBounds(265,191,90,35);
		UserTypeBox.setBackground(new Color(214,217,223));
		UserTypeBox.setForeground(new Color(0,0,0));
		UserTypeBox.setEnabled(true);
		UserTypeBox.setFont(new Font("sansserif",0,12));
		UserTypeBox.setVisible(true);

		UserTypeLabel = new JLabel();
		UserTypeLabel.setBounds(117,193,90,35);
		UserTypeLabel.setBackground(new Color(214,217,223));
		UserTypeLabel.setForeground(new Color(0,0,0));
		UserTypeLabel.setEnabled(true);
		UserTypeLabel.setFont(new Font("sansserif",0,12));
		UserTypeLabel.setText("User Type");
		UserTypeLabel.setVisible(true);

		//adding components to contentPane panel
		contentPane.add(LogIn);
		contentPane.add(LogInButton);
		contentPane.add(NewUserLabel);
		contentPane.add(PassFieldLogIn);
		contentPane.add(PasswordLabel);
		contentPane.add(RegisterButton);
		contentPane.add(StudentID);
		contentPane.add(StudentIDLabel);
		contentPane.add(UserTypeBox);
		contentPane.add(UserTypeLabel);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

	//Method mouseClicked for LogInButton
	private void logIn (MouseEvent evt) {
		 try {

            if (StudentID.getText().isEmpty() || PassFieldLogIn.getPassword().length == 0 ) {
                JOptionPane.showMessageDialog(this, "Student ID or Password empty");
            } else {

                String studentid = StudentID.getText();
                
                String password = String.valueOf(PassFieldLogIn.getPassword());
                
                    conn = dbConnection.getConnection();
                    System.out.println("Database Connected");
                    pst = conn.prepareStatement("SELECT * FROM userstudent where studentID=? and password=?");
                    pst.setString(1, studentid);
                    pst.setString(2, password);
                    rs = pst.executeQuery();

                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Welcome " + studentID + " to the student menu");
                        StudentMainForm ms = new StudentMainForm();
                        this.dispose();
                        ms.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "User or Password does not match or account does not exist");
                        StudentID.setText("");
                        
                        PassFieldLogIn.setText("");
                        
                        StudentID.requestFocus();
                    }
                } 
              
            
            conn.close();
            System.out.println("Database is closed");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex + " First error Ups something got wrong.....");
            Logger.getLogger(LogInForm.class.getName()).log(Level.SEVERE, null, ex);
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex1) {
                    Logger.getLogger(LogInForm.class.getName()).log(Level.SEVERE, null, ex1);
                    JOptionPane.showMessageDialog(this, ex + " Second Error Ups something got wrong.....");
                }
            }
        }

    
	
	}

	//Method actionPerformed for RegisterButton

	private void goToRegister (ActionEvent evt) {
			//TODO

	}

	//method for generate menu
	public void generateMenu(){
		menuBar = new JMenuBar();

		JMenu file = new JMenu("File");
		JMenu tools = new JMenu("Tools");
		JMenu help = new JMenu("Help");

		JMenuItem open = new JMenuItem("Open   ");
		JMenuItem save = new JMenuItem("Save   ");
		JMenuItem exit = new JMenuItem("Exit   ");
		JMenuItem preferences = new JMenuItem("Preferences   ");
		JMenuItem about = new JMenuItem("About   ");


		file.add(open);
		file.add(save);
		file.addSeparator();
		file.add(exit);
		tools.add(preferences);
		help.add(about);

		menuBar.add(file);
		menuBar.add(tools);
		menuBar.add(help);
	}



	 public static void main(String[] args){
		System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new LogInForm().setVisible(true);
			}
		});
	}

} 
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


public class LogInForm extends JFrame {

	private JMenuBar menuBar;
	private JLabel LogIn;
	private JButton LogInButton;
	private JLabel NewUserLabel;
	private JTextField Password;
	private JLabel PasswordLabel;
	private JButton RegisterButton;
	private JTextField StudentID;
	private JLabel StudentIDLavel;

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
		LogInButton.setBounds(201,201,90,35);
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

		Password = new JTextField();
		Password.setBounds(258,138,90,35);
		Password.setBackground(new Color(255,255,255));
		Password.setForeground(new Color(0,0,0));
		Password.setEnabled(true);
		Password.setFont(new Font("sansserif",0,12));
		Password.setText("");
		Password.setVisible(true);

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
				register(evt);
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

		StudentIDLavel = new JLabel();
		StudentIDLavel.setBounds(123,92,90,35);
		StudentIDLavel.setBackground(new Color(214,217,223));
		StudentIDLavel.setForeground(new Color(0,0,0));
		StudentIDLavel.setEnabled(true);
		StudentIDLavel.setFont(new Font("sansserif",0,12));
		StudentIDLavel.setText("Student ID");
		StudentIDLavel.setVisible(true);

		//adding components to contentPane panel
		contentPane.add(LogIn);
		contentPane.add(LogInButton);
		contentPane.add(NewUserLabel);
		contentPane.add(Password);
		contentPane.add(PasswordLabel);
		contentPane.add(RegisterButton);
		contentPane.add(StudentID);
		contentPane.add(StudentIDLavel);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

	//Method mouseClicked for LogInButton
	private void logIn (MouseEvent evt) {
			//TODO
	}

	//Method actionPerformed for RegisterButton
	private void register (ActionEvent evt) {
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
				new LogInForm();
			}
		});
	}

}
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


public class RegisterForm extends JFrame {

	private JMenuBar menuBar;
	private JLabel ConPassLabelReg;
	private JTextField ConPassRegField;
	private JLabel FNameLabel;
	private JTextField FNameRegField;
	private JLabel IDLabelReg;
	private JTextField LNameRegField;
	private JLabel LNameRegLabel;
	private JTextField PassRegField;
	private JLabel PasswordLabelReg;
	private JButton RegRegisterButton;
	private JLabel RegisterLabel;
	private JTextField StuIDRegField;

	//Constructor 
	public RegisterForm(){

		this.setTitle("RegisterForm");
		this.setSize(500,400);
		//menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(500,400));
		contentPane.setBackground(new Color(192,192,192));


		ConPassLabelReg = new JLabel();
		ConPassLabelReg.setBounds(97,179,117,32);
		ConPassLabelReg.setBackground(new Color(214,217,223));
		ConPassLabelReg.setForeground(new Color(0,0,0));
		ConPassLabelReg.setEnabled(true);
		ConPassLabelReg.setFont(new Font("sansserif",0,12));
		ConPassLabelReg.setText("Confirm Password");
		ConPassLabelReg.setVisible(true);

		ConPassRegField = new JTextField();
		ConPassRegField.setBounds(265,176,90,35);
		ConPassRegField.setBackground(new Color(255,255,255));
		ConPassRegField.setForeground(new Color(0,0,0));
		ConPassRegField.setEnabled(true);
		ConPassRegField.setFont(new Font("sansserif",0,12));
		ConPassRegField.setText("");
		ConPassRegField.setVisible(true);

		FNameLabel = new JLabel();
		FNameLabel.setBounds(96,223,90,35);
		FNameLabel.setBackground(new Color(214,217,223));
		FNameLabel.setForeground(new Color(0,0,0));
		FNameLabel.setEnabled(true);
		FNameLabel.setFont(new Font("sansserif",0,12));
		FNameLabel.setText("First Name");
		FNameLabel.setVisible(true);

		FNameRegField = new JTextField();
		FNameRegField.setBounds(264,220,90,35);
		FNameRegField.setBackground(new Color(255,255,255));
		FNameRegField.setForeground(new Color(0,0,0));
		FNameRegField.setEnabled(true);
		FNameRegField.setFont(new Font("sansserif",0,12));
		FNameRegField.setText("");
		FNameRegField.setVisible(true);

		IDLabelReg = new JLabel();
		IDLabelReg.setBounds(97,98,90,35);
		IDLabelReg.setBackground(new Color(214,217,223));
		IDLabelReg.setForeground(new Color(0,0,0));
		IDLabelReg.setEnabled(true);
		IDLabelReg.setFont(new Font("sansserif",0,12));
		IDLabelReg.setText("Student ID");
		IDLabelReg.setVisible(true);

		LNameRegField = new JTextField();
		LNameRegField.setBounds(265,266,90,35);
		LNameRegField.setBackground(new Color(255,255,255));
		LNameRegField.setForeground(new Color(0,0,0));
		LNameRegField.setEnabled(true);
		LNameRegField.setFont(new Font("sansserif",0,12));
		LNameRegField.setText("");
		LNameRegField.setVisible(true);

		LNameRegLabel = new JLabel();
		LNameRegLabel.setBounds(95,268,90,35);
		LNameRegLabel.setBackground(new Color(214,217,223));
		LNameRegLabel.setForeground(new Color(0,0,0));
		LNameRegLabel.setEnabled(true);
		LNameRegLabel.setFont(new Font("sansserif",0,12));
		LNameRegLabel.setText("Last Name");
		LNameRegLabel.setVisible(true);

		PassRegField = new JTextField();
		PassRegField.setBounds(264,134,90,35);
		PassRegField.setBackground(new Color(255,255,255));
		PassRegField.setForeground(new Color(0,0,0));
		PassRegField.setEnabled(true);
		PassRegField.setFont(new Font("sansserif",0,12));
		PassRegField.setText("");
		PassRegField.setVisible(true);

		PasswordLabelReg = new JLabel();
		PasswordLabelReg.setBounds(97,136,90,35);
		PasswordLabelReg.setBackground(new Color(214,217,223));
		PasswordLabelReg.setForeground(new Color(0,0,0));
		PasswordLabelReg.setEnabled(true);
		PasswordLabelReg.setFont(new Font("sansserif",0,12));
		PasswordLabelReg.setText("Password");
		PasswordLabelReg.setVisible(true);

		RegRegisterButton = new JButton();
		RegRegisterButton.setBounds(195,326,90,35);
		RegRegisterButton.setBackground(new Color(214,217,223));
		RegRegisterButton.setForeground(new Color(0,0,0));
		RegRegisterButton.setEnabled(true);
		RegRegisterButton.setFont(new Font("sansserif",0,12));
		RegRegisterButton.setText("Register");
		RegRegisterButton.setVisible(true);
		//Set action for button click
		//Call defined method
		RegRegisterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				register(evt);
			}
		});


		RegisterLabel = new JLabel();
		RegisterLabel.setBounds(193,32,90,35);
		RegisterLabel.setBackground(new Color(214,217,223));
		RegisterLabel.setForeground(new Color(0,0,0));
		RegisterLabel.setEnabled(true);
		RegisterLabel.setFont(new Font("SansSerif",0,20));
		RegisterLabel.setText("Register");
		RegisterLabel.setVisible(true);

		StuIDRegField = new JTextField();
		StuIDRegField.setBounds(262,93,90,35);
		StuIDRegField.setBackground(new Color(255,255,255));
		StuIDRegField.setForeground(new Color(0,0,0));
		StuIDRegField.setEnabled(true);
		StuIDRegField.setFont(new Font("sansserif",0,12));
		StuIDRegField.setText("");
		StuIDRegField.setVisible(true);

		//adding components to contentPane panel
		contentPane.add(ConPassLabelReg);
		contentPane.add(ConPassRegField);
		contentPane.add(FNameLabel);
		contentPane.add(FNameRegField);
		contentPane.add(IDLabelReg);
		contentPane.add(LNameRegField);
		contentPane.add(LNameRegLabel);
		contentPane.add(PassRegField);
		contentPane.add(PasswordLabelReg);
		contentPane.add(RegRegisterButton);
		contentPane.add(RegisterLabel);
		contentPane.add(StuIDRegField);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

	//Method actionPerformed for RegRegisterButton
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
				new RegisterForm();
			}
		});
	}

}
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
	private JButton LogInButton;
	private JTextField LogInID;
	private JTextField LogInPass;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;

	//Constructor 
	public LogInForm(){

		this.setTitle("LogInForm");
		this.setSize(445,350);
		//menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(445,350));
		contentPane.setBackground(new Color(192,192,192));


		LogInButton = new JButton();
		LogInButton.setBounds(165,242,90,35);
		LogInButton.setBackground(new Color(214,217,223));
		LogInButton.setForeground(new Color(0,0,0));
		LogInButton.setEnabled(true);
		LogInButton.setFont(new Font("sansserif",0,12));
		LogInButton.setText("Log In");
		LogInButton.setVisible(true);
		//Set action for button click
		//Call defined method
		LogInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				loginnow(evt);
			}
		});

		//Set methods for mouse events
		//Call defined methods
		LogInButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				logIn(evt);
			}
		});


		LogInID = new JTextField();
		LogInID.setBounds(203,101,90,35);
		LogInID.setBackground(new Color(255,255,255));
		LogInID.setForeground(new Color(0,0,0));
		LogInID.setEnabled(true);
		LogInID.setFont(new Font("sansserif",0,12));
		LogInID.setText("");
		LogInID.setVisible(true);

		LogInPass = new JTextField();
		LogInPass.setBounds(206,151,90,35);
		LogInPass.setBackground(new Color(255,255,255));
		LogInPass.setForeground(new Color(0,0,0));
		LogInPass.setEnabled(true);
		LogInPass.setFont(new Font("sansserif",0,12));
		LogInPass.setText("");
		LogInPass.setVisible(true);

		label1 = new JLabel();
		label1.setBounds(98,102,90,35);
		label1.setBackground(new Color(214,217,223));
		label1.setForeground(new Color(0,0,0));
		label1.setEnabled(true);
		label1.setFont(new Font("sansserif",0,12));
		label1.setText("Student ID");
		label1.setVisible(true);

		label2 = new JLabel();
		label2.setBounds(97,153,90,35);
		label2.setBackground(new Color(214,217,223));
		label2.setForeground(new Color(0,0,0));
		label2.setEnabled(true);
		label2.setFont(new Font("sansserif",0,12));
		label2.setText("Password");
		label2.setVisible(true);

		label3 = new JLabel();
		label3.setBounds(126,26,215,28);
		label3.setBackground(new Color(214,217,223));
		label3.setForeground(new Color(0,0,0));
		label3.setEnabled(true);
		label3.setFont(new Font("SansSerif",0,20));
		label3.setText("Log In to the EMS");
		label3.setVisible(true);

		//adding components to contentPane panel
		contentPane.add(LogInButton);
		contentPane.add(LogInID);
		contentPane.add(LogInPass);
		contentPane.add(label1);
		contentPane.add(label2);
		contentPane.add(label3);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

	//Method actionPerformed for LogInButton
	private void loginnow (ActionEvent evt) {
			//TODO
	}

	//Method mouseClicked for LogInButton
	private void logIn (MouseEvent evt) {
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
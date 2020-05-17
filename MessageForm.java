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


public class MessageForm extends JFrame {

	private JMenuBar menuBar;
	private JButton OkMessButton;
	private JLabel label1;

	//Constructor 
	public MessageForm(){

		this.setTitle("MessageForm");
		this.setSize(406,187);
		//menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(406,187));
		contentPane.setBackground(new Color(192,192,192));


		OkMessButton = new JButton();
		OkMessButton.setBounds(168,120,90,35);
		OkMessButton.setBackground(new Color(214,217,223));
		OkMessButton.setForeground(new Color(0,0,0));
		OkMessButton.setEnabled(true);
		OkMessButton.setFont(new Font("sansserif",0,12));
		OkMessButton.setText("OK");
		OkMessButton.setVisible(true);
		//Set action for button click
		//Call defined method
		OkMessButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				goBack(evt);
			}
		});


		label1 = new JLabel();
		label1.setBounds(93,60,254,36);
		label1.setBackground(new Color(214,217,223));
		label1.setForeground(new Color(0,0,0));
		label1.setEnabled(true);
		label1.setFont(new Font("sansserif",0,12));
		label1.setText("Congratulations! Everything worked!");
		label1.setVisible(true);

		//adding components to contentPane panel
		contentPane.add(OkMessButton);
		contentPane.add(label1);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

	//Method actionPerformed for OkMessButton
	private void goBack (ActionEvent evt) {
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
				new MessageForm();
			}
		});
	}

}
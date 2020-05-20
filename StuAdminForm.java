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


public class StuAdminForm extends JFrame {

	private JMenuBar menuBar;
	private JButton ApplyButton;
	private JButton DiscardButton;
	private JButton DoneButton;
	private JTextArea PermissionField;
	private JLabel PermissionLabel;
	private JLabel RoleLabel;
	private JButton SeeOrganisersButton;
	private JButton SeeRequestsButton;
	private JButton SeeStudentsButton;
	private JButton SeeAllUsersButton;
	private JLabel StuAdminLabel;
	private JTextArea UserRoleField;
	private JTextArea UsernameField;
	private JLabel nameLabel;

	//Constructor 
	public StuAdminForm(){

		this.setTitle("StuAdminForm");
		this.setSize(719,442);
		//menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(719,442));
		contentPane.setBackground(new Color(192,192,192));


		ApplyButton = new JButton();
		ApplyButton.setBounds(600,104,90,35);
		ApplyButton.setBackground(new Color(214,217,223));
		ApplyButton.setForeground(new Color(0,0,0));
		ApplyButton.setEnabled(true);
		ApplyButton.setFont(new Font("sansserif",0,12));
		ApplyButton.setText("Apply");
		ApplyButton.setVisible(true);
		
		//Set action for button click
		//Call defined method
		ApplyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				applyChanges(evt);
			}
		});

		DiscardButton = new JButton();
		DiscardButton.setBounds(605,156,90,35);
		DiscardButton.setBackground(new Color(214,217,223));
		DiscardButton.setForeground(new Color(0,0,0));
		DiscardButton.setEnabled(true);
		DiscardButton.setFont(new Font("sansserif",0,12));
		DiscardButton.setText("Discard");
		DiscardButton.setVisible(true);
		
		//Set action for button click
		//Call defined method
		DiscardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				discard(evt);
			}
		});

		DoneButton = new JButton();
		DoneButton.setBounds(605,201,90,35);
		DoneButton.setBackground(new Color(214,217,223));
		DoneButton.setForeground(new Color(0,0,0));
		DoneButton.setEnabled(true);
		DoneButton.setFont(new Font("sansserif",0,12));
		DoneButton.setText("Done");
		DoneButton.setVisible(true);
		
		//Set action for button click
		//Call defined method
		DoneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				done(evt);
			}
		});

		PermissionField = new JTextArea();
		PermissionField.setBounds(497,106,90,275);
		PermissionField.setBackground(new Color(255,255,255));
		PermissionField.setForeground(new Color(0,0,0));
		PermissionField.setEnabled(true);
		PermissionField.setFont(new Font("sansserif",0,12));
		PermissionField.setText("");
		PermissionField.setBorder(BorderFactory.createBevelBorder(1));
		PermissionField.setVisible(true);

		PermissionLabel = new JLabel();
		PermissionLabel.setBounds(492,67,90,35);
		PermissionLabel.setBackground(new Color(214,217,223));
		PermissionLabel.setForeground(new Color(0,0,0));
		PermissionLabel.setEnabled(true);
		PermissionLabel.setFont(new Font("sansserif",0,12));
		PermissionLabel.setText("Permission");
		PermissionLabel.setVisible(true);

		RoleLabel = new JLabel();
		RoleLabel.setBounds(358,68,90,35);
		RoleLabel.setBackground(new Color(214,217,223));
		RoleLabel.setForeground(new Color(0,0,0));
		RoleLabel.setEnabled(true);
		RoleLabel.setFont(new Font("sansserif",0,12));
		RoleLabel.setText("Role");
		RoleLabel.setVisible(true);

		SeeOrganisersButton = new JButton();
		SeeOrganisersButton.setBounds(26,200,146,34);
		SeeOrganisersButton.setBackground(new Color(214,217,223));
		SeeOrganisersButton.setForeground(new Color(0,0,0));
		SeeOrganisersButton.setEnabled(true);
		SeeOrganisersButton.setFont(new Font("sansserif",0,12));
		SeeOrganisersButton.setText("See Organisers");
		SeeOrganisersButton.setVisible(true);
		
		//Set action for button click
		//Call defined method
		SeeOrganisersButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				seeOrganisers(evt);
			}
		});

		SeeRequestsButton = new JButton();
		SeeRequestsButton.setBounds(27,254,149,31);
		SeeRequestsButton.setBackground(new Color(214,217,223));
		SeeRequestsButton.setForeground(new Color(0,0,0));
		SeeRequestsButton.setEnabled(true);
		SeeRequestsButton.setFont(new Font("sansserif",0,12));
		SeeRequestsButton.setText("See Requests");
		SeeRequestsButton.setVisible(true);
		
		//Set action for button click
		//Call defined method
		SeeRequestsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				seeRequests(evt);
			}
		});

		SeeStudentsButton = new JButton();
		SeeStudentsButton.setBounds(24,149,141,36);
		SeeStudentsButton.setBackground(new Color(214,217,223));
		SeeStudentsButton.setForeground(new Color(0,0,0));
		SeeStudentsButton.setEnabled(true);
		SeeStudentsButton.setFont(new Font("sansserif",0,12));
		SeeStudentsButton.setText("See Students");
		SeeStudentsButton.setVisible(true);
		
		//Set action for button click
		//Call defined method
		SeeStudentsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				seeStudents(evt);
			}
		});

		SeeAllUsersButton = new JButton();
		SeeAllUsersButton.setBounds(24,99,145,33);
		SeeAllUsersButton.setBackground(new Color(214,217,223));
		SeeAllUsersButton.setForeground(new Color(0,0,0));
		SeeAllUsersButton.setEnabled(true);
		SeeAllUsersButton.setFont(new Font("sansserif",0,12));
		SeeAllUsersButton.setText("See All Users");
		SeeAllUsersButton.setVisible(true);
		
		//Set action for button click
		//Call defined method
		SeeAllUsersButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				seeAllUsers(evt);
			}
		});

		StuAdminLabel = new JLabel();
		StuAdminLabel.setBounds(243,14,269,31);
		StuAdminLabel.setBackground(new Color(214,217,223));
		StuAdminLabel.setForeground(new Color(0,0,0));
		StuAdminLabel.setEnabled(true);
		StuAdminLabel.setFont(new Font("SansSerif",0,20));
		StuAdminLabel.setText("Student Administration");
		StuAdminLabel.setVisible(true);

		UserRoleField = new JTextArea();
		UserRoleField.setBounds(358,106,133,275);
		UserRoleField.setBackground(new Color(255,255,255));
		UserRoleField.setForeground(new Color(0,0,0));
		UserRoleField.setEnabled(true);
		UserRoleField.setFont(new Font("sansserif",0,12));
		UserRoleField.setText("");
		UserRoleField.setBorder(BorderFactory.createBevelBorder(1));
		UserRoleField.setVisible(true);

		UsernameField = new JTextArea();
		UsernameField.setBounds(208,106,145,275);
		UsernameField.setBackground(new Color(255,255,255));
		UsernameField.setForeground(new Color(0,0,0));
		UsernameField.setEnabled(true);
		UsernameField.setFont(new Font("sansserif",0,12));
		UsernameField.setText("");
		UsernameField.setBorder(BorderFactory.createBevelBorder(1));
		UsernameField.setVisible(true);

		nameLabel = new JLabel();
		nameLabel.setBounds(211,70,90,35);
		nameLabel.setBackground(new Color(214,217,223));
		nameLabel.setForeground(new Color(0,0,0));
		nameLabel.setEnabled(true);
		nameLabel.setFont(new Font("sansserif",0,12));
		nameLabel.setText("Name");
		nameLabel.setVisible(true);

		//adding components to contentPane panel
		contentPane.add(ApplyButton);
		contentPane.add(DiscardButton);
		contentPane.add(DoneButton);
		contentPane.add(PermissionField);
		contentPane.add(PermissionLabel);
		contentPane.add(RoleLabel);
		contentPane.add(SeeOrganisersButton);
		contentPane.add(SeeRequestsButton);
		contentPane.add(SeeStudentsButton);
		contentPane.add(SeeAllUsersButton);
		contentPane.add(StuAdminLabel);
		contentPane.add(UserRoleField);
		contentPane.add(UsernameField);
		contentPane.add(nameLabel);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}
	
	//Method actionPerformed
	private void applyChanges (ActionEvent evt) {
			//TODO
	}
	
	//Method actionPerformed
	private void discard (ActionEvent evt) {
			//TODO
	}
	
	//Method actionPerformed
	private void done (ActionEvent evt) {
			//TODO
	}
	
	//Method actionPerformed
	private void seeOrganisers (ActionEvent evt) {
			//TODO
	}
	
	//Method actionPerformed
	private void seeRequests (ActionEvent evt) {
			//TODO
	}
	
	//Method actionPerformed
	private void seeStudents (ActionEvent evt) {
			//TODO
	}
	
	//Method actionPerformed
	private void seeAllUsers (ActionEvent evt) {
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
				new StuAdminForm();
			}
		});
	}

}
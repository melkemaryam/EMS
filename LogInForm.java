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
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class LogInForm extends JFrame {
        // Variables declaration
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

    
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    
    
    
    

     /**
     * Constructor for objects of class Login
     */
    public LogInForm(){

        this.setTitle("LogInForm");
        this.setSize(500,400);
        

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(192,192,192));

	// create new label
        LogIn = new JLabel();
        LogIn.setBounds(201,24,90,35);
        LogIn.setBackground(new Color(214,217,223));
        LogIn.setForeground(new Color(0,0,0));
        LogIn.setEnabled(true);
        LogIn.setFont(new Font("SansSerif",0,20));
        LogIn.setText("Log In");
        LogIn.setVisible(true);
	
	// create new button
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

	// create new label
        NewUserLabel = new JLabel();
        NewUserLabel.setBounds(188,286,132,28);
        NewUserLabel.setBackground(new Color(214,217,223));
        NewUserLabel.setForeground(new Color(0,0,0));
        NewUserLabel.setEnabled(true);
        NewUserLabel.setFont(new Font("sansserif",0,12));
        NewUserLabel.setText("Are you a new user?");
        NewUserLabel.setVisible(true);

	// create new field
        PassFieldLogIn = new JPasswordField();
        PassFieldLogIn.setBounds(259,136,90,35);
        PassFieldLogIn.setBackground(new Color(214,217,223));
        PassFieldLogIn.setForeground(new Color(0,0,0));
        PassFieldLogIn.setEnabled(true);
        PassFieldLogIn.setFont(new Font("sansserif",0,12));
        PassFieldLogIn.setVisible(true);

	// create new label
        PasswordLabel = new JLabel();
        PasswordLabel.setBounds(120,140,90,35);
        PasswordLabel.setBackground(new Color(214,217,223));
        PasswordLabel.setForeground(new Color(0,0,0));
        PasswordLabel.setEnabled(true);
        PasswordLabel.setFont(new Font("sansserif",0,12));
        PasswordLabel.setText("Password");
        PasswordLabel.setVisible(true);

	// create new button
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
                        
	// create new field
        StudentID = new JTextField();
        StudentID.setBounds(257,91,90,35);
        StudentID.setBackground(new Color(255,255,255));
        StudentID.setForeground(new Color(0,0,0));
        StudentID.setEnabled(true);
        StudentID.setFont(new Font("sansserif",0,12));
        StudentID.setText("");
        StudentID.setVisible(true);
	
	// create new label
        StudentIDLabel = new JLabel();
        StudentIDLabel.setBounds(123,92,90,35);
        StudentIDLabel.setBackground(new Color(214,217,223));
        StudentIDLabel.setForeground(new Color(0,0,0));
        StudentIDLabel.setEnabled(true);
        StudentIDLabel.setFont(new Font("sansserif",0,12));
        StudentIDLabel.setText("Student ID");
        StudentIDLabel.setVisible(true);
       
	// create new combobox
        UserTypeBox = new JComboBox();
        UserTypeBox.setBounds(265,191,90,35);
        UserTypeBox.setBackground(new Color(214,217,223));
        UserTypeBox.setForeground(new Color(0,0,0));
        UserTypeBox.setEnabled(true);
        UserTypeBox.setFont(new Font("sansserif",0,12));
        UserTypeBox.setVisible(true);
        UserTypeBox.setModel(new DefaultComboBoxModel<>(new String[] {"Student","Event Organiser","Administrator"} ));

	// create new label
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

                int studentid = Integer.parseInt(StudentID.getText());
                String usertype = UserTypeBox.getSelectedItem().toString();
                String password = String.valueOf(PassFieldLogIn.getPassword());
                
                    if ("student".equalsIgnoreCase(usertype)) 
                    {
                    conn = DBManager.connect();
                    System.out.println("Database Connected");
                    pst = conn.prepareStatement("SELECT * FROM Users where UniversityID=? and password=?");
                    pst.setInt(1, studentid);
                    pst.setString(2, password);
                    rs = pst.executeQuery();

                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Welcome " + studentid + " to the student menu");
                        StudentMainForm ms = new StudentMainForm();
                        ms.catchAUser(studentid);
                        this.dispose();
                        ms.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "User or Password does not match or account does not exist");
                        StudentID.setText("");
                        PassFieldLogIn.setText("");
                        UserTypeBox.setSelectedIndex(-1);
                        StudentID.requestFocus();
                    }
                } else if ("event organiser".equalsIgnoreCase(usertype)) {
                    conn = DBManager.connect();
                    System.out.println("Database Connected");
                    pst = conn.prepareStatement("SELECT * FROM Users where StudentID=? and password=?");
                    pst.setInt(1, studentid);
                    pst.setString(2, password);
                    rs = pst.executeQuery();

                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Welcome " + studentid + " to the Event Organiser menu");
                        EOMainForm mo = new EOMainForm();
                        mo.catchAUser(studentid);
                        this.dispose();
                        mo.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "User or Password does not match or account does not exist");
                        StudentID.setText("");
                        PassFieldLogIn.setText("");
                        UserTypeBox.setSelectedIndex(-1);
                        StudentID.requestFocus();
                    }
                } else if ("administrator".equalsIgnoreCase(usertype)) {
                    conn = DBManager.connect();
                    System.out.println("Database Connected");
                    pst = conn.prepareStatement("SELECT * FROM Users where StudentID=? and password=?");
                    pst.setInt(1, studentid);
                    pst.setString(2, password);
                    rs = pst.executeQuery();

                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Welcome " + studentid + " to the Admin menu");
                        AdminMainForm ma = new AdminMainForm();
                        this.dispose();
                        ma.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "User or Password does not match or account does not exist");
                        StudentID.setText("");
                        PassFieldLogIn.setText("");
                        UserTypeBox.setSelectedIndex(-1);
                        StudentID.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "User or Password does not match or account does not exist");
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
            
            RegisterForm m = new RegisterForm();
            this.dispose();
            m.setVisible(true);

	}

	

         //param args the command line arguments
	 public static void main(String[] args){
		System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		//Create and display the form
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new LogInForm().setVisible(true);
			}
		});
	}

} 

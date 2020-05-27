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

public class RegisterForm extends JFrame {
    // Components of the Form
    private JLabel ConPassLabelReg;
    private JPasswordField ConPassRegField;
    private JLabel FNameLabel;
    private JTextField FNameRegField;
    private JLabel IDLabelReg;
    private JTextField LNameRegField;
    private JLabel LNameRegLabel;
    private JPasswordField PassRegField;
    private JLabel PasswordLabelReg;
    private JButton RegRegisterButton;
    private JLabel RegisterLabel;
    private JTextField StuIDRegField;
    private JComboBox UserTypeBoxReg;
    private JLabel UserTypeLabelReg;
    
    Connection conn;   
    PreparedStatement pst;
    ResultSet rs;
	
    

    // Creates new form RegisteForm 
    public RegisterForm(){

        this.setTitle("RegisterForm");
        this.setSize(500,444);
        

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,444));
        contentPane.setBackground(new Color(192,192,192));


        ConPassLabelReg = new JLabel();
        ConPassLabelReg.setBounds(97,179,117,32);
        ConPassLabelReg.setBackground(new Color(214,217,223));
        ConPassLabelReg.setForeground(new Color(0,0,0));
        ConPassLabelReg.setEnabled(true);
        ConPassLabelReg.setFont(new Font("sansserif",0,12));
        ConPassLabelReg.setText("Confirm Password");
        ConPassLabelReg.setVisible(true);

        ConPassRegField = new JPasswordField();
        ConPassRegField.setBounds(266,177,90,35);
        ConPassRegField.setBackground(new Color(214,217,223));
        ConPassRegField.setForeground(new Color(0,0,0));
        ConPassRegField.setEnabled(true);
        ConPassRegField.setFont(new Font("sansserif",0,12));
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

        PassRegField = new JPasswordField();
        PassRegField.setBounds(264,135,90,35);
        PassRegField.setBackground(new Color(214,217,223));
        PassRegField.setForeground(new Color(0,0,0));
        PassRegField.setEnabled(true);
        PassRegField.setFont(new Font("sansserif",0,12));
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
        RegRegisterButton.setBounds(205,392,90,35);
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
        
        UserTypeBoxReg = new JComboBox();
        UserTypeBoxReg.setBounds(266,317,90,35);
        UserTypeBoxReg.setBackground(new Color(214,217,223));
        UserTypeBoxReg.setForeground(new Color(0,0,0));
        UserTypeBoxReg.setEnabled(true);
        UserTypeBoxReg.setFont(new Font("sansserif",0,12));
        UserTypeBoxReg.setVisible(true);
        UserTypeBoxReg.setModel(new DefaultComboBoxModel<>(new String[] {"Student","Administrator"} ));


        UserTypeLabelReg = new JLabel();
        UserTypeLabelReg.setBounds(91,310,90,35);
        UserTypeLabelReg.setBackground(new Color(214,217,223));
        UserTypeLabelReg.setForeground(new Color(0,0,0));
        UserTypeLabelReg.setEnabled(true);
        UserTypeLabelReg.setFont(new Font("sansserif",0,12));
        UserTypeLabelReg.setText("User Type");
        UserTypeLabelReg.setVisible(true);

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
        contentPane.add(UserTypeBoxReg);
        contentPane.add(UserTypeLabelReg);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    //Method actionPerformed for RegRegisterButton
    private void register (ActionEvent evt) {
            
            if (StuIDRegField.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Please Insert Student ID");
            }  else if (PassRegField.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Please Insert Password");
            } else if (PassRegField.getText().equals(ConPassRegField.getText()) == false) {
            JOptionPane.showMessageDialog(this, "Password Not matched");
            } else if (FNameRegField.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Please Insert First name");
            }else if (LNameRegField.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Please Insert Last name");
        }
        else {
            try {

                String studentid = StuIDRegField.getText();
                String password = PassRegField.getText();
                String firstname = FNameRegField.getText();
                String lastname = LNameRegField.getText();
                String usertype = UserTypeBoxReg.getSelectedItem().toString();

                if ("student".equalsIgnoreCase(usertype)) // go to student data base
                {
                    // create a connection to the database
                    //conn = DBManager.connect();
                    //System.out.println("Database Connected ");

                    //pst = conn.prepareStatement("INSERT INTO userstudent(studentID,firstName, lastName,password)values(?,?,?,?)");
                    
                    //pst.setString(1, studentid);
                    //pst.setString(2, firstname);
                    //pst.setString(3, lastname);
                    //pst.setString(4, password);
                    //pst.execute();
                    //conn.close();
                    //System.out.println("Database is closed");
                    //JOptionPane.showMessageDialog(null, firstname + " " + lastname + " account created!");

                    
                    
                    LogInForm m = new LogInForm();
                    this.dispose();
                    m.setVisible(true);

                } else if ("administrator".equalsIgnoreCase(usertype)) //go to admin data base
                {
                   // JOptionPane.showMessageDialog(null, "Option disabled by Administrator, contact the admin to give you access!");
                                 
                // create a connection to the database
                conn = DBManager.connect();
                System.out.println("Database Connected yes");

                pst = conn.prepareStatement("INSERT INTO usersadmin(adminID,firstName,lastName,password)values(?,?,?,?)");
                pst.setString(1, studentid);
                pst.setString(2, firstname);
                pst.setString(3, lastname);
                pst.setString(4, password);
                pst.execute();
                JOptionPane.showMessageDialog(null, firstname + " " + lastname + " account created!");
                StuIDRegField.setText("");
                PassRegField.setText("");
                ConPassRegField.setText("");
                FNameRegField.setText("");
                LNameRegField.setText("");
                UserTypeBoxReg.setSelectedIndex(-1);
                FNameRegField.requestFocus();
                     
                } else {
                    JOptionPane.showMessageDialog(this, "User ID, name, type and Password does not match.....");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "User ID or name already exists....");
                Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
                if (conn != null) {
                    try {
                        conn.close();
                        System.out.println("Database is closed");
                    } catch (SQLException ex1) {
                        Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
            }
        }

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
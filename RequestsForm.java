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


public class RequestsForm extends JFrame {

    private JButton CloseButton;
    private JButton GrantPermissionButton;
    private JTextArea RequestsArea;
    private JLabel RequestsLabel;
    private JButton RevokeRightsButton;

    //Constructor 
    public RequestsForm(){

        this.setTitle("RequestsForm");
        this.setSize(500,400);
        

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(192,192,192));


        CloseButton = new JButton();
        CloseButton.setBounds(323,202,90,35);
        CloseButton.setBackground(new Color(214,217,223));
        CloseButton.setForeground(new Color(0,0,0));
        CloseButton.setEnabled(true);
        CloseButton.setFont(new Font("sansserif",0,12));
        CloseButton.setText("Close");
        CloseButton.setVisible(true);
        //Set action for button click
        //Call defined method
        CloseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                close(evt);
            }
        });


        GrantPermissionButton = new JButton();
        GrantPermissionButton.setBounds(318,93,136,33);
        GrantPermissionButton.setBackground(new Color(214,217,223));
        GrantPermissionButton.setForeground(new Color(0,0,0));
        GrantPermissionButton.setEnabled(true);
        GrantPermissionButton.setFont(new Font("sansserif",0,12));
        GrantPermissionButton.setText("Grant Permission");
        GrantPermissionButton.setVisible(true);
        
        //Set action for button click
        //Call defined method
        GrantPermissionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                grantPermission(evt);
            }
        });

        RequestsArea = new JTextArea();
        RequestsArea.setBounds(59,81,209,290);
        RequestsArea.setBackground(new Color(255,255,255));
        RequestsArea.setForeground(new Color(0,0,0));
        RequestsArea.setEnabled(true);
        RequestsArea.setFont(new Font("sansserif",0,12));
        RequestsArea.setText("");
        RequestsArea.setBorder(BorderFactory.createBevelBorder(1));
        RequestsArea.setVisible(true);

        RequestsLabel = new JLabel();
        RequestsLabel.setBounds(83,25,377,35);
        RequestsLabel.setBackground(new Color(214,217,223));
        RequestsLabel.setForeground(new Color(0,0,0));
        RequestsLabel.setEnabled(true);
        RequestsLabel.setFont(new Font("SansSerif",0,20));
        RequestsLabel.setText("Student Administration: Requests");
        RequestsLabel.setVisible(true);

        RevokeRightsButton = new JButton();
        RevokeRightsButton.setBounds(321,139,132,34);
        RevokeRightsButton.setBackground(new Color(214,217,223));
        RevokeRightsButton.setForeground(new Color(0,0,0));
        RevokeRightsButton.setEnabled(true);
        RevokeRightsButton.setFont(new Font("sansserif",0,12));
        RevokeRightsButton.setText("Revoke Rights");
        RevokeRightsButton.setVisible(true);
        //Set action for button click
        //Call defined method
        RevokeRightsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                revokeRights(evt);
            }
        });


        //adding components to contentPane panel
        contentPane.add(CloseButton);
        contentPane.add(GrantPermissionButton);
        contentPane.add(RequestsArea);
        contentPane.add(RequestsLabel);
        contentPane.add(RevokeRightsButton);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    //Method actionPerformed for CloseButton
    private void close (ActionEvent evt) {
        AdminMainForm ad = new AdminMainForm();
	this.dispose();
	ad.setVisible(true);
    }

    //Method actionPerformed for CloseButton
    private void grantPermission (ActionEvent evt) {
	String inputValue = JOptionPane.showInputDialog("Please type in the user ID.");
    }
    
    //Method actionPerformed for RevokeRightsButton
    private void revokeRights (ActionEvent evt) {
	String inputValue = JOptionPane.showInputDialog("Please type in the user ID.");
    }




     public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RequestsForm();
            }
        });
    }

}
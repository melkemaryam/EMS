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


public class AreYouSureForm extends JFrame {

    private JMenuBar menuBar;
    private JLabel AreYouSureLabel;
    private JButton NoButton;
    private JButton YesButton;

    //Constructor 
    public AreYouSureForm(){

        this.setTitle("AreYouSureForm");
        this.setSize(441,220);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(441,220));
        contentPane.setBackground(new Color(192,192,192));


        AreYouSureLabel = new JLabel();
        AreYouSureLabel.setBounds(141,54,217,30);
        AreYouSureLabel.setBackground(new Color(214,217,223));
        AreYouSureLabel.setForeground(new Color(0,0,0));
        AreYouSureLabel.setEnabled(true);
        AreYouSureLabel.setFont(new Font("SansSerif",1,20));
        AreYouSureLabel.setText("Are you sure?");
        AreYouSureLabel.setVisible(true);

        NoButton = new JButton();
        NoButton.setBounds(271,134,90,35);
        NoButton.setBackground(new Color(214,217,223));
        NoButton.setForeground(new Color(0,0,0));
        NoButton.setEnabled(true);
        NoButton.setFont(new Font("sansserif",0,12));
        NoButton.setText("No");
        NoButton.setVisible(true);
        //Set action for button click
        //Call defined method
        NoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                pressedNo(evt);
            }
        });


        YesButton = new JButton();
        YesButton.setBounds(61,131,90,35);
        YesButton.setBackground(new Color(214,217,223));
        YesButton.setForeground(new Color(0,0,0));
        YesButton.setEnabled(true);
        YesButton.setFont(new Font("sansserif",0,12));
        YesButton.setText("Yes");
        YesButton.setVisible(true);
        //Set action for button click
        //Call defined method
        YesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                pressedYes(evt);
            }
        });


        //adding components to contentPane panel
        contentPane.add(AreYouSureLabel);
        contentPane.add(NoButton);
        contentPane.add(YesButton);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    //Method actionPerformed for NoButton
    private void pressedNo (ActionEvent evt) {
        this.dispose();
    }

    //Method actionPerformed for YesButton
    private void pressedYes (ActionEvent evt) {
         this.dispose();
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
                new AreYouSureForm();
            }
        });
    }

}
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


public class AdminMainForm extends JFrame {

    private JMenuBar menuBar;
    private JButton AdminAdButton;
    private JCheckBox BookReqCheckAd;
    private JLabel BookReqLabel;
    private JButton CancelAdButton;
    private JTextField CatAdField;
    private JLabel Category;
    private JTextField DateAdField;
    private JLabel DateLabel;
    private JTextField DescAdField;
    private JLabel DescLabel;
    private JButton ExitAdButton;
    private JLabel LocLabel;
    private JTextField LocationAdField;
    private JButton LogOutAdButton;
    private JTextField PlacesAdField;
    private JLabel PlacesLabel;
    private JTextField RoomNoAdField;
    private JLabel RoomNoLabel;
    private JButton SeeAllBookAdButton;
    private JButton SeeAllEventsAdButton;
    private JTextArea ShowEventsAd;
    private JTextField TiitleAdField;
    private JTextField TimeAdField;
    private JLabel TimeLabel;
    private JLabel TitleLabel;
    private JLabel WelcomeLabel;

    //Constructor 
    public AdminMainForm(){

        this.setTitle("AdminMainForm");
        this.setSize(694,443);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(694,443));
        contentPane.setBackground(new Color(192,192,192));


        AdminAdButton = new JButton();
        AdminAdButton.setBounds(33,178,165,35);
        AdminAdButton.setBackground(new Color(214,217,223));
        AdminAdButton.setForeground(new Color(0,0,0));
        AdminAdButton.setEnabled(true);
        AdminAdButton.setFont(new Font("sansserif",0,12));
        AdminAdButton.setText("Student Administration");
        AdminAdButton.setVisible(true);
        //Set action for button click
        //Call defined method
        AdminAdButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                studentAdministrationAd(evt);
            }
        });


        BookReqCheckAd = new JCheckBox();
        BookReqCheckAd.setBounds(517,205,90,35);
        BookReqCheckAd.setBackground(new Color(214,217,223));
        BookReqCheckAd.setForeground(new Color(0,0,0));
        BookReqCheckAd.setEnabled(true);
        BookReqCheckAd.setFont(new Font("sansserif",0,12));
        BookReqCheckAd.setText("");
        BookReqCheckAd.setVisible(true);

        BookReqLabel = new JLabel();
        BookReqLabel.setBounds(383,205,110,34);
        BookReqLabel.setBackground(new Color(214,217,223));
        BookReqLabel.setForeground(new Color(0,0,0));
        BookReqLabel.setEnabled(true);
        BookReqLabel.setFont(new Font("sansserif",0,12));
        BookReqLabel.setText("Booking Required");
        BookReqLabel.setVisible(true);

        CancelAdButton = new JButton();
        CancelAdButton.setBounds(244,391,90,35);
        CancelAdButton.setBackground(new Color(214,217,223));
        CancelAdButton.setForeground(new Color(0,0,0));
        CancelAdButton.setEnabled(true);
        CancelAdButton.setFont(new Font("sansserif",0,12));
        CancelAdButton.setText("Cancel");
        CancelAdButton.setVisible(true);
        //Set action for button click
        //Call defined method
        CancelAdButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cancelAd(evt);
            }
        });


        CatAdField = new JTextField();
        CatAdField.setBounds(513,237,100,30);
        CatAdField.setBackground(new Color(255,255,255));
        CatAdField.setForeground(new Color(0,0,0));
        CatAdField.setEnabled(true);
        CatAdField.setFont(new Font("sansserif",0,12));
        CatAdField.setText("");
        CatAdField.setVisible(true);

        Category = new JLabel();
        Category.setBounds(382,235,90,35);
        Category.setBackground(new Color(214,217,223));
        Category.setForeground(new Color(0,0,0));
        Category.setEnabled(true);
        Category.setFont(new Font("sansserif",0,12));
        Category.setText("Category");
        Category.setVisible(true);

        DateAdField = new JTextField();
        DateAdField.setBounds(502,143,91,27);
        DateAdField.setBackground(new Color(255,255,255));
        DateAdField.setForeground(new Color(0,0,0));
        DateAdField.setEnabled(true);
        DateAdField.setFont(new Font("sansserif",0,12));
        DateAdField.setText("");
        DateAdField.setVisible(true);

        DateLabel = new JLabel();
        DateLabel.setBounds(383,139,90,35);
        DateLabel.setBackground(new Color(214,217,223));
        DateLabel.setForeground(new Color(0,0,0));
        DateLabel.setEnabled(true);
        DateLabel.setFont(new Font("sansserif",0,12));
        DateLabel.setText("Date");
        DateLabel.setVisible(true);

        DescAdField = new JTextField();
        DescAdField.setBounds(500,107,164,33);
        DescAdField.setBackground(new Color(255,255,255));
        DescAdField.setForeground(new Color(0,0,0));
        DescAdField.setEnabled(true);
        DescAdField.setFont(new Font("sansserif",0,12));
        DescAdField.setText("");
        DescAdField.setVisible(true);

        DescLabel = new JLabel();
        DescLabel.setBounds(383,109,90,35);
        DescLabel.setBackground(new Color(214,217,223));
        DescLabel.setForeground(new Color(0,0,0));
        DescLabel.setEnabled(true);
        DescLabel.setFont(new Font("sansserif",0,12));
        DescLabel.setText("Description");
        DescLabel.setVisible(true);

        ExitAdButton = new JButton();
        ExitAdButton.setBounds(35,303,90,35);
        ExitAdButton.setBackground(new Color(214,217,223));
        ExitAdButton.setForeground(new Color(0,0,0));
        ExitAdButton.setEnabled(true);
        ExitAdButton.setFont(new Font("sansserif",0,12));
        ExitAdButton.setText("Exit");
        ExitAdButton.setVisible(true);
        //Set action for button click
        //Call defined method
        ExitAdButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exitAd(evt);
            }
        });


        LocLabel = new JLabel();
        LocLabel.setBounds(378,266,90,35);
        LocLabel.setBackground(new Color(214,217,223));
        LocLabel.setForeground(new Color(0,0,0));
        LocLabel.setEnabled(true);
        LocLabel.setFont(new Font("sansserif",0,12));
        LocLabel.setText("Location");
        LocLabel.setVisible(true);

        LocationAdField = new JTextField();
        LocationAdField.setBounds(514,276,144,28);
        LocationAdField.setBackground(new Color(255,255,255));
        LocationAdField.setForeground(new Color(0,0,0));
        LocationAdField.setEnabled(true);
        LocationAdField.setFont(new Font("sansserif",0,12));
        LocationAdField.setText("");
        LocationAdField.setVisible(true);

        LogOutAdButton = new JButton();
        LogOutAdButton.setBounds(34,258,90,35);
        LogOutAdButton.setBackground(new Color(214,217,223));
        LogOutAdButton.setForeground(new Color(0,0,0));
        LogOutAdButton.setEnabled(true);
        LogOutAdButton.setFont(new Font("sansserif",0,12));
        LogOutAdButton.setText("Log Out");
        LogOutAdButton.setVisible(true);
        //Set action for button click
        //Call defined method
        LogOutAdButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                logOutAd(evt);
            }
        });


        PlacesAdField = new JTextField();
        PlacesAdField.setBounds(514,340,94,29);
        PlacesAdField.setBackground(new Color(255,255,255));
        PlacesAdField.setForeground(new Color(0,0,0));
        PlacesAdField.setEnabled(true);
        PlacesAdField.setFont(new Font("sansserif",0,12));
        PlacesAdField.setText("");
        PlacesAdField.setVisible(true);

        PlacesLabel = new JLabel();
        PlacesLabel.setBounds(380,330,90,35);
        PlacesLabel.setBackground(new Color(214,217,223));
        PlacesLabel.setForeground(new Color(0,0,0));
        PlacesLabel.setEnabled(true);
        PlacesLabel.setFont(new Font("sansserif",0,12));
        PlacesLabel.setText("Places");
        PlacesLabel.setVisible(true);

        RoomNoAdField = new JTextField();
        RoomNoAdField.setBounds(511,308,101,28);
        RoomNoAdField.setBackground(new Color(255,255,255));
        RoomNoAdField.setForeground(new Color(0,0,0));
        RoomNoAdField.setEnabled(true);
        RoomNoAdField.setFont(new Font("sansserif",0,12));
        RoomNoAdField.setText("");
        RoomNoAdField.setVisible(true);

        RoomNoLabel = new JLabel();
        RoomNoLabel.setBounds(382,298,90,35);
        RoomNoLabel.setBackground(new Color(214,217,223));
        RoomNoLabel.setForeground(new Color(0,0,0));
        RoomNoLabel.setEnabled(true);
        RoomNoLabel.setFont(new Font("sansserif",0,12));
        RoomNoLabel.setText("Room No.");
        RoomNoLabel.setVisible(true);

        SeeAllBookAdButton = new JButton();
        SeeAllBookAdButton.setBounds(36,135,145,33);
        SeeAllBookAdButton.setBackground(new Color(214,217,223));
        SeeAllBookAdButton.setForeground(new Color(0,0,0));
        SeeAllBookAdButton.setEnabled(true);
        SeeAllBookAdButton.setFont(new Font("sansserif",0,12));
        SeeAllBookAdButton.setText("See All Bookings");
        SeeAllBookAdButton.setVisible(true);
        //Set action for button click
        //Call defined method
        SeeAllBookAdButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                seeAllBookingsAd(evt);
            }
        });


        SeeAllEventsAdButton = new JButton();
        SeeAllEventsAdButton.setBounds(37,90,120,37);
        SeeAllEventsAdButton.setBackground(new Color(214,217,223));
        SeeAllEventsAdButton.setForeground(new Color(0,0,0));
        SeeAllEventsAdButton.setEnabled(true);
        SeeAllEventsAdButton.setFont(new Font("sansserif",0,12));
        SeeAllEventsAdButton.setText("See All Events");
        SeeAllEventsAdButton.setVisible(true);
        //Set action for button click
        //Call defined method
        SeeAllEventsAdButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                seeAllEventsAd(evt);
            }
        });


        ShowEventsAd = new JTextArea();
        ShowEventsAd.setBounds(205,86,157,284);
        ShowEventsAd.setBackground(new Color(255,255,255));
        ShowEventsAd.setForeground(new Color(0,0,0));
        ShowEventsAd.setEnabled(true);
        ShowEventsAd.setFont(new Font("sansserif",0,12));
        ShowEventsAd.setText("");
        ShowEventsAd.setBorder(BorderFactory.createBevelBorder(1));
        ShowEventsAd.setVisible(true);

        TiitleAdField = new JTextField();
        TiitleAdField.setBounds(503,70,98,31);
        TiitleAdField.setBackground(new Color(255,255,255));
        TiitleAdField.setForeground(new Color(0,0,0));
        TiitleAdField.setEnabled(true);
        TiitleAdField.setFont(new Font("sansserif",0,12));
        TiitleAdField.setText("");
        TiitleAdField.setVisible(true);

        TimeAdField = new JTextField();
        TimeAdField.setBounds(538,174,90,35);
        TimeAdField.setBackground(new Color(255,255,255));
        TimeAdField.setForeground(new Color(0,0,0));
        TimeAdField.setEnabled(true);
        TimeAdField.setFont(new Font("sansserif",0,12));
        TimeAdField.setText("");
        TimeAdField.setVisible(true);

        TimeLabel = new JLabel();
        TimeLabel.setBounds(383,172,90,35);
        TimeLabel.setBackground(new Color(214,217,223));
        TimeLabel.setForeground(new Color(0,0,0));
        TimeLabel.setEnabled(true);
        TimeLabel.setFont(new Font("sansserif",0,12));
        TimeLabel.setText("Time");
        TimeLabel.setVisible(true);

        TitleLabel = new JLabel();
        TitleLabel.setBounds(382,74,90,35);
        TitleLabel.setBackground(new Color(214,217,223));
        TitleLabel.setForeground(new Color(0,0,0));
        TitleLabel.setEnabled(true);
        TitleLabel.setFont(new Font("sansserif",0,12));
        TitleLabel.setText("Title");
        TitleLabel.setVisible(true);

        WelcomeLabel = new JLabel();
        WelcomeLabel.setBounds(292,30,90,35);
        WelcomeLabel.setBackground(new Color(214,217,223));
        WelcomeLabel.setForeground(new Color(0,0,0));
        WelcomeLabel.setEnabled(true);
        WelcomeLabel.setFont(new Font("SansSerif",0,20));
        WelcomeLabel.setText("Welcome");
        WelcomeLabel.setVisible(true);

        //adding components to contentPane panel
        contentPane.add(AdminAdButton);
        contentPane.add(BookReqCheckAd);
        contentPane.add(BookReqLabel);
        contentPane.add(CancelAdButton);
        contentPane.add(CatAdField);
        contentPane.add(Category);
        contentPane.add(DateAdField);
        contentPane.add(DateLabel);
        contentPane.add(DescAdField);
        contentPane.add(DescLabel);
        contentPane.add(ExitAdButton);
        contentPane.add(LocLabel);
        contentPane.add(LocationAdField);
        contentPane.add(LogOutAdButton);
        contentPane.add(PlacesAdField);
        contentPane.add(PlacesLabel);
        contentPane.add(RoomNoAdField);
        contentPane.add(RoomNoLabel);
        contentPane.add(SeeAllBookAdButton);
        contentPane.add(SeeAllEventsAdButton);
        contentPane.add(ShowEventsAd);
        contentPane.add(TiitleAdField);
        contentPane.add(TimeAdField);
        contentPane.add(TimeLabel);
        contentPane.add(TitleLabel);
        contentPane.add(WelcomeLabel);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    //Method actionPerformed for AdminAdButton
    private void studentAdministrationAd (ActionEvent evt) {
            //TODO
    }

    //Method actionPerformed for CancelAdButton
    private void cancelAd (ActionEvent evt) {
            //TODO
    }

    //Method actionPerformed for ExitAdButton
    private void exitAd (ActionEvent evt) {
        System.exit(0);
        //TODO
    }

    //Method actionPerformed for LogOutAdButton
    private void logOutAd (ActionEvent evt) {
            //TODO
    }

    //Method actionPerformed for SeeAllBookAdButton
    private void seeAllBookingsAd (ActionEvent evt) {
            //TODO
    }

    //Method actionPerformed for SeeAllEventsAdButton
    private void seeAllEventsAd (ActionEvent evt) {
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
                new AdminMainForm();
            }
        });
    }

}
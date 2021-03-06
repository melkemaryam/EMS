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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


public class AdminMainForm extends JFrame {

    // Components of the Form
    private JButton AdminAdButton;
    private JCheckBox BookReqCheckAd;
    private JLabel BookReqLabel;
    private JButton CancelBookAdButton;
    private JButton CancelEventAdButton;
    private JTextField CatAdField;
    private JLabel Category;
    private JButton ChooseOrSearchEventAdButton;
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
    private JTextField TitleAdField;
    private JTextField TimeAdField;
    private JLabel TimeLabel;
    private JLabel TitleLabel;
    private JLabel WelcomeLabel;
    private JScrollPane Scroll;
    int uniId;
    
    
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    //Constructor 
    public AdminMainForm(){

        this.setTitle("AdminMainForm");
        this.setSize(694,443);
        

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(694,443));
        contentPane.setBackground(new Color(192,192,192));

        //create new button
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

        //create new checkbox
        BookReqCheckAd = new JCheckBox();
        BookReqCheckAd.setBounds(517,205,90,35);
        BookReqCheckAd.setBackground(new Color(214,217,223));
        BookReqCheckAd.setForeground(new Color(0,0,0));
        BookReqCheckAd.setEnabled(true);
        BookReqCheckAd.setFont(new Font("sansserif",0,12));
        BookReqCheckAd.setText("");
        BookReqCheckAd.setVisible(true);
        //BookReqCheckAd.setEditable(false);

        //create new label
        BookReqLabel = new JLabel();
        BookReqLabel.setBounds(383,205,110,34);
        BookReqLabel.setBackground(new Color(214,217,223));
        BookReqLabel.setForeground(new Color(0,0,0));
        BookReqLabel.setEnabled(true);
        BookReqLabel.setFont(new Font("sansserif",0,12));
        BookReqLabel.setText("Booking Required");
        BookReqLabel.setVisible(true);

        //create new button
        CancelBookAdButton = new JButton();
        CancelBookAdButton.setBounds(305,389,146,34);
        CancelBookAdButton.setBackground(new Color(214,217,223));
        CancelBookAdButton.setForeground(new Color(0,0,0));
        CancelBookAdButton.setEnabled(true);
        CancelBookAdButton.setFont(new Font("sansserif",0,12));
        CancelBookAdButton.setText("Cancel Booking");
        CancelBookAdButton.setVisible(true);
        //Set action for button click
        //Call defined method
        CancelBookAdButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cancelBooking(evt);
            }
        });

        //create new button
        CancelEventAdButton = new JButton();
        CancelEventAdButton.setBounds(148,388,119,35);
        CancelEventAdButton.setBackground(new Color(214,217,223));
        CancelEventAdButton.setForeground(new Color(0,0,0));
        CancelEventAdButton.setEnabled(true);
        CancelEventAdButton.setFont(new Font("sansserif",0,12));
        CancelEventAdButton.setText("Cancel Event");
        CancelEventAdButton.setVisible(true);
        //Set action for button click
        //Call defined method
        CancelEventAdButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            cancelEvent(evt);
        }
    });

        //create new field
        CatAdField = new JTextField();
        CatAdField.setBounds(513,237,100,30);
        CatAdField.setBackground(new Color(255,255,255));
        CatAdField.setForeground(new Color(0,0,0));
        CatAdField.setEnabled(true);
        CatAdField.setFont(new Font("sansserif",0,12));
        CatAdField.setText("");
        CatAdField.setVisible(true);
        CatAdField.setEditable(false);
    
        //create new label
        Category = new JLabel();
        Category.setBounds(382,235,90,35);
        Category.setBackground(new Color(214,217,223));
        Category.setForeground(new Color(0,0,0));
        Category.setEnabled(true);
        Category.setFont(new Font("sansserif",0,12));
        Category.setText("Category");
        Category.setVisible(true);
        
        //create new button
        ChooseOrSearchEventAdButton = new JButton();
        ChooseOrSearchEventAdButton.setBounds(502,388,170,33);
        ChooseOrSearchEventAdButton.setBackground(new Color(214,217,223));
        ChooseOrSearchEventAdButton.setForeground(new Color(0,0,0));
        ChooseOrSearchEventAdButton.setEnabled(true);
        ChooseOrSearchEventAdButton.setFont(new Font("sansserif",0,12));
        ChooseOrSearchEventAdButton.setText("Choose or Search Event");
        ChooseOrSearchEventAdButton.setVisible(true);
        //Set action for button click
        //Call defined method
        ChooseOrSearchEventAdButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                chooseOrSearchEventAd(evt);
            }
        });

        //create new field
        DateAdField = new JTextField();
        DateAdField.setBounds(502,143,91,27);
        DateAdField.setBackground(new Color(255,255,255));
        DateAdField.setForeground(new Color(0,0,0));
        DateAdField.setEnabled(true);
        DateAdField.setFont(new Font("sansserif",0,12));
        DateAdField.setText("");
        DateAdField.setVisible(true);
        DateAdField.setEditable(false);

        //create new label
        DateLabel = new JLabel();
        DateLabel.setBounds(383,139,90,35);
        DateLabel.setBackground(new Color(214,217,223));
        DateLabel.setForeground(new Color(0,0,0));
        DateLabel.setEnabled(true);
        DateLabel.setFont(new Font("sansserif",0,12));
        DateLabel.setText("Date");
        DateLabel.setVisible(true);

        //create new field
        DescAdField = new JTextField();
        DescAdField.setBounds(500,107,164,33);
        DescAdField.setBackground(new Color(255,255,255));
        DescAdField.setForeground(new Color(0,0,0));
        DescAdField.setEnabled(true);
        DescAdField.setFont(new Font("sansserif",0,12));
        DescAdField.setText("");
        DescAdField.setVisible(true);
        DescAdField.setEditable(false);

        //create new label
        DescLabel = new JLabel();
        DescLabel.setBounds(383,109,90,35);
        DescLabel.setBackground(new Color(214,217,223));
        DescLabel.setForeground(new Color(0,0,0));
        DescLabel.setEnabled(true);
        DescLabel.setFont(new Font("sansserif",0,12));
        DescLabel.setText("Description");
        DescLabel.setVisible(true);
        
        //create new button
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

        //create new label
        LocLabel = new JLabel();
        LocLabel.setBounds(378,266,90,35);
        LocLabel.setBackground(new Color(214,217,223));
        LocLabel.setForeground(new Color(0,0,0));
        LocLabel.setEnabled(true);
        LocLabel.setFont(new Font("sansserif",0,12));
        LocLabel.setText("Location");
        LocLabel.setVisible(true);

        //create new field
        LocationAdField = new JTextField();
        LocationAdField.setBounds(514,276,144,28);
        LocationAdField.setBackground(new Color(255,255,255));
        LocationAdField.setForeground(new Color(0,0,0));
        LocationAdField.setEnabled(true);
        LocationAdField.setFont(new Font("sansserif",0,12));
        LocationAdField.setText("");
        LocationAdField.setVisible(true);
        LocationAdField.setEditable(false);

        //create new button
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

        //create new field
        PlacesAdField = new JTextField();
        PlacesAdField.setBounds(514,340,94,29);
        PlacesAdField.setBackground(new Color(255,255,255));
        PlacesAdField.setForeground(new Color(0,0,0));
        PlacesAdField.setEnabled(true);
        PlacesAdField.setFont(new Font("sansserif",0,12));
        PlacesAdField.setText("");
        PlacesAdField.setVisible(true);
        PlacesAdField.setEditable(false);

        //create new label
        PlacesLabel = new JLabel();
        PlacesLabel.setBounds(380,330,90,35);
        PlacesLabel.setBackground(new Color(214,217,223));
        PlacesLabel.setForeground(new Color(0,0,0));
        PlacesLabel.setEnabled(true);
        PlacesLabel.setFont(new Font("sansserif",0,12));
        PlacesLabel.setText("Places");
        PlacesLabel.setVisible(true);

        //create new field
        RoomNoAdField = new JTextField();
        RoomNoAdField.setBounds(511,308,101,28);
        RoomNoAdField.setBackground(new Color(255,255,255));
        RoomNoAdField.setForeground(new Color(0,0,0));
        RoomNoAdField.setEnabled(true);
        RoomNoAdField.setFont(new Font("sansserif",0,12));
        RoomNoAdField.setText("");
        RoomNoAdField.setVisible(true);
        RoomNoAdField.setEditable(false);

        //create new label
        RoomNoLabel = new JLabel();
        RoomNoLabel.setBounds(382,298,90,35);
        RoomNoLabel.setBackground(new Color(214,217,223));
        RoomNoLabel.setForeground(new Color(0,0,0));
        RoomNoLabel.setEnabled(true);
        RoomNoLabel.setFont(new Font("sansserif",0,12));
        RoomNoLabel.setText("Room No.");
        RoomNoLabel.setVisible(true);

        //create new button 
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

        //create new button
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

        //create new text area
        ShowEventsAd = new JTextArea();
        ShowEventsAd.setBounds(205,86,157,284);
        ShowEventsAd.setBackground(new Color(255,255,255));
        ShowEventsAd.setForeground(new Color(0,0,0));
        ShowEventsAd.setEnabled(true);
        ShowEventsAd.setFont(new Font("sansserif",0,12));
        //ShowEventsAd.setText(getAllEventsList());
        ShowEventsAd.setText("");
        ShowEventsAd.setBorder(BorderFactory.createBevelBorder(1));
        ShowEventsAd.setVisible(true);
        ShowEventsAd.setEditable(false);
        Scroll = new JScrollPane(ShowEventsAd, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        ShowEventsAd.setLineWrap(true);
        ShowEventsAd.setWrapStyleWord(true);
        Scroll.setBounds(205,86,157,284);

        //create new field
        TitleAdField = new JTextField();
        TitleAdField.setBounds(503,70,98,31);
        TitleAdField.setBackground(new Color(255,255,255));
        TitleAdField.setForeground(new Color(0,0,0));
        TitleAdField.setEnabled(true);
        TitleAdField.setFont(new Font("sansserif",0,12));
        TitleAdField.setText("");
        TitleAdField.setVisible(true);
        TitleAdField.setEditable(false);
        
        //create new field
        TimeAdField = new JTextField();
        TimeAdField.setBounds(538,174,90,35);
        TimeAdField.setBackground(new Color(255,255,255));
        TimeAdField.setForeground(new Color(0,0,0));
        TimeAdField.setEnabled(true);
        TimeAdField.setFont(new Font("sansserif",0,12));
        TimeAdField.setText("");
        TimeAdField.setVisible(true);
        TimeAdField.setEditable(false);

        //create new label
        TimeLabel = new JLabel();
        TimeLabel.setBounds(383,172,90,35);
        TimeLabel.setBackground(new Color(214,217,223));
        TimeLabel.setForeground(new Color(0,0,0));
        TimeLabel.setEnabled(true);
        TimeLabel.setFont(new Font("sansserif",0,12));
        TimeLabel.setText("Time");
        TimeLabel.setVisible(true);

        //create new label
        TitleLabel = new JLabel();
        TitleLabel.setBounds(382,74,90,35);
        TitleLabel.setBackground(new Color(214,217,223));
        TitleLabel.setForeground(new Color(0,0,0));
        TitleLabel.setEnabled(true);
        TitleLabel.setFont(new Font("sansserif",0,12));
        TitleLabel.setText("Title");
        TitleLabel.setVisible(true);

        //create new label
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
        contentPane.add(CancelBookAdButton);
        contentPane.add(CancelEventAdButton);
        contentPane.add(CatAdField);
        contentPane.add(Category);
        contentPane.add(ChooseOrSearchEventAdButton);
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
        contentPane.add(TitleAdField);
        contentPane.add(TimeAdField);
        contentPane.add(TimeLabel);
        contentPane.add(TitleLabel);
        contentPane.add(WelcomeLabel);
        contentPane.add(Scroll);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    //Method actionPerformed for AdminAdButton
    private void studentAdministrationAd (ActionEvent evt) {
        RequestsForm rf = new RequestsForm();
        this.dispose();
        rf.setVisible(true);
    }

    //Method actionPerformed for CancelAdButton
    private void cancelBooking (ActionEvent evt) {
        
        String inputValue = JOptionPane.showInputDialog("Please type in the event name.");
        //call method admincancelbooking, with booking id in bookingManager
        String bookstr = JOptionPane.showInputDialog("Please type in the booking ID.");
        int bookId = Integer.parseInt(bookstr);
        BookingManager bm = new BookingManager();
        bm.adminCancelBooking(bookId);
        
        int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel it?", "Yes",  JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "You have successfully cancelled the booking.");
        } 
    }
    
    //Method actionPerformed for CancelAdButton
    private void cancelEvent (ActionEvent evt) {
            
            if (ShowEventsAd.getText().length() == 0) {
        String inputValue = JOptionPane.showInputDialog("Please type in the event name.");
        } else {
            try {
                String inputValue = JOptionPane.showInputDialog("Please type in the event name.");

                String deleteB = inputValue;             
                conn = DBManager.connect();
                System.out.println("Database Connected");
                String findByNameQuery = "SELECT * FROM event WHERE EventName=?";
                PreparedStatement preparedStmt = conn.prepareStatement(findByNameQuery);
                preparedStmt.setString(1, deleteB);
                preparedStmt.execute();
                rs = preparedStmt.getResultSet();

                if (rs.next()) {
                    
                    int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel it?", "Yes",  JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION){
                     
                        EventManager bs = new EventManager();
                        bs.cancelEvent(deleteB);
                        //String query = "DELETE FROM event WHERE EventName=?";
                        //preparedStmt = conn.prepareStatement(query);
                        //preparedStmt.setInt(1, id);
                        //preparedStmt.execute();
                        //String query1 = "DELETE FROM studentbookings WHERE EventName=?";
                        //preparedStmt = conn.prepareStatement(query1);
                        //preparedStmt.setInt(1, id);
                        //preparedStmt.execute();
                        JOptionPane.showMessageDialog(null, "You have successfully cancelled it.");

                        this.dispose();
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Event Name does not exist!!!");
                }
                conn.close();
                System.out.println("Database is closed");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Opss something when wrong!!!");
                //Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException ex1) {
                        //Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
            }
        }
    }

    //Method actionPerformed for ChooseEventAdButton
    private void chooseOrSearchEventAd (ActionEvent evt) {
        String eventName = JOptionPane.showInputDialog("Please type in the event name.");
        EventManager bs = new EventManager();
        bs.searchEvent(eventName);
        //searchEvnet from EventManager with event name
    }

    //Method actionPerformed for ExitAdButton
    private void exitAd (ActionEvent evt) {
        System.exit(0);
    }

    //Method actionPerformed for LogOutAdButton
    private void logOutAd (ActionEvent evt) {
        LogInForm lo = new LogInForm();
        this.dispose();
        lo.setVisible(true);
    }

    //Method actionPerformed for SeeAllBookAdButton
    private void seeAllBookingsAd (ActionEvent evt) {
            //asking user for event name
            String inputValue = JOptionPane.showInputDialog("Please type in the event name.");
            BookingManager bs = new BookingManager();
            bs.viewAllBookings();

            //call from BookingManager 
    }
    
    private String getAllBookingsList(){
        BookingManager bs = new BookingManager();
        ArrayList<String> bookingsList = bs.viewAllBookings();
        String bookingsListString = "";
    
            for (String s : bookingsList)
            {
                bookingsListString += s + "\t";
            }
    
        return bookingsListString;
    }   

    //Method actionPerformed for SeeAllEventsAdButton
    private void seeAllEventsAd (ActionEvent evt) {
    }

    private String getAllEventsList(){
            EventManager bs = new EventManager();
            ArrayList<String> eventsList = bs.viewAllEvents();
            String eventListString = "";
            
                for (String s : eventsList)
                {
                    eventListString += s + "\t";
                }
            
            return eventListString;
    }

    //Method to store loggedin user data
    public void catchAUser (int uniId){
        this.uniId = uniId;
    }   
    
    //Method to store loggedin user data
    public int getUser() {
        return uniId;
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

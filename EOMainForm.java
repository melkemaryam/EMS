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


public class EOMainForm extends JFrame {


    private JButton BookEOButton;
    private JCheckBox BookReqBoxEO;
    private JLabel BookReqLabel;
    private JButton CancelEOButton;
    private JComboBox CatEOBox;
    private JLabel Category;
    private JButton ChooseOrSearchEventEOButton;
    private JButton CreateEventEOButton;
    private JLabel DateLabel;
    private JTextField DayEOField;
    private JTextField DescEOField;
    private JLabel DescLabel;
    private JButton ExitEOButton;
    private JTextField HourEOField;
    private JTextField LocationEOFIeld;
    private JLabel LocationLabel;
    private JButton LogOutEOButton;
    private JTextField MinutesEOField;
    private JButton ModifyEOButton;
    private JTextField MonthEOField;
    private JButton MyEventsEOButton;
    private JTextField PlacesEOField;
    private JLabel PlacesLabel;
    private JComboBox RoomNoEOBox;
    private JLabel RoomNoLabel;
    private JButton SaveEOButton;
    private JButton SeeAllBookEOButton;
    private JButton SeeAllEventsEOButton;
    private JTextArea ShowEventsEO;
    private JLabel TimeLabel;
    private JTextField TitleEOField;
    private JLabel TitleLabel;
    private JLabel Welcomelabel;
    private JTextField YearEOField;
    private JScrollPane Scroll;
    int uniId;


    //Constructor 
    public EOMainForm(){

        this.setTitle("EOMainForm");
        this.setSize(717,444);
       

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(717,444));
        contentPane.setBackground(new Color(192,192,192));

	//create new button
        BookEOButton = new JButton();
        BookEOButton.setBounds(30,390,90,35);
        BookEOButton.setBackground(new Color(214,217,223));
        BookEOButton.setForeground(new Color(0,0,0));
        BookEOButton.setEnabled(true);
        BookEOButton.setFont(new Font("sansserif",0,12));
        BookEOButton.setText("Book");
        BookEOButton.setVisible(true);
        //Set action for button click
        //Call defined method
        BookEOButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bookEO(evt);
            }
        });

	//create new checkbox
        BookReqBoxEO = new JCheckBox();
        BookReqBoxEO.setBounds(524,203,90,35);
        BookReqBoxEO.setBackground(new Color(214,217,223));
        BookReqBoxEO.setForeground(new Color(0,0,0));
        BookReqBoxEO.setEnabled(true);
        BookReqBoxEO.setFont(new Font("sansserif",0,12));
        BookReqBoxEO.setText("");
        BookReqBoxEO.setVisible(true);

	//create new label
        BookReqLabel = new JLabel();
        BookReqLabel.setBounds(379,206,117,34);
        BookReqLabel.setBackground(new Color(214,217,223));
        BookReqLabel.setForeground(new Color(0,0,0));
        BookReqLabel.setEnabled(true);
        BookReqLabel.setFont(new Font("sansserif",0,12));
        BookReqLabel.setText("Booking Required");
        BookReqLabel.setVisible(true);

	//create new button
        CancelEOButton = new JButton();
        CancelEOButton.setBounds(150,371,90,35);
        CancelEOButton.setBackground(new Color(214,217,223));
        CancelEOButton.setForeground(new Color(0,0,0));
        CancelEOButton.setEnabled(true);
        CancelEOButton.setFont(new Font("sansserif",0,12));
        CancelEOButton.setText("Cancel");
        CancelEOButton.setVisible(true);
        //Set action for button click
        //Call defined method
        CancelEOButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cancelEO(evt);
            }
        });


	//create new combobox
        CatEOBox = new JComboBox();
        CatEOBox.setBounds(527,239,90,35);
        CatEOBox.setBackground(new Color(214,217,223));
        CatEOBox.setForeground(new Color(0,0,0));
        CatEOBox.setEnabled(true);
        CatEOBox.setFont(new Font("sansserif",0,12));
        CatEOBox.setVisible(true);
        CatEOBox.setModel(new DefaultComboBoxModel<>(new String[] {"online","physical"} ));

	//create new label
        Category = new JLabel();
        Category.setBounds(379,240,90,35);
        Category.setBackground(new Color(214,217,223));
        Category.setForeground(new Color(0,0,0));
        Category.setEnabled(true);
        Category.setFont(new Font("sansserif",0,12));
        Category.setText("Category");
        Category.setVisible(true);

      	//create new button  
        ChooseOrSearchEventEOButton = new JButton();
	ChooseOrSearchEventEOButton.setBounds(506,395,170,33);
	ChooseOrSearchEventEOButton.setBackground(new Color(214,217,223));
	ChooseOrSearchEventEOButton.setForeground(new Color(0,0,0));
	ChooseOrSearchEventEOButton.setEnabled(true);
	ChooseOrSearchEventEOButton.setFont(new Font("sansserif",0,12));
	ChooseOrSearchEventEOButton.setText("Choose or Search Event");
	ChooseOrSearchEventEOButton.setVisible(true);
	//Set action for button click
	//Call defined method
	ChooseOrSearchEventEOButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
			chooseOrSearchEventEO(evt);
		}
	});

	//create new button
        CreateEventEOButton = new JButton();
        CreateEventEOButton.setBounds(31,155,139,34);
        CreateEventEOButton.setBackground(new Color(214,217,223));
        CreateEventEOButton.setForeground(new Color(0,0,0));
        CreateEventEOButton.setEnabled(true);
        CreateEventEOButton.setFont(new Font("sansserif",0,12));
        CreateEventEOButton.setText("Create New Event");
        CreateEventEOButton.setVisible(true);
        //Set action for button click
        //Call defined method
        CreateEventEOButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //createEventEO(evt);
            }
        });


	//create new LABEL
        DateLabel = new JLabel();
        DateLabel.setBounds(376,136,90,35);
        DateLabel.setBackground(new Color(214,217,223));
        DateLabel.setForeground(new Color(0,0,0));
        DateLabel.setEnabled(true);
        DateLabel.setFont(new Font("sansserif",0,12));
        DateLabel.setText("Date");
        DateLabel.setVisible(true);
	
	//create new FIELD
        DayEOField = new JTextField();
        DayEOField.setBounds(445,142,78,23);
        DayEOField.setBackground(new Color(255,255,255));
        DayEOField.setForeground(new Color(0,0,0));
        DayEOField.setEnabled(true);
        DayEOField.setFont(new Font("sansserif",0,12));
        DayEOField.setText("");
        DayEOField.setVisible(true);

	//create new field
        DescEOField = new JTextField();
        DescEOField.setBounds(534,103,90,35);
        DescEOField.setBackground(new Color(255,255,255));
        DescEOField.setForeground(new Color(0,0,0));
        DescEOField.setEnabled(true);
        DescEOField.setFont(new Font("sansserif",0,12));
        DescEOField.setText("");
        DescEOField.setVisible(true);

	//create new label
        DescLabel = new JLabel();
        DescLabel.setBounds(377,101,90,35);
        DescLabel.setBackground(new Color(214,217,223));
        DescLabel.setForeground(new Color(0,0,0));
        DescLabel.setEnabled(true);
        DescLabel.setFont(new Font("sansserif",0,12));
        DescLabel.setText("Description");
        DescLabel.setVisible(true);

	//create new button
        ExitEOButton = new JButton();
        ExitEOButton.setBounds(33,252,90,35);
        ExitEOButton.setBackground(new Color(214,217,223));
        ExitEOButton.setForeground(new Color(0,0,0));
        ExitEOButton.setEnabled(true);
        ExitEOButton.setFont(new Font("sansserif",0,12));
        ExitEOButton.setText("Exit");
        ExitEOButton.setVisible(true);
        //Set action for button click
        //Call defined method
        ExitEOButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exitEO(evt);
            }
        });

	//create new field
        HourEOField = new JTextField();
        HourEOField.setBounds(469,174,84,24);
        HourEOField.setBackground(new Color(255,255,255));
        HourEOField.setForeground(new Color(0,0,0));
        HourEOField.setEnabled(true);
        HourEOField.setFont(new Font("sansserif",0,12));
        HourEOField.setText("");
        HourEOField.setVisible(true);

	//create new field
        LocationEOFIeld = new JTextField();
        LocationEOFIeld.setBounds(505,277,140,25);
        LocationEOFIeld.setBackground(new Color(255,255,255));
        LocationEOFIeld.setForeground(new Color(0,0,0));
        LocationEOFIeld.setEnabled(true);
        LocationEOFIeld.setFont(new Font("sansserif",0,12));
        LocationEOFIeld.setText("");
        LocationEOFIeld.setVisible(true);

	//create new label
        LocationLabel = new JLabel();
        LocationLabel.setBounds(379,272,90,35);
        LocationLabel.setBackground(new Color(214,217,223));
        LocationLabel.setForeground(new Color(0,0,0));
        LocationLabel.setEnabled(true);
        LocationLabel.setFont(new Font("sansserif",0,12));
        LocationLabel.setText("Location");
        LocationLabel.setVisible(true);

	//create new button
        LogOutEOButton = new JButton();
        LogOutEOButton.setBounds(33,212,90,35);
        LogOutEOButton.setBackground(new Color(214,217,223));
        LogOutEOButton.setForeground(new Color(0,0,0));
        LogOutEOButton.setEnabled(true);
        LogOutEOButton.setFont(new Font("sansserif",0,12));
        LogOutEOButton.setText("Log Out");
        LogOutEOButton.setVisible(true);
        //Set action for button click
        //Call defined method
        LogOutEOButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                logOutEO(evt);
            }
        });

	//create new field
        MinutesEOField = new JTextField();
        MinutesEOField.setBounds(576,175,71,24);
        MinutesEOField.setBackground(new Color(255,255,255));
        MinutesEOField.setForeground(new Color(0,0,0));
        MinutesEOField.setEnabled(true);
        MinutesEOField.setFont(new Font("sansserif",0,12));
        MinutesEOField.setText("");
        MinutesEOField.setVisible(true);
	
	//create new button
        ModifyEOButton = new JButton();
        ModifyEOButton.setBounds(29,347,90,35);
        ModifyEOButton.setBackground(new Color(214,217,223));
        ModifyEOButton.setForeground(new Color(0,0,0));
        ModifyEOButton.setEnabled(true);
        ModifyEOButton.setFont(new Font("sansserif",0,12));
        ModifyEOButton.setText("Modify");
        ModifyEOButton.setVisible(true);
        //Set action for button click
        //Call defined method
        ModifyEOButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                modifyEO(evt);
            }
        });

	//create new field
        MonthEOField = new JTextField();
        MonthEOField.setBounds(531,142,68,24);
        MonthEOField.setBackground(new Color(255,255,255));
        MonthEOField.setForeground(new Color(0,0,0));
        MonthEOField.setEnabled(true);
        MonthEOField.setFont(new Font("sansserif",0,12));
        MonthEOField.setText("");
        MonthEOField.setVisible(true);
	
	//create new button
        MyEventsEOButton = new JButton();
        MyEventsEOButton.setBounds(29,113,128,32);
        MyEventsEOButton.setBackground(new Color(214,217,223));
        MyEventsEOButton.setForeground(new Color(0,0,0));
        MyEventsEOButton.setEnabled(true);
        MyEventsEOButton.setFont(new Font("sansserif",0,12));
        MyEventsEOButton.setText("See My Events");
        MyEventsEOButton.setVisible(true);
        //Set action for button click
        //Call defined method
        MyEventsEOButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                seeOwnEventsEO(evt);
                EventManager em = new EventManager();
                Student playerOne = new Student();
                playerOne.setUniId(getUser());
                AccountManager am = new AccountManager();
                am.retrieveUser(playerOne);
                ArrayList<String> eventList = em.viewOwnEvents(playerOne);
                StringBuilder sb = new StringBuilder();
                    for (int i = eventList.size() - 1; i >=0; i--){
                        String event = (eventList.get(i) + "\n");
                        sb.append(event);
                    }
                ShowEventsEO.setText(sb.toString());
            }
        });

	//create new field
        PlacesEOField = new JTextField();
        PlacesEOField.setBounds(529,346,90,35);
        PlacesEOField.setBackground(new Color(255,255,255));
        PlacesEOField.setForeground(new Color(0,0,0));
        PlacesEOField.setEnabled(true);
        PlacesEOField.setFont(new Font("sansserif",0,12));
        PlacesEOField.setText("");
        PlacesEOField.setVisible(true);
	
	//create new label
        PlacesLabel = new JLabel();
        PlacesLabel.setBounds(378,346,90,35);
        PlacesLabel.setBackground(new Color(214,217,223));
        PlacesLabel.setForeground(new Color(0,0,0));
        PlacesLabel.setEnabled(true);
        PlacesLabel.setFont(new Font("sansserif",0,12));
        PlacesLabel.setText("Places");
        PlacesLabel.setVisible(true);
	
	//create new combobox
        RoomNoEOBox = new JComboBox();
	RoomNoEOBox.setBounds(530,306,90,35);
	RoomNoEOBox.setBackground(new Color(214,217,223));
	RoomNoEOBox.setForeground(new Color(0,0,0));
	RoomNoEOBox.setEnabled(true);
	RoomNoEOBox.setFont(new Font("sansserif",0,12));
	RoomNoEOBox.setVisible(true);

	//create new label
        RoomNoLabel = new JLabel();
        RoomNoLabel.setBounds(378,307,90,35);
        RoomNoLabel.setBackground(new Color(214,217,223));
        RoomNoLabel.setForeground(new Color(0,0,0));
        RoomNoLabel.setEnabled(true);
        RoomNoLabel.setFont(new Font("sansserif",0,12));
        RoomNoLabel.setText("Room No.");
        RoomNoLabel.setVisible(true);
  
	//create new button
        SaveEOButton = new JButton();
        SaveEOButton.setBounds(30,301,90,35);
        SaveEOButton.setBackground(new Color(214,217,223));
        SaveEOButton.setForeground(new Color(0,0,0));
        SaveEOButton.setEnabled(true);
        SaveEOButton.setFont(new Font("sansserif",0,12));
        SaveEOButton.setText("Save");
        SaveEOButton.setVisible(true);
        //Set action for button click
        //Call defined method
        SaveEOButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                saveChanges(evt);
            }
        });
        
	//create new button
        SeeAllBookEOButton = new JButton();
        SeeAllBookEOButton.setBounds(30,30,137,35);
        SeeAllBookEOButton.setBackground(new Color(214,217,223));
        SeeAllBookEOButton.setForeground(new Color(0,0,0));
        SeeAllBookEOButton.setEnabled(true);
        SeeAllBookEOButton.setFont(new Font("sansserif",0,12));
        SeeAllBookEOButton.setText("See All Bookings");
        SeeAllBookEOButton.setVisible(true);
        //Set action for button click
        //Call defined method
        SeeAllBookEOButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                seeAllBookingsEO(evt);
                String eventName = JOptionPane.showInputDialog("Please type in the event name.");
                BookingManager bm = new BookingManager();
                ArrayList<Integer> eventList = bm.viewEventBookings(eventName);
                StringBuilder sb = new StringBuilder();
                    for (int i = eventList.size() - 1; i >=0; i--){
                        String event = (String.valueOf(eventList.get(i)) + "\n");
                        sb.append(event);
                    }
                ShowEventsEO.setText(sb.toString());
            }
        });

	//create new button
        SeeAllEventsEOButton = new JButton();
        SeeAllEventsEOButton.setBounds(29,71,130,33);
        SeeAllEventsEOButton.setBackground(new Color(214,217,223));
        SeeAllEventsEOButton.setForeground(new Color(0,0,0));
        SeeAllEventsEOButton.setEnabled(true);
        SeeAllEventsEOButton.setFont(new Font("sansserif",0,12));
        SeeAllEventsEOButton.setText("See All Events");
        SeeAllEventsEOButton.setVisible(true);
        //Set action for button click
        //Call defined method
        SeeAllEventsEOButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                seeAllEventsEO(evt);
                EventManager em = new EventManager();
                ArrayList<String> eventList = em.viewAllEvents();
                StringBuilder se = new StringBuilder();
                    for (int i = eventList.size() - 1; i >=0; i--){
                        String event = (eventList.get(i) + "\n");
                        se.append(event);
                    }
                ShowEventsEO.setText(se.toString());
            }
        });

	//create new text area
        ShowEventsEO = new JTextArea();
        ShowEventsEO.setBounds(202,75,151,267);
        ShowEventsEO.setBackground(new Color(255,255,255));
        ShowEventsEO.setForeground(new Color(0,0,0));
        ShowEventsEO.setEnabled(true);
        ShowEventsEO.setFont(new Font("sansserif",0,12));
        ShowEventsEO.setText("");
        ShowEventsEO.setBorder(BorderFactory.createBevelBorder(1));
        ShowEventsEO.setVisible(true);
        ShowEventsEO.setEditable(false);
        Scroll = new JScrollPane(ShowEventsEO, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        ShowEventsEO.setLineWrap(true);
        ShowEventsEO.setWrapStyleWord(true);
        Scroll.setBounds(202,75,151,267);

	//create new label
        TimeLabel = new JLabel();
        TimeLabel.setBounds(379,170,90,35);
        TimeLabel.setBackground(new Color(214,217,223));
        TimeLabel.setForeground(new Color(0,0,0));
        TimeLabel.setEnabled(true);
        TimeLabel.setFont(new Font("sansserif",0,12));
        TimeLabel.setText("Time");
        TimeLabel.setVisible(true);

	//create new field
        TitleEOField = new JTextField();
        TitleEOField.setBounds(531,62,90,35);
        TitleEOField.setBackground(new Color(255,255,255));
        TitleEOField.setForeground(new Color(0,0,0));
        TitleEOField.setEnabled(true);
        TitleEOField.setFont(new Font("sansserif",0,12));
        TitleEOField.setText("");
        TitleEOField.setVisible(true);

	//create new label
        TitleLabel = new JLabel();
        TitleLabel.setBounds(380,69,90,35);
        TitleLabel.setBackground(new Color(214,217,223));
        TitleLabel.setForeground(new Color(0,0,0));
        TitleLabel.setEnabled(true);
        TitleLabel.setFont(new Font("sansserif",0,12));
        TitleLabel.setText("Title");
        TitleLabel.setVisible(true);
	

	 //create new label
        Welcomelabel = new JLabel();
        Welcomelabel.setBounds(306,28,90,35);
        Welcomelabel.setBackground(new Color(214,217,223));
        Welcomelabel.setForeground(new Color(0,0,0));
        Welcomelabel.setEnabled(true);
        Welcomelabel.setFont(new Font("SansSerif",0,20));
        Welcomelabel.setText("Welcome");
        Welcomelabel.setVisible(true);

	//create new field
        YearEOField = new JTextField();
        YearEOField.setBounds(611,142,67,25);
        YearEOField.setBackground(new Color(255,255,255));
        YearEOField.setForeground(new Color(0,0,0));
        YearEOField.setEnabled(true);
        YearEOField.setFont(new Font("sansserif",0,12));
        YearEOField.setText("");
        YearEOField.setVisible(true);


        //adding components to contentPane panel
        contentPane.add(BookEOButton);
        contentPane.add(BookReqBoxEO);
        contentPane.add(BookReqLabel);
        contentPane.add(CancelEOButton);
        contentPane.add(CatEOBox);
        contentPane.add(Category);
        contentPane.add(ChooseOrSearchEventEOButton);
        contentPane.add(CreateEventEOButton);
        contentPane.add(DateLabel);
        contentPane.add(DayEOField);
        contentPane.add(DescEOField);
        contentPane.add(DescLabel);
        contentPane.add(ExitEOButton);
        contentPane.add(HourEOField);
        contentPane.add(LocationEOFIeld);
        contentPane.add(LocationLabel);
        contentPane.add(LogOutEOButton);
        contentPane.add(MinutesEOField);
        contentPane.add(ModifyEOButton);
        contentPane.add(MonthEOField);
        contentPane.add(MyEventsEOButton);
        contentPane.add(PlacesEOField);
        contentPane.add(PlacesLabel);
        contentPane.add(RoomNoEOBox);
        contentPane.add(RoomNoLabel);
        contentPane.add(SaveEOButton);
        contentPane.add(SeeAllBookEOButton);
        contentPane.add(SeeAllEventsEOButton);
        contentPane.add(ShowEventsEO);
        contentPane.add(TimeLabel);
        contentPane.add(TitleEOField);
        contentPane.add(TitleLabel);
        contentPane.add(Welcomelabel);
        contentPane.add(YearEOField);
        contentPane.add(Scroll);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    //Method actionPerformed for BookEOButton
    private void bookEO (ActionEvent evt) {
            String eventName = JOptionPane.showInputDialog("Please type in the event name.");
            Student playerOne = new Student();
            playerOne.setUniId(uniId);
            AccountManager.retrieveUser(playerOne);
            BookingManager bs = new BookingManager();
            bs.addBooking(playerOne, eventName);

    }

    //Method actionPerformed for CancelEOButton
    private void cancelEO (ActionEvent evt) {
            String eventName = JOptionPane.showInputDialog("Please type in the event name.");

            int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel it?", "Yes",  JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION){
                EventManager em = new EventManager();
                em.cancelEvent(eventName);
                JOptionPane.showMessageDialog(null, "You have successfully cancelled it.");
            } 
            
    }
    
    //Method actionPerformed for ChooseOrSearchEventEOButton
    private void chooseOrSearchEventEO (ActionEvent evt) {
        EventManager em = new EventManager();
        String eventName = JOptionPane.showInputDialog("Please type in the event name.");
        Events specificEvent = em.searchEvent(eventName);
        TitleEOField.setText(specificEvent.getEventName());
        DescEOField.setText(specificEvent.getDescription());
        DayEOField.setText(String.valueOf(specificEvent.getEventDay()));
        MonthEOField.setText(String.valueOf(specificEvent.getEventMonth()));
        YearEOField.setText(String.valueOf(specificEvent.getEventYear()));
        HourEOField.setText(String.valueOf(specificEvent.getEventHour()));
        MinutesEOField.setText(String.valueOf(specificEvent.getEventMinute()));
        PlacesEOField.setText(String.valueOf(specificEvent.getEventPlaces()));
    }

    //Method actionPerformed for CreateEventEOButton
    private void createEventEO (ActionEvent evt) {
    TitleEOField.setText("");
    DescEOField.setText("");
    DayEOField.setText("");
    MonthEOField.setText("");
    YearEOField.setText("");
    HourEOField.setText("");
    MinutesEOField.setText("");
    PlacesEOField.setText("");
    }


    //Method actionPerformed for ExitEOButton
    private void exitEO (ActionEvent evt) {
            System.exit(0);
        //TODO
    }

    //Method actionPerformed for LogOutEOButton
    private void logOutEO (ActionEvent evt) {
        LogInForm lo = new LogInForm();
        this.dispose();
        lo.setVisible(true);
    }

    //Method actionPerformed for ModifyEOButton
    private void modifyEO (ActionEvent evt) {
        String eventName = JOptionPane.showInputDialog("Please type in the event name.");
        EventManager em = new EventManager();
        Events specificEvent = new Events();
        em.searchEvent(eventName);
        TitleEOField.setText(specificEvent.getEventName());
        DescEOField.setText(specificEvent.getEventName());
        DayEOField.setText(String.valueOf(specificEvent.getEventDay()));
        MonthEOField.setText(String.valueOf(specificEvent.getEventMonth()));
        YearEOField.setText(String.valueOf(specificEvent.getEventYear()));
        HourEOField.setText(String.valueOf(specificEvent.getEventHour()));
        MinutesEOField.setText(String.valueOf(specificEvent.getEventMinute()));
        PlacesEOField.setText(String.valueOf(specificEvent.getEventPlaces()));
            //check if event was created by EO
            //saves the changes made in the DB
    }

    //Method actionPerformed for MyEventsEOButton
    private void seeOwnEventsEO (ActionEvent evt) {
            EventManager em = new EventManager();
            Student playerOne = new Student();
            playerOne.setUniId(uniId);
            AccountManager.retrieveUser(playerOne);
            em.viewOwnEvents(playerOne);
    }
    
    //Method actionPerformed for SaveEOButton
    private void saveChanges (ActionEvent evt) {
            EventManager em = new EventManager();
            Student playerOne = new Student();
            playerOne.setUniId(getUser());
            AccountManager am = new AccountManager();
            am.retrieveUser(playerOne);
            String category = CatEOBox.getSelectedItem().toString();
            int roomNo = 10;
            em.createEvent(TitleEOField.getText(), DescEOField.getText(), category, Integer.parseInt(DayEOField.getText()), Integer.parseInt(MonthEOField.getText()), Integer.parseInt(YearEOField.getText()), Integer.parseInt(HourEOField.getText()), Integer.parseInt(MinutesEOField.getText()), playerOne, roomNo, Integer.parseInt(PlacesEOField.getText()));
    
            //saves the new event in DB   
        TitleEOField.setText("");
        DescEOField.setText("");
        DayEOField.setText("");
        MonthEOField.setText("");
        YearEOField.setText("");
        HourEOField.setText("");
        MinutesEOField.setText("");
        PlacesEOField.setText("");
            //clears entry fields to avoid accidental doubling on creation of new event
    }

    //Method actionPerformed for SeeAllBookEOButton
    private void seeAllBookingsEO (ActionEvent evt) {
            String eventName = JOptionPane.showInputDialog("Please type in the event name.");
            BookingManager bm = new BookingManager();
            bm.viewAllBookings();
    }

    //Method actionPerformed for SeeAllEventsEOButton
    private void seeAllEventsEO (ActionEvent evt) {
            EventManager em = new EventManager();
            em.viewAllEvents();
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
                new EOMainForm();
            }
        });
    }

}

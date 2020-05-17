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


public class StudentMainForm extends JFrame {

	private JMenuBar menuBar;
	private JButton BookButton;
	private JLabel BookReqLabel;
	private JButton CancelBookButton;
	private JComboBox CatFieldStu;
	private JLabel CatLabel;
	private JCheckBox CheckBoxBookReqStu;
	private JTextField DateFieldStu;
	private JLabel Datelabel;
	private JTextField DescFieldStu;
	private JLabel DescLabel;
	private JButton ExitStuButton;
	private JLabel LocLabel;
	private JTextField LocationFieldStu;
	private JButton LogOutStuButton;
	private JTextField PlacesFieldStu;
	private JLabel Placeslabel;
	private JButton RightsStuButton;
	private JTextField RoomNoFieldStu;
	private JLabel RoomNoLabel;
	private JButton SeeAllBookStuButton;
	private JButton SeeAllEventsStuButton;
	private JTextArea ShowEventsStuBox;
	private JTextField TimeFieldStu;
	private JLabel TimeLabel;
	private JTextField TitleFieldStu;
	private JLabel TitleLabel;
	private JLabel Welcome;

	//Constructor 
	public StudentMainForm(){

		this.setTitle("StudentMainForm");
		this.setSize(703,447);
		//menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(703,447));
		contentPane.setBackground(new Color(192,192,192));


		BookButton = new JButton();
		BookButton.setBounds(179,378,90,35);
		BookButton.setBackground(new Color(214,217,223));
		BookButton.setForeground(new Color(0,0,0));
		BookButton.setEnabled(true);
		BookButton.setFont(new Font("sansserif",0,12));
		BookButton.setText("Book");
		BookButton.setVisible(true);

		BookReqLabel = new JLabel();
		BookReqLabel.setBounds(380,228,118,33);
		BookReqLabel.setBackground(new Color(214,217,223));
		BookReqLabel.setForeground(new Color(0,0,0));
		BookReqLabel.setEnabled(true);
		BookReqLabel.setFont(new Font("sansserif",0,12));
		BookReqLabel.setText("Booking Required");
		BookReqLabel.setVisible(true);

		CancelBookButton = new JButton();
		CancelBookButton.setBounds(273,378,90,35);
		CancelBookButton.setBackground(new Color(214,217,223));
		CancelBookButton.setForeground(new Color(0,0,0));
		CancelBookButton.setEnabled(true);
		CancelBookButton.setFont(new Font("sansserif",0,12));
		CancelBookButton.setText("Cancel");
		CancelBookButton.setVisible(true);

		CatFieldStu = new JComboBox();
		CatFieldStu.setBounds(537,263,90,35);
		CatFieldStu.setBackground(new Color(214,217,223));
		CatFieldStu.setForeground(new Color(0,0,0));
		CatFieldStu.setEnabled(true);
		CatFieldStu.setFont(new Font("sansserif",0,12));
		CatFieldStu.setVisible(true);

		CatLabel = new JLabel();
		CatLabel.setBounds(379,265,90,35);
		CatLabel.setBackground(new Color(214,217,223));
		CatLabel.setForeground(new Color(0,0,0));
		CatLabel.setEnabled(true);
		CatLabel.setFont(new Font("sansserif",0,12));
		CatLabel.setText("Category");
		CatLabel.setVisible(true);

		CheckBoxBookReqStu = new JCheckBox();
		CheckBoxBookReqStu.setBounds(534,227,90,35);
		CheckBoxBookReqStu.setBackground(new Color(214,217,223));
		CheckBoxBookReqStu.setForeground(new Color(0,0,0));
		CheckBoxBookReqStu.setEnabled(true);
		CheckBoxBookReqStu.setFont(new Font("sansserif",0,12));
		CheckBoxBookReqStu.setText("");
		CheckBoxBookReqStu.setVisible(true);

		DateFieldStu = new JTextField();
		DateFieldStu.setBounds(539,148,90,35);
		DateFieldStu.setBackground(new Color(255,255,255));
		DateFieldStu.setForeground(new Color(0,0,0));
		DateFieldStu.setEnabled(true);
		DateFieldStu.setFont(new Font("sansserif",0,12));
		DateFieldStu.setText("");
		DateFieldStu.setVisible(true);

		Datelabel = new JLabel();
		Datelabel.setBounds(379,149,90,35);
		Datelabel.setBackground(new Color(214,217,223));
		Datelabel.setForeground(new Color(0,0,0));
		Datelabel.setEnabled(true);
		Datelabel.setFont(new Font("sansserif",0,12));
		Datelabel.setText("Date");
		Datelabel.setVisible(true);

		DescFieldStu = new JTextField();
		DescFieldStu.setBounds(537,106,90,35);
		DescFieldStu.setBackground(new Color(255,255,255));
		DescFieldStu.setForeground(new Color(0,0,0));
		DescFieldStu.setEnabled(true);
		DescFieldStu.setFont(new Font("sansserif",0,12));
		DescFieldStu.setText("");
		DescFieldStu.setVisible(true);

		DescLabel = new JLabel();
		DescLabel.setBounds(377,107,90,35);
		DescLabel.setBackground(new Color(214,217,223));
		DescLabel.setForeground(new Color(0,0,0));
		DescLabel.setEnabled(true);
		DescLabel.setFont(new Font("sansserif",0,12));
		DescLabel.setText("Description");
		DescLabel.setVisible(true);

		ExitStuButton = new JButton();
		ExitStuButton.setBounds(30,272,90,35);
		ExitStuButton.setBackground(new Color(214,217,223));
		ExitStuButton.setForeground(new Color(0,0,0));
		ExitStuButton.setEnabled(true);
		ExitStuButton.setFont(new Font("sansserif",0,12));
		ExitStuButton.setText("Exit");
		ExitStuButton.setVisible(true);

		LocLabel = new JLabel();
		LocLabel.setBounds(376,298,90,35);
		LocLabel.setBackground(new Color(214,217,223));
		LocLabel.setForeground(new Color(0,0,0));
		LocLabel.setEnabled(true);
		LocLabel.setFont(new Font("sansserif",0,12));
		LocLabel.setText("Location");
		LocLabel.setVisible(true);

		LocationFieldStu = new JTextField();
		LocationFieldStu.setBounds(537,299,90,35);
		LocationFieldStu.setBackground(new Color(255,255,255));
		LocationFieldStu.setForeground(new Color(0,0,0));
		LocationFieldStu.setEnabled(true);
		LocationFieldStu.setFont(new Font("sansserif",0,12));
		LocationFieldStu.setText("");
		LocationFieldStu.setVisible(true);

		LogOutStuButton = new JButton();
		LogOutStuButton.setBounds(29,226,90,35);
		LogOutStuButton.setBackground(new Color(214,217,223));
		LogOutStuButton.setForeground(new Color(0,0,0));
		LogOutStuButton.setEnabled(true);
		LogOutStuButton.setFont(new Font("sansserif",0,12));
		LogOutStuButton.setText("Log Out");
		LogOutStuButton.setVisible(true);

		PlacesFieldStu = new JTextField();
		PlacesFieldStu.setBounds(540,373,90,35);
		PlacesFieldStu.setBackground(new Color(255,255,255));
		PlacesFieldStu.setForeground(new Color(0,0,0));
		PlacesFieldStu.setEnabled(true);
		PlacesFieldStu.setFont(new Font("sansserif",0,12));
		PlacesFieldStu.setText("");
		PlacesFieldStu.setVisible(true);

		Placeslabel = new JLabel();
		Placeslabel.setBounds(380,371,90,35);
		Placeslabel.setBackground(new Color(214,217,223));
		Placeslabel.setForeground(new Color(0,0,0));
		Placeslabel.setEnabled(true);
		Placeslabel.setFont(new Font("sansserif",0,12));
		Placeslabel.setText("Places");
		Placeslabel.setVisible(true);

		RightsStuButton = new JButton();
		RightsStuButton.setBounds(24,157,169,36);
		RightsStuButton.setBackground(new Color(214,217,223));
		RightsStuButton.setForeground(new Color(0,0,0));
		RightsStuButton.setEnabled(true);
		RightsStuButton.setFont(new Font("sansserif",0,12));
		RightsStuButton.setText("Ask For Editing Rights");
		RightsStuButton.setVisible(true);

		RoomNoFieldStu = new JTextField();
		RoomNoFieldStu.setBounds(536,335,90,35);
		RoomNoFieldStu.setBackground(new Color(255,255,255));
		RoomNoFieldStu.setForeground(new Color(0,0,0));
		RoomNoFieldStu.setEnabled(true);
		RoomNoFieldStu.setFont(new Font("sansserif",0,12));
		RoomNoFieldStu.setText("");
		RoomNoFieldStu.setVisible(true);

		RoomNoLabel = new JLabel();
		RoomNoLabel.setBounds(381,332,90,35);
		RoomNoLabel.setBackground(new Color(214,217,223));
		RoomNoLabel.setForeground(new Color(0,0,0));
		RoomNoLabel.setEnabled(true);
		RoomNoLabel.setFont(new Font("sansserif",0,12));
		RoomNoLabel.setText("Room No.");
		RoomNoLabel.setVisible(true);

		SeeAllBookStuButton = new JButton();
		SeeAllBookStuButton.setBounds(24,116,159,33);
		SeeAllBookStuButton.setBackground(new Color(214,217,223));
		SeeAllBookStuButton.setForeground(new Color(0,0,0));
		SeeAllBookStuButton.setEnabled(true);
		SeeAllBookStuButton.setFont(new Font("sansserif",0,12));
		SeeAllBookStuButton.setText("See All My Bookings");
		SeeAllBookStuButton.setVisible(true);

		SeeAllEventsStuButton = new JButton();
		SeeAllEventsStuButton.setBounds(23,74,127,37);
		SeeAllEventsStuButton.setBackground(new Color(214,217,223));
		SeeAllEventsStuButton.setForeground(new Color(0,0,0));
		SeeAllEventsStuButton.setEnabled(true);
		SeeAllEventsStuButton.setFont(new Font("sansserif",0,12));
		SeeAllEventsStuButton.setText("See All Events");
		SeeAllEventsStuButton.setVisible(true);

		ShowEventsStuBox = new JTextArea();
		ShowEventsStuBox.setBounds(208,85,156,275);
		ShowEventsStuBox.setBackground(new Color(255,255,255));
		ShowEventsStuBox.setForeground(new Color(0,0,0));
		ShowEventsStuBox.setEnabled(true);
		ShowEventsStuBox.setFont(new Font("sansserif",0,12));
		ShowEventsStuBox.setText("");
		ShowEventsStuBox.setBorder(BorderFactory.createBevelBorder(1));
		ShowEventsStuBox.setVisible(true);

		TimeFieldStu = new JTextField();
		TimeFieldStu.setBounds(540,188,90,35);
		TimeFieldStu.setBackground(new Color(255,255,255));
		TimeFieldStu.setForeground(new Color(0,0,0));
		TimeFieldStu.setEnabled(true);
		TimeFieldStu.setFont(new Font("sansserif",0,12));
		TimeFieldStu.setText("");
		TimeFieldStu.setVisible(true);

		TimeLabel = new JLabel();
		TimeLabel.setBounds(380,189,90,35);
		TimeLabel.setBackground(new Color(214,217,223));
		TimeLabel.setForeground(new Color(0,0,0));
		TimeLabel.setEnabled(true);
		TimeLabel.setFont(new Font("sansserif",0,12));
		TimeLabel.setText("Time");
		TimeLabel.setVisible(true);

		TitleFieldStu = new JTextField();
		TitleFieldStu.setBounds(535,64,90,35);
		TitleFieldStu.setBackground(new Color(255,255,255));
		TitleFieldStu.setForeground(new Color(0,0,0));
		TitleFieldStu.setEnabled(true);
		TitleFieldStu.setFont(new Font("sansserif",0,12));
		TitleFieldStu.setText("");
		TitleFieldStu.setVisible(true);

		TitleLabel = new JLabel();
		TitleLabel.setBounds(380,68,90,35);
		TitleLabel.setBackground(new Color(214,217,223));
		TitleLabel.setForeground(new Color(0,0,0));
		TitleLabel.setEnabled(true);
		TitleLabel.setFont(new Font("sansserif",0,12));
		TitleLabel.setText("Title");
		TitleLabel.setVisible(true);

		Welcome = new JLabel();
		Welcome.setBounds(301,20,90,35);
		Welcome.setBackground(new Color(214,217,223));
		Welcome.setForeground(new Color(0,0,0));
		Welcome.setEnabled(true);
		Welcome.setFont(new Font("SansSerif",0,20));
		Welcome.setText("Welcome");
		Welcome.setVisible(true);

		//adding components to contentPane panel
		contentPane.add(BookButton);
		contentPane.add(BookReqLabel);
		contentPane.add(CancelBookButton);
		contentPane.add(CatFieldStu);
		contentPane.add(CatLabel);
		contentPane.add(CheckBoxBookReqStu);
		contentPane.add(DateFieldStu);
		contentPane.add(Datelabel);
		contentPane.add(DescFieldStu);
		contentPane.add(DescLabel);
		contentPane.add(ExitStuButton);
		contentPane.add(LocLabel);
		contentPane.add(LocationFieldStu);
		contentPane.add(LogOutStuButton);
		contentPane.add(PlacesFieldStu);
		contentPane.add(Placeslabel);
		contentPane.add(RightsStuButton);
		contentPane.add(RoomNoFieldStu);
		contentPane.add(RoomNoLabel);
		contentPane.add(SeeAllBookStuButton);
		contentPane.add(SeeAllEventsStuButton);
		contentPane.add(ShowEventsStuBox);
		contentPane.add(TimeFieldStu);
		contentPane.add(TimeLabel);
		contentPane.add(TitleFieldStu);
		contentPane.add(TitleLabel);
		contentPane.add(Welcome);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
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
				new StudentMainForm();
			}
		});
	}

}
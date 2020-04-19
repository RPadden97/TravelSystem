import javax.swing.*;

public class MainMenuGUI {
    private JFrame mainFrame;
    private JLabel lb1;
    private JButton btn;
    private JRadioButton jradio_btn1, jradio_btn2, jradio_btn3, jradio_btn4, jradio_btn5;
    //create a constructor
    public MainMenuGUI(){
        prepareGUI();
    }
    private void prepareGUI(){
        mainFrame = new JFrame("Main Menu");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(null);
        lb1 = new JLabel("Integrated Travel System");
        lb1.setBounds(120, 50, 150, 20);
        jradio_btn1 = new JRadioButton();
        jradio_btn1.setText("Create Profile");
        jradio_btn1.setBounds(100, 90, 120, 20);
        jradio_btn2 = new JRadioButton();
        jradio_btn2.setText("Delete Profile");
        jradio_btn2.setBounds(100, 120, 120, 20);
        jradio_btn3 = new JRadioButton();
        jradio_btn3.setText("Update Profile");
        jradio_btn3.setBounds(100, 150, 120, 20);
        jradio_btn4 = new JRadioButton();
        jradio_btn4.setText("Find/Display Profile");
        jradio_btn4.setBounds(100, 180, 150, 20);
        jradio_btn5 = new JRadioButton();
        jradio_btn5.setText("Display All Profiles");
        jradio_btn5.setBounds(100, 210, 150, 20);
        btn = new JButton("Select");
        btn.setBounds(120, 250, 100, 20);
        mainFrame.add(btn);
        mainFrame.add(lb1);
        mainFrame.add(jradio_btn1);
        mainFrame.add(jradio_btn2);
        mainFrame.add(jradio_btn3);
        mainFrame.add(jradio_btn4);
        mainFrame.add(jradio_btn5);
        mainFrame.setVisible(true);
    }
    public static void main(String[] args){
        MainMenuGUI mainMenuGUI = new MainMenuGUI();
    }
}

import javax.swing.*;

public class MainMenuGUI {
    private JFrame mainFrame;
    private JLabel lb_mm;
    private JButton btn_mm;
    private JRadioButton jradio_btn1_mm, jradio_btn2_mm, jradio_btn3_mm, jradio_btn4_mm, jradio_btn5_mm;
    //create a constructor
    public MainMenuGUI(){
        prepareGUI();
    }
    private void prepareGUI(){
        mainFrame = new JFrame("Main Menu");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(null);
        lb_mm = new JLabel("Integrated Travel System");
        lb_mm.setBounds(120, 50, 150, 20);
        jradio_btn1_mm = new JRadioButton();
        jradio_btn1_mm.setText("Create Profile");
        jradio_btn1_mm.setBounds(100, 90, 120, 20);
        jradio_btn2_mm = new JRadioButton();
        jradio_btn2_mm.setText("Delete Profile");
        jradio_btn2_mm.setBounds(100, 120, 120, 20);
        jradio_btn3_mm = new JRadioButton();
        jradio_btn3_mm.setText("Update Profile");
        jradio_btn3_mm.setBounds(100, 150, 120, 20);
        jradio_btn4_mm = new JRadioButton();
        jradio_btn4_mm.setText("Find/Display Profile");
        jradio_btn4_mm.setBounds(100, 180, 150, 20);
        jradio_btn5_mm = new JRadioButton();
        jradio_btn5_mm.setText("Display All Profiles");
        jradio_btn5_mm.setBounds(100, 210, 150, 20);
        btn_mm = new JButton("Select");
        btn_mm.setBounds(120, 250, 100, 20);
        mainFrame.add(btn_mm);
        mainFrame.add(lb_mm);
        mainFrame.add(jradio_btn1_mm);
        mainFrame.add(jradio_btn2_mm);
        mainFrame.add(jradio_btn3_mm);
        mainFrame.add(jradio_btn4_mm);
        mainFrame.add(jradio_btn5_mm);
        mainFrame.setVisible(true);
    }
    public static void main(String[] args){
        MainMenuGUI mainMenuGUI = new MainMenuGUI();
    }
}

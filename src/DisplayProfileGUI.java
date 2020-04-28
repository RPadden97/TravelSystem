import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayProfileGUI {

    private JFrame displayProfFrame, findProfFrame;
    private JLabel lb_title, lb_TravelerID, lb_FirstName, lb_LastName, lb_Address, lb_Phone, lb_TripCost, lb_TravelType, lb_PaymentType, lb_MDContact, lb_MDPhone, lb_AlgType, lb_IllType;
    private JLabel lb2, lb3;
    private JPanel createProfPanel;
    private JButton btn, backbutton;
    private JTextField tf_TravelerID, tf_FirstName, tf_LastName, tf_Address, tf_Phone, tf_TripCost, tf_MDContact, tf_MDPhone;
    private JTextField cb_TravelType, cb_PaymentType, cb_AlgType, cb_Illtype;
    private JTextField textField1, textField2;

    private final int FRAME_WIDTH = 400;
    private final int FRAME_HEIGHT = 400;
    private final int LABEL_X_COORDINATE = 10;
    private final int Y_COORDINATE = 10;
    private final int LABEL_WIDTH = 150;
    private final int LABEL_HEIGHT = 20;
    private final int TEXTFIELD_WIDTH = 150;
    private final int TEXTFIELD_HEIGHT = 20;
    private final int TEXTFIELD_X_COORDINATE = LABEL_WIDTH + 20;
    private final int SPACE_BETWEEN_Y = 20;


    public DisplayProfileGUI() {
        prepareGUI();
    }

    private void prepareGUI() {
        findProfFrame = new JFrame("Travel System");
        findProfFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        findProfFrame.setLayout(null);
        displayProfFrame = new JFrame("Travel System");
        displayProfFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        displayProfFrame.setLayout(null);
        
        int i = 0;

        lb_title = new JLabel("FIND PROFILE");
        lb_title.setBounds(LABEL_X_COORDINATE, Y_COORDINATE + i, LABEL_WIDTH + 100, LABEL_HEIGHT);
        findProfFrame.add(lb_title);

        lb2 = new JLabel("Traveler ID: ");
        lb2.setBounds(100, 100, 150, 20);
        findProfFrame.add(lb2);
        textField1 = new JTextField();
        textField1.setBounds(180, 100, 150, 20);
        findProfFrame.add(textField1);
        lb3 = new JLabel("Last Name: ");
        lb3.setBounds(100, 130, 150, 20);
        findProfFrame.add(lb3);
        textField2 = new JTextField();
        textField2.setBounds(180, 130, 150, 20);
        findProfFrame.add(textField2);
        btn = new JButton("Find");
        btn.setBounds(120, 210, 100, 20);
        findProfFrame.add(btn);
        findProfFrame.setVisible(true);

        i = 0;

        //Title
        lb_title = new JLabel("DISPLAY PROFILE");
        lb_title.setBounds(LABEL_X_COORDINATE, Y_COORDINATE + i, LABEL_WIDTH + 100, LABEL_HEIGHT);
        displayProfFrame.add(lb_title);
        i += SPACE_BETWEEN_Y;

        //Traveler ID
        lb_TravelerID = new JLabel("Traveler ID: ");
        lb_TravelerID.setBounds(LABEL_X_COORDINATE, Y_COORDINATE + i, LABEL_WIDTH, LABEL_HEIGHT);
        displayProfFrame.add(lb_TravelerID);

        tf_TravelerID = new JTextField();
        tf_TravelerID.setBounds(TEXTFIELD_X_COORDINATE, Y_COORDINATE + i, TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
        tf_TravelerID.setEditable(false);
        displayProfFrame.add(tf_TravelerID);
        i += SPACE_BETWEEN_Y;

        //First Name
        lb_FirstName = new JLabel("First Name: ");
        lb_FirstName.setBounds(LABEL_X_COORDINATE, Y_COORDINATE + i, LABEL_WIDTH, LABEL_HEIGHT);
        displayProfFrame.add(lb_FirstName);

        tf_FirstName = new JTextField();
        tf_FirstName.setBounds(TEXTFIELD_X_COORDINATE, Y_COORDINATE + i, TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
        tf_FirstName.setEditable(false);
        displayProfFrame.add(tf_FirstName);
        i += SPACE_BETWEEN_Y;

        //Last Name
        lb_LastName = new JLabel("Last Name: ");
        lb_LastName.setBounds(LABEL_X_COORDINATE, Y_COORDINATE + i, LABEL_WIDTH, LABEL_HEIGHT);
        displayProfFrame.add(lb_LastName);

        tf_LastName = new JTextField();
        tf_LastName.setBounds(TEXTFIELD_X_COORDINATE, Y_COORDINATE + i, TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
        tf_LastName.setEditable(false);
        displayProfFrame.add(tf_LastName);
        i += SPACE_BETWEEN_Y;

        //Address
        lb_Address = new JLabel("Address: ");
        lb_Address.setBounds(LABEL_X_COORDINATE, Y_COORDINATE + i, LABEL_WIDTH, LABEL_HEIGHT);
        displayProfFrame.add(lb_Address);

        tf_Address = new JTextField();
        tf_Address.setBounds(TEXTFIELD_X_COORDINATE, Y_COORDINATE + i, TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
        tf_Address.setEditable(false);
        displayProfFrame.add(tf_Address);
        i += SPACE_BETWEEN_Y;

        //Phone
        lb_Phone = new JLabel("Phone: ");
        lb_Phone.setBounds(LABEL_X_COORDINATE, Y_COORDINATE + i, LABEL_WIDTH, LABEL_HEIGHT);
        displayProfFrame.add(lb_Phone);

        tf_Phone = new JTextField();
        tf_Phone.setBounds(TEXTFIELD_X_COORDINATE, Y_COORDINATE + i, TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
        tf_Phone.setEditable(false);
        displayProfFrame.add(tf_Phone);
        i += SPACE_BETWEEN_Y;

        //TripCost
        lb_TripCost = new JLabel("Trip Cost: ");
        lb_TripCost.setBounds(LABEL_X_COORDINATE, Y_COORDINATE + i, LABEL_WIDTH, LABEL_HEIGHT);
        displayProfFrame.add(lb_TripCost);

        tf_TripCost = new JTextField();
        tf_TripCost.setBounds(TEXTFIELD_X_COORDINATE, Y_COORDINATE + i, TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
        tf_TripCost.setEditable(false);
        displayProfFrame.add(tf_TripCost);
        i += SPACE_BETWEEN_Y;

        //TravelType
        lb_TravelType = new JLabel("Travel Type: ");
        lb_TravelType.setBounds(LABEL_X_COORDINATE, Y_COORDINATE + i, LABEL_WIDTH, LABEL_HEIGHT);
        displayProfFrame.add(lb_TravelType);

        String[] travelTypes = {"Pleasure", "Business"};
        cb_TravelType = new JTextField();
        cb_TravelType.setBounds(TEXTFIELD_X_COORDINATE, Y_COORDINATE + i, TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
        cb_TravelType.setEditable(false);
        displayProfFrame.add(cb_TravelType);
        i += SPACE_BETWEEN_Y;

        //PaymentType
        lb_PaymentType = new JLabel("Payment Type: ");
        lb_PaymentType.setBounds(LABEL_X_COORDINATE, Y_COORDINATE + i, LABEL_WIDTH, LABEL_HEIGHT);
        displayProfFrame.add(lb_PaymentType);

        String[] paymentTypes = {"Credit", "Check", "Debit", "Invoice"};
        cb_PaymentType = new JTextField();
        cb_PaymentType.setBounds(TEXTFIELD_X_COORDINATE, Y_COORDINATE + i, TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
        cb_PaymentType.setEditable(false);
        displayProfFrame.add(cb_PaymentType);
        i += SPACE_BETWEEN_Y;

        //MDContact
        lb_MDContact = new JLabel("Physician's Name: ");
        lb_MDContact.setBounds(LABEL_X_COORDINATE, Y_COORDINATE + i, LABEL_WIDTH, LABEL_HEIGHT);
        displayProfFrame.add(lb_MDContact);

        tf_MDContact = new JTextField();
        tf_MDContact.setBounds(TEXTFIELD_X_COORDINATE, Y_COORDINATE + i, TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
        tf_MDContact.setEditable(false);
        displayProfFrame.add(tf_MDContact);
        i += SPACE_BETWEEN_Y;

        //MDPhone
        lb_MDPhone = new JLabel("Physician's Number: ");
        lb_MDPhone.setBounds(LABEL_X_COORDINATE, Y_COORDINATE + i, LABEL_WIDTH, LABEL_HEIGHT);
        displayProfFrame.add(lb_MDPhone);

        tf_MDPhone = new JTextField();
        tf_MDPhone.setBounds(TEXTFIELD_X_COORDINATE, Y_COORDINATE + i, TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
        tf_MDPhone.setEditable(false);
        displayProfFrame.add(tf_MDPhone);
        i += SPACE_BETWEEN_Y;

        //AlgType
        lb_AlgType = new JLabel("Alergy Type: ");
        lb_AlgType.setBounds(LABEL_X_COORDINATE, Y_COORDINATE + i, LABEL_WIDTH, LABEL_HEIGHT);
        displayProfFrame.add(lb_AlgType);

        String[] algTypes = {"None", "Food", "Medication", "Other"};
        cb_AlgType = new JTextField();
        cb_AlgType.setBounds(TEXTFIELD_X_COORDINATE, Y_COORDINATE + i, TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
        cb_AlgType.setEditable(false);
        displayProfFrame.add(cb_AlgType);
        i += SPACE_BETWEEN_Y;

        //IllType
        lb_IllType = new JLabel("Illness Type: ");
        lb_IllType.setBounds(LABEL_X_COORDINATE, Y_COORDINATE + i, LABEL_WIDTH, LABEL_HEIGHT);
        displayProfFrame.add(lb_IllType);

        String[] illTypes = {"None", "Heart", "Diabetes", "Asthma", "Other"};
        cb_Illtype = new JTextField();
        cb_Illtype.setBounds(TEXTFIELD_X_COORDINATE, Y_COORDINATE + i, TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
        cb_Illtype.setEditable(false);
        displayProfFrame.add(cb_Illtype);
        i += SPACE_BETWEEN_Y;

        //Submit Button
        backbutton = new JButton("Back");
        backbutton.setBounds(LABEL_X_COORDINATE, Y_COORDINATE + i, LABEL_WIDTH, LABEL_HEIGHT);
        displayProfFrame.add(backbutton);


        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                findProfFrame.setVisible(false);
                displayProfFrame.setVisible(true);

            }
        });
    };
    public static void main(String[] args){
        DisplayProfileGUI swingtest = new DisplayProfileGUI();
    }
}

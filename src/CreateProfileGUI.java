import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateProfileGUI {

    private JFrame createProfFrame;
    private JLabel lb_title, lb_TravelerID,lb_FirstName,lb_LastName,lb_Address,lb_Phone,lb_TripCost, lb_TravelType, lb_PaymentType, lb_MDContact, lb_MDPhone,lb_AlgType,lb_IllType;
    private JPanel createProfPanel;
    private JButton submitButton;
    private JTextField tf_TravelerID,tf_FirstName,tf_LastName,tf_Address,tf_Phone,tf_TripCost, tf_MDContact, tf_MDPhone;
    private JComboBox cb_TravelType, cb_PaymentType, cb_AlgType, cb_Illtype;

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


    public CreateProfileGUI(){
        prepareGUI();
    }

    private void prepareGUI(){
        createProfFrame = new JFrame("Travel System");
        createProfFrame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        createProfFrame.setLayout(null);

        int i = 0;

        //Title
        lb_title = new JLabel("CREATE PROFILE");
        lb_title.setBounds(LABEL_X_COORDINATE,Y_COORDINATE + i, LABEL_WIDTH + 100,LABEL_HEIGHT);
        createProfFrame.add(lb_title);
        i+=SPACE_BETWEEN_Y;

        //Traveler ID
        lb_TravelerID = new JLabel("Traveler ID: ");
        lb_TravelerID.setBounds(LABEL_X_COORDINATE,Y_COORDINATE + i,LABEL_WIDTH,LABEL_HEIGHT);
        createProfFrame.add(lb_TravelerID);

        tf_TravelerID = new JTextField();
        tf_TravelerID.setBounds(TEXTFIELD_X_COORDINATE,Y_COORDINATE + i,TEXTFIELD_WIDTH,TEXTFIELD_HEIGHT);
        createProfFrame.add(tf_TravelerID);
        i+=SPACE_BETWEEN_Y;

        //First Name
        lb_FirstName = new JLabel("First Name: ");
        lb_FirstName.setBounds(LABEL_X_COORDINATE,Y_COORDINATE + i,LABEL_WIDTH,LABEL_HEIGHT);
        createProfFrame.add(lb_FirstName);

        tf_FirstName = new JTextField();
        tf_FirstName.setBounds(TEXTFIELD_X_COORDINATE,Y_COORDINATE + i,TEXTFIELD_WIDTH,TEXTFIELD_HEIGHT);
        createProfFrame.add(tf_FirstName);
        i+=SPACE_BETWEEN_Y;

        //Last Name
        lb_LastName = new JLabel("Last Name: ");
        lb_LastName.setBounds(LABEL_X_COORDINATE,Y_COORDINATE + i,LABEL_WIDTH,LABEL_HEIGHT);
        createProfFrame.add(lb_LastName);

        tf_LastName = new JTextField();
        tf_LastName.setBounds(TEXTFIELD_X_COORDINATE,Y_COORDINATE + i,TEXTFIELD_WIDTH,TEXTFIELD_HEIGHT);
        createProfFrame.add(tf_LastName);
        i+=SPACE_BETWEEN_Y;

        //Address
        lb_Address = new JLabel("Address: ");
        lb_Address.setBounds(LABEL_X_COORDINATE,Y_COORDINATE + i,LABEL_WIDTH,LABEL_HEIGHT);
        createProfFrame.add(lb_Address);

        tf_Address = new JTextField();
        tf_Address.setBounds(TEXTFIELD_X_COORDINATE,Y_COORDINATE + i,TEXTFIELD_WIDTH,TEXTFIELD_HEIGHT);
        createProfFrame.add(tf_Address);
        i+=SPACE_BETWEEN_Y;

        //Phone
        lb_Phone = new JLabel("Phone: ");
        lb_Phone.setBounds(LABEL_X_COORDINATE,Y_COORDINATE + i,LABEL_WIDTH,LABEL_HEIGHT);
        createProfFrame.add(lb_Phone);

        tf_Phone = new JTextField();
        tf_Phone.setBounds(TEXTFIELD_X_COORDINATE,Y_COORDINATE + i,TEXTFIELD_WIDTH,TEXTFIELD_HEIGHT);
        createProfFrame.add(tf_Phone);
        i+=SPACE_BETWEEN_Y;

        //TripCost
        lb_TripCost = new JLabel("Trip Cost: ");
        lb_TripCost.setBounds(LABEL_X_COORDINATE,Y_COORDINATE + i,LABEL_WIDTH,LABEL_HEIGHT);
        createProfFrame.add(lb_TripCost);

        tf_TripCost = new JTextField();
        tf_TripCost.setBounds(TEXTFIELD_X_COORDINATE,Y_COORDINATE + i,TEXTFIELD_WIDTH,TEXTFIELD_HEIGHT);
        createProfFrame.add(tf_TripCost);
        i+=SPACE_BETWEEN_Y;

        //TravelType
        lb_TravelType = new JLabel("Travel Type: ");
        lb_TravelType.setBounds(LABEL_X_COORDINATE,Y_COORDINATE + i,LABEL_WIDTH,LABEL_HEIGHT);
        createProfFrame.add(lb_TravelType);

        String[] travelTypes = {"Pleasure","Business"};
        cb_TravelType = new JComboBox(travelTypes);
        cb_TravelType.setBounds(TEXTFIELD_X_COORDINATE,Y_COORDINATE+i,TEXTFIELD_WIDTH,TEXTFIELD_HEIGHT);
        createProfFrame.add(cb_TravelType);
        i+=SPACE_BETWEEN_Y;

        //PaymentType
        lb_PaymentType = new JLabel("Payment Type: ");
        lb_PaymentType.setBounds(LABEL_X_COORDINATE,Y_COORDINATE + i,LABEL_WIDTH,LABEL_HEIGHT);
        createProfFrame.add(lb_PaymentType);

        String[] paymentTypes = {"Credit","Check","Debit","Invoice"};
        cb_PaymentType = new JComboBox(paymentTypes);
        cb_PaymentType.setBounds(TEXTFIELD_X_COORDINATE,Y_COORDINATE+i,TEXTFIELD_WIDTH,TEXTFIELD_HEIGHT);
        createProfFrame.add(cb_PaymentType);
        i+=SPACE_BETWEEN_Y;

        //MDContact
        lb_MDContact = new JLabel("Physician's Name: ");
        lb_MDContact.setBounds(LABEL_X_COORDINATE,Y_COORDINATE + i,LABEL_WIDTH,LABEL_HEIGHT);
        createProfFrame.add(lb_MDContact);

        tf_MDContact = new JTextField();
        tf_MDContact.setBounds(TEXTFIELD_X_COORDINATE,Y_COORDINATE + i,TEXTFIELD_WIDTH,TEXTFIELD_HEIGHT);
        createProfFrame.add(tf_MDContact);
        i+=SPACE_BETWEEN_Y;

        //MDPhone
        lb_MDPhone = new JLabel("Physician's Number: ");
        lb_MDPhone.setBounds(LABEL_X_COORDINATE,Y_COORDINATE + i,LABEL_WIDTH,LABEL_HEIGHT);
        createProfFrame.add(lb_MDPhone);

        tf_MDPhone = new JTextField();
        tf_MDPhone.setBounds(TEXTFIELD_X_COORDINATE,Y_COORDINATE + i,TEXTFIELD_WIDTH,TEXTFIELD_HEIGHT);
        createProfFrame.add(tf_MDPhone);
        i+=SPACE_BETWEEN_Y;

        //AlgType
        lb_AlgType = new JLabel("Alergy Type: ");
        lb_AlgType.setBounds(LABEL_X_COORDINATE,Y_COORDINATE + i,LABEL_WIDTH,LABEL_HEIGHT);
        createProfFrame.add(lb_AlgType);

        String[] algTypes = {"None","Food","Medication","Other"};
        cb_AlgType = new JComboBox(algTypes);
        cb_AlgType.setBounds(TEXTFIELD_X_COORDINATE,Y_COORDINATE+i,TEXTFIELD_WIDTH,TEXTFIELD_HEIGHT);
        createProfFrame.add(cb_AlgType);
        i+=SPACE_BETWEEN_Y;

        //IllType
        lb_IllType = new JLabel("Illness Type: ");
        lb_IllType.setBounds(LABEL_X_COORDINATE,Y_COORDINATE + i,LABEL_WIDTH,LABEL_HEIGHT);
        createProfFrame.add(lb_IllType);

        String[] illTypes = {"None","Heart","Diabetes","Asthma","Other"};
        cb_Illtype = new JComboBox(illTypes);
        cb_Illtype.setBounds(TEXTFIELD_X_COORDINATE,Y_COORDINATE+i,TEXTFIELD_WIDTH,TEXTFIELD_HEIGHT);
        createProfFrame.add(cb_Illtype);
        i+=SPACE_BETWEEN_Y;

        //Submit Button
        submitButton = new JButton("Submit");
        submitButton.setBounds(LABEL_X_COORDINATE,Y_COORDINATE+i,LABEL_WIDTH,LABEL_HEIGHT);
        createProfFrame.add(submitButton);

        createProfFrame.setVisible(true);

        //add listeners to submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String input_TravelID = tf_TravelerID.getText();
                String input_FirstName = tf_FirstName.getText();
                String input_LastName = tf_LastName.getText();
                String input_Address = tf_Address.getText();
                String input_Phone = tf_Phone.getText();
                Float input_TripCost = Float.parseFloat(tf_TripCost.getText());
                String input_MDContact = tf_MDContact.getText();
                String input_MDPhone = tf_MDPhone.getText();


                String input_TravelType;
                switch(cb_TravelType.getSelectedIndex()){
                    case 1: input_TravelType = "Business";
                            break;
                    default: input_TravelType = "Pleasure";
                            break;
                }

                String input_PaymentType;
                switch(cb_PaymentType.getSelectedIndex()){
                    case 1: input_PaymentType = "Check";
                            break;
                    case 2: input_PaymentType = "Debit";
                            break;
                    case 3: input_PaymentType = "Invoice";
                            break;
                    default: input_PaymentType = "Credit";
                            break;
                }

                String input_AlgType;
                switch(cb_PaymentType.getSelectedIndex()){
                    case 1: input_AlgType = "Food";
                            break;
                    case 2: input_AlgType = "Medication";
                            break;
                    case 3: input_AlgType = "Other";
                            break;
                    default: input_AlgType= "None";
                            break;
                }

                String input_IllType;
                switch(cb_PaymentType.getSelectedIndex()){
                    case 1: input_IllType = "Heart";
                            break;
                    case 2: input_IllType = "Diabetes";
                            break;
                    case 3: input_IllType = "Asthma";
                            break;
                    case 4: input_IllType = "Other";
                            break;
                    default: input_IllType = "None";
                            break;
                }

                TravProf newTP = new TravProf(input_TravelID,input_FirstName,input_LastName,input_Address,input_Phone,input_TripCost,input_TravelType,input_PaymentType,new MedCond(input_MDContact,input_MDPhone,input_AlgType,input_IllType));

            }
        });

    };

    public static void main(String[] args){

        CreateProfileGUI swingtest = new CreateProfileGUI();
    }

}

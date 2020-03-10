import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TravProfInterface {

    private Scanner keyboard;
    private TravProfDB database;
    private String databaseName;

    public TravProfInterface(String fileName) throws IOException {
        keyboard = new Scanner(System.in);
        databaseName = fileName;
        getUserChoice();
    }

    public void getUserChoice() throws IOException {
        int menuChoice;
        System.out.println("Menu: ");
        System.out.println("\t1. Enter a New Travel Profile\n\t2. Delete a Traveler by Name and Agent ID\n\t3. Find and display a Profile\n\t4. Travel Profile Modifications\n\t5. Display All Profiles\n\t6. Write to database\n\t7. Intialize Database");
        System.out.print("Select an option (1-7): ");
        menuChoice = keyboard.nextInt();

        switch( menuChoice ){
            case 1: createNewTravProf(); break;
            case 2: deleteTravProf(); break;
            case 3: findTravProf(); break;
            case 4: updateTravProf(); break;
            case 5: displayAllTravProf(); break;
            case 6: writeToDB(); break;
            case 7: initDB(); break;
        }

    }

    public void deleteTravProf(){
        System.out.println("\nDelete a Traveler by Name and Agent ID:");
        System.out.print("\tEnter traveler's last name: ");
        String lastName = keyboard.nextLine();
        System.out.println();
        System.out.print("\tEnter travel agent ID: ");
        String agentID = keyboard.nextLine();
        System.out.println();

        database.deleteProfile(agentID,lastName);
    }

    public void findTravProf(){
        System.out.println("\nFind and Display a Traveler by Name and Agent ID:");
        System.out.print("\tEnter traveler's last name: ");
        String lastName = keyboard.nextLine();
        System.out.println();
        System.out.print("\tEnter travel agent ID: ");
        String agentID = keyboard.nextLine();
        System.out.println();
        displayTravProf(database.findProfile(agentID,lastName));
    }

    public void updateTravProf(){

    }

    public void displayTravProf(TravProf profile){
        System.out.println("Profile of " + profile.getLastName());
        System.out.println("\tAgent ID: " + profile.gettravAgentID());
        System.out.println("\tName: " + profile.getFirstName() + " " + profile.getLastName());
        System.out.println("\tAddress: " + profile.getAddress());
        System.out.println("\tPhone Number: " + profile.getPhone());
        System.out.println("\tTrip Cost: " + profile.getTripCost());
        System.out.println("\tTravel Type: " + profile.getTravelType());
        System.out.println("\tPayment Type: " + profile.getPaymentType());
        System.out.println("\tMedical Condition ");
        System.out.println("\t\tContact: " + profile.getMedCondInfo().getMdContact());
        System.out.println("\t\tPhone: " + profile.getMedCondInfo().getMdPhone());
        System.out.println("\t\tAllergy Type: " + profile.getMedCondInfo().getAlgType());
        System.out.println("\t\tIllness Type: " + profile.getMedCondInfo().getIllType());
    }

    public void displayAllTravProf(){
        System.out.print("\tEnter travel agent ID: ");
        String agentID = keyboard.nextLine();
        System.out.println();

        TravProf temp = database.findFirstProfile();
        displayTravProf(temp);
        temp = database.findNextProfile();
        while(temp!=null){
            displayTravProf(temp);
            temp = database.findNextProfile();
        }
    }

    public void writeToDB(){
        database.writeAllTravProf(databaseName);
    }

    public void initDB() throws IOException {
        database = new TravProfDB(databaseName);
    }

    public TravProf createNewTravProf(){
        System.out.print("Enter agent ID: ");
        String agentID = keyboard.nextLine();
        System.out.println();

        System.out.print("Enter first name: ");
        String firstName = keyboard.nextLine();
        System.out.println();

        System.out.print("Enter last name: ");
        String lastName = keyboard.nextLine();
        System.out.println();

        System.out.print("Enter address: ");
        String address = keyboard.nextLine();
        System.out.println();

        System.out.print("Enter phone number: ");
        String phoneNumber = keyboard.nextLine();
        System.out.println();

        System.out.print("Enter trip cost: ");
        float tripCost = keyboard.nextFloat();
        System.out.println();

        System.out.print("Enter travel type: ");
        String travelType = keyboard.nextLine();
        System.out.println();

        System.out.print("Enter payment type: ");
        String paymentType = keyboard.nextLine();
        System.out.println();

        return new TravProf(agentID,firstName,lastName,address,phoneNumber,tripCost,travelType,paymentType,createNewMedCond());
    }

    public MedCond createNewMedCond(){
        System.out.print("Enter Doctor contact: ");
        String contact = keyboard.nextLine();
        System.out.println();

        System.out.print("Enter Doctor's phone number: ");
        String phoneNumber = keyboard.nextLine();
        System.out.println();

        System.out.print("Enter allergy type: ");
        String algType = keyboard.nextLine();
        System.out.println();

        System.out.print("Enter illness type: ");
        String illType = keyboard.nextLine();
        System.out.println();

        return new MedCond(contact, phoneNumber, algType, illType);
    }
}

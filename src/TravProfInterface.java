import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TravProfInterface {

    private Scanner keyboard;
    private TravProfDB database;
    private String databaseName;
    private TravProf currentProfile = null;

    public TravProfInterface(String fileName) throws IOException {
        keyboard = new Scanner(System.in);
        databaseName = fileName;
        getUserChoice();
    }

    public void getUserChoice() throws IOException {
        boolean exit = false;
        while(!exit){
            System.out.println("Menu: ");
            System.out.println("\t1. Enter a New Travel Profile\n\t2. Delete a Traveler by Name and Agent ID\n\t3. Find and display a Profile\n\t4. Travel Profile Modifications\n\t5. Display All Profiles\n\t6. Write to database\n\t7. Intialize Database\n\t8. Exit");
            System.out.print("Select an option (1-7): ");
            int menuChoice = keyboard.nextInt();

            switch( menuChoice ){
                case 1: createNewTravProf(); break;
                case 2: deleteTravProf(); break;
                case 3: findTravProf(); break;
                case 4: updateTravProf(); break;
                case 5: displayAllTravProf(); break;
                case 6: writeToDB(); break;
                case 7: initDB(); break;
                case 8: exit = true; break;
            }

            System.out.println();
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
        if(currentProfile!=null){
            System.out.println("Choose an element to modify: ");
            System.out.println("\t1. Address\n\t2. Phone\n\t3. Travel Type\n\t4. Trip Cost\n\t5. Payment Type\n\t6. MD Contact\n\t7. MD Phone Number\n\t8. Illness Type\n\t9. Allergy Type");
            System.out.print("Select an option (1-9): ");
            int menuChoice = keyboard.nextInt();

            switch( menuChoice ){
                case 1:
                    System.out.print("Enter new address: ");
                    currentProfile.updateAddress(keyboard.nextLine());
                    break;
                case 2:
                    System.out.print("Enter new phone number: ");
                    currentProfile.updatePhone(keyboard.nextLine());
                    break;
                case 3:
                    System.out.print("Enter new travel type: ");
                    currentProfile.updateTravelType(keyboard.nextLine());
                    break;
                case 4:
                    System.out.print("Enter new trip cost: ");
                    currentProfile.updateTripCost(keyboard.nextFloat());
                    break;
                case 5:
                    System.out.print("Enter new payment type: ");
                    currentProfile.updatePaymentType(keyboard.nextLine());
                    break;
                case 6:
                    System.out.print("Enter new MD Contact: ");
                    currentProfile.getMedCondInfo().updateMdContact(keyboard.nextLine());
                    break;
                case 7:
                    System.out.print("Enter new MD phone: ");
                    currentProfile.getMedCondInfo().updateMdPhone(keyboard.nextLine());
                    break;
                case 8:
                    System.out.print("Enter new illness type: ");
                    currentProfile.getMedCondInfo().updateIllType(keyboard.nextLine());
                    break;
                case 9:
                    System.out.print("Enter new allergy type: ");
                    currentProfile.getMedCondInfo().updateAlgType(keyboard.nextLine());
                    break;
            }
        }else{
            System.out.println("Find profile first");
        }
        System.out.println();
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

    public TravProf createNewTravProf() {
        keyboard.nextLine();

        System.out.print("\tEnter agent ID: ");
        String agentID = keyboard.nextLine();

        System.out.print("\tEnter first name: ");
        String firstName = keyboard.nextLine();

        System.out.print("\tEnter last name: ");
        String lastName = keyboard.nextLine();

        System.out.print("\tEnter address: ");
        String address = keyboard.nextLine();

        System.out.print("\tEnter phone number: ");
        String phoneNumber = keyboard.nextLine();

        System.out.print("\tEnter trip cost: ");
        float tripCost = keyboard.nextFloat();

        System.out.print("\tEnter travel type: ");
        String travelType = keyboard.nextLine();

        System.out.print("\tEnter payment type: ");
        String paymentType = keyboard.nextLine();

        return new TravProf(agentID,firstName,lastName,address,phoneNumber,tripCost,travelType,paymentType,createNewMedCond());
    }

    public MedCond createNewMedCond(){
        System.out.print("\tEnter Doctor contact: ");
        String contact = keyboard.nextLine();

        System.out.print("\tEnter Doctor's phone number: ");
        String phoneNumber = keyboard.nextLine();

        System.out.print("\tEnter allergy type: ");
        String algType = keyboard.nextLine();

        System.out.print("\tEnter illness type: ");
        String illType = keyboard.nextLine();

        return new MedCond(contact, phoneNumber, algType, illType);
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TravProfInterface {

    private Scanner keyboard;
    private Scanner file;

    public TravProfInterface(String fileName) throws FileNotFoundException {
        keyboard = new Scanner(System.in);
        file = new Scanner(new File("./database/" + fileName));

        getUserChoice();

    }

    public void getUserChoice(){
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
        System.out.print("\tEnter traveler last name: ");
        String lastName = keyboard.nextLine();
        System.out.println();
        System.out.print("\tEnter Travel Agent ID: ");
        String agentID = keyboard.nextLine();
        System.out.println();

        //DELETE FROM DATABASE
    }

    public void findTravProf(){

        displayTravProf();

    }

    public void updateTravProf(){

    }

    public void displayTravProf(){

    }

    public void displayAllTravProf(){

    }

    public void writeToDB(){

    }

    public void initDB(){

    }

    public TravProf createNewTravProf(){

        createNewMedCond();
        return null;
    }

    public MedCond createNewMedCond(){
        return null;
    }
}

import java.util.Scanner;
public class TravProf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome! Enter traveler ID: ");
        String travAgentID = in.nextLine();
        // if travAgentID is already in the db, give options to get or update
        // if not, ask questions:
        System.out.println("Enter first name: ");
        String firstName = in.nextLine();
        System.out.println("Enter last name: ");
        String lastName = in.nextLine();
        System.out.println("Enter address: ");
        String address = in.nextLine();
        System.out.println("Enter phone number: ");
        String phone = in.nextLine();
        System.out.println("Enter cost of trip: ");
        Float tripCost = in.nextLine();
        System.out.println("Enter type of travel: ");
        String travelType = in.nextLine();
        System.out.println("Enter type of payment: ");
        String paymentType = in.nextLine();
        // this is where medcondinfo will go
        //System.out.println("Enter medical condition information: ");
}
}

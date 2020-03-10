import java.io.Serializable;

public class TravProf implements Serializable {
    // defining variables
    private String travAgentID;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private float tripCost;
    private String travelType;
    private String paymentType;
    private MedCond medCondInfo;
    // constructor method 
    public TravProf(String newTravAgentID, String newFirstName, String newLastName, String newAddress, String newPhone, float newTripCost, String newTravelType, String newPaymentType, MedCond newMedCondInfo) {
        travAgentID = newTravAgentID;
        updateFirstName(newFirstName);
        updateLastName(newLastName);
        updateAddress(newAddress);
        updatePhone(newPhone);
        updateTripCost(newTripCost);
        updateTravelType(newTravelType);
        updatePaymentType(newPaymentType);
        updateMedCondInfo(newMedCondInfo);
    }
    // get methods
    public String gettravAgentID() {
        return travAgentID;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public float getTripCost() {
        return tripCost;
    }
    public String getTravelType() {
        return travelType;
    }
    public String getPaymentType() {
        return paymentType;
    }
    public MedCond getMedCondInfo() {
        return medCondInfo;
    }
    //update methods
    public void updateFirstName(String newFirst) {
        firstName = newFirst;
    }
    public void updateLastName(String newLast) {
        lastName = newLast;
    }
    public void updateAddress(String newAddress) {
        address = newAddress;
    }
    public void updatePhone(String newPhone) {
        phone = newPhone;
    }
    public void updateTripCost(float newTripCost) {
        tripCost = newTripCost;
    }
    public void updateTravelType(String newTravelType) {
        travelType = newTravelType;
    }
    public void updatePaymentType(String newPaymentType) {
        paymentType = newPaymentType;
    }
    public void updateMedCondInfo(MedCond newMedCondInfo) {
        medCondInfo = newMedCondInfo;
    }
}

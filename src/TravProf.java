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
    public String gettravAgentID() { //get and return travAgentID
        return travAgentID;
    }
    public String getFirstName() { //get and return firstName
        return firstName;
    }
    public String getLastName() { //get and return lastName
        return lastName;
    }
    public String getAddress() { //get and return address
        return address;
    }
    public String getPhone() { //get and return phone number
        return phone;
    }
    public float getTripCost() { //get and return tripCost
        return tripCost;
    }
    public String getTravelType() { //get and return travelType
        return travelType;
    }
    public String getPaymentType() { //get and return paymentType
        return paymentType;
    }
    public MedCond getMedCondInfo() { //get and return MedCondInfo
        return medCondInfo;
    }
    //update methods
    public void updateFirstName(String newFirst) { //update first name
        firstName = newFirst;
    }
    public void updateLastName(String newLast) { //update last name
        lastName = newLast;
    }
    public void updateAddress(String newAddress) { //update address
        address = newAddress;
    }
    public void updatePhone(String newPhone) { //update phone number
        phone = newPhone;
    }
    public void updateTripCost(float newTripCost) { //update tripCost
        tripCost = newTripCost;
    }
    public void updateTravelType(String newTravelType) { //update travelType
        travelType = newTravelType;
    }
    public void updatePaymentType(String newPaymentType) { //update paymentType
        paymentType = newPaymentType;
    }
    public void updateMedCondInfo(MedCond newMedCondInfo) { //update medCondInfo
        medCondInfo = newMedCondInfo;
    }
}

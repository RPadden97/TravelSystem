import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
public class TravProfDB {
    private int numTravelers;
    private int currentTravelerIndex;
    private String fileName;
    private ArrayList<TravProf> travelerList;
    //public TravProfDB(String fileName) {
    //
   // }
    public void insertNewProfile(TravProf TravProf) {
        travelerList.add(TravProf);
    }
    public boolean deleteProfile(String travAgentID, String lastName) {
        return travelerList.remove(findProfile(travAgentID, lastName)); //send back true if it was successful, false if not
    }
    public TravProf findProfile(String travAgentID, String lastName) {
        for(int i = 0; i < travelerList.size(); i++) { //iterate through traveler list
            if (travelerList.get(i).gettravAgentID() == travAgentID && travelerList.get(i).getLastName() == lastName) { //check if both ID and last name matches
                currentTravelerIndex = i; //updates traveler index
                return travelerList.get(i); //returns profile if both match
            }
        }
        return null; //returns null if both do not match
    }
    public TravProf findFirstProfile() {
        travelerList.get(0);
    }
    public TravProf findNextProfile() {
        return travelerList.get(currentTravelerIndex+1); //returns traveler index + 1
    }
    public void writeAllTravProf(String TravProf) implements Serializable {
        try {
            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut
        }

    { //writes to a file
    }
    public void initializeDataBase(String TravProf) { //returns information from the file
    }
    }

}

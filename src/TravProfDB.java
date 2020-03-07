import java.util.ArrayList;
public class TravProfDB {
    private int numTravelers;
    private int currentTravelerIndex;
    private String fileName;
    private ArrayList<TravProf> travelerList;
    // constructor: public TravProfDB();
    public void insertNewProfile(TravProf TravProf) {
        travelerList.add(TravProf);
    }
    public boolean deleteProfile(String travAgentID, String lastName) {

    }
    public TravProf findProfile(String, String) {
    }
    public TravProf findFirstProfile() {
        travelerList.get(0);
    }
    public TravProf findNextProfile() {
    }
    public void writeAllTravProf(String) {
    }
    public void initializeDataBase(String) {
    }
    }

}

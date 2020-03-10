import java.io.*;
import java.util.ArrayList;

public class TravProfDB {

    private int numTravelers;
    private int currentTravelerIndex;
    private String fileName;
    private ArrayList<TravProf> travelerList;

    public TravProfDB(String newFileName) throws IOException {
        fileName = newFileName;
        initializeDataBase(fileName);
    }

    public void insertNewProfile(TravProf TravProf) {
        travelerList.add(TravProf);
    }

    public boolean deleteProfile(String travAgentID, String lastName) {
        return travelerList.remove(findProfile(travAgentID, lastName)); //send back true if it was successful, false if not
    }

    public TravProf findProfile(String travAgentID, String lastName) {
        for(int i = 0; i < travelerList.size(); i++) { //iterate through traveler list
            if (travelerList.get(i).gettravAgentID().equals(travAgentID) && travelerList.get(i).getLastName().equals(lastName)) { //check if both ID and last name matches
                currentTravelerIndex = i; //updates traveler index
                return travelerList.get(i); //returns profile if both match
            }
        }
        return null; //returns null if both do not match
    }

    public TravProf findFirstProfile() {
        return travelerList.get(0);
    }

    public TravProf findNextProfile() {
        return travelerList.get(currentTravelerIndex+1); //returns traveler index + 1
    }

    public void writeAllTravProf(String fileNameDB) {
        String filePath = "./database/" + fileNameDB + ".ser";

        try {
            FileOutputStream fileOut = new FileOutputStream(filePath);
            ObjectOutputStream writeData = new ObjectOutputStream(fileOut);
            writeData.writeObject(travelerList);
            writeData.flush();
            writeData.close();
            System.out.println("Good Job!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //writes to a file
    }

    public void initializeDataBase(String fileNameDB) throws IOException { //returns information from the file
        String filePath = "./database/" + fileNameDB + ".ser";
        File myObj = new File(filePath);

        if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
            travelerList = new ArrayList<TravProf>();
            writeAllTravProf(fileNameDB);
        } else {
            System.out.println("File already exists.");
            try{
                FileInputStream readData = new FileInputStream(filePath);
                ObjectInputStream readStream = new ObjectInputStream(readData);

                travelerList = (ArrayList<TravProf>) readStream.readObject();
                readStream.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

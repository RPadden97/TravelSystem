import java.io.IOException;
import java.util.ArrayList;

public class Main {
    //File for testing current implementations

    public static void main(String[] args) throws IOException {
//        TravProf testProf = new TravProf("ABC","Ava","Fritz","123 Not here", "860",123,"Commercial","Credit", new MedCond("11","860","Many","Ill"));
//        TravProf testProf2 = new TravProf("ABC","Ava","Fritz","123 Not here", "860",123,"Commercial","Credit", new MedCond("11","860","Many","Ill"));
        TravProfDB testDB = new TravProfDB("testFile");
//        testDB.insertNewProfile(testProf);
//        testDB.insertNewProfile(testProf2);
        testDB.initializeDataBase("testFile");
        TravProf returned = testDB.findProfile("ABC","Fritz");
        System.out.println(returned.getFirstName());
    }
}

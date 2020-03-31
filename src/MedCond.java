import java.io.Serializable;

public class MedCond implements Serializable {

    private String mdContact;
    private String mdPhone;
    private String algType;
    private String illType;

    public MedCond(String newMdContact, String newMdPhone, String newAlgType, String newIllType){
        updateMdContact(newMdContact);
        updateMdPhone(newMdPhone);
        updateAlgType(newAlgType);
        updateIllType(newIllType);
    }
    //Get Methods
    public String getMdContact(){
        return mdContact;
    } //gets the MD's name

    public String getMdPhone(){
        return mdPhone;
    } //gets the MD's phone number

    public String getAlgType(){
        return algType;
    } //gets the allergy type

    public String getIllType(){
        return illType;
    } //gets the illness type
    //Update Methods
    public void updateMdContact(String newMdContact){
        mdContact = newMdContact;
    } //updates MD's name

    public void updateMdPhone(String newMdPhone){
        mdPhone = newMdPhone;
    } //updates the MD's phone number

    public void updateAlgType(String newAlgType){
        algType = newAlgType;
    } //updates the allergy type

    public void updateIllType(String newIllType){
        illType = newIllType;
    } //updates the illness type

}

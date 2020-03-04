public class MedCond {

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

    public String getMdContact(){
        return mdContact;
    }

    public String getMdPhone(){
        return mdPhone;
    }

    public String getAlgType(){
        return algType;
    }

    public String getIllType(){
        return illType;
    }

    public void updateMdContact(String newMdContact){
        mdContact = newMdContact;
    }

    public void updateMdPhone(String newMdPhone){
        mdPhone = newMdPhone;
    }

    public void updateAlgType(String newAlgType){
        algType = newAlgType;
    }

    public void updateIllType(String newIllType){
        illType = newIllType;
    }

}

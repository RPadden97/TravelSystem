import javax.swing.*;
import java.awt.*;

public class Swing {
    private JFrame mainFrame;

    //create a constructor
    public Swing(){
        prepareGUI();
    }

    private void prepareGUI(){
        mainFrame = new JFrame("Java Swing Examples");
        mainFrame.setSize(400,400);
        mainFrame.setVisible(true);

    };

    public static void main(String[] args){
        //testcode
        Swing swingtest = new Swing();
    }

}
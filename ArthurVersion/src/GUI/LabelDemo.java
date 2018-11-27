package GUI;

import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.SwingUtilities;

/*
 * LabelDemo.java needs one other file:
 *   images/middle.gif
 */
public class LabelDemo extends JPanel {
    public LabelDemo(String[] tileStr) {
        super(new GridLayout(1,14));  //3 rows, 1 column
        JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13, label14;

        ImageIcon icon1 = createImageIcon( "image/" + tileStr[0] +".gif", "a pretty but meaningless splat");
        ImageIcon icon2 = createImageIcon( "image/" + tileStr[1] +".gif", "a pretty but meaningless splat");
        ImageIcon icon3 = createImageIcon( "image/" + tileStr[2] +".gif", "a pretty but meaningless splat");
        ImageIcon icon4 = createImageIcon( "image/" + tileStr[3] +".gif", "a pretty but meaningless splat");
        ImageIcon icon5 = createImageIcon( "image/" + tileStr[4] +".gif", "a pretty but meaningless splat");
        ImageIcon icon6 = createImageIcon( "image/" + tileStr[5] +".gif", "a pretty but meaningless splat");
        ImageIcon icon7 = createImageIcon( "image/" + tileStr[6] +".gif", "a pretty but meaningless splat");
        ImageIcon icon8 = createImageIcon( "image/" + tileStr[7] +".gif", "a pretty but meaningless splat");
        ImageIcon icon9 = createImageIcon( "image/" + tileStr[8] +".gif", "a pretty but meaningless splat");
        ImageIcon icon10 = createImageIcon( "image/" + tileStr[9] +".gif", "a pretty but meaningless splat");
        ImageIcon icon11 = createImageIcon( "image/" + tileStr[10] +".gif", "a pretty but meaningless splat");
        ImageIcon icon12 = createImageIcon( "image/" + tileStr[11] +".gif", "a pretty but meaningless splat");
        ImageIcon icon13 = createImageIcon( "image/" + tileStr[12] +".gif", "a pretty but meaningless splat");
        ImageIcon icon14 = createImageIcon( "image/" + tileStr[13] +".gif", "a pretty but meaningless splat");
        
        
        //Create the first label.
        //default: label1 = new JLabel("Image and Text", icon1, JLabel.CENTER);
        label1 = new JLabel("Image and Text", icon1, JLabel.CENTER);
        label2 = new JLabel("Image and Text", icon2, JLabel.CENTER);
        label3 = new JLabel("Image and Text", icon3, JLabel.CENTER);
        label4 = new JLabel("Image and Text", icon4, JLabel.CENTER);
        label5 = new JLabel("Image and Text", icon5, JLabel.CENTER);
        label6 = new JLabel("Image and Text", icon6, JLabel.CENTER);
        label7 = new JLabel("Image and Text", icon7, JLabel.CENTER);
        label8 = new JLabel("Image and Text", icon8, JLabel.CENTER);
        label9 = new JLabel("Image and Text", icon9, JLabel.CENTER);
        label10 = new JLabel("Image and Text", icon10, JLabel.CENTER);
        label11 = new JLabel("Image and Text", icon11, JLabel.CENTER);
        label12 = new JLabel("Image and Text", icon12, JLabel.CENTER);
        label13 = new JLabel("Image and Text", icon13, JLabel.CENTER);
        label14 = new JLabel("Image and Text", icon14, JLabel.CENTER);
        
        

        //Add the labels.
        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(label6);
        add(label7);
        add(label8);
        add(label9);
        add(label10);
        add(label11);
        add(label12);
        add(label13);
        add(label14);
    }

    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path,
                                               String description) {
        java.net.URL imgURL = LabelDemo.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    public static void createAndShowGUI(String[] tileStr) {
        //Create and set up the window.
        JFrame frame = new JFrame("Mahjong calculator"); //this is program name
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Add content to the window.
        frame.add(new LabelDemo(tileStr)); //may put string array into it

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}
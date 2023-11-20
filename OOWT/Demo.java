import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.*;
import java.awt.event.*;

/**
 * Write a description of class Demo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demo implements ActionListener
{
    // instance variables - replace the example below with your own
    private JFrame frame0;

    /**
     * Constructor for objects of class Demo
     */
    public Demo()
    {
        // initialise instance variables
        makeFrame();
        makeMenuBar();
        frame0.pack();
    }

    public void makeFrame()
    {
        frame0 = new JFrame("image viewer");
        frame0.setSize(1000,200);
        JLabel label1 = new JLabel("I am a label", JLabel.RIGHT);
        label1.setFont(new Font("times",Font.ITALIC,50));
        label1.setForeground(Color.BLUE);
        label1.setBackground(Color.YELLOW);
        label1.setOpaque(true);
        Container contentpane = frame0.getContentPane();
        
        JButton button1 = new JButton("I am going to replace the label");
        button1.addActionListener(this);
        button1.setForeground(Color.GREEN);
        button1.setFont(new Font("Elephant", Font.BOLD, 50));
        contentpane.add(label1);
        contentpane.add(button1);
        //frame0.pack();
        frame0.setVisible(true);
        
        
    }
    
    private void makeMenuBar(){
        JMenuBar mymenubar = new JMenuBar();
        frame0.setJMenuBar(mymenubar);
        // A menu is a kind of container, you can add as many objects as u would like however
        JMenu myfile = new JMenu("File");
        mymenubar.add(myfile);
        JMenuItem menuItem1 = new JMenuItem("Open");
        myfile.add(menuItem1);
        menuItem1.addActionListener(this);
        JMenuItem menuItem2 = new JMenuItem("Reopen PDF");
        myfile.add(menuItem2);
        JMenuItem menuItem3 = new JMenuItem("Create PDF");
        myfile.add(menuItem3);
        JMenu myEdit = new JMenu("Edit");
        JMenuItem menuItem4 = new JMenuItem("view");
        mymenubar.add(menuItem4);
        mymenubar.add(myEdit);
        JMenu myMore = new JMenu("More");
        myEdit.add(myMore);
        JMenuItem menuItem5 = new JMenuItem("Open");
        myMore.add(menuItem5);
        JMenuItem menuItem6 = new JMenuItem("Reopen");
        myMore.add(menuItem6);
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();
        if (command == "Open"){
            System.out.println("The file is opened");
        }
        
        
    }
}

// java Program to create a simple JList 

import javax.swing.*;
class solve extends JFrame
{   
    static JFrame f; 
    static JList b;

    public static void main(String[] args)
    {
        //create a new frame
        f = new JFrame("frame");

        solve s=new solve();        //create a object

        JPanel p =new JPanel();

        JLabel l= new JLabel("select the day of the week");

        String week[]= { "Monday","Tuesday","Wednesday",
                "Thursday","Friday","Saturday","Sunday"};

        //create list
        b= new JList(week);

        //set a selected index
        b.setSelectedIndex(2);

        //add list to panel
        p.add(b);

        f.add(p);

        //set the size of frame 
        f.setSize(400,400);

        f.show();
    }
} 

// java Program to create a checkbox with a icon . 
import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
class solve extends JFrame { 
 
	static JFrame f; 

	public static void main(String[] args){ 
  
		// create a new frame 
		f = new JFrame("frame"); 

		// set layout of frame 
		f.setLayout(new FlowLayout()); 

		// create checkbox 
		JCheckBox c1 = new JCheckBox("checkbox with image", new ImageIcon("f:/gfg.jpg"), true); 
		JCheckBox c2 = new JCheckBox("checkbox 2"); 

		// create a new panel 
		JPanel p = new JPanel(); 

		// add checkbox to panel 
		p.add(c1); 
		p.add(c2); 

		// add panel to frame 
		f.add(p); 

		// set the size of frame 
		f.setSize(300, 300); 

		f.show(); 
	} 
} 

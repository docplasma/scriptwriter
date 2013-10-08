package rundown;
import java.awt.Container;

import javax.swing.JFrame;

public class RundownGUI extends JFrame {
	
	public RundownGUI() {
		super("Rundown");
		String rundown = "Nightly_9-17-19";
		StoriesList stories = new StoriesList(rundown);
		setBounds(100,100,300,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.add(stories);
		stories.setOpaque(true);
		this.pack();
		setVisible(true);
	}

}

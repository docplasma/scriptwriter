import java.awt.Container;
import javax.swing.JFrame;


public class Rundown extends JFrame {
	
	StoriesList stories = new StoriesList();
	Rundown() {
		super("Rundown");
		setBounds(100,100,300,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.add(stories);
		stories.setOpaque(true);
		this.pack();
		setVisible(true);
	}

}

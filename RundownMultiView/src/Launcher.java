import javax.swing.JFrame;

import com.docplasma.rundownmultiview.gui.RundownView;


public class Launcher {

	public static void main(String args[]) {
		JFrame frame = new JFrame();
		frame.add(new RundownView());
		frame.pack();
		frame.setVisible(true);
	}
	
}

package rundown;

import javax.swing.JTable;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import data.Rundown;
import database.RundownTableDriver;


public class RundownDataLoadWorker extends SwingWorker<TableModel, TableModel>{	
	
	//-----Constructors
	public RundownDataLoadWorker() {
		
	}
	
	public RundownDataLoadWorker(JTable table) {
		
	}

	@Override
	protected TableModel doInBackground() throws Exception {
		Rundown rundown = new Rundown();
		
		//TODO Create rundown table driver and getRundown 
	
		RundownTableDriver driver = new RundownTableDriver();
		
		DefaultTableModel tableModel = new DefaultTableModel(rundown.getRows(),rundown.getColumnNames());
		
		return tableModel;
	}
	
}



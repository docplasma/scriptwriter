package com.docplasma.rundownmultiview.gui;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class RundownView extends JPanel {

	
	//-----Data
	Object[][] data = {
            {"SQUEEZE", "PKG", ""},
            {"OPEN", "LIVE", ""},
            {"TROYTAILGATE", "PKG", ""},
            {"DODGEBALL", "PKG", ""},
            {"PINGPONG", "PKG", ""},
            {"STATE", "LIVE", ""},
            {"TEASE", "PKG", ""},
            {"TOSSTOGLOBAL", "LIVE", ""},
            {"WILDFIRES", "PKG", ""},
            {"SYRIA", "PKG", ""},
            {"TOSSFROMGLOBAL", "LIVE", ""},
            {"TOSSTOSPORTS", "LIVE", ""},
            {"FOOTBALL", "PKG", ""},
            {"SOCCER", "PKG", ""},
            {"CROSSCOUNTRY", "PKG", ""},
            {"ITSTTIME", "PKG", ""},
            {"TOSSTONEWS", "LIVE", ""},
            {"TEASE2", "PKG", ""},
            {"TOSSTOWEATHER", "LIVE", ""},
            {"WEATHER", "PKG", ""},
            {"TOSSTONEWS", "LIVE", ""},
            {"TTALK", "PKG", ""},
            {"CLOSE", "LIVE", ""}
        };
	String[] columnNames = {"Story", "Type", "Note"};
	
	public RundownView() {
		JTable rundownTable = new JTable(data, columnNames);
		rundownTable.setPreferredScrollableViewportSize(new Dimension(500,1080));
		rundownTable.setFillsViewportHeight(true);
		JScrollPane tableScrollPane = new JScrollPane(rundownTable);
		add(tableScrollPane);
	}
	
}

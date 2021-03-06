//Sam Wang
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SpiqueInteractive extends JFrame implements ActionListener{
//LOAD/INITIALIZE.=======================================================================
 	SIPanel gui;
	javax.swing.Timer frameupdater=new javax.swing.Timer(1000/80,this);
	
	public SpiqueInteractive(){
		super("Spique Interactive");
		gui=new SIPanel();
		gui.setPreferredSize(new Dimension(1024,768));
		gui.setLocation(0,0);
		//setIconImage(icon); //Sets the JFrame icon.
		add(gui);
		pack(); //Resizes window so that all panels are at their preferred size.
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		frameupdater.start();
	}
//ACTION PERFORMED.======================================================================
	public void actionPerformed(ActionEvent evt){
		gui.repaint(); //Repaint here as updating is disabled on pause.
	}
	
	public static void main(String[]args){
		SpiqueInteractive frame=new SpiqueInteractive();
	}
}
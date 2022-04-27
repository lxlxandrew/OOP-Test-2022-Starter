package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{

	//creating array list for nematode object
	ArrayList<Nematode> nematode = new ArrayList<Nematode>();

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
		}		
	}


	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();				
	}
	

	public void loadNematodes()
	{
		Table nematodeTable = loadTable("nematode.csv", "header");
        for(TableRow rows:nematodeTable.rows())
        {
            Nematode newNema = new Nematode(rows);
            nematode.add(newNema);
        }
	}


	public void draw()
	{	
	}
}

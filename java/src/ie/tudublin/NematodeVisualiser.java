package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{
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
		loadNematodes();			
	}
	

	//creating array list for nematode object
	ArrayList<Nematode> nematode = new ArrayList<Nematode>();

	public void loadNematodes()
	{
		//loading the csv file and adding to array list
		Table nematodeTable = loadTable("nematodes.csv", "header");
        for(TableRow rows:nematodeTable.rows())
        {
            Nematode newNema = new Nematode(rows);
            nematode.add(newNema);
        }
	}

	public void draw()
	{	
		//for loop for nematodes?
		for(Nematode nema:nematode){

			noFill();
			stroke(255);
			circle(200, 200, 50);
			circle(200, 250, 50);
			circle(200, 300, 50);
			circle(200, 350, 50);
			circle(200, 350, 25);

		}
		//if statments for eyes and limbs and gender

		
		
		
	}
}

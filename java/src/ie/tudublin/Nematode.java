package ie.tudublin;

import processing.data.TableRow;

public class Nematode {
    
    //declaring variables
    private String nemaName;
    private int nemaLength;
    private boolean nemaLimbs;
    private String nemaGender;
    private boolean nemaEyes;

    //constructor
    public Nematode(String nemaName, int nemaLength, boolean nemaLimbs, String nemaGender, boolean nemaEyes) {
        this.nemaName = nemaName;
        this.nemaLength = nemaLength;
        this.nemaLimbs = nemaLimbs;
        this.nemaGender = nemaGender;
        this.nemaEyes = nemaEyes;
    }

    //accessor methods -- GET METHODS
    public String getName()
    {
        return nemaName;
    }

    public int getLength()
    {
        return nemaLength;
    }

    public boolean getLimbs()
    {
        return nemaLimbs;
    }

    public String getGender()
    {
        return nemaGender;
    }

    public boolean getEyes()
    {
        return nemaEyes;
    }


    //accessor methods -- SET METHODS
    public void setName(String nemaName)
    {
        this.nemaName = nemaName;
    }

    public void setLength(int nemaLength)
    {
        this.nemaLength = nemaLength;
    }

    public void setLimbs(boolean nemaLimbs)
    {
        this.nemaLimbs = nemaLimbs;
    }

    public void setGender(String nemaGender)
    {
        this.nemaGender = nemaGender;
    }

    public void setEyes(boolean nemaEyes)
    {
        this.nemaEyes = nemaEyes;
    }


    //toString methods
    public String toString()
    {
        return "Nematode [Name: " + nemaName 
                + " Length: " + nemaLength 
                + "Limbs: " + nemaLimbs 
                + " Gender: " + nemaGender 
                + " Eyes : " + nemaEyes 
                + "]";
        
    }

    //a constructor that takes a TableRow parameter 
    //from the Processing library as a parameter
    public Nematode(TableRow rows)
    {      
        nemaName = rows.getString("name");
        nemaLength = rows.getInt("length");
        nemaLimbs = (rows.getInt("limbs") == 1);
        nemaGender = rows.getString("gender");
        nemaEyes = (rows.getInt("eyes") == 1);
        
    }

}

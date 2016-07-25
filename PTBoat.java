package com.tiy.ptboat;

public class PTBoat {

     int location;
    
    
    
    
    
    public PTBoat(int location) 
    {
        this.location = location;
      
    }
    
    public boolean amIHit(int column)
    {
    	return (column == location);
    }
    
    
}


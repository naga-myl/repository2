package net.inheritance;

public class Laptop extends  ComputerInheritance {
 
	
	 String color="";
	
	Laptop(String name, int modelnumber, String series,String color) 
	{
		
		super(name, modelnumber, series);
		// TODO Auto-generated constructor stub
		  this.color=color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
  public void colorselection(String color)
  {
	  
	  System.out.println("the color choosen is :" +color);
  }
	
	
  @Override
  public String toString()
  {
	  return "Laptop[name= "+getName()+" ,modelnumber= "+getModelnumber()+", Series= "+getSeries()+", color: "+this.color+"]";
	  
  }
}

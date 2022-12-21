package net.inheritance;

public class ComputerInheritance {

	private String name="";
	private int modelnumber=1345;
	private String series="";
	
	 ComputerInheritance(String name,int modelnumber,String series)
	
	{
		this.setName(name);
		this.setModelnumber(modelnumber);
		this.setSeries(series);
	 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getModelnumber() {
		return modelnumber;
	}

	public void setModelnumber(int modelnumber) {
		this.modelnumber = modelnumber;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}
     public void GetModelNumber(int modelnumber)
     {
    	 System.out.println("the model number is :" +modelnumber);
    	 
     }
	
     public void GetModelName(String name)
     {
    	 System.out.println("the model name is :" +name);
    	 
     }
 	
	  @Override
	  public String toString()
	  {
		  return "Smartphone[name= " +name+" ,modelnumber= "+modelnumber+", Series= "+series+"]";
		  
	  }
	}



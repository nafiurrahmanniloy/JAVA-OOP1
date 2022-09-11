public class Box
{
	private double height;
    private double width;
    private double length;
	private double volume;
    
    public void setHeight(double h)
	{
		height = h;
	}
    
    public double getHeight()
	{
		return height;
	}

    public void setLength(double l)
	{
		length = l;
	}
    
    public double getLength()
	{
		return length;
	}	

    public void setWidth(double w)
	{
		width = w;
	}
    
    public double getWidth()
	{
		return width;
	}		
	
	public double showVolume()
	{
		volume = height*width*length;
		return volume;
	}
	
	public static void main(String [] args)
	{
		Box b = new Box();
		b.setHeight(20);
		b.setWidth(20);
		b.setLength(20);
		
		
		System.out.println("Height is : "+ b. getHeight());
		System.out.println("Length is : "+ b. getLength());
		System.out.println("Width  is : "+ b. getWidth());
		System.out.println("Volume is : "+ b. showVolume());
	}
}
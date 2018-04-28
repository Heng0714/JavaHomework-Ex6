

public class Rectangular implements Shape {

	private int length;
	private int width;

	Rectangular(int length , int width){
		this.length=length;
		this.width=width;
		
	}
	
	
	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int computeArea() {
		
		return length*width;
	}

	
	public int computeCircumference() {
		
		return (length+width)*2;
	}
	
	public static void main (String[]args) {
		Rectangular fo = new Rectangular(4,6);
			
		System.out.println(fo.computeArea());
		System.out.println(fo.computeCircumference());
			
				
	}
}

package oops;

public class ComplexNumbers {
	
	private int real;
    private int imaginary;
    
	public ComplexNumbers(int real, int imaginary){
        this.real= real;
        this.imaginary = imaginary;
    }
	
	public void plus(ComplexNumbers c2){
        this.real= this.real + c2.real;
        this.imaginary= this.imaginary + c2.imaginary;
    }

	public void multiply(ComplexNumbers c2){
		int part1f = this.real * c2.real;
		int part1s = this.imaginary * c2.real;
		int part2f = this.real * c2.imaginary;
		int part2s = this.imaginary * c2.imaginary;
		
		this.real = part1f - part2s;
		this.imaginary = part1s + part2f;
    }
    
    public void print(){
        System.out.println(real + " i"+ imaginary);
    }
}

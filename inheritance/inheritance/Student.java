package inheritance;

public class Student extends Person {
	void fun() 
    { 
        System.out.print("student class"); 
    } 
    void display() 
    { 
        fun(); 
        super.fun(); 
    } 
}

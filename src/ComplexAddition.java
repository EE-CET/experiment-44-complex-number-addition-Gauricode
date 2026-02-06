import java.util.Scanner;

class Complex {
    int real,newReal; 
    int img,newImg;

	Complex(int real,int img){
		this.real=real;
		this.img=img;
	}
	Complex add(Complex other){
		newReal=this.real+other.real;
		newImg=this.img+other.img;
		return new Complex(newReal,newImg);
	}
    // TODO: parameterized constructor Complex(int real, int imag)

    // TODO: Method to add two complex numbers: add(Complex other) returning new Complex
    // Or static method add(Complex c1, Complex c2)
}

public class ComplexAddition {
    public static void main(String args[]){
        // TODO: Read real1, imag1
        // TODO: Read real2, imag2
        Scanner sc=new Scanner(System.in);
	int real1=sc.nextInt();
	int img1=sc.nextInt();
	int real2=sc.nextInt();
	int img2=sc.nextInt();
	Complex c1=new Complex(real1,img1);
	Complex c2=new Complex(real2,img2);
	Complex sum=c1.add(c2);
	System.out.println(sum.real+" + "+sum.img+"i");
	
        // TODO: Create two Complex objects
        
        // TODO: Add them
        
        // TODO: Print result in "real + imagi" format (e.g., "6 + 8i")
    }
}

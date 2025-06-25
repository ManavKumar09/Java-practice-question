import java.util.*;
class Complex{
    int real;
    int imag;

    public Complex(int r, int i){
        real = r;
        imag = i;
    }

    public static Complex add(Complex a, Complex b){
        return new Complex(a.real + b.real, a.imag+b.imag);
        
    }

    public static Complex subtract(Complex a, Complex b){
        return new Complex(a.real-b.real,a.imag-b.imag);
    }

    public void printComplex(){
        if(real == 0 && imag != 0){
            System.out.println(imag + "i");
        } else if(real != 0 && imag == 0){
            System.out.println(real);
        }else{
            System.out.println(real+ "+" + imag + "i");
        }
    }
}

public class complexnumber {
    public static void main(String[] args) {
        Complex a = new Complex (5,3);
        Complex b = new Complex(4,5);
        Complex c = Complex.subtract(a,b);
        c.printComplex();
    }
}

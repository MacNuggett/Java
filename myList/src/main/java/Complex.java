public class Complex {

    double real;
    double image;
    Complex(){}


    Complex(double real, double image){
        this.real = real;
        this.image = image;
    }

    void print(){
        if (image == 0)
            System.out.println(+real);
        else if(image > 0 && image != 1.0)
            System.out.println(+real+"+"+image+"i");
        else if(image == 1.0)
            System.out.println(+real+"+i");
        else if (image < 0)
            System.out.println(+real+image+"i");
    }

    double getReal(){
        return real;
    }

    double getImage(){
        return image;
    }

    double abs() {
        return Math.sqrt(real*real+image*image);
    }
    double argument() {
        return Math.toDegrees(Math.atan(image/real));
    }
    public static Complex sum(Complex a, Complex b){
        return new Complex(a.real + b.real, a.image + b.image);
    }
    public static Complex diff(Complex a, Complex b){
        return new Complex(a.real - b.real, a.image - b.image);
    }
}

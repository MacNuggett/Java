public class main {
    public static void main(String[] args){
        myList<Complex> A = new myList<Complex>();
        Complex a1 = new Complex(2,3);
        Complex a2 = new Complex(5,7);
        Complex a3 = new Complex(9,-1);
        Complex a4 = new Complex(0,0.5);
        Complex a5 = new Complex(7,8);
        Complex a6 = new Complex(5,6);
        A.addToEnd(a1);
        A.addToEnd(a2);
        A.addToEnd(a3);
        A.addToEnd(a4);
        A.addToEnd(a5);
        boolean b1 = A.FindElement(a3);
        boolean b2 = A.FindElement(a6);
        System.out.println("Searching for Complex(9,-1): "+b1);
        System.out.println("Searching for Complex(5,6): "+b2);
    }
}

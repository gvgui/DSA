package Recursion.Implementation;
public class recursion1 {

    public static int fact(int n) {
        if(n==0) 
            return 1;
        else 
            return n * fact(n-1);
    }
    public static void main(String[] args) {
        int x = 0;
        int y = 3;
        int z = 5;

        System.out.println("Should be 1:");
        System.out.println("The factorial of " + x + " is: " + fact(x) );
        System.out.println("--------------------------------------");
        System.out.println("Should be 6:");
        System.out.println("The factorial of " + y + " is: " + fact(y) );
        System.out.println("--------------------------------------");
        System.out.println("Should be 120:");
        System.out.println("The factorial of " + z + " is: " + fact(z) );
    }
}

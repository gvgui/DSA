public class recursion3 {
    
    private static int sumOfAllNumbers(int n) {
        int m = n;
        if (n < 0) {
            n = n * -1;
        }
        if(n == 0) {
            return n;
        } else {
            n = n + sumOfAllNumbers(n - 1);
        }
        if (m < 0) {
            n = n * -1;
        }
        return n;
    }
    public static void main(String[] args) {
        int test1 = sumOfAllNumbers(0);
        int test2 = sumOfAllNumbers(2);
        int test3 = sumOfAllNumbers(10);
        int test4 = sumOfAllNumbers(-3);
        System.out.println("Answer should be 0:");
        System.out.println("The sum of all numbers from 0 to 0 is " + test1);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Answer should be 3:");
        System.out.println("The sum of all numbers from 0 to 2 is " + test2);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Answer should be 55:");
        System.out.println("The sum of all numbers from 0 to 10 is " + test3);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Answer should be -6:");
        System.out.println("The sum of all numbers from -3 to 0 is " + test4);
    }
}

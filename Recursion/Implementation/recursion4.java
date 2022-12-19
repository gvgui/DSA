public class recursion4 {

    private static void recursiveCalls(String name, int n) {
        System.out.println(name + " has called themselves " + n + " time(s)");
        if(n <= 0) {
            return;
        } recursiveCalls(name, n - 1);
    }
    public static void main(String[] args) {
        recursiveCalls("Gabbie", 5);
        recursiveCalls("Rachel", 4);
        recursiveCalls("test", 0);
    }    
}

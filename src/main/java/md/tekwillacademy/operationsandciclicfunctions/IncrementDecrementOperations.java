package md.tekwillacademy.operationsandciclicfunctions;
public class IncrementDecrementOperations {
    public static void main(String[] args) {
        int a = 5 ;

        // Increment
        a++;
        System.out.println("Value after increment: " + a);

        // Increment pre fixed
        ++a; // a=7
        int b = ++a; // b = 8, a = 8 ;
        int a1 = a;
        int c = a++; // c =8 a=9;
        System.out.println("The value after increment pre fixed is: " +a);
        System.out.println("Afiseaza b " + b + " a1= " +a1 + " c=" + c + " a2=" + a);

        //Decrement
        a--;
        System.out.println("The value after decrement is: " + a);

        //Decreement pre fixed
        --a;
        System.out.println("The value after decrement prefixed is: " +a);



    }
}

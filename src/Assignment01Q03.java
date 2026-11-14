public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0])
        System.out.println("The first " + x + " Fibonacci numbers are:");

        ////////////////////////////////////////////////////////////////
        // TODO: Replace this code with the correct Fibonacci sequence
        ////////////////////////////////////////////////////////////////
        /// ...
        
        int numOdd = 0;
        int prev2 = 1;
        int prev1 = 1;
        for (int i = 0; i < x; i++) {
            if (i < 2) {
                System.out.println(1);
            } else {
                int newTerm = prev2 + prev1;
                numOdd += (newTerm % 2);
                prev2 = prev1;
                prev1 = newTerm;
                System.out.print(newTerm);
            }
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}

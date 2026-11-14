public class Assignment01Q02 {
    private static double nth_term(int n) {
        double result = 1.0 / (2*n + 1);

        return (n % 2 == 0) ? result : -1 * result;
    }

    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;

        /////////////////////////////////////////////
        // TODO: Fill in the Pi approxiamtion here
        /////////////////////////////////////////////
        /// ...
        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            approxPi += nth_term(i);
        }
        
        approxPi *= 4;
        /////////////////////////////////////////////
        
        System.out.println(approxPi + " " + actualPi);
    }
}

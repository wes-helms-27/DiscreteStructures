/**
 * DiscreteMath
 * A class that has algorithms that are used within discrete mathematics
 *
 * @Author Wes Helms
 * @Version 4/23/24
 */
public class DiscreteMath {
    //instance variables


    /**
     * gcd
     * finds the greatest common divisor among a and b by recursively
     * implementing the Euclidean algorithm on a and b
     *
     * @param a     int the first number (must be greater than b)
     * @param b     int the other number
     * @param print boolean if true prints every step to the console
     * @return the gcd of a and b or -1 if invalid inputs
     */
    public static int gcd(int a, int b, boolean print) {
        /*
         * The Euclidean algorithm is the following:
         * a = b * q + r
         */

        //checks if the method was called appropriately
        if (!(a > b)) {
            return -1;
        }

        //calculates the quotient and remainder
        int q = Math.floorDiv(a, b);
        int r = a - (b * q);

        //
        if (print) {
            System.out.println(a + " = " + b + " * " + q + " + " + r);
        }

        //
        if (r != 0) {
            return gcd(b, r, print);
        } else {
            return b;
        }

    } //gcd(a,b)

    /**
     * linearCombination
     *
     * @param a     int the first number (must be greater than b)
     * @param b     int the other number
     * @param print boolean if true prints every step to the console
     * @return an array of ints of size 2 which contain the x and y values
     * that combine to make the gcd of a, b
     */
    public static int[] linearCombination(int a, int b, boolean print){
        int gcd = gcd(a,b,print);

        return new int[]{0};
    }

}

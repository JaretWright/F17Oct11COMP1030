package f17oct11comp1030;

/**
 *
 * @author JWright
 */
public class OddAndEven {
    public static void main(String[] args)
    {
        for (int count=1; count<=100; count += 9)
        {
            System.out.printf("%n%3d. ", count);
            
            if (isEven(count))
                System.out.print("even");
            else
                System.out.print("odd");
        }
    }
    
    public static boolean isEven(int numToAssess)
    {
        return numToAssess % 2 == 0;
    }
}

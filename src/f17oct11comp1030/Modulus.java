package f17oct11comp1030;

/**
 *
 * @author JWright
 */
public class Modulus {
    public static void main(String[] args)
    {
        System.out.printf("5/2 = %d%n", 5/2);
        System.out.printf("5%%2 = %d%n", 5%2);
        
        fizzBuzz();
    }
    
    public static void fizzBuzz()
    {
        for (int count =1 ; count <=100; count++)
        {
            System.out.printf("%n%3d. ", count);
            
            //check if divisible by 3
            if (count % 3 == 0)
                System.out.printf("Fizz");
            
            //check if divisible by 5
            if (count % 5 == 0)
                System.out.printf("Buzz");
        }
    }
}

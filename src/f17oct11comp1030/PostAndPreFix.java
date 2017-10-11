package f17oct11comp1030;

/**
 *
 * @author JWright
 */
public class PostAndPreFix {
    public static void main(String[] args)
    {
        int count = 5;
        
        //demostrate a postfix increment
        System.out.printf("count before post-increment: %d%n", count);
        System.out.printf("    post-incrementing count: %d%n", count++);
        System.out.printf(" count after post-increment: %d%n", count);
        
        //demostrate a prefix increment
        System.out.printf("%n%ncount before pre-increment: %d%n", count);
        System.out.printf("    pre-incrementing count: %d%n", ++count);
        System.out.printf(" count after pre-increment: %d%n", count);
    }
}

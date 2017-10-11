package f17oct11comp1030;

/**
 *
 * @author JWright
 */
public class LoopWarmUp {
    public static void main(String[] args)
    {
        int count = 1;
        
        while (count <= 10)
        {
            System.out.println(count);
            count++;
        }
        
        forLoopExample();
        doWhileLoopExample();
    }
    
    public static void doWhileLoopExample()
    {
        System.out.printf("%n%nInside the doWhileExample%n");
        int count=1;
        do
        {
            System.out.printf("%2d.%n", count++);
        } while (count <= 10);
    }
    
    
    public static void forLoopExample()
    {
        System.out.printf("%n%nInside the forLoopExample%n");
        for (int count=1; count <=10; count++)
        {
            System.out.printf("%2d.%n", count);
        }
    }
}

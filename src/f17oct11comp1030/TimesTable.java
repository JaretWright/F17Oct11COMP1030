package f17oct11comp1030;

/**
 *
 * @author JWright
 */
public class TimesTable {
    public static void main(String[] args)
    {
        for (int x=1; x<=12; x++)
        {
            for (int y=1 ; y<= 12; y++)
            {
                System.out.printf("%4d", x*y);
            }   //end of y loop
            
            System.out.println();
        } //end of x loop
        
    }   //end of main method
}   //end of class

/**
 *
 * @author user
 */
public class GoTooFar {
    
    public static void main(String[] args)
    {
        int [] integer = { 10,20,30,40,50 };
        
        try
        {
        for (int x=0; x<6; ++x)
        {
            System.out.println(integer[x]);
        }
    }

    catch(ArrayIndexOutOfBoundsException mistake)
    {
        System.out.println("Now You've gone too far.");
    }
}
}
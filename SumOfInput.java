/**
 * Sum of numbers 1 to n
 *
 * @author (April Howard)
 * @version (02/05/2020)
 */
public class SumOfInput
{
    
    // instance variables - replace the example below with your own
    
   public int num;
   
    
    /**
     * Constructor for objects of class SumOfInput
     */
    public SumOfInput()
    {
        // initialise instance variables
        num = 0;
      
    }
        
    public Integer oneToNumber(Integer numberToSum){
        int b = 0;
        
        for (int i = 1; i <= numberToSum; i++) {
        b += i; 
        
    }
    
        return b;
    }
}

import javax.swing.JOptionPane;

public class Loops
{
    public static void main ( String[] args )
    {
        int sumOdd;
        int sumEven;
        int oddNumber;
        int evenNumber;

        sumOdd = 0;
        sumEven = 0;
        oddNumber = 1;
        evenNumber = 2;
        
        while ( oddNumber <=25 )    
        {
      sumOdd += oddNumber;
      oddNumber +=2;
        }   

        System.out.printf ("The sum of odd number is %d\n", sumOdd);    
        
        while ( evenNumber <= 50 )
        {
      sumEven += evenNumber; 
      evenNumber +=2;
        }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numcheck;

/**
 *
 * @author LK
 */
public class NumberChecker {
    public static String checkNumber(int number){
        if (  (number % 3) == 0 ) {
            return "FIZZ";
        } else if (  (number % 5) == 0 ) {
            return "FUZZ";
        }
        
        
        return "nothing";
        
    }
    
    public static void multiplyTable(int start, int end, int coefficient){
        for (int i = start; i <= end; i++) {
            System.out.println(i + ") " + coefficient * i );
        }
    } 
    
    public static void divisionTable(int start, int end, double doubleDivisor) {
        for (int i = start; i <= end; i++) {
            System.out.println(i + " / "  + doubleDivisor + " = " + i/doubleDivisor);
         }
         
    } 
    
    
    
    
    
    
    
    
}

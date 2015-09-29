import java.util.*;

/**
 *
 * @author jeffe_000
 */
public class Lab05 {
    
    static String A;
    static String B;
    static String C;

    static Scanner READ = new Scanner(System.in);
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        
        
        inputNumbers();
        convertArrays();
        
        
  
        
    }

    /**
     *
     */
    public static void inputNumbers(){
        
       
       
        
        System.out.print("Please input a number: ");
        A = READ.next();
        System.out.print("Please input another number: ");
        B = READ.next();
        
        
        
      

    }
    
    /**
     *
     */
    public static void convertArrays(){
        
         int[] Array1 = new int[A.length()];
         int[] Array2 = new int[B.length()];
         int[] Array3 = new int[0];
         
         int carry = 0;
         
         
         
        
        for ( int i = 0; i < A.length(); i++ ){
            
            Array1[i] = A.charAt(i) - '0';
          
        }
        
       // System.out.println(Arrays.toString(Array1));
        
        
        
        
        
        
        for (int i = 0; i < A.length() /2; i++){
            
            Array1[i] = A.charAt(i) - '0';
            
            int temp = Array1[i];
            Array1[i] = Array1[A.length() - 1 - i];
            Array1[A.length() - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(Array1));
        
        
        
        
        
        

        for ( int i = 0; i < B.length(); i++ ){
         
            Array2[i] = B.charAt(i) - '0';
          
        }
        
        //System.out.println(Arrays.toString(Array2));
        
        
        for (int i = 0; i < B.length() /2; i++){
            
            Array2[i] = B.charAt(i) - '0';
            
            int temp = Array2[i];
            Array2[i] = Array2[B.length() - 1 - i];
            Array2[B.length() - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(Array2));
        
        for ( int i = 0; i < A.length(); i++ ){
            int sum;
            sum = A.length() + B.length();
            
            
            
            
        }
        
        
        
        
        
        

     
    
       
        
        
        
    }
        
    }
    


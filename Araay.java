package array;

import java.util.Arrays;

/**
 *
 * @author Bhavani Bhava
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char name[]={'a','b','c','d',};
        int len=name.length;
        char name1[]=name.clone();
        
        System.out.println(Arrays.toString(name1 ));
        System.out.println(len);
    }
    
}

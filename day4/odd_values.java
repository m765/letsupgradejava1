// Questions 1:
// create a class avenger with
// properties (name,age,power,weapon,planet) and with
// functions-getDetails() and displayDetails().
// create 5 objects as an array in the main method and call.

// ------------------------------------------------------------------------------------------------

package avenger;

import java.util.Scanner;
// Questions 2:
// Create an int array with 5 values and print only odd values.

// ------------------------------------------------------------------------------------------------

package odd_values;

import java.util.Scanner;

public class odd_values {

    public static void main(String[] args) {
        
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 Integer Values: ");
        
        for(int i=0; i<5; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.println("Odd Numbers are: ");
        
        for(int i=0; i<5; i++){
            if(a[i]%2!=0){
                System.out.println(a[i]+" ");
            }
            
        }
        
    }
    
}
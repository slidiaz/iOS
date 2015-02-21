/*
 *  CS312 Assignment 2.
 *  On my honor, Stephanie Li-Diaz, this programming assignment is my own work.
 *
 *  A program to print out the UT Tower in ASCII art form.
 *
 *  Name: Stephanie Li-Diaz
 *  email address: slidiaz@yahoo.com
 *  UTEID: sl34978
 *  Section 5 digit ID: 52828
 *  Grader name: Aaron Dishman  
 *  Number of slip days used on this assignment: 0
 */

public class Tower extends TowerSize {
    
    // CS312 students, DO NOT ALTER THE FOLLOWING LINE.
    public static final int SIZE = TowerSize.getSize();

    public static void main(String[] args) {
        topSection();
        midSection();
        base();

    }
    
    // Calls the methods that make up the top section of the UT tower 
    // that consists of #'s and |'s 
    public static void topSection() {
        poundSigns();
        Lines();
        poundSigns();
        System.out.println();
    }
    
    // Displays the correct number of #s in a certain number of spaces
    // in a single line h times in relation to SIZE       
    public static void poundSigns() {
        System.out.println();
        
        for (int h=1; h <= ((SIZE-2)*4)+10; h++) {
            System.out.print(" ");
        }
        
        for (int i=1; i <= SIZE*2 - 1; i++) {
            System.out.print("#");
        }      
 
    }
    // Displays the row of vertical lines X amount of times in each new line
    // depending on SIZE. 
    public static void Lines() {
        
        //height
        for (int i=1; i <= SIZE*2 -2; i++) {
            System.out.println();
        
        //The amount of spaces from the left side of top section.
        int spaces= ((SIZE-2)*4)+10;
            for (int h=1; h <= spaces; h++) {
                System.out.print(" ");
            }
            
        //the number of |'s in row
            for (int j=1; j<= SIZE*2 -1; j++) {
                System.out.print("|");  
            }  
        }
    }    
    
    // Displays the mid-part of the tower that consists of spaces and 
    // characters in a certain length for each line which depend on SIZE
    public static void midSection() {
        
        // The outer for-loop determines the height of the mid-section
            for (int h =1; h <= SIZE*SIZE; h++) {
                tildes();
                System.out.println();          
                
                int spaces= (SIZE-2)*4+8;

                for (int i=1; i <= spaces; i++) {
                    System.out.print(" ");
                }
                System.out.print("|-");
                
                for (int j=1; j<=SIZE; j++) {
                    System.out.print("O-");
                }
                System.out.print("|");
                System.out.println();                                       
            }
            
            tildes();
    }
    
    // Depending on SIZE, it displays a certain number of tildes in a row
    // in a certain number of spaces
    public static void tildes() {
            // Including spaces, this displays the last tilde line
            for (int spaces=1; spaces <= (SIZE-2)*4+8; spaces++) {
                    System.out.print(" ");
                }
            for (int i=1; i <= (SIZE-2)*2+7 ; i++) {
                    System.out.print("~");
                }
    }
              
    // Calls the 2 methods that make up the overall base    
    public static void base() {
        steps();
        foundation();
    }
    
    // The top part of the base that displays the correct number of steps using
    // spaces and the increasing number of quotes corresponding to the SIZE
    public static void steps() {
        System.out.println();
                
        int line= (SIZE/2)+1;

        for (int i= 1; i <= line; i++) {
            
            int spaces = i*-3 + line*3 ;
            
            for (int j=1; j <= spaces ; j++) {
                 System.out.print(" ");
             }
                System.out.print("/\"");
                      
            int lengthSteps = (SIZE*5 ) + (line-i)*-3; 
            
            for (int k=1; k <=  lengthSteps ; k++) {
                System.out.print("'\"");
            }
            System.out.print("\\");
            System.out.println();
        }
    }
    
    // The bottom part of the base that displays the correct number of O's 
    //and "'s in relation to the SIZE
    public static void foundation() {

        for (int i = 1; i <= SIZE; i++) {
            System.out.print("/\"");
            
            for (int j=1; j <= SIZE*5; j++) {
                System.out.print("O\"");
            }
            System.out.print("\\");
            System.out.println();
        }
    }
      
}
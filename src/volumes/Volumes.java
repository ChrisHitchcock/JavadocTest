/*
 * NAME:        Chris Hitchcock
 * DATE:        14/09/16
 * FILENAME:    Volumes.java
 * DESCRIPTION: This program calculates the volume of either a rectangular prism,
 *              sphere, or cube, based on the users choice. It gets the measurements
 *              from the user. 
 */

package volumes;

//Imports
import java.util.*;
/**
 * Chris Hitchcock - 14/09/16
 * This program calculates the volume of either a rectangular prism,
 * sphere, or cube, based on the users choice. It gets the measurements
 * from the user. 
 */
public class Volumes {
    //Variable/object declaration
    static double l, w, h, r, d, V;
    static int option;
    static Scanner kb = new Scanner(System.in);
    
    /**
     * When recPrism is called [user chose option 1] find the measurements
     * of the rectangular prism and calculate its volume.
     * pre: user selects 1
     * post: volume rectangular prism is outputted
     */
    public static void recPrism()
    {
        //Obtain the measurements of the prism
        System.out.println("Please enter the length of the prism.");
        l = kb.nextDouble();
        System.out.println("Please enter the width of the prism.");
        w = kb.nextDouble();
        System.out.println("Please enter the height of the prism.");   
        h = kb.nextDouble();
        
        //Calculate the Volume of the prism
        V=w*l*h;
        V=V*100;
        V=Math.round(V);
        V=V/100;
        
        //Output
        System.out.println("The volume of the prism is: "+V);
    }
    
    /**
     * When sphere is called [user chose option 2] find the measurements
     * of the sphere and calculate its volume.
     * pre: user selects 2
     * post: volume of sphere is outputted
     */
    public static void sphere()
    {
        //Obtain the radius of the sphere
        System.out.println("Please enter the radius of the sphere.");
        r = kb.nextDouble();
        
        //Calculate the Volume of the sphere
        d = r*2;
        V=(Math.PI*Math.pow(d, 3))/6;
        V=V*100;
        V=Math.round(V);
        V=V/100;
        
        //Output the Volume of the sphere
        System.out.println("The volume of the sphere is: "+V);
    }
    
    /**
     * When cube is called [user chose option 3] find the measurements
     * of the cube and calculate its volume.
     * pre: user selects 3
     * post: volume of cube is outputted
     */
    public static void cube()
    {
        //Obtain the length of the sides of the cube
        System.out.println("Please enter the length of each side.");
        l = kb.nextDouble();
        
        //Calculate the Volume of the cube
        V = Math.pow(l,3);
        V=V*100;
        V=Math.round(V);
        V=V/100;
        
        //Ouput
        System.out.println("The volume of the cube is: "+V);
    }
    /**
     * Get the selection from the user; rectangular prism, sphere or cube
     * @param args
     */
    public static void main(String[] args) {
        //Ask whether user wants the volume of a Rec. Prism, Sphere or Cube
        System.out.println("Find the Volume of a...?");
        System.out.println("1. Rectangular Prism\n2. Sphere\n3. Cube");
        option=kb.nextInt();
        
        //Choose the method based on the previous selection
        switch(option)
        {
            case 1:recPrism();break;
            case 2:sphere();break;
            case 3:cube();break;
        }
        
    }
    
}

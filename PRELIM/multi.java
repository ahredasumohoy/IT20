/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRELIM;

/**
 *
 * @author Admin
 */
public class multi {
    public static void main (String[]args){
        int marks[][] = {
            {19, 18, 06},
            {07, 31, 07},
            {05, 01, 07}
        };
        
        for(int i = 0; i<marks.length; i++){
           for(int j = 0; j<marks[i].length; j++){ 
            System.out.print(marks[i][j]+ " ");
        }
           System.out.println();
        }
    }
   
    
}

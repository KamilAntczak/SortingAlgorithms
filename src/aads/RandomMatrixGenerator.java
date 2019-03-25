/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aads;
import java.util.Random;

/**
 *
 * @author Kamil
 */
public  class RandomMatrixGenerator {
    
    
    public int[] generator(int range){
        
        int[] matrix = new int[range];
        Random rand = new Random();
        
        for(int i=0; i<range; i++){
            
            matrix[i] = i;
        }
        
        for(int i=0; i<range; i++){
            
            
            int r1 = rand.nextInt(range);
           
            int temp= matrix[r1];
            
            int r2 = rand.nextInt(range);
                                               
            matrix[r1] = matrix[r2];
            matrix[r2] = temp;
        }  
        
        
        
        return matrix;
    }
    
}

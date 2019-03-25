/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aads;

/**
 *
 * @author Kamil
 */
public class CocktailSort {
    
    public int[] cocktail(int matrix[]){
        
        boolean flag = true;
        int start = 0;
        int end = matrix.length;
        
        
        while(flag){
            
            flag = false;
            
            
            for(int j=start; j < end-1 ; j++)
                if(matrix[j+1] < matrix[j]){
                    
                    int temp = matrix[j];
                    matrix[j] = matrix[j+1];
                    matrix[j+1] = temp; 
                    flag = true;
                }
            
            if(flag == false)
                break;
            
            flag = false;
            end = end-1;
            
            
            for(int j=end-1 ; j > start-1 ; j--)
                if(matrix[j+1] < matrix[j]){
                    
                    int temp = matrix[j];
                    matrix[j] = matrix[j+1];
                    matrix[j+1] = temp; 
                    flag = true;
                }
            
            start = start + 1;
            
        }
        
        return matrix;
    }
    
}

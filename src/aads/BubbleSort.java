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
public class BubbleSort {
    
    
    public int[] bubbleSort(int[] matrix){
        
        int n = matrix.length;
        
        for(int i=0 ; i<n-1; i++)
            for(int j=0; j < n-1; j++)
                if(matrix[j+1] < matrix[j]){
                    
                    int temp = matrix[j];
                    matrix[j] = matrix[j+1];
                    matrix[j+1] = temp;                    
                }                                  
        
        return matrix;
    }
    
    
}

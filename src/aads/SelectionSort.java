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
public class SelectionSort {
    
    public int[] selection(int matrix[]){
        
        int n = matrix.length;
        
        for(int i=0 ; i < n; i++){
            
            int temp = matrix[i];
            
            for(int j=i+1; j < n ; j++){
                
                if(matrix[j] < temp){
                    
                    int temp1 = temp;
                    temp = matrix[j];
                    matrix[j] = temp1;
                }
                
            } 
            matrix[i] = temp;
        }
        
        return matrix;
    }
    
}

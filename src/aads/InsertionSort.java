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
public class InsertionSort {
    
    
    public int[] insertion(int[] matrix){
        
        int n = matrix.length;
        
       for(int i=1; i<n; ++i){
           int k = matrix[i];
           int j = i-1;
           
           while( j >= 0 && matrix[j] > k){
               matrix[j+1] = matrix[j];
               
               j=j-1;
           }
           
           matrix[j+1] = k;
           
       }
       
       return matrix;
    }
}

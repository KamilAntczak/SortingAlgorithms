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
public class PritnArray {
    
    public void pritnArray(int matrix[]){
        
        for( int i = 0; i < matrix.length; i++){
            System.out.print(" " + matrix[i]);
        }
    }
    
    public void pritnArray(String words[]){
        
        for( int i = 0; i < words.length; i++){
            System.out.print(" " + words[i]);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aads_words;

import java.util.Random;

/**
 *
 * @author Kamil
 */
public class TxtReader {
    
    public String[] wordBank(int wordNumber){
        
        Random rand = new Random();
        String[] wordBank = new String[wordNumber];
        
        for(int i=0; i < wordNumber; i++){
            
            for(int j=0; j < rand.nextInt(10)+1 ; j++ ){
            
                int ascii = rand.nextInt(24)+97;
                if(wordBank[i] == null)
                    wordBank[i] = new StringBuilder().append("").append((char)ascii).toString();
                else
                wordBank[i] = wordBank[i] + (char)ascii;
            }
            
        }
                            
        return wordBank;
    }
    
}

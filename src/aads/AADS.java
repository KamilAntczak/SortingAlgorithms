/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aads;
import aads_words.TxtReader;
/**
 *
 * @author Kamil
 */
public class AADS {
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       InsertionSort insertion = new InsertionSort();
       RandomMatrixGenerator randomGenerator = new RandomMatrixGenerator();
       BubbleSort bubble = new BubbleSort();
       SelectionSort selection = new SelectionSort();
       CocktailSort cocktail = new CocktailSort();
       PritnArray printArray = new PritnArray();
       BubbleSmart bubbleSmart = new BubbleSmart();
       TxtReader txt = new TxtReader();
       
       
       int[] matrix = randomGenerator.generator(8000);
       String[] words = null;
       
       
       float startTime = System.nanoTime();
       
       words = txt.wordBank(8000);
       
       //bubble.bubbleSort(matrix);
       
       bubbleSmart.bubbleSmart(matrix);
      
       //insertion.insertion(matrix);
       
       //selection.selection(matrix);
       
       //cocktail.cocktail(matrix);
       
       
       float stopTime = System.nanoTime();       
       float executedTime = (stopTime - startTime) / 1000000000;  
       
       
       System.out.println(executedTime);
       printArray.pritnArray(words);
    }
    
}

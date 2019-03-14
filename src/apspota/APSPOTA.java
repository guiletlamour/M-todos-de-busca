/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apspota;

/**
 *
 * @author gilvaneide.santos
 */
public class APSPOTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      BubbleSort bubbleSort = new BubbleSort();
       
       int [] vetor = new int [5];
       
       for (int i =0;i<vetor.length;i++){
           vetor[i] = (int) (Math.random()*100);
       }
      
       //bubbleSort.imprime(vetor);
      // bubbleSort.Ordena(vetor);
       //bubbleSort.imprime(vetor);
      // bubbleSort.ordenadoSN(vetor);
      
     InsertionSort insertion = new InsertionSort();
       
     //  insertion.imprimeVetor(vetor);
      // insertion.Ordena(vetor);
      // insertion.imprimeVetor(vetor);
      
     HeapSort heap = new HeapSort();
     
    // heap.imprime(vetor); // mostra vetor sem arrumar 
    // heap.heapSort(vetor); // mostra quantas vezes o metodo é chamando pra ordenar
   //  heap.imprime(vetor); // mostra vetor arrumado
   
   Quicksort quick = new Quicksort();
   
     // quick.imprime(vetor);
     // quick.quickSort(vetor, 0, vetor.length-1);
     // quick.imprime(vetor);
    
    }
    
       
    }
    


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
public class HeapSort {
    
     public  void heapSort(int[] v) {
         
      int cont;
       CriaHeap(v);
        int n = v.length;

        for (int i = v.length - 1; i > 0; i--) {
            swap(v, i, 0);
            ArrumaHeap(v, 0, --n);
            
            cont = +1;
            System.out.println("Arruma" + cont);
        }
    }

    private  void CriaHeap(int[] v) {
        for (int i = v.length / 2 - 1; i >= 0; i--)
            ArrumaHeap(v, i, v.length);

    }

     private  void ArrumaHeap(int[] vetor, int troca, int tamanhoDoVetor){  

         int raiz = 2 * troca + 1, filho = raiz + 1;  
         if (raiz < tamanhoDoVetor)  
         {  

             if (filho < tamanhoDoVetor && vetor[raiz] < vetor[filho])  
                 raiz = filho;

             if (vetor[raiz] > vetor[troca])  
             {  
                 swap(vetor, raiz, troca);  
                 ArrumaHeap(vetor, raiz, tamanhoDoVetor);  
             }  
         }  
     }

    public  void swap(int[] v, int j, int aposJ) {
        int aux = v[j];
        v[j] = v[aposJ];
        v[aposJ] = aux;
    }
    
    public void imprime(int[]v){
    
    for(int i =0;i<v.length;i++){
       System.out.println("Vetor ordenado HeapSort: " + v[i] + "");
}
    }
}

    


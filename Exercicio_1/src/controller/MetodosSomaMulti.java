package controller;

public class MetodosSomaMulti {

    public int somatoriamulti (int a, int b){
        
        
       if (b == 1){ 
        return a;
       } else {
           return a + somatoriamulti(a,  b - 1); 
       }
    }
}
package controller;

public class MetodosPares {
    public int contarPares(int vt[], int i, int contador) {
        if (i < 0) {
            return contador;
        }
        if (vt[i] % 2 == 0) { 
            contador++; 
        }
        return contarPares(vt, i - 1, contador); 
    }
}
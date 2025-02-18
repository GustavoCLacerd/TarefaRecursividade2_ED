package controller;

public class MetodosFatorialDuplo {

    public int fatorialDuplo(int N) {
        if (N == 1) {
            return 1;
        }
        return N * fatorialDuplo(N - 2);
    }
}
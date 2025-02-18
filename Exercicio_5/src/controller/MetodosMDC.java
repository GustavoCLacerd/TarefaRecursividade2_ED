package controller;

public class MetodosMDC {

    public int calcularMDC(int x, int y) {
        if (x == y) {
            return x;
        }
        if (x > y) {
            return calcularMDC(x - y, y);
        }
        return calcularMDC(x, y - x);
    }
}
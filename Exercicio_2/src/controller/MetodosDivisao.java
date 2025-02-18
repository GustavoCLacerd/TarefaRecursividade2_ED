package controller;

public class MetodosDivisao {

    public int dividisubtrai(int dividendo, int divisor) {
        if (dividendo < divisor) {
            return dividendo; 
        } 
        return dividisubtrai(dividendo - divisor, divisor);
    }
}
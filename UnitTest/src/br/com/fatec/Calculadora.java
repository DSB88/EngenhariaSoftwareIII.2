package br.com.fatec;

public class Calculadora {
    private int a;
    private int b;


    public int soma(int a, int b){
        return a+b;
    }

    public int subtracao(int a, int b){
        return a-b;
    }

    public int multiplicacao(int a, int b){
        return a*b;
    }

    public int divisao(int a, int b){
        return a/b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

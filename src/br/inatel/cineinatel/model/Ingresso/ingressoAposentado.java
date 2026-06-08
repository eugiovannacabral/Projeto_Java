package Ingresso;

public class ingressoAposentado extends ingresso{
    public ingressoAposentado(sessao sessao, double valorBase) {
        super(sessao, valorBase);
    }

    @Override
    public double calcularValor() {
        return valorBase * 0.7;
    }
}
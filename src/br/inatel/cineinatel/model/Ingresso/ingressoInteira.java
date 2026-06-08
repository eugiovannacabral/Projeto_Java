package Ingresso;

public class ingressoInteira extends ingresso {

    public ingressoInteira(sessao sessao, double valorBase) {
        super(sessao, valorBase);
    }

    @Override
    public double calcularValor() {
        return valorBase;
    }
}
}
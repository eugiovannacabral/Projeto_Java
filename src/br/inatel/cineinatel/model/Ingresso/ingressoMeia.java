package Ingresso;

import Sessao.sessao;

public class ingressoMeia extends ingresso {
    public IngressoMeia(Sessao sessao, double valorBase) {
        super(sessao, valorBase);
    }

    @Override
    public double calcularValor() {
        return valorBase / 2;
    }
}
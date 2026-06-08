public abstract class Pagamento {//classe abstrata
    private double valor;
    private String dataHora;//hora do pagamento
    private String status;//status do pagamento

    public Pagamento(double valor, String dataHora) {//construtor
        this.valor = valor;//recebe o valor do pagamento
        this.dataHora = dataHora;//e a hora do pagamento
        this.status = "PENDENTE";//começa com os status do pagamento pendente
    }

    public boolean processarPagamento();//retorna true ou false para o processamento do pagamento
    public String getFormaPagamento();

    public void aprovar() {
        this.status = "APROVADO";
    }
    public void recusar() {
        this.status = "RECUSADO";
    }
    public void cancelar() {
        this.status = "CANCELADO";
    }
//criei os getters e setters
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataHora() {
        return dataHora;
    }
    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }


}
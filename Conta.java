public class Conta {
    private double saldo;
    private static int qtdClientes;
    private Cliente cliente;
    
    public Conta(double saldo, Cliente c){
        qtdClientes++;
        this.saldo = saldo;
        this.cliente = c;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public void saca(double valor){
        if(valor <= this.saldo)
            this.saldo -= valor;
        else
            System.out.println("Impossivel realizar a transacao");
    }

    public void extrato(){
        System.out.format("Saldo: %.2f R$\n", this.saldo);
    }

    public Conta(){
        qtdClientes++;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente c) {
        this.cliente = c;
    }
}

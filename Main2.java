public class Main2 {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Conta k = new Conta();

        c.setNome("Adeval");

        k.setSaldo(1000.25f);
        k.setCliente(c);

        k.deposita(100);
        k.saca(1565);
        k.saca(200);
        k.extrato();
    }
}

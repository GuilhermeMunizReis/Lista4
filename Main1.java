public class Main1 {
    public static void main(String[] args) {
        Camiseta c = new Camiseta();
        Notebook n = new Notebook();

        Produto[] p = new Produto[2];

        c.setNome("Camisa");
        c.setCor("Azul");
        c.setTamanho("P");
        c.setPreco(10.99f);

        n.setNome("Notebook");
        n.setArmazenamento(15.52f);
        n.setGpu("Amd");
        n.setProcessador("Intel I5");
        n.setPreco(2000.00f);

        p[0] = c;
        p[1] = n;

        System.out.println(p[0].etiquetaPreco());
        System.out.println(p[1].etiquetaPreco());
    }
}

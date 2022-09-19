public class Produto {
    private double preco;
    private String nome;

    public String etiquetaPreco(){
        String etiqueta = null;

        etiqueta = this.nome + "--" + this.preco;

        return etiqueta;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

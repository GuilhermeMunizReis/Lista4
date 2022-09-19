public class Camiseta extends Produto{
    private String cor;
    private String tamanho;

    @Override
    public String etiquetaPreco(){
        String etiqueta = null;

        etiqueta = this.getNome() + "--" + this.getPreco() + "--" + this.cor + "--" + this.tamanho;

        return etiqueta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}

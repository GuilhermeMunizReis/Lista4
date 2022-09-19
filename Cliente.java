public class Cliente {
    private String nome;
    private int id;
    private static int cont;

    public Cliente(String nome){
        cont++;
        this.nome = nome;
        this.id = cont;
    }
    public Cliente(){
        cont++;
        this.id = cont;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }
}

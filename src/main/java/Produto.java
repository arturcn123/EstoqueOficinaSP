public class Produto {
    private String nome;
    private double preco;
    private int codigo;
    private int contador = 1;


    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }


    public Produto(String nome, double preco, int codigo) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    } // Metodo para facilitar a criaçao do produto

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: R$" + preco + ", Código do produto: " + codigo;
    } // Sobreescreveu o ToString para facilitar a vizualizaçao na impressao

}




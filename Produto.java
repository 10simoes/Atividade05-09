public class Produto {
    private String nome;
    private String codigo;
    private double preco;

    public Produto(String nome, String codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    // Exibir nome e código
    public void exibir() {
        System.out.println("Nome: " + nome + ", Código: " + codigo);
    }

    // Exibir nome, código e preço
    public void exibir(boolean mostrarPreco) {
        if (mostrarPreco) {
            System.out.println("Nome: " + nome + ", Código: " + codigo + ", Preço: " + preco);
        } else {
            exibir();
        }
    }

    public static void main(String[] args) {
        Produto prod = new Produto("Notebook", "12345", 2500.00);
        prod.exibir();
        prod.exibir(true);
    }
}


public class Produto{
    public void exibirInfo(String nome){
        System.out.println("Nome do produto:" + nome);
    }
    public void exibirInfo(String none, int codigo){
        System.out.println("Nome do produto:" + nome + ", Codigo" + codigo);
    }
    public void exibirInfo(String nome, int codigo, double preco){
        System.out.println("Nome do produto" + nome  + ",Codigo" + codigo + ",Preço" + preco);
    }


    public static void main(String[]args){
        Produto prod = new Produto();
    }
}

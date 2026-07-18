public class TesteEx05 {
    public static void main(String[] args) {
        Ex5 produto = new Ex5("Cimento", "Saco de 50kg", 35.0, 50.0, 20);

        System.out.println("Estoque inicial: " + produto.getEstoque());

        produto.adicionarEstoque();
        System.out.println("Estoque apos adicionar 1: " + produto.getEstoque());

        produto.adicionarEstoque(10);
        System.out.println("Estoque apos adicionar 10: " + produto.getEstoque());

        produto.venderProduto(5);
        System.out.println("Estoque apos vender 5: " + produto.getEstoque());

        System.out.println("Preco antes da promocao: " + produto.getPreco());
        produto.aplicarPromocao(20); // 20% de desconto
        System.out.println("Preco apos promocao de 20%: " + produto.getPreco());
    }
}


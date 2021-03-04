public class Main {
    public static void main(String[] args) {
        Pedido solicitacao = new Pedido();
        // inicia estoque
        for (int i=0;i<50;i++){
            solicitacao.addLoja(1.99, 10,i);
        }
        solicitacao.carrinho(5, 7);
        solicitacao.finalizaCompra();
    }
}

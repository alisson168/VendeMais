public class Retirada extends Pedido{

    public Retirada(String cliente) {
        super(cliente);
    }

    @Override
    public void pedir(double valor_Produto) {
        super.pedir(valor_Produto);
        IO.println("RETIRADA");
        IO.println("Valor: " + getValorP());
        IO.println("Data de entrega: " + getDataPedido());
    }
}

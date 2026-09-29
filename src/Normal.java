import java.time.LocalDate;

public class Normal extends Pedido {

    private double valorF = 12.99;

    public Normal(String cliente) {
        super(cliente);
    }
    public double getTotal(){
        return getValorP() + valorF;
    }

    @Override
    public void pedir(double valor_Produto) {
        super.pedir(valor_Produto);
        IO.println("ENTREGA NORMAL");
        IO.println("Valor: " + getValorP());
        IO.println("Data de entrega: " + getDataPedido().plusDays(7));
    }
}
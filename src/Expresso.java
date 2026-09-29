import java.time.LocalDate;

public class Expresso extends Pedido {

    private double valorF = 5.75;

    public Expresso(String cliente) {
        super(cliente);
    }
    public double getTotal(){
        return getValorP() + valorF;
    }

    @Override
    public void pedir(double valor_Produto) {
        super.pedir(valor_Produto);
        IO.println("ENTREGA EXPRESSO");
        IO.println("Valor: " + getValorP());
        IO.println("Data de entrega: " + getDataPedido().plusDays(2));
    }
}

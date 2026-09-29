import java.time.LocalDate;

public abstract class Pedido {
    private int numero = 0;
    private String cliente;
    private double valorP;
    private LocalDate dataPedido;


    public Pedido(String cliente) {
        this.cliente = cliente;
        numero += 1;
        dataPedido = LocalDate.now();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValorP() {
        return valorP;
    }

    public void setValorP(double valorP) {
        this.valorP = valorP;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }
    public void pedir(double valor_Produto){
        if(valor_Produto > 0 ){
            valorP = valor_Produto;
        }else{
            IO.println("Valor inválido");
        }
        IO.println("Numero do pedido:" + numero);
        IO.println("cliente:" + cliente);
        IO.println("Valor" + valorP);
        IO.println("Data:" + dataPedido);
    }

}
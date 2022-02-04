package uia.com.apimvcrest.modelo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemCotizacionModelo
{

    private int cantidad=-1;
    private double valorUnitario=0.0;
    private double subtotal=0.0;
    private double total=0.0;

    public ItemCotizacionModelo(int cantidad, double valorUnitario, double subtotal, double total)
    {
        this.valorUnitario = valorUnitario;
        this.subtotal = subtotal;
        this.total = total;
    }


    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void print() {
        System.out.println(
                " \n\t\tcantidad:\t" + this.cantidad
                        + " \n\t\tvalorUnitario:\t" + this.valorUnitario
                        + " \n\t\tsubtotal:\t" + this.subtotal
                        + " \n\t\ttotal:\t" + this.total);

    }
}

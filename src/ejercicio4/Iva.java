package ejercicio4;

public class Iva {

    private double valor;
    private double iva = 1.21;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcularPrecioIva(){
        return getValor()*iva;
    }
}

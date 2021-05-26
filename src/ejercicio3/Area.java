package ejercicio3;

public class Area {

    private double rad;

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    public double calcularArea(){
        return Math.PI*Math.pow(getRad(),2);
    }
}

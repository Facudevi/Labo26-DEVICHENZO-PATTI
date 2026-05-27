package alarmas;

public class Sensor {
    private double umbral;

    public Sensor(double umbral) { this.umbral = umbral; }

    public double getUmbral() { return umbral; }
    public void setUmbral(double umbral) { this.umbral = umbral; }

    public void dispararAlarma(){}
    public void imprimirAlarma(){}
}
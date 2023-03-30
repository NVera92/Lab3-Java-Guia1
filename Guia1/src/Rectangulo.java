public class Rectangulo {


    private double ancho;
    private double alto;


    public Rectangulo() {
        this.alto = 1.0;
        this.ancho = 1.0;
    }

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }


    public double calculaArea() {
        return this.ancho * this.alto;
    }

    public double calculaPerimetro() {
        return ((2 * this.ancho) + (2 * alto));
    }

}



public class Krug2 {

    private String naziv;
    private double radius;

    public Krug2(String naziv, double radius) {
        this.naziv = naziv;
        this.radius = radius;
    }
    public String getNaziv() {
        return this.naziv;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double racunajPovrsinu() {
        return this.radius * this.radius * Math.PI;
    }
    public double racunajOpseg () {
        return (this.radius + this.radius) * Math.PI;
    }
    }


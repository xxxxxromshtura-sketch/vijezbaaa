public class Trokut {

    public String naziv;
    public double stranicaA;
    public double stranicaB;
    public double stranicaC;

    public String getNaziv() {
        return naziv;
    }
    public double getStranicaA() {
        return stranicaA;
    }
    public double getStranicaB() {
        return stranicaB;
    }
    public double getStranicaC() {
        return stranicaC;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public void setStranicaA(double stranicaA) {
        this.stranicaA = stranicaA;
    }
    public void setStranicaB(double stranicaB) {
        this.stranicaB = stranicaB;
    }
    public void setStranicaC(double stranicaC) {
        this.stranicaC = stranicaC;
    }
    public Trokut(String naziv, double a, double b, double c){
        this.naziv = naziv;
        this.stranicaA= a;
        this.stranicaB=b;
        this.stranicaC=c;}

    public double racunajPovrsinu() {
        double Trokut = (stranicaA + stranicaB + stranicaC) / 2;
        return Math.sqrt(Trokut * (Trokut - stranicaA) * (Trokut - stranicaB) * (Trokut - stranicaC));
    }
    public double racunajOpseg(){
        return stranicaA + stranicaB + stranicaC;
    }
    }


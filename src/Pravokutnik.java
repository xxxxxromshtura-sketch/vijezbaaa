public class Pravokutnik {
    private String naziv;
    private double StranicaA;
    private double StranicaB;

public String getNaziv() {
    return naziv;
}
public double getStranicaA() {
    return StranicaA;
}
public double getStranicaB() {
    return StranicaB;
}
public void setNaziv(String naziv) {
    this.naziv = naziv;
}
public void setStranicaA(double stranicaA) {
    this.StranicaA = stranicaA;
}
public void setStranicaB(double stranicaB) {
    this.StranicaB = stranicaB;
}
public Pravokutnik(String naziv, double a, double b) {
this.naziv = naziv;
this.StranicaA = a;
this.StranicaB = b;}

    public double racunajPovrsinu() {
        return StranicaA * StranicaB;
    }
    public double racunajOpseg(){
        return (StranicaA + StranicaB) *2;
    }
}



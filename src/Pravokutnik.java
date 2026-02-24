public class Pravokutnik extends GeometrijskiLik {
    private double StranicaA;
    private double StranicaB;

public double getStranicaA() {
    return StranicaA;
}
public double getStranicaB() {
    return StranicaB;
}

public void setStranicaA(double stranicaA) {
    this.StranicaA = stranicaA;
}
public void setStranicaB(double stranicaB) {
    this.StranicaB = stranicaB;
}
public Pravokutnik(String naziv, double a, double b) {
    super(naziv);
this.StranicaA = a;
this.StranicaB = b;}

    @Override
    public double povrsina() {
        return StranicaA * StranicaB;
    }
    public double opseg(){
        return (StranicaA + StranicaB) *2;
    }
}




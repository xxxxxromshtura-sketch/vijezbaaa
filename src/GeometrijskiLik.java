public abstract class GeometrijskiLik {
    private String naziv;

    public GeometrijskiLik(String naziv) {
    }

    public abstract double opseg();
    public abstract double povrsina();

    public String getNaziv() {
        return this.naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;

    }

    }



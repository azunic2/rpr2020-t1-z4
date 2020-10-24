package ba.unsa.etf.rpr;

public class Artikl {
    String naziv; int cijena; String kod;
    public Artikl(String nazivArtikla, int cijena, String id) {
        this.naziv = nazivArtikla; this.cijena = cijena; this.kod = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getCijena() {
        return cijena;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}

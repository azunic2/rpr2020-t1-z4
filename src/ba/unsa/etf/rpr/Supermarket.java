package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000];
    public static int brojac = 0;
    public Artikl[] getArtikli() {
        return artikli;
    }
    public boolean dodajArtikl(Artikl a) {
        if(brojac == 1000) return false;
        artikli[brojac] = a;
        brojac++;
        return true;
    }

    public void setArtikli(Artikl[] artikli) {
        this.artikli = artikli;
    }
    Artikl izbaciArtiklSaKodom(String kod) {
        for(int i = 0; i < artikli.length; i++) {
            if(artikli[i].getKod().equals(kod)) {
                //Ovdje ide algo za izbacivanje to be written
                brojac--;
                Artikl returnedArtikal = artikli[i];
                int j;
                for(j = i; j < artikli.length-1; j++) artikli[j] = artikli[j + 1];
                artikli[j] = null;
                return returnedArtikal;
            }
        }
        return null;
    }
}

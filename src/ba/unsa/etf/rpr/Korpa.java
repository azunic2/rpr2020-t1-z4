package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new  Artikl[50];
    private static int brojac = 0;

    public boolean dodajArtikl(Artikl a) {
        if(brojac == 50) return false;
        artikli[brojac++] = a;

        return true;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
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

    public Artikl[] getArtikli() {
        return artikli;
    }

    public void setArtikli(Artikl[] artikli) {
        this.artikli = artikli;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for(int i = 0; !(artikli[i] == null); i++) suma+=artikli[i].getCijena();
        return suma;
    }
}

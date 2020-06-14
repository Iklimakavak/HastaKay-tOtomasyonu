public class hst{

    private int sıra;
    private String ad;
    private String soyad;
    private String yasi;
    private String test_sonucu;
    private String durumu;
   
    public hst(int sıra, String ad, String soyad, String yasi, String test_sonucu, String durumu) {
        this.sıra = sıra;
        this.ad = ad;
        this.soyad = soyad;
        this.yasi = yasi;
        this.test_sonucu = test_sonucu;
        this.durumu=durumu;
        
    }

   
    public int getSıra() {
        return sıra;
    }

    public void setSıra(int sıra) {
        this.sıra = sıra;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getYasi() {
        return yasi;
    }

    public void setYasi(String yasi) {
        this.yasi = yasi;
    }

    public String getTest_sonucu() {
        return test_sonucu;
    }

    public void setTest_sonucu(String test_sonucu) {
        this.test_sonucu = test_sonucu;
    }

    public String getDurumu() {
        return durumu;
    }

    public void setDurumu(String durumu) {
        this.durumu = durumu;
    }
}

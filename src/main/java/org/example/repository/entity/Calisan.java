package org.example.repository.entity;

public class Calisan {
    private Long id;
    private String isim;
    private String soyisim;

    public Calisan(String isim, String soyisim) {
        this.isim = isim;
        this.soyisim = soyisim;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                '}';
    }
}

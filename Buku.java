package toko.domain;

import java.math.BigDecimal;

public class Buku {
        private Integer id;
        private String isbn;
        private String kode;
        private String judul;
        private String pengarang;
        private String penerbit;
        private BigDecimal harga;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
        
        
        public Integer getId() {
                return id;
        }
        public void setId(Integer id) {
                this.id = id;
        }
        public String getKode() {
                return kode;
        }
        public void setKode(String kode) {
                this.kode = kode;
        }
        
        public String getJudul() {
                return judul;
        }
        public void setJudul(String judul) {
                this.judul = judul;
        }
        public String getPengarang() {
                return pengarang;
        }
        public void setPengarang(String pengarang) {
                this.pengarang = pengarang;
        }
        public String getPenerbit() {
                return penerbit;
        }
        public void setPenerbit(String penerbit) {
                this.penerbit = penerbit;
        }
        public BigDecimal getHarga() {
                return harga;
        }
        public void setHarga(BigDecimal harga) {
                this.harga = harga;
        }
        
}
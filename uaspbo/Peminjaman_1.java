/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspbo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fauziah
 */
@Entity
@Table(name = "peminjaman")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Peminjaman_1.findAll", query = "SELECT p FROM Peminjaman_1 p")
    , @NamedQuery(name = "Peminjaman_1.findByNim", query = "SELECT p FROM Peminjaman_1 p WHERE p.nim = :nim")
    , @NamedQuery(name = "Peminjaman_1.findByNama", query = "SELECT p FROM Peminjaman_1 p WHERE p.nama = :nama")
    , @NamedQuery(name = "Peminjaman_1.findByJudul", query = "SELECT p FROM Peminjaman_1 p WHERE p.judul = :judul")
    , @NamedQuery(name = "Peminjaman_1.findByTanggalPeminjaman", query = "SELECT p FROM Peminjaman_1 p WHERE p.tanggalPeminjaman = :tanggalPeminjaman")
    , @NamedQuery(name = "Peminjaman_1.findByTanggalKembali", query = "SELECT p FROM Peminjaman_1 p WHERE p.tanggalKembali = :tanggalKembali")
    , @NamedQuery(name = "Peminjaman_1.findByAngkatan", query = "SELECT p FROM Peminjaman_1 p WHERE p.angkatan = :angkatan")
    , @NamedQuery(name = "Peminjaman_1.findByStatus", query = "SELECT p FROM Peminjaman_1 p WHERE p.status = :status")})
public class Peminjaman_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nim")
    private String nim;
    @Column(name = "nama")
    private String nama;
    @Column(name = "judul")
    private String judul;
    @Column(name = "tanggal_peminjaman")
    @Temporal(TemporalType.DATE)
    private Date tanggalPeminjaman;
    @Column(name = "tanggal_kembali")
    @Temporal(TemporalType.DATE)
    private Date tanggalKembali;
    @Column(name = "angkatan")
    private String angkatan;
    @Column(name = "status")
    private String status;
    @JoinColumn(name = "isbn", referencedColumnName = "isbn")
    @ManyToOne
    private Buku_1 isbn;

    public Peminjaman_1() {
    }

    public Peminjaman_1(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public Date getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    public void setTanggalPeminjaman(Date tanggalPeminjaman) {
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    public Date getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(Date tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Buku_1 getIsbn() {
        return isbn;
    }

    public void setIsbn(Buku_1 isbn) {
        this.isbn = isbn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nim != null ? nim.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peminjaman_1)) {
            return false;
        }
        Peminjaman_1 other = (Peminjaman_1) object;
        if ((this.nim == null && other.nim != null) || (this.nim != null && !this.nim.equals(other.nim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uaspbo.Peminjaman_1[ nim=" + nim + " ]";
    }
    
}

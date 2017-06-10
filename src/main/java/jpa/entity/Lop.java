package jpa.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by DELL on 06/10/17.
 */
@Entity
@Table(name = "lop")
public class Lop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "khoa")
    private String khoa;

    @Column(name = "chuyennganh")
    private String chuyennganh;

    @OneToMany(mappedBy = "lop", fetch = FetchType.EAGER)
    private List<SinhVien1> sinhVien1List;

    public Lop() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getChuyennganh() {
        return chuyennganh;
    }

    public void setChuyennganh(String chuyennganh) {
        this.chuyennganh = chuyennganh;
    }

    public List<SinhVien1> getSinhVien1List() {
        return sinhVien1List;
    }

    public void setSinhVien1List(List<SinhVien1> sinhVien1List) {
        this.sinhVien1List = sinhVien1List;
    }
}

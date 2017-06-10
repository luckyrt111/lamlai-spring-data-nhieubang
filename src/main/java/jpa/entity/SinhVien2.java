package jpa.entity;

import javax.persistence.*;

/**
 * Created by DELL on 06/10/17.
 */
@Entity
@Table(name = "sinhvien2")
public class SinhVien2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "namsinh")
    private int namsing;

    @Column(name = "diachi")
    private String diachi;

    @Column(name = "diem")
    private float diem;

    @OneToOne(mappedBy = "sinhVien2")
    private SinhVien1 sinhVien1;

    public SinhVien2() {
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

    public int getNamsing() {
        return namsing;
    }

    public void setNamsing(int namsing) {
        this.namsing = namsing;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public SinhVien1 getSinhVien1() {
        return sinhVien1;
    }

    public void setSinhVien1(SinhVien1 sinhVien1) {
        this.sinhVien1 = sinhVien1;
    }
}

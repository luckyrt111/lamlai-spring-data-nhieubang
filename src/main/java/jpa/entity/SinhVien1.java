package jpa.entity;

import javax.persistence.*;

/**
 * Created by DELL on 06/10/17.
 */
@Entity
@Table(name = "sinhvien1")
public class SinhVien1 {
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

    @OneToOne(cascade = {CascadeType.ALL})
    @PrimaryKeyJoinColumn
    private SinhVien2 sinhVien2;

    @ManyToOne
    @JoinColumn(name = "lopID")
    private Lop lop;

    public SinhVien1() {
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

    public SinhVien2 getSinhVien2() {
        return sinhVien2;
    }

    public void setSinhVien2(SinhVien2 sinhVien2) {
        this.sinhVien2 = sinhVien2;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }
}

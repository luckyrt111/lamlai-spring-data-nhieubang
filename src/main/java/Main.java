import jpa.config.SpringConfig;
import jpa.entity.Lop;
import jpa.entity.SinhVien1;
import jpa.entity.SinhVien2;
import jpa.repository.LopRepository;
import jpa.repository.SinhVien1Repository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by DELL on 06/10/17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        SinhVien1Repository sinhVien1Repository = context.getBean("sinhVien1Repository",SinhVien1Repository.class);

        SinhVien1 sinhVien1 = new SinhVien1();
        sinhVien1.setName("Hanh");
        sinhVien1.setDiachi("Phu yen");
        sinhVien1.setNamsing(1996);

        SinhVien2 sinhVien2 = new SinhVien2();
        sinhVien2.setName("Nghia");
        sinhVien2.setDiachi("Quang binh");
        sinhVien2.setNamsing(1995);
        sinhVien1.setSinhVien2(sinhVien2);
        sinhVien2.setSinhVien1(sinhVien1);

        Lop lop = new Lop();
        lop.setId(2);
        sinhVien1.setLop(lop);

        sinhVien1Repository.save(sinhVien1);


        System.out.println("Xong");
    }
}

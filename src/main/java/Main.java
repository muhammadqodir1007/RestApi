import db.DBConnection;
import entity.GitCertificate;
import service.GitCertificateImpl;
import service.GitCertificateService;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {


        GitCertificateService gitCertificateService = new GitCertificateImpl();
        List<GitCertificate> all =
                gitCertificateService.getAll();
        GitCertificate gitCertificate = all.get(0);
        System.out.println(gitCertificate.getId());
        System.out.println(gitCertificate.getName());
    }
}

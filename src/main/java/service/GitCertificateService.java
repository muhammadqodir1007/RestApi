package service;

import entity.GitCertificate;
import org.w3c.dom.stylesheets.LinkStyle;

import java.sql.SQLException;
import java.util.List;

public interface GitCertificateService {


    List<GitCertificate> getAll() throws SQLException;

    GitCertificate getById();

    void deleteById(int id);

    void update(int id);

    boolean add(GitCertificate gitCertificate);


}

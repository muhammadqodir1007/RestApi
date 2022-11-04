package service;

import db.DBConnection;
import entity.GitCertificate;

import javax.sql.DataSource;
import java.awt.image.DataBuffer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GitCertificateImpl implements GitCertificateService {


    @Override
    public List<GitCertificate> getAll() throws SQLException {
        DataSource dataSource = DBConnection.postgresqlDataSource();
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM public.\"GitCertificate\"");
        List<GitCertificate> list = new ArrayList<>();
        while (resultSet.next()) {
            GitCertificate gitCertificate = new GitCertificate();
            gitCertificate.setId(resultSet.getInt(1));
            gitCertificate.setName(resultSet.getString(2));
            gitCertificate.setDescription(resultSet.getString(3));
            gitCertificate.setPrice(resultSet.getInt(4));
            gitCertificate.setDuration(resultSet.getInt(5));
            gitCertificate.setCreatedDate(resultSet.getDate(6));
            gitCertificate.setLastUpdatedDate(resultSet.getDate(7));
            list.add(gitCertificate);

        }
        return list;


    }

    @Override
    public GitCertificate getById() {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void update(int id) {

    }

    @Override
    public boolean add(GitCertificate gitCertificate) {
        return false;
    }
}

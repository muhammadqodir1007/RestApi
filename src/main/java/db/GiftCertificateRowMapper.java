package db;

import entity.GitCertificate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GiftCertificateRowMapper implements RowMapper<GitCertificate> {


    @Override
    public GitCertificate mapRow(ResultSet rs, int rowNum) throws SQLException {

        GitCertificate gitCertificate = new GitCertificate();


        gitCertificate.setId(rs.getInt("id"));
        gitCertificate.setName(rs.getString("name"));
        gitCertificate.setDuration(rs.getInt("duration"));
        gitCertificate.setPrice(rs.getDouble("price"));
        gitCertificate.setCreatedDate(rs.getDate("created_date"));
        gitCertificate.setLastUpdatedDate(rs.getDate("updated_date"));


        return gitCertificate;
    }
}

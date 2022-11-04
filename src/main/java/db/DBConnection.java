package db;

import entity.GitCertificate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.List;

public class DBConnection {

    public static DataSource postgresqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/RestApiCore");
        dataSource.setUsername("postgres");
        dataSource.setPassword("1007");
        return dataSource;
    }


    JdbcTemplate jdbcTemplate = new JdbcTemplate();

    public List<GitCertificate> findAll() {
        jdbcTemplate.setDataSource(postgresqlDataSource());
        List<GitCertificate> list = jdbcTemplate.query("SELECT * FROM public.\"GitCertificate\"", new BeanPropertyRowMapper<>(GitCertificate.class));

        return list;
    }

    public GitCertificate getById(int id) {
        jdbcTemplate.setDataSource(postgresqlDataSource());
        GitCertificate gitCertificate = jdbcTemplate.queryForObject("SELECT * FROM public.\"GitCertificate\" where id=?  ", new Object[]{id}, new GiftCertificateRowMapper());

        return gitCertificate;
    }

    public static void main(String[] args) {
        DBConnection dbConnection = new DBConnection();
        GitCertificate byId = dbConnection.getById(1);
        System.out.println(byId.getName());
    }


}

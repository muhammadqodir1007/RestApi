package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GitCertificate {

    int id;
    String name;
    String description;
    double price;
    double duration;
    Date createdDate;

    Date lastUpdatedDate;

}

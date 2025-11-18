package edu.icet.ecom.model.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name ="Member")
public class Member {
@Id
    private String id;
    private String name;
    private String city;
    private String dob;
    private String nic;
}

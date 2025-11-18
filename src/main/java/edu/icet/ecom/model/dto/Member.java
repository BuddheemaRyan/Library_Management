package edu.icet.ecom.model.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
public class Member {
@Id
    private String id;
    private String name;
    private String city;
    private String dob;
    private String nic;
}

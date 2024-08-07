package com.lcwd.user.service.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "micro_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "ID")
    private String userId;
    @Column (name = "NAME", length = 20)
    private String name;
    @Column (name = "EMAIL")
    private String email;
    @Column (name = "ABOUT")
    private String about;

    @Transient //When we do not want to store the data of Rating in the same database of User service.
    // It will ignore by JPA.
    private List<Rating> ratings=new ArrayList<>();

}

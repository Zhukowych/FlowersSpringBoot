package org.example.springflowerstore.user;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
@Entity(name="app_user")
@Table(name="app_user")
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String email;

    private LocalDate dateOfBirth;

    @Transient
    private Integer age;

    @Transient
    public Integer getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

}

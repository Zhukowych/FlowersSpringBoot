package org.example.springflowerstore.user;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

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

    private String email;

    private LocalDate dateOfBirth;

    private Integer age;


}

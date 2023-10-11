package com.example.hibernate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "PERSONS")
public class Person {
    @EmbeddedId
    private PersonsId personsId;

    @Column(name = "phone_number")
    private String phone_number;
    @Column(name = "city_of_living")
    private String city_of_living;
}

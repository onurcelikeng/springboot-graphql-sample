package com.onurcelikeng.springbootgraphqlsample.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER")
public final class User implements Serializable {

    @Id
    private UUID id = UUID.randomUUID();

    @Column(length = 40, name = "name")
    private String name;

    @Column(length = 40, name = "surname")
    private String surname;

    @Column(length = 11, name = "identityNumber")
    private Long identityNumber;

    @Column(length = 1, name = "gender")
    private String gender; // F or M

    @Column(length = 40, name = "birthPlace")
    private String birthPlace;
}

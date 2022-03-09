package com.marketplace.api.models;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
@Entity
@Table(name = "VW_USER", schema = "MARKETPLACE_OWNER")
@SequenceGenerator(name = "SEQ_USER", sequenceName = "SEQ_USER", allocationSize = 1, schema = "MARKETPLACE_OWNER")
public class UserModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USER")
    private Long id;

    @NotBlank
    @Column(name = "user_name", unique = true)
    private String userName;

    @NotBlank
    @Column(name = "password")
    private String password;

    @NotBlank
    @Column(name = "email")
    private String email;

}



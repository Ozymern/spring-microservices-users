package com.ozymern.spring.microservices.user.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


//@Entity
//@Table(name = "user")
//@Data
//public class User implements Serializable {
//
//
//    private static final long serialVersionUID = 4170778533100523523L;
//
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(unique = true, length = 20)
//    private String username;
//
//    private String name;
//
//    @Column(length = 60)
//    private String password;
//    @Column(unique = true)
//    private String email;
//
//    @Column(name = "last_name")
//    private String lastName;
//
//    private Boolean enabled;
//
//    @ManyToMany(fetch = FetchType.LAZY)
//    //personalizacion
//    //nombre de las tabla intermedia(user_to_roles), llave foraneas (@JoinColumn(name = "users_id"),inverseJoinColumns = @JoinColumn(name = "role_id")), uniqueConstraints junta las 2 llave y las hace unicas
//    @JoinTable(name = "user_to_roles",joinColumns = @JoinColumn(name = "users_id"),inverseJoinColumns = @JoinColumn(name = "role_id"),uniqueConstraints = {@UniqueConstraint(columnNames = {"users_id","role_id"})})
//    private List<Role> roles;
//}

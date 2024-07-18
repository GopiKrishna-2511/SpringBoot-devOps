package com.springboot.devops.entity;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Users")
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name="user_id")
        private Integer userId;

        @Column(name="user_name")
        private String userName;

        @Column(name="password")
        private String password;

        @Column(name="group_name")
        private String groupName;

        @Column(name="group_id")
        private Long groupId;

}

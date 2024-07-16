package com.springboot.devops.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class User {

        private Long userId;
        private String userName;
        private String password;
        private String groupName;
        private Long groupId;

}

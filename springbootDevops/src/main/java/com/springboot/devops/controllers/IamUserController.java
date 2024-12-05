package com.springboot.devops.controllers;

import com.amazonaws.services.identitymanagement.AmazonIdentityManagement;
import com.amazonaws.services.identitymanagement.AmazonIdentityManagementClientBuilder;
import com.amazonaws.services.identitymanagement.model.ListUsersRequest;
import com.amazonaws.services.identitymanagement.model.ListUsersResult;
import com.amazonaws.services.identitymanagement.model.User;
import com.springboot.devops.service.UserService;
import com.springboot.devops.utils.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Utility.base_url)
public class IamUserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAllIamUsers")
    public ResponseEntity<ListUsersResult> getAllIamUsers() {

        ListUsersResult response=null;
        final AmazonIdentityManagement iam = AmazonIdentityManagementClientBuilder.defaultClient();

        boolean done = false;
        ListUsersRequest request = new ListUsersRequest();

        while (!done) {
            response  = iam.listUsers(request);

            for (User user : response.getUsers()) {
                System.out.format("Retrieved user %s", user.getUserName());
            }

            request.setMarker(response.getMarker());

            if (!response.getIsTruncated()) {
                done = true;
            }

        }

  return ResponseEntity.ok(response);
    }

}
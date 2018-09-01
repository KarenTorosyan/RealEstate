package com.realestate.demo.security;

import com.realestate.demo.model.User;
import lombok.Getter;
import org.springframework.security.core.authority.AuthorityUtils;
@Getter
public class CurrentUser extends org.springframework.security.core.userdetails.User {

    private User user;

    public CurrentUser(User user) {
        super(user.getEmail(),user.getPassword(),AuthorityUtils.createAuthorityList(user.getUserType().name()));
        this.user=user;
    }
}

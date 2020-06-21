package com.Tajseer.Watheq.Authority;


import com.Tajseer.Watheq.Users.User;
import org.springframework.jdbc.support.CustomSQLErrorCodesTranslation;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="authority")
public class Authority {
    @Id
    private int AuthID;
    private String authName;
    private String authoDescr;

    @OneToMany (mappedBy = "authority", cascade = CascadeType.ALL)
    private List<User> users = new ArrayList<>();

    public Authority() {
    }

    public Authority(int authID, String authName, String authoDescr, List<User> users) {
        AuthID = authID;
        this.authName = authName;
        this.authoDescr = authoDescr;
        this.users = users;
    }


    public int getAuthID() {
        return AuthID;
    }

    public void setAuthID(int authID) {
        AuthID = authID;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public String getAuthoDescr() {
        return authoDescr;
    }

    public void setAuthoDescr(String authoDescr) {
        this.authoDescr = authoDescr;
    }

    public int AuthID() {return AuthID;}

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}

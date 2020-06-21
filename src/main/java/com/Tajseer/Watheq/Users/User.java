package com.Tajseer.Watheq.Users;

import com.Tajseer.Watheq.Authority.Authority;
import com.Tajseer.Watheq.Cerification.Certs;
import com.Tajseer.Watheq.Org.Organization;
import com.Tajseer.Watheq.Shared.Shared;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int UserID;
    @Column
    private String UserFirstName, UserLastName;
    @Column
    private String DOB;
    @Column
    private int MobileNumber;
    @Column
    private String Email;
    @Column
    private String Password;
    @Column
    private int NationalID;
    @Column
    private boolean enabled;

    @OneToMany(mappedBy = "UserCerts", cascade = CascadeType.ALL, targetEntity = Certs.class)
    private List<Certs> certs = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "AuthID")
    private Authority authority;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OrgID")
    private Organization UserOrganization;


    @OneToMany(mappedBy = "userShared", cascade = CascadeType.ALL, targetEntity = Shared.class)
    private List<Shared> shared = new ArrayList<>();

    public User() {
    }

    public User(int userID, String userFirstName, String userLastName, String DOB, int mobileNumber, String email, String passWord, int nationalID, List<Certs> certs, Authority authority, Organization userOrganization, List<Shared> shared) {
        UserID = userID;
        UserFirstName = userFirstName;
        UserLastName = userLastName;
        this.DOB = DOB;
        MobileNumber = mobileNumber;
        Email = email;
        Password = passWord;
        NationalID = nationalID;
        this.certs = certs;
        this.authority = authority;
        UserOrganization = userOrganization;
        this.shared = shared;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getUserFirstName() {
        return UserFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        UserFirstName = userFirstName;
    }

    public String getUserLastName() {
        return UserLastName;
    }

    public void setUserLastName(String userLastName) {
        UserLastName = userLastName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getNationalID() {
        return NationalID;
    }

    public void setNationalID(int nationalID) {
        NationalID = nationalID;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
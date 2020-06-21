package com.Tajseer.Watheq.Org;


import com.Tajseer.Watheq.Cerification.Certs;
import com.Tajseer.Watheq.Users.User;
import org.omg.CORBA.PRIVATE_MEMBER;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name= "organization")
public class Organization {
    @Id
    private int OrgID;
    private String OrgName;
    private String OrgAddress;

    @OneToMany(mappedBy = "CertsOrganization", cascade = CascadeType.ALL)
    private List<Certs> certs = new ArrayList<Certs>();

    @OneToMany(mappedBy = "UserOrganization", cascade = CascadeType.ALL)
    private List<User> user = new ArrayList<>();

    public Organization() {
    }

    public Organization(int orgID, String orgName, String orgAddress, List<Certs> certs, List<User> user) {
        OrgID = orgID;
        OrgName = orgName;
        OrgAddress = orgAddress;
        this.certs = certs;
        this.user = user;
    }

    public int getOrgID() {
        return OrgID;
    }

    public void setOrgID(int orgID) {
        OrgID = orgID;
    }

    public String getOrgName() {
        return OrgName;
    }

    public void setOrgName(String orgName) {
        OrgName = orgName;
    }

    public String getOrgAddress() {
        return OrgAddress;
    }

    public void setOrgAddress(String orgAddress) {
        OrgAddress = orgAddress;
    }

    public List<Certs> getCerts() {
        return certs;
    }

    public void setCerts(List<Certs> certs) {
        this.certs = certs;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

}

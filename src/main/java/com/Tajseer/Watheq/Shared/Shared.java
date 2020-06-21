package com.Tajseer.Watheq.Shared;


import com.Tajseer.Watheq.Cerification.Certs;
import com.Tajseer.Watheq.Users.User;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Shared")
public class Shared {
    @Id
    private int SharedID;

    @Column
    private int certID;
    @Column
    private String URL;

    @ManyToOne(cascade = CascadeType.ALL ,targetEntity = User.class)
    @JoinColumn(name = "UserID")
    private User userShared;

    @ManyToMany(mappedBy = "shared", cascade = CascadeType.ALL)
    private Set<Certs> certs = new HashSet<Certs>();

    public Shared(int sharedID, int certID, String URL) {
        SharedID = sharedID;

        this.certID = certID;
        this.URL = URL;
    }

    public Shared() {
    }

    public Shared(int sharedID, int certID, String URL, User userShared, Set<Certs> certs) {
        SharedID = sharedID;

        this.certID = certID;
        this.URL = URL;
        this.userShared = userShared;
        this.certs = certs;
    }

    public int getSharedID() {
        return SharedID;
    }

    public void setSharedID(int sharedID) {
        SharedID = sharedID;
    }


    public int getCertID() {
        return certID;
    }

    public void setCertID(int certID) {
        this.certID = certID;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public User getUserShared() {
        return userShared;
    }

    public void setUserShared(User userShared) {
        this.userShared = userShared;
    }

    public Set<Certs> getCerts() {
        return certs;
    }

    public void setCerts(Set<Certs> certs) {
        this.certs = certs;
    }
}

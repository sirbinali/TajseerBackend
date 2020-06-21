package com.Tajseer.Watheq.Cerification;

import com.Tajseer.Watheq.Org.Organization;
import com.Tajseer.Watheq.Shared.Shared;
import com.Tajseer.Watheq.Users.User;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="certification")
public class Certs {


    @Id
    @Column
    private int certID;
    @Column
    private String certTitle,certType;
    @Column
    private String certIssueDate;


    @ManyToOne (cascade = CascadeType.ALL , targetEntity = User.class)
    @JoinColumn (name = "UserID")
    private User UserCerts;

    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Organization.class)
    @JoinColumn(name = "OrgID")
    private Organization CertsOrganization;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "certification_Shared",
            joinColumns = {@JoinColumn(name = "certID")},
            inverseJoinColumns = {@JoinColumn(name = "SharedID")}
    )

    private final Set<Shared> shared = new HashSet<Shared>();

    public Certs() {
    }

    public Certs(int certID, String certTitle, String certType, String certIssueDate, User userCerts, Organization certsOrganization) {
        this.certID = certID;
        this.certTitle = certTitle;
        this.certType = certType;
        this.certIssueDate = certIssueDate;
        UserCerts = userCerts;
        CertsOrganization = certsOrganization;
    }

    public int getCertID() {
        return certID;
    }

    public void setCertID(int certID) {
        this.certID = certID;
    }

    public String getCertTitle() {
        return certTitle;
    }

    public void setCertTitle(String certTitle) {
        this.certTitle = certTitle;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertIssueDate() {
        return certIssueDate;
    }

    public void setCertIssueDate(String certIssueDate) {
        this.certIssueDate = certIssueDate;
    }

    public User getUserCerts() {
        return UserCerts;
    }

    public void setUserCerts(User userCerts) {
        UserCerts = userCerts;
    }

    public Organization getCertsOrganization() {
        return CertsOrganization;
    }

    public void setCertsOrganization(Organization certsOrganization) {
        CertsOrganization = certsOrganization;
    }

    public Set<Shared> getShared() {
        return shared;
    }



}







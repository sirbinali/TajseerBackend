package com.Tajseer.Watheq.Cerification;

import com.Tajseer.Watheq.Users.User;

import java.util.List;

public interface CertsService {
    public Certs addCerts(Certs certs);
    public List<Certs> getAllCerts();
    public Certs getCerts (int certID);
    public Certs updateCertID (Certs certs, int certID);
    public void delete(int certID);
    public String deleteAllCertID();

}

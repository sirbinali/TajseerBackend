package com.Tajseer.Watheq.Cerification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class CertsImp implements CertsService {


    @Autowired
    private CertsRep rep ;


    @Override
    public Certs addCerts(Certs certs) {
        return rep.save(certs);
    }

    @Override
    public List<Certs> getAllCerts() {
        return rep.findAll();
    }

    @Override
    public Certs getCerts(int certID) {
        return rep.findById(certID).get();
    }


    @Override
    public Certs updateCertID(Certs certs, int certID) {
        certs.setCertID(certID);
        return rep.save(certs);
    }

    @Override
    public void delete(int certID) {
        rep.deleteById(certID);
    }



    @Override
    public String deleteAllCertID() {
        rep.deleteAll();
        return "All Cert deleted";
    }
}

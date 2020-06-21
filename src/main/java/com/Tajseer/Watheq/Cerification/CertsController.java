package com.Tajseer.Watheq.Cerification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "/Certs")
public class CertsController {
    @Autowired
    private CertsService certsService;
    @Autowired
    private CertsService certsServiceService;
    @PostMapping(value = "/addcerts")
    public Certs addCerts(@RequestBody Certs certs) {
        return certsService.addCerts(certs);
    }
    @GetMapping(value = "/getAllCerts")
    public List<Certs> getAllCerts(){
        return certsService.getAllCerts();
    }

    @GetMapping(value = "getcerts")
    public Certs getCerts(@PathVariable("/certID") int certID){
        return certsService.getCerts(certID);
    }
    @PutMapping(value = "/updatecerts")
    public Certs updateCerts(@RequestBody Certs certs, @PathVariable("/certID") int certID){
        return certsService.updateCertID(certs, certID);
    }
    @DeleteMapping(value = "/deletecerts")
    public void deleteUser(@PathVariable("/certID") int certID){
        certsService.delete(certID);
    }
    @DeleteMapping(value = "deleteAll")
    public String  deleteAllCertID(){
        return certsService. deleteAllCertID();
    }

}












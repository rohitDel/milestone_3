package com.hashedIn.milestone_3;

import com.hashedIn.milestone_3.service.NetflixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
public class NetflixController {
    @Autowired
    private NetflixService nfs;

    @RequestMapping(path = "feedNetflixData")
    public  void setDataInDB(){
        try {
            nfs.NetflixData();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}

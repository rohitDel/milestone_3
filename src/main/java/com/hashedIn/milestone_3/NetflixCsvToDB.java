package com.hashedIn.milestone_3;

import com.hashedIn.milestone_3.service.NetflixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;

@Component
public class NetflixCsvToDB {

    @Autowired
    private NetflixService netflixService;

    @EventListener(ApplicationReadyEvent.class)
    public  void setDataInDB(){
        try {
            netflixService.NetflixData();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}

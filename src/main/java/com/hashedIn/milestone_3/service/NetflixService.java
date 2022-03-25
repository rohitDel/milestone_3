package com.hashedIn.milestone_3.service;

import com.hashedIn.milestone_3.model.NetflixMap;
import com.hashedIn.milestone_3.repository.NetflixRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@Service
public class NetflixService {

    @Autowired
    private NetflixRepo netflixRepo;

    private static final String SUCCESS_MSG = "Successfully Saved in DB";

    public String NetflixData() throws FileNotFoundException {
        List<NetflixMap> result = new ArrayList<>();
        try(Scanner sc = new Scanner(new File("src/main/resources/netflix_titles.csv"))) { //parsing data from csv file
            while (sc.hasNext())  //returns a boolean value
            {
                String data = sc.nextLine();
                String[] fields = data.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                NetflixMap map = new NetflixMap(fields[0], fields[1], fields[2], fields[3], fields[4], fields[5], fields[6], fields[7], fields[8], fields[9], fields[10], fields[11]);
                result.add(map);
            }
        }
        netflixRepo.saveAll(result); //adding data to table
        return SUCCESS_MSG;
    }
}

package com.hashedIn.milestone_3.repository;

import com.hashedIn.milestone_3.model.NetflixMap;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetflixRepo extends CrudRepository<NetflixMap, Integer> {
}

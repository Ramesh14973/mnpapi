/**
 * 
 */
package com.mnpapiv1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.mnpapiv1.collections.master;
import java.util.Optional;


/**
 * 
 */
@Repository
public interface masterRepository extends MongoRepository<master,String>{
	
 //List<master> findByMsisdn(String msisdn);
	Optional<master> findByMsisdn(String msisdn);
	
} // End of masterRepository

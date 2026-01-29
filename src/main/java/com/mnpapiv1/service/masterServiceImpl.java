/**
 * 
 */
package com.mnpapiv1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mnpapiv1.collections.master;
import com.mnpapiv1.repository.masterRepository;

/**
 * 
 */
@Service
public class masterServiceImpl implements masterService{
	
	@Autowired
	private masterRepository mastrepo;

	@Override
	public String save(master mast) {
		try {
		mast = mastrepo.save(mast);	
		}catch(Exception e) {
			e.printStackTrace();;
		}
		 return mast.toString();
	} // End of save

	@Override
	public String getRN(String msisdn) {
		List<master> mastlist = null;
		try {
		mastlist = mastrepo.findByMsisdn(msisdn);
		}catch(Exception e) {e.printStackTrace();}
		
		return mastlist.get(0).getRn();
	} // End of getRN method

	
} // End of masterServiceImpl

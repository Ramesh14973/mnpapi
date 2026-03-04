/**
 * 
 */
package com.mnpapiv1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mnpapiv1.collections.master;
import com.mnpapiv1.repository.masterRepository;
import com.mnpapiv1.exception.NoSuchCustomerExistsException;

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
		String strRN="999";
		master master = null;
		try {
			
			//mastrepo.findById(msisdn).orElseThrow()
			master  = mastrepo.findByMsisdn(msisdn).orElseThrow(()-> new NoSuchCustomerExistsException("Unknown Mobile Number = " + msisdn));
			//master.orElseThrow(()-> {return new NoSuchCustomerExistsException("NO RN For This Mobile Number = " + msisdn);});
		//strRN = mastlist.get(0).getRn();
			strRN = master.getRn();
		}catch(Exception e) {
			strRN="999";
			e.printStackTrace();
			}
		
		return strRN;
	} // End of getRN method

	
} // End of masterServiceImpl

/**
 * 
 */
package com.mnpapiv1.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.mnpapiv1.collections.master;
import com.mnpapiv1.service.masterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


/**
 * 
 */
@RestController
@RequestMapping("/master")
public class masterController {
	private static final Logger logger = LogManager.getLogger(masterController.class);
	
	@Autowired
	private masterService mastserv;
	

	@PostMapping("/addmsisdn")
	public String save(@RequestBody master mast) {
		//
		return mastserv.save(mast);
	}
	
	@GetMapping("/getrn")
	public String getRN(@RequestParam("msisdn") String msisdn) {
		info("info ***************************"+msisdn);
		return mastserv.getRN(msisdn);
		
	} // End of getRN

	
	private void info(String strPrint) {
		logger.info(strPrint);
	}
	
	/*
	private void debug(String strPrint) {
		logger.debug(strPrint);
	}
	private void error(String strPrint) {logger.error(strPrint);}
	*/
} // End of masterController

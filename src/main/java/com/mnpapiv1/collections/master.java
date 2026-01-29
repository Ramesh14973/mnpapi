/**
 * 
 */
package com.mnpapiv1.collections;


import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;

/**
 * 
 */
@Data
@Builder
@Document(collection="master")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class master {

	//@Id
	//private String id;
	
	@Indexed(unique = true)
	private String msisdn;
	private String rn;
	
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getRn() {
		return rn;
	}
	public void setRn(String rn) {
		this.rn = rn;
	}
	
} // End of master

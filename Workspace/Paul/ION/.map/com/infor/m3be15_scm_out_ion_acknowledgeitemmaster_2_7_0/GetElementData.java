// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code outside the function body is automatically generated and will NOT be kept. Therefore:
// *** Do NOT change the function name. This must be done in the Mapper editor only.
// *** Do NOT add any code outside the function body.
// *** Do NOT add any function parameters. This must be done in the Mapper editor only. 
// Thank You!
// ----------------------------------------------------------------------------------------------

//MECID=FID5
package com.infor.m3be15_scm_out_ion_acknowledgeitemmaster_2_7_0;

import org.apache.log4j.*;
import com.intentia.ec.utility.MeCError;
import com.intentia.ec.mapper.*;
import com.intentia.ec.shared.ManifestConstants;
import com.intentia.ecutil.util.*;
import com.lawson.ecutil.util.*;
import com.infor.ecutil.util.*;
import java.util.Hashtable;
import java.util.Enumeration;

public class GetElementData extends Globals {
	/**
	 * Element name
	 */
	private String Name;

	/**
	 * Element value
	 */
	private String Value;

	/**
	 * Please describe me
	 */
	private String iIFIN;

	/**
	 * Item number
	 */
	private String iITNO;

	/**
	 * Please describe me
	 */
	private String iSTAI;

	/**
	 * Please describe me
	 */
	private String iMSID;

	/**
	 * Please describe me
	 */
	private String iMSGD;

	/**
	 * Please describe me
	 */
	private String iUSD1;

	/**
	 * Please describe me
	 */
	private String iUSD2;

	/**
	 * Please describe me
	 */
	private String iUSD3;

	/**
	 * Please describe me
	 */
	private String oIFIN;

	/**
	 * Item number
	 */
	private String oITNO;

	/**
	 * Please describe me
	 */
	private String oSTAI;

	/**
	 * Please describe me
	 */
	private String oMSID;

	/**
	 * Please describe me
	 */
	private String oMSGD;

	/**
	 * Please describe me
	 */
	private String oUSD1;

	/**
	 * Please describe me
	 */
	private String oUSD2;

	/**
	 * Please describe me
	 */
	private String oUSD3;

	// ----------------------------------------------------------------------------------- 
	// PLEASE REMEMBER:
	// Do NOT change anything outside the function body. 
	// For details please see the comment at the top of the file.
	// ----------------------------------------------------------------------------------- 

	/**
	 * Please describe me
	 */
	private void getElementData() throws Throwable {
		oIFIN = iIFIN;
    	oITNO = iITNO;
    	oSTAI = iSTAI;
    	oMSID = iMSID;
    	oMSGD = iMSGD;
    	oUSD1 = iUSD1;
    	oUSD2 = iUSD2;
    	oUSD3 = iUSD3;
    	if ("IFIN".equals(Name)) {
    		oIFIN = IONToolbox.rightTrim(Value);
    	} else if ("ITNO".equals(Name)) {
    		oITNO = IONToolbox.rightTrim(Value);
    	} else if ("STAI".equals(Name)) {
    		oSTAI = Value;
    	} else if ("MSID".equals(Name)) {
    		oMSID = Value;
    	} else if ("MSGD".equals(Name)) {
    		oMSGD = IONToolbox.rightTrim(Value);
    	} else if ("USD1".equals(Name)) {
    		oUSD1 = IONToolbox.rightTrim(Value);
    	} else if ("USD2".equals(Name)) {
    		oUSD2 = IONToolbox.rightTrim(Value);
    	} else if ("USD3".equals(Name)) {
    		oUSD3 = IONToolbox.rightTrim(Value);
    	}
	}
}
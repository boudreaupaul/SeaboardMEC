// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code outside the function body is automatically generated and will NOT be kept. Therefore:
// *** Do NOT change the function name. This must be done in the Mapper editor only.
// *** Do NOT add any code outside the function body.
// *** Do NOT add any function parameters. This must be done in the Mapper editor only. 
// Thank You!
// ----------------------------------------------------------------------------------------------

//MECID=FID10
package com.infor.m3be15_fin_out_ion_syncsourcesystemjournalentry_2_7_0;

import org.apache.log4j.*;
import com.intentia.ec.utility.MeCError;
import com.intentia.ec.mapper.*;
import com.intentia.ec.shared.ManifestConstants;
import com.intentia.ecutil.util.*;
import com.lawson.ecutil.util.*;
import com.infor.ecutil.util.*;
import java.util.Hashtable;
import java.util.Enumeration;

public class SetJournalID extends Globals {
	/**
	 * Please describe me
	 */
	private String iLogicalID;

	/**
	 * Please describe me
	 */
	private String iYEA4;

	/**
	 * Please describe me
	 */
	private String iVSER;

	/**
	 * Please describe me
	 */
	private String iVONO;

	/**
	 * Please describe me
	 */
	private String oJournalID;

	/**
	 * Please describe me
	 */
	private String oAccountingEntity;

	/**
	 * Please describe me
	 */
	private String oVariationID;

	/**
	 * Please describe me
	 */
	private String oLid;

	// ----------------------------------------------------------------------------------- 
	// PLEASE REMEMBER:
	// Do NOT change anything outside the function body. 
	// For details please see the comment at the top of the file.
	// ----------------------------------------------------------------------------------- 

	/**
	 * Please describe me
	 */
	private void setJournalID() throws Throwable {
		if (iVSER.trim().isEmpty())
			iVSER = "___";
		oJournalID = iYEA4.trim() + iVSER.trim() + IONToolbox.rightTrim(iVONO);
		oAccountingEntity = nounAE;
    	
        oVariationID = getManifestInfo("com:ionVariationId");
        oLid = iLogicalID;
	}
}
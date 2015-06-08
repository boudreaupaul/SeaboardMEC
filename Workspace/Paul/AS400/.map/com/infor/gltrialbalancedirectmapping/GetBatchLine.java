// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code outside the function body is automatically generated and will NOT be kept. Therefore:
// *** Do NOT change the function name. This must be done in the Mapper editor only.
// *** Do NOT add any code outside the function body.
// *** Do NOT add any function parameters. This must be done in the Mapper editor only. 
// Thank You!
// ----------------------------------------------------------------------------------------------

//MECID=FID5
package com.infor.gltrialbalancedirectmapping;

import org.apache.log4j.*;
import com.intentia.ec.utility.MeCError;
import com.intentia.ec.mapper.*;
import com.intentia.ec.shared.ManifestConstants;
import com.intentia.ecutil.util.*;
import com.lawson.ecutil.util.*;
import com.infor.ecutil.util.*;
import java.util.Hashtable;
import java.util.Enumeration;

public class GetBatchLine extends Globals {
	/**
	 * Please describe me
	 */
	private String iCawka1;

	/**
	 * Please describe me
	 */
	private String iCaplt1;

	/**
	 * Please describe me
	 */
	private String oLINE;

	/**
	 * Please describe me
	 */
	private String oPARM;

	// ----------------------------------------------------------------------------------- 
	// PLEASE REMEMBER:
	// Do NOT change anything outside the function body. 
	// For details please see the comment at the top of the file.
	// ----------------------------------------------------------------------------------- 

	/**
	 * Please describe me
	 */
	private void getBatchLine() throws Throwable {
		// Please implement me

		oLINE = iCawka1.trim ();

		oPARM = iCaplt1.trim ();
	}
}
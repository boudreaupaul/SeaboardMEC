// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code outside the function body is automatically generated and will NOT be kept. Therefore:
// *** Do NOT change the function name. This must be done in the Mapper editor only.
// *** Do NOT add any code outside the function body.
// *** Do NOT add any function parameters. This must be done in the Mapper editor only. 
// Thank You!
// ----------------------------------------------------------------------------------------------

//MECID=FID5
package com.infor.m3be15_co_in_x12_850_4030;

import org.apache.log4j.*;
import com.intentia.ec.utility.MeCError;
import com.intentia.ec.mapper.*;
import com.intentia.ec.shared.ManifestConstants;
import com.intentia.ecutil.util.*;
import com.lawson.ecutil.util.*;
import com.infor.ecutil.util.*;
import java.util.Hashtable;
import java.util.Enumeration;

public class g000_PER extends Globals {
	/**
	 * Contact function code
	 */
	private String e01_0366;

	/**
	 * Name
	 */
	private String e02_0093;

	/**
	 * Translate qualifier
	 */
	private String TranslQual;

	/**
	 * Our reference
	 */
	private String iOREF;

	/**
	 * Your reference
	 */
	private String iYREF;

	/**
	 * Our reference
	 */
	private String oOREF;

	/**
	 * Your reference
	 */
	private String oYREF;

	// ----------------------------------------------------------------------------------- 
	// PLEASE REMEMBER:
	// Do NOT change anything outside the function body. 
	// For details please see the comment at the top of the file.
	// ----------------------------------------------------------------------------------- 

	/**
	 * Administrative communications contact
	 */
	private void g000_PER() throws Throwable {
		
if (e01_0366 == null) e01_0366 = "";
if (e02_0093 == null) e02_0093 = "";
if (TranslQual == null) TranslQual = "";
oOREF = iOREF;
oYREF = iYREF;
if (TranslQual.trim().equals("Y"))
{
	e01_0366 = dt.toMovex ("g000/PER", "e01_0366", e01_0366,"","","","");
}
if (e01_0366.trim().equals("BD") || e01_0366.trim().equals("PD"))
{
	oYREF = e02_0093.trim();
}
else if (e01_0366.trim().equals("SA") || e01_0366.trim().equals("SR"))
{
	oOREF = e02_0093.trim();
}

	}
}
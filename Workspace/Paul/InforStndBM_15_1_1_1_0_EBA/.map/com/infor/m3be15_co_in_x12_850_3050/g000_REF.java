// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code outside the function body is automatically generated and will NOT be kept. Therefore:
// *** Do NOT change the function name. This must be done in the Mapper editor only.
// *** Do NOT add any code outside the function body.
// *** Do NOT add any function parameters. This must be done in the Mapper editor only. 
// Thank You!
// ----------------------------------------------------------------------------------------------

//MECID=FID4
package com.infor.m3be15_co_in_x12_850_3050;

import org.apache.log4j.*;
import com.intentia.ec.utility.MeCError;
import com.intentia.ec.mapper.*;
import com.intentia.ec.shared.ManifestConstants;
import com.intentia.ecutil.util.*;
import com.lawson.ecutil.util.*;
import com.infor.ecutil.util.*;
import java.util.Hashtable;
import java.util.Enumeration;

public class g000_REF extends Globals {
	/**
	 * Reference number qualifier
	 */
	private String e01_0128;

	/**
	 * Reference number
	 */
	private String e02_0127;

	/**
	 * Translate qualifier
	 */
	private String TranslQual;

	/**
	 * Blanket agreement number
	 */
	private String iAGNO;

	/**
	 * Blanket agreement number
	 */
	private String oAGNO;

	// ----------------------------------------------------------------------------------- 
	// PLEASE REMEMBER:
	// Do NOT change anything outside the function body. 
	// For details please see the comment at the top of the file.
	// ----------------------------------------------------------------------------------- 

	/**
	 * Reference numbers
	 */
	private void g000_REF() throws Throwable {
		
if (e01_0128 == null) e01_0128 = "";
if (e02_0127 == null) e02_0127 = "";
//Save values
oAGNO = iAGNO;
if (TranslQual.trim().equals ("Y"))
{
	e01_0128 = dt.toMovex ("g000/REF", "e01_0128", e01_0128,"","","","");
}
if (e01_0128.trim().equals ("AH"))
{
	oAGNO = e02_0127.trim();
}

	}
}
// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code in this file is autmatically generated will NOT be kept. Therefore do NOT edit.
// Thank You!
// ----------------------------------------------------------------------------------------------

package com.infor.m3be15_co_in_wal_mart_x12_850_5010;

import org.apache.log4j.*;
import com.intentia.ec.utility.MeCError;
import com.intentia.ec.mapper.*;
import com.intentia.ec.shared.ManifestConstants;
import com.intentia.ecutil.util.*;
import com.lawson.ecutil.util.*;
import com.infor.ecutil.util.*;
import java.util.Hashtable;
import java.util.Enumeration;

public class Globals extends com.intentia.ec.mapper.Mapping {


	/**
	 * Delivery address ID
	 */
	protected String ADID = "";


	/**
	 * Address type
	 */
	protected String ADRT = "";


	/**
	 * Blanket agreement number
	 */
	protected String AGNO = "";


	/**
	 * Alternate UM
	 */
	protected String ALUN = "";


	/**
	 * Alias qualifier
	 */
	protected String ALWQ = "";


	/**
	 * Alias category
	 */
	protected String ALWT = "";


	/**
	 * Country (BT)
	 */
	protected String BT_CSCD = "";


	/**
	 * Customer address line 1 (BT)
	 */
	protected String BT_CUA1 = "";


	/**
	 * Customer address line 2 (BT)
	 */
	protected String BT_CUA2 = "";


	/**
	 * Customer address line 4 (BT)
	 */
	protected String BT_CUA4 = "";


	/**
	 * Customer name (BT)
	 */
	protected String BT_CUNM = "";


	/**
	 * Area/State (BT)
	 */
	protected String BT_ECAR = "";


	/**
	 * Postal code (BT)
	 */
	protected String BT_PONO = "";


	/**
	 * Payer (BT)
	 */
	protected String BT_PYNO = "";


	/**
	 * Your reference (BT)
	 */
	protected String BT_YREF = "";


	/**
	 * Customer number (BY)
	 */
	protected String BY_CUNO = "";


	/**
	 * Your reference (BY)
	 */
	protected String BY_YREF = "";


	/**
	 * Company
	 */
	protected String CONO = "";


	/**
	 * Country
	 */
	protected String CSCD = "";


	/**
	 * Customer address line 1
	 */
	protected String CUA1 = "";


	/**
	 * Customer address line 2
	 */
	protected String CUA2 = "";


	/**
	 * Customer address line 4
	 */
	protected String CUA4 = "";


	/**
	 * Currency
	 */
	protected String CUCD = "";


	/**
	 * Customers purchase order date
	 */
	protected String CUDT = "";


	/**
	 * Customer name
	 */
	protected String CUNM = "";


	/**
	 * Customer number
	 */
	protected String CUNO = "";


	/**
	 * Customers order number
	 */
	protected String CUOR = "";


	/**
	 * Customers order line number
	 */
	protected String CUPO = "";


	/**
	 * Division
	 */
	protected String DIVI = "";


	/**
	 * Delivery specification
	 */
	protected String DLSP = "";


	/**
	 * Data translator reference,  used in the whole map
	 */
	protected DataTranslator dt = null;


	/**
	 * State / Area
	 */
	protected String ECAR = "";


	/**
	 * Reference price
	 */
	protected String EDFP = "";


	/**
	 * Facility
	 */
	protected String FACI = "";


	/**
	 * Customer number (FR)
	 */
	protected String FR_CUNO = "";


	/**
	 * Your reference (FR)
	 */
	protected String FR_YREF = "";


	/**
	 * Entity identifier code
	 */
	protected String g006_N1_01_0098 = "";


	/**
	 * Indicator for SDQ
	 */
	protected String g012_SDQ_Ind = "";


	/**
	 * Item number
	 */
	protected String ITNO = "";


	/**
	 * Method of delivery
	 */
	protected String MODL = "";


	/**
	 * Our reference
	 */
	protected String OREF = "";


	/**
	 * Order number
	 */
	protected String ORNO = "";


	/**
	 * Ordered quantity
	 */
	protected String ORQT = "";


	/**
	 * Order type
	 */
	protected String ORTP = "";


	/**
	 * Text
	 */
	protected String PARM = "";


	/**
	 * Postal code
	 */
	protected String PONO = "";


	/**
	 * Alias number
	 */
	protected String POPN = "";


	/**
	 * Payer
	 */
	protected String PYNO = "";


	/**
	 * Requested delivery date
	 */
	protected String RLDZ = "";


	/**
	 * Salesprice
	 */
	protected String SAPR = "";


	/**
	 * Sales price unit of measure
	 */
	protected String SPUN = "";


	/**
	 * Sorting structure for use in g012_SDQ
	 */
	protected SortingStructure SS_SDQ = new SortingStructure(3);


	/**
	 * Delivery address ID (ST)
	 */
	protected String ST_ADID = "";


	/**
	 * Country (ST)
	 */
	protected String ST_CSCD = "";


	/**
	 * Customer address line 1 (ST)
	 */
	protected String ST_CUA1 = "";


	/**
	 * Customer address line 2 (ST)
	 */
	protected String ST_CUA2 = "";


	/**
	 * Customer address line 4 (ST)
	 */
	protected String ST_CUA4 = "";


	/**
	 * Customer name (ST)
	 */
	protected String ST_CUNM = "";


	/**
	 * State/Area (ST)
	 */
	protected String ST_ECAR = "";


	/**
	 * Postal code (ST)
	 */
	protected String ST_PONO = "";


	/**
	 * Your reference (ST)
	 */
	protected String ST_YREF = "";


	/**
	 * Our reference (SU)
	 */
	protected String SU_OREF = "";


	/**
	 * Terms of delivery
	 */
	protected String TEDL = "";


	/**
	 * Temporary order number
	 */
	protected String Temp_ORNO = "";


	/**
	 * Terms of payment
	 */
	protected String TEPY = "";


	/**
	 * Terminate map "Y"  or  ""
	 */
	protected String Terminate = "";


	/**
	 * String containing all free text
	 */
	protected String Text = "";


	/**
	 * Translate qualifier
	 */
	protected String TranslQual = "";


	/**
	 * Document class
	 */
	protected String TXHE = "";


	/**
	 * Order head or line, 1= Head, 2 = Line
	 */
	protected String TYPE = "";


	/**
	 * Type of text. 1=Pre, 2=Post, 3=F6
	 */
	protected String TYTR = "";


	/**
	 * String containing all free text
	 */
	protected String wText = "";


	/**
	 * Your reference
	 */
	protected String YREF = "";


	/**
	 * This map object
	 */
	protected final Object myMap = this;

	public void mapMain() {}
}
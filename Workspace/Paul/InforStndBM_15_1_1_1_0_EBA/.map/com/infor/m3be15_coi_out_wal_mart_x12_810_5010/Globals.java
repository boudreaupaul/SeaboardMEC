// ----------------------------------------------------------------------------------------------
// PLEASE NOTE!
// All code in this file is autmatically generated will NOT be kept. Therefore do NOT edit.
// Thank You!
// ----------------------------------------------------------------------------------------------

package com.infor.m3be15_coi_out_wal_mart_x12_810_5010;

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
	 * Invoice amount, foreign currency
	 */
	protected String AMT2 = "";


	/**
	 * Monetary amount from GetInvHead
	 */
	protected String AMT2_GetInvHead = "";


	/**
	 * Charge or allowance
	 */
	protected String ChAl = "";


	/**
	 * Company
	 */
	protected String CONO = "";


	/**
	 * Charge ID
	 */
	protected String CRID = "";


	/**
	 * Country
	 */
	protected String CSCD = "";


	/**
	 * Customer address 1
	 */
	protected String CUA1 = "";


	/**
	 * Customer address 2
	 */
	protected String CUA2 = "";


	/**
	 * Customer address 4
	 */
	protected String CUA4 = "";


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
	 * Current DLIX
	 */
	protected String CurDLIX = "";


	/**
	 * Current ORNO
	 */
	protected String CurORNO = "";


	/**
	 * Current PONR
	 */
	protected String CurPONR = "";


	/**
	 * Curren POSX
	 */
	protected String CurPOSX = "";


	/**
	 * DATE
	 */
	protected String DATE = "";


	/**
	 * Discount 1
	 */
	protected String DIP1 = "";


	/**
	 * Discount 2
	 */
	protected String DIP2 = "";


	/**
	 * Discount 3
	 */
	protected String DIP3 = "";


	/**
	 * Discount 4
	 */
	protected String DIP4 = "";


	/**
	 * Discount 5
	 */
	protected String DIP5 = "";


	/**
	 * Discount 6
	 */
	protected String DIP6 = "";


	/**
	 * Discount line number
	 */
	protected String DISNO = "";


	/**
	 * Discount model
	 */
	protected String DISY = "";


	/**
	 * Division
	 */
	protected String DIVI = "";


	/**
	 * Planned delivery date
	 */
	protected String DLDT = "";


	/**
	 * Delivery index
	 */
	protected String DLIX = "";


	/**
	 * Delivered quantity - alternate UM
	 */
	protected String DLQA = "";


	/**
	 * Data Translator reference, used in the whole map
	 */
	protected DataTranslator dt = null;


	/**
	 * Due Date
	 */
	protected String DUDT = "";


	/**
	 * Area State
	 */
	protected String ECAR = "";


	/**
	 * Extended invoice number
	 */
	protected String EXIN = "";


	/**
	 * Counter for g000_REF
	 */
	protected int g000_REF_Count = 1;


	/**
	 * Counter for g001 N1
	 */
	protected int g001_N1_Count = 1;


	/**
	 * Unit of basis for measurement code
	 */
	protected String g006_IT1_e03_0355 = "";


	/**
	 * IT1 Line number
	 */
	protected int g006_IT1_LineNo = 0;


	/**
	 * Invoice date
	 */
	protected String IDAT = "";


	/**
	 * Invoice prefix
	 */
	protected String INPX = "";


	/**
	 * Required breaklevel and sorting
	 */
	protected String ITDE = "";


	/**
	 * Item description
	 */
	protected String ITDS = "";


	/**
	 * Item number
	 */
	protected String ITNO = "";


	/**
	 * Invoice number
	 */
	protected String IVNO = "";


	/**
	 * Invoice reference
	 */
	protected String IVRF = "";


	/**
	 * Information type
	 */
	protected String IVTP = "";


	/**
	 * Message copy
	 */
	protected String MessageCopy = "";


	/**
	 * Message Date
	 */
	protected String MessageDate = "";


	/**
	 * Message time
	 */
	protected String MessageTime = "";


	/**
	 * Method of delivery
	 */
	protected String MODL = "";


	/**
	 * Number of Deliveries
	 */
	protected int NoOfDeliveries = 0;


	/**
	 * NumberOfPackages
	 */
	protected int NoOfPackages = 0;


	/**
	 * Order date
	 */
	protected String ORDT = "";


	/**
	 * Order number
	 */
	protected String ORNO = "";


	/**
	 * Order type
	 */
	protected String ORTP = "";


	/**
	 * Discount percent
	 */
	protected String OTDP = "";


	/**
	 * Partner alias category
	 */
	protected String PAAC = "";


	/**
	 * Partner alias
	 */
	protected String PAAL = "";


	/**
	 * Partner alias Ship To
	 */
	protected String PAAL_ST = "";


	/**
	 * Partner alias, supplier
	 */
	protected String PAAL_SU = "";


	/**
	 * Partner alias sublevel 1
	 */
	protected String PAI1 = "";


	/**
	 * Partner ID
	 */
	protected String PAID = "";


	/**
	 * Package number
	 */
	protected String PANR = "";


	/**
	 * Requested sort order
	 */
	protected String PASO = "";


	/**
	 * Package content
	 */
	protected String PCON = "";


	/**
	 * Partner category
	 */
	protected String PCTG = "";


	/**
	 * Postal code
	 */
	protected String PONO = "";


	/**
	 * Line number
	 */
	protected String PONR = "";


	/**
	 * Alias number
	 */
	protected String POPN = "";


	/**
	 * Line suffix
	 */
	protected String POSX = "";


	/**
	 * Qualifying partner  category
	 */
	protected String QCTG = "";


	/**
	 * Qualifier
	 */
	protected String QLFI = "";


	/**
	 * Value for qualifier
	 */
	protected String QLFV = "";


	/**
	 * Partner alias category
	 */
	protected String QPAI = "";


	/**
	 * Invoice quantity - alternate UM
	 */
	protected String QTY5 = "";


	/**
	 * Sales price quantity
	 */
	protected String SACD = "";


	/**
	 * Sales price
	 */
	protected String SAPR = "";


	/**
	 * Sorting structure for LstInvLineByType IVTP = 31
	 */
	protected SortingStructure SS_31 = new SortingStructure(5);


	/**
	 * Sorting structure for LstInvByType IVTP = 32 + 67
	 */
	protected SortingStructure SS_32_67 = new SortingStructure(5);


	/**
	 * Sorting structure for LstInvLineByType IVTP = 35 + 60
	 */
	protected SortingStructure SS_35_60 = new SortingStructure(3);


	/**
	 * Delivery terms
	 */
	protected String TEDL = "";


	/**
	 * Terms of Payment
	 */
	protected String TEPY = "";


	/**
	 * Total amount IVTP = 35
	 */
	protected double Tot_35 = 0;


	/**
	 * Total number of units
	 */
	protected double Tot_QTY5 = 0;


	/**
	 * TotDiscAmt
	 */
	protected double TotDiscAmt = 0;


	/**
	 * Translate qualifier
	 */
	protected String TranslQual = "Y";


	/**
	 * Terms of payment, text
	 */
	protected String TXPY = "";


	/**
	 * warehouse
	 */
	protected String WHLO = "";


	/**
	 * Year
	 */
	protected String YEA4 = "";


	/**
	 * This map object
	 */
	protected final Object myMap = this;

	public void mapMain() {}
}
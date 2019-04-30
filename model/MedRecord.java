/**
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID : 1144105003<br>
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)<br>
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I<br>
 * LAB FOR VETERINARY MI PEQUENIA MASCOTA CODE<br>
 * @author: JUAN SEBASTIÁN BARRERA PULIDO <juan.barrera4@correo.icesi.edu.co><br>
 * @LAST UPDATE DATE: 28 APRIL 2019<br>
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 */

package model;
import java.util.*;

/**
 * This class controls all the records.<br>
 * @author Sebastián Barrera.<br>
 */
public class MedRecord {

	//--------------------------------------------------------------------------------------------------

	//Constant

	//--------------------------------------------------------------------------------------------------
	public final static String OPEN = "Open";
	public final static String CLOSED = "Closed";
	public final static int PRICE_10 = 10000;
	public final static int PRICE_12 = 12000;
	public final static int PRICE_15 = 15000;
	public final static int PRICE_17 = 17000;
	public final static int PRICE_20 = 20000;
	public final static int PRICE_25 = 25000;
	public final static int PRICE_30 = 30000;
	public final static int PRICE_33 = 33000;

	//--------------------------------------------------------------------------------------------------

	//Attributes

	//--------------------------------------------------------------------------------------------------
	private String petInfo;
	private String ownerInfo;
	private String symptoms;
	private String diagnosys;
	private String status;
	private double fee;

	//--------------------------------------------------------------------------------------------------

	//Relations

	//--------------------------------------------------------------------------------------------------
	private DateIn entryDate;
	private DateIn dateOut;
	private Pet sick;
	private ArrayList<ReqMed> meds;

	//--------------------------------------------------------------------------------------------------

	//Methods

	//--------------------------------------------------------------------------------------------------

	/**
	 * MedRecord constructor
	 * @param petInfo Is the information of the pet<br>
	 * @param ownerInfo Is the information of the owner of the pet<br>
	 * @param symptoms Are the symptoms of the pet<br>
	 * @param diagnosys Are the diagnostics of the pet<br>
	 * @param status Is the status of the pet<br>
	 * @param entryDate A Date object of the entry date<br>
	 * @param sick A Pet object of the current pet<br>
	 */
	public MedRecord(String petInfo, String ownerInfo, String symptoms, String diagnosys, 
					 String status, DateIn entryDate, Pet sick ) {
		this.petInfo = petInfo;
		this.ownerInfo = ownerInfo;
		this.symptoms = symptoms;
		this.diagnosys = diagnosys;
		this.status = status;
		this.entryDate = entryDate;
		this.sick = sick;
		meds = new ArrayList<ReqMed>();
		this.fee = calculatingFee();
	}

	/**
	 * <b>Gets</b> the information of the pet<br>
	 * @return an <code>String</code> specifying the information of the pet.<br>
	 */
	public  String getPetInfo() {
		return petInfo;
	}

	/**
	 * <b>Sets</b> the dose of the medicine.<br>
	 * @param petInfo The dose of the medicine<br>
	 */
	public void setPetInfo(String petInfo) {
		this.petInfo = petInfo;
	}

	/**
	 * <b>Gets</b> the information of the owner of the pet<br>
	 * @return an <code>String</code> specifying the information of the owner of the pet.<br>
	 */
	public  String getOwnerInfo() {
		return ownerInfo;
	}

	/**
	 * <b>Sets</b> the dose of the medicine.<br>
	 * @param ownerInfo The dose of the medicine<br>
	 */
	public void setOwnerInfo(String ownerInfo) {
		this.ownerInfo = ownerInfo;
	}

	/**
	 * <b>Gets</b> the symptoms of the pet<br>
	 * @return an <code>String</code> specifying the symptoms of the pet.<br>
	 */
	public  String getSymptoms() {
		return symptoms;
	}

	/**
	 * <b>Sets</b> the dose of the medicine.<br>
	 * @param symptoms The dose of the medicine<br>
	 */
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	/**
	 * <b>Gets</b> the diagnostics of the pet<br>
	 * @return an <code>String</code> specifying the diagnostics of the pet.<br>
	 */
	public  String getDiagnosys() {
		return diagnosys;
	}

	/**
	 * <b>Sets</b> the dose of the medicine.<br>
	 * @param diagnosys The dose of the medicine<br>
	 */
	public void setDiagnosys(String diagnosys) {
		this.diagnosys = diagnosys;
	}

	/**
	 * <b>Gets</b> the status of the pet<br>
	 * @return an <code>String</code> specifying the status of the pet.<br>
	 */
	public  String getStatus() {
		return status;
	}

	/**
	 * <b>Sets</b> the dose of the medicine.<br>
	 * @param status The dose of the medicine<br>
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * <b>Gets</b> the Date object of the entry date<br>
	 * @return an <code>DateIn</code> specifying the Date object of the entry date.<br>
	 */
	public  DateIn getDateInn() {
		return entryDate;
	}

	/**
	 * <b>Sets</b> the dose of the medicine.<br>
	 * @param entryDate The dose of the medicine<br>
	 */
	public void setDateInn(DateIn entryDate) {
		this.entryDate = entryDate;
	}

	/**
	 * <b>Gets</b> the Date object of the out date<br>
	 * @return an <code>DateIn</code> specifying the Date object of the out date.<br>
	 */
	public  DateIn getDateOut() {
		return dateOut;
	}
	
	/**
	 * <b>Sets</b> the dose of the medicine.<br>
	 * @param dateOut The dose of the medicine<br>
	 */
	public void setDateOut(DateIn dateOut) {
		this.dateOut = dateOut;
	}

	/**
	 * <b>Gets</b> the mPet object of the current pet<br>
	 * @return an <code>Pet</code> specifying the Pet object of the current pet.<br>
	 */
	public  Pet getSick() {
		return sick;
	}

	/**
	 * <b>Sets</b> the dose of the medicine.<br>
	 * @param sick The dose of the medicine<br>
	 */
	public void setSick(Pet sick) {
		this.sick = sick;
	}

	/**
	 * <b>Gets</b> the cost of the hospitalization<br>
	 * @return an <code>String</code> specifying the cost of the hospitalization.<br>
	 */
	public  double getFee() {
		return fee;
	}

	/**
	 * <b>Sets</b> the dose of the medicine.<br>
	 * @param fee The dose of the medicine<br>
	 */
	public void setFee(double fee) {
		this.fee = fee;
	}

	/**
	 * Add all de medicine to the record
	 * @param petsMeds an arrayList of the medicines
	 */
	public void addMeds(ArrayList<ReqMed> petsMeds) {
		meds = petsMeds;
	}

	/**
	 * Calculate the price of the hospitalization
	 * @return an <code>double</code> specifying the hospitalization price
	 */
	public double calculatingFee() {
		double total = 0.0;
		if (sick !=  null) {
			if (dateOut == null) {
				Calendar today = new GregorianCalendar();
				int monthT = today.get(Calendar.MONTH) + 1;
				int dayT = today.get(Calendar.DATE);	
				int yearT = today.get(Calendar.YEAR);
				dayT -= entryDate.getDay();					
				monthT = (monthT - entryDate.getMonth()) * 30;
				yearT = (yearT - entryDate.getYear()) * 360;
				int daysDifference = (dayT + monthT + yearT);
				switch (sick.getType()) {
					case Pet.DOG:
						if (sick.getWeight() >= 1.0 && sick.getWeight() <= 3.0 ) {
							total = (double)(daysDifference * PRICE_15);
						} else if (sick.getWeight() > 3.0 && sick.getWeight() <= 10.0 ) {
							total = (double)(daysDifference * PRICE_17);
						} else if (sick.getWeight() > 10.0 && sick.getWeight() <= 20.0 ) {
							total = (double)(daysDifference * PRICE_20);
						} else if (sick.getWeight() > 20.0) {
							total = (double)(daysDifference * PRICE_25);
						}
					break;
					case Pet.CAT:
						if (sick.getWeight() >= 1.0 && sick.getWeight() <= 3.0 ) {
							total = (double)(daysDifference * PRICE_10);			
						} else if (sick.getWeight() > 3.0 && sick.getWeight() <= 10.0 ) {
							total = (double)(daysDifference * PRICE_12);
						} else if (sick.getWeight() > 10.0 && sick.getWeight() <= 20.0 ) {
							total = (double)(daysDifference * PRICE_15);
						} else if (sick.getWeight() > 20.0) {
							total = (double)(daysDifference * PRICE_20);
						}
					break;
					case Pet.BIRD: 
						if (sick.getWeight() >= 1.0 && sick.getWeight() <= 3.0 ) {
								total = (double)(daysDifference * PRICE_10);
						
						} else if (sick.getWeight() > 3.0 && sick.getWeight() <= 10.0 ) {
							total = (double)(daysDifference * PRICE_12);
						} else if (sick.getWeight() > 10.0 && sick.getWeight() <= 20.0 ) {
							total = (double)(daysDifference * PRICE_20);
						} else if (sick.getWeight() > 20.0) {
							total = (double)(daysDifference * PRICE_25);
							}
					break;
					case Pet.OTHER:
						if (sick.getWeight() >= 1.0 && sick.getWeight() <= 3.0 ) {
							total = (double)(daysDifference * PRICE_10);		
						} else if (sick.getWeight() > 3.0 && sick.getWeight() <= 10.0 ) {
							total = (double)(daysDifference * PRICE_17);
						} else if (sick.getWeight() > 10.0 && sick.getWeight() <= 20.0 ) {
							total = (double)(daysDifference * PRICE_30);
						} else if (sick.getWeight() > 20.0) {
							total = (double)(daysDifference * PRICE_33);
						}
					break;	
				}				
				for (int i = 0; i < meds.size() ; i++ ) {
					total += meds.get(i).priceMed() ;
				}					
			}else {
				int dayE = dateOut.getDay();					
				int monthE = dateOut.getMonth();					
				int yearE = dateOut.getYear();
				dayE -= entryDate.getDay();					
				monthE = (monthE - entryDate.getMonth()) * 30;					
				yearE = (yearE - entryDate.getYear()) * 360;
				int daysDifferenceWithEndDate = (dayE + monthE+ yearE);
				switch (sick.getType()) {
					case Pet.DOG:
						if (sick.getWeight() >= 1.0 && sick.getWeight() <= 3.0 ) {
							total = (double)(daysDifferenceWithEndDate * PRICE_15);
						} else if (sick.getWeight() > 3.0 && sick.getWeight() <= 10.0 ) {
							total = (double)(daysDifferenceWithEndDate * PRICE_17);
						} else if (sick.getWeight() > 10.0 && sick.getWeight() <= 20.0 ) {
							total = (double)(daysDifferenceWithEndDate * PRICE_20);
						} else if (sick.getWeight() > 20.0) {
							total = (double)(daysDifferenceWithEndDate * PRICE_25);
						}
					break;
					case Pet.CAT:
						if (sick.getWeight() >= 1.0 && sick.getWeight() <= 3.0 ) {
							total = (double)(daysDifferenceWithEndDate * PRICE_10);
						} else if (sick.getWeight() > 3.0 && sick.getWeight() <= 10.0 ) {
							total = (double)(daysDifferenceWithEndDate * PRICE_12);
						} else if (sick.getWeight() > 10.0 && sick.getWeight() <= 20.0 ) {
							total = (double)(daysDifferenceWithEndDate * PRICE_15);
						} else if (sick.getWeight() > 20.0) {
							total = (double)(daysDifferenceWithEndDate * PRICE_20);
						}
					break;
					case Pet.BIRD: 
						if (sick.getWeight() >= 1.0 && sick.getWeight() <= 3.0 ) {
							total = (double)(daysDifferenceWithEndDate * PRICE_10);								
						} else if (sick.getWeight() > 3.0 && sick.getWeight() <= 10.0 ) {
							total = (double)(daysDifferenceWithEndDate * PRICE_12);
						} else if (sick.getWeight() > 10.0 && sick.getWeight() <= 20.0 ) {
							total = (double)(daysDifferenceWithEndDate * PRICE_20);
						} else if (sick.getWeight() > 20.0) {
							total = (double)(daysDifferenceWithEndDate * PRICE_25);
						}
					break;
					case Pet.OTHER:
						if (sick.getWeight() >= 1.0 && sick.getWeight() <= 3.0 ) {
							total = (double)(daysDifferenceWithEndDate * PRICE_10);
						} else if (sick.getWeight() > 3.0 && sick.getWeight() <= 10.0 ) {
							total = (double)(daysDifferenceWithEndDate * PRICE_17);
						} else if (sick.getWeight() > 10.0 && sick.getWeight() <= 20.0 ) {
							total = (double)(daysDifferenceWithEndDate * PRICE_30);
						} else if (sick.getWeight() > 20.0) {
							total = (double)(daysDifferenceWithEndDate * PRICE_33);
						}
					break;
				}
				for (int in = 0 ; in < meds.size() ; in++ ) {
					total = total + meds.get(in).priceMed() ;
				}				
			}
		}
		return total;
	} 

	/**
	 * Shows al the medical record
	 * @return an <code>String</code> specifying the medicine record
	 */	 
	public String medRecordInfo() {
		String msg = "\n";
				msg += "\n";
		    	msg += "+-----------------------------------------------------------------------------+\n";
				msg += "| ****************************** MEDICAL RECORD ***************************** +\n";
				msg += "+-----------------------------------------------------------------------------+\n";
				msg += "|\n";
				msg += petInfo;
				msg += ownerInfo;
				msg += "|\n";
				msg += "| The date when this hospitalization started is: " +entryDate.convertDateToString()+"\n";
				if (dateOut != null) {
					msg += "| The date when this hospitalization ended is:" +dateOut.convertDateToString()+"\n";
				}		   
				msg += "| The symptoms are: "+symptoms+"\n";
				msg += "| The diagnosys is: "+diagnosys+"\n";
				msg += "| The status is: "+status+"\n";
				msg += "| The cost is: "+fee+"\n";
				msg += "|\n";
				msg += "+-----------------------------------------------------------------------------+\n";
				msg += "| Prescribed medications:\n";
				msg += "|\n";
				int number = 0;
				for (int i = 0; i < meds.size() ; i++ ) {
					++number;
					msg += "| Med #"+number+"\n";
					msg += meds.get(i).showMedsinfo();			
				}
				msg += "+-----------------------------------------------------------------------------+\n";
		return msg;
	}

	/**
	 * Add a new medicine to the record
	 * @param medInMatter is the medicine
	 */
	public void addNewMed(ReqMed medInMatter) {
		meds.add(medInMatter);
	}

 }
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

/**
 * This class maintains the the medicine an their information.<br>
 * @author Sebastián Barrera.<br>
 */
public class ReqMed{

	//--------------------------------------------------------------------------------------------------

	//Constant

	//--------------------------------------------------------------------------------------------------

	//--------------------------------------------------------------------------------------------------

	//Attributes

	//--------------------------------------------------------------------------------------------------
	private String name;
	private double dose; 
	private double pricePerDose;
	private String frecuency;

	//--------------------------------------------------------------------------------------------------

	//Relations

	//--------------------------------------------------------------------------------------------------

	//--------------------------------------------------------------------------------------------------

	//Methods

	//--------------------------------------------------------------------------------------------------
	
	/**
	 * ReqMed constructor<br>
	 * @param name Is the medicine name<br>
	 * @param dose Is the dose of the medicine<br>
	 * @param pricePerDose Is the price of the dose<br>
	 * @param frecuency Is the frecuency of application of the dose <br>
	 */
	public ReqMed(String name, double dose, double pricePerDose, String frecuency){
		this.name = name;
		this.dose = dose;
		this.pricePerDose = pricePerDose;
		this.frecuency = frecuency;
	}

	/**
	 * <b>Gets</b> the medicine name<br>
	 * @return an <code>String</code> specifying the medicine name.<br>
	 */
	public  String getName() {
		return name;
	}

	/**
	 * <b>Sets</b> the medicine name.<br>
	 * @param name The medicine name<br>
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <b>Gets</b> the dose of the medicine<br>
	 * @return an <code>double</code> specifying the dose of the medicine.<br>
	 */
	public  double getDose() {
		return dose;
	}

	 
	public void setDose(double dose) {
		this.dose = dose;
	}

	/**
	 * <b>Gets</b> the price of the dose<br>
	 * @return an <code>double</code> specifying the price of the dose.<br>
	 */
	public  double getPricePerDose() {
		return pricePerDose;
	}

	/**
	 * <b>Sets</b> the price of the medicine.<br>
	 * @param pricePerDose The price of the medicine<br>
	 */
	public void setPricePerDose(double pricePerDose) {
		this.pricePerDose = pricePerDose;
	}

	/**
	 * <b>Gets</b> the frecuency of application of the dose <br>
	 * @return an <code>String</code> specifying the frecuency of application of the dose.<br>
	 */
	public  String getFrecuency() {
		return frecuency;
	}

	/**
	 * <b>Sets</b> the frecuency of application of the dose.<br>
	 * @param frecuency The frecuency of application of the dose <br>
	 */
	public void setFrecuency(String frecuency) {
		this.frecuency = frecuency;
	}

	/**
	 * Calculate de medicine price
	 * @return an <code>double</code> specifying the medicine price
	 */
	public double priceMed(){
		double total = dose * pricePerDose;
		return total;
	}

	/**
	 * Shows all the medicine information
	 * @return an <code>String</code> specifying the medicine information
	 */
	public String showMedsinfo(){
		String msg = "";
		msg += "| Prescribed medication's name is: "+name+"\n";
		msg += "| Prescribed medication's dose is: "+dose+"\n";
		msg += "| Prescribed medication's price per dose is: "+pricePerDose+"\n";
		msg += "| Prescribed medication's frecuency is: "+frecuency+"\n";
		msg += "| \n";
		return msg;
	}

 }
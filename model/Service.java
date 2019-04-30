/**
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID : 1144105003
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR VETERINARY MI PEQUENIA MASCOTA CODE
 * @author: JUAN SEBASTIÁN BARRERA PULIDO <juan.barrera4@correo.icesi.edu.co>
 * @LAST UPDATE DATE: 28 APRIL 2019
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 */

package model;

/**
 * This class maintains the service and all the information about it.
 * @see java.lang.Object
 * @author Sebastián Barrera.
 */
public class Service{

	//--------------------------------------------------------------------------------------------------

	//Constant

	//--------------------------------------------------------------------------------------------------
	public final static double BATHP = 20000.0 ;
	public final static double BATHDOMP = 30000.0;
	public final static double TEETHP = 12000.0;
	public final static double NAILSP = 8000.0;
	public final static double SHOTP = 45000.0;
	public final static char BATH = 'b';
	public final static char BATHDOM = 'd';
	public final static char TEETH = 't';
	public final static char NAILS = 'n';
	public final static char SHOT = 's';

	//--------------------------------------------------------------------------------------------------

	//Attributes

	//--------------------------------------------------------------------------------------------------
	private char type;
	private double price;
	private String ownerId;
	private String petId;

	//--------------------------------------------------------------------------------------------------

	//Relations

	//--------------------------------------------------------------------------------------------------
	private Pet clientPet;
	private DateIn serviceDate;

	//--------------------------------------------------------------------------------------------------

	//Methods

	//--------------------------------------------------------------------------------------------------
	
	/**
	 * Service constructor<br>
	 * @param type Is the type of service<br>
	 * @param ownerId Is the id of the owner<br>
	 * @param petId Is the id of the pet<br>
	 * @param pet A Pet object with which to initialize<br>
	 * @param serviceDate Is the day of the service<br>
	 */
	public Service(char type, String ownerId, String petId, Pet pet, DateIn serviceDate){
		this.type = type;
		this.ownerId = ownerId;
		this.petId = petId;
		this.serviceDate = serviceDate;
		price = setInitialPrice();
	}

	/**
	 * <b>Gets</b> the service<br>
	 * @return an <code>char</code> specifying the service.<br>
	 */
	public  char getType() {
		return type;
	}

	/**
	 * <b>Sets</b> the client id.<br>
	 * @param type The client id<br>
	 */
	public void setType(char type) {
		this.type = type;
	}

	/**
	 * <b>Gets</b> the price of the service<br>
	 * @return an <code>double</code> specifying the price of the service.<br>
	 */
	public  double getPrice() {
		return price;
	}

	/**
	 * <b>Gets</b> the id of the owner<br>
	 * @return an <code>String</code> specifying the id of the owner.<br>
	 */
	public  String getOwnerId() {
		return ownerId;
	}

	/**
	 * <b>Sets</b> the client id.<br>
	 * @param ownerId The client id<br>
	 */
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	/**
	 * <b>Gets</b> the id of the pet<br>
	 * @return an <code>String</code> specifying the id of the pet.<br>
	 */
	public  String getPetId() {
		return petId;
	}

	/**
	 * <b>Sets</b> the pet id.<br>
	 * @param petId The pet id<br>
	 */
	public void setPetId(String petId) {
		this.petId = petId;
	}

	/**
	 * <b>Sets</b> the initial price of the service.<br>
	 * @return an <code>double</code> specifying the initial price
	 */
	public double setInitialPrice(){
		double cost = 0.0;
		switch (type) {
			case 'b':
				cost = BATHP;
			break;
			case 'd':
				cost = BATHDOMP;
			break;
			case 't':
				cost = TEETHP;
			break;
			case 'n':
				cost = NAILSP;
			break;
			case 's':
				cost = SHOTP;
			break;	
		}
		return cost;
	}

	/**
	 * Shows all the information of the service
	 * @return an <code>String</code> specifying the service information
	 */
	public String toString(){
		String msg = "\n";
		msg += "\n";
		msg += "+-----------------------------------------------------------------------------+\n";
		msg += "| Service: "+type2String(type)+"\n";
		msg += "| Price: "+price+" COP\n";
		msg += "| Owner ID: "+ownerId+"\n";
		msg += "| Pet's name: " +petId+ "\n";
		msg += "| Date of the service: " +serviceDate.convertDateToString()+"\n";
		msg += "+-----------------------------------------------------------------------------+\n";
		return msg;
	}

	/**
	 * convert a char constant in a String of the service
	 * @param type Is the type of service  
	 * @return an <code>String</code> specifying the service
	 */
	public String type2String(char type){
		String word = "";
		switch (type) {
			case BATH:
				word = "Bath";
			break;
			case BATHDOM:
				word = "Bath to go";
			break;
			case TEETH:
				word = "Dental prophylaxis";
			break;
			case NAILS:
				word = "Cutting nails";
			break;
			case SHOT:
				word = "Vaccination";
			break;	
		}
		return word;
	}

}
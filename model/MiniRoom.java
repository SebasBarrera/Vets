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
 * This class contain the information about the mini rooms.<br>
 * @author Sebastián Barrera.<br>
 */
public class MiniRoom { 

	//--------------------------------------------------------------------------------------------------

	//Constant

	//--------------------------------------------------------------------------------------------------
	public final static int ALLROOMS = 8;

	//--------------------------------------------------------------------------------------------------

	//Attributes

	//-------------------------------------------------------------------------------------------------- 
	private boolean available;
	private int numberOfMiniRoom;
	private String pet;
	private String owner;

	//--------------------------------------------------------------------------------------------------

	//Relations

	//--------------------------------------------------------------------------------------------------
	private Pet guest;

	//--------------------------------------------------------------------------------------------------

	//Methods

	//--------------------------------------------------------------------------------------------------

	/**
	 * MiniRoom constructor<br>
	 * @param available Is the availability of the mini room<br>
	 * @param numberOfMiniRoom Is the number of the mini room<br>
	 * @param pet Is the name of the pet that is in the mini room. If there isn't a pet is a empty String <br>
	 * @param owner Is the name of the owner of the pet that is in the mini room. If there isn't a pet is a empty String <br>
	 * @param guest Is the object of the pet in the mini room<br>
	 */
	public MiniRoom(boolean available, int numberOfMiniRoom, String pet, String owner, Pet guest){
		this.available = available;
		this.numberOfMiniRoom = numberOfMiniRoom;
		this.pet = pet;
		this.owner = owner;
		this.guest = guest;
	}

	/**
	 * <b>Gets</b> the availability of the mini room<br>
	 * @return an <code>boolean</code> specifying the availability of the mini room.<br>
	 */
	public boolean getAvailable() {
		return available;
	}

	/**
	 * <b>Sets</b> the dose of the medicine.<br>
	 * @param available The dose of the medicine<br>
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}

	/**
	 * <b>Gets</b> the number of the mini room<br>
	 * @return an <code>integer</code> specifying the number of the mini room.<br>
	 */
	public  int getNumberOfMiniRoom() {
		return numberOfMiniRoom;
	}

	/**
	 * <b>Sets</b> the dose of the medicine.<br>
	 * @param numberOfMiniRoom The dose of the medicine<br>
	 */
	public void setNumberOfMiniRoom(int numberOfMiniRoom) {
		this.numberOfMiniRoom = numberOfMiniRoom;
	}

	/**
	 * <b>Gets</b> the name of the pet<br>
	 * @return an <code>String</code> specifying the name of the pet.<br>
	 */
	public  String getPet() {
	return pet;
	}

	/**
	 * <b>Sets</b> the dose of the medicine.<br>
	 * @param pet The dose of the medicine<br>
	 */
	public void setPet(String pet) {
		this.pet = pet;
	}

	/**
	 * <b>Gets</b> the name of the owner of the pet<br>
	 * @return an <code>String</code> specifying the name of the owner of the pet.<br>
	 */
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * <b>Gets</b> the Pet object of the pet in the mini room<br>
	 * @return an <code>Pet</code> specifying the Pet object of the pet in the mini room.<br>
	 */
	public Pet getHostage() {
		return guest;
	}

	/**
	 * <b>Sets</b> the dose of the medicine.<br>
	 * @param guest The dose of the medicine<br>
	 */
	public void setHostage(Pet guest) {
		this.guest = guest;
	}

	/**
	 * Shows a reply if the name has no founded 
	 * @param theName is the name 
	 * @param kind says if is a client or a patient
	 * @return an <code>String</code> specifying the
	 */ 
	public String checkIfItsHospitalized(int kind, String theName){
		String msg = "";
		switch (kind) {
			case 1: 
				if (theName.equalsIgnoreCase(owner)){
					
				}
				else{
					msg += "ERROR: No match found\n";
				}
			break;
			case 2:
				if (theName.equalsIgnoreCase(pet)){
					
				}
				else{
					msg += "ERROR: No match found\n";
				}
			break;
			default:
			break;
		}
		return msg;
	}

}
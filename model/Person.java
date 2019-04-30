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
 * This class contains all the information of the client.<br>
 * @author Sebastián Barrera.<br>
 */
public class Person {

	//--------------------------------------------------------------------------------------------------

	//Constant

	//--------------------------------------------------------------------------------------------------

	//--------------------------------------------------------------------------------------------------

	//Attributes

	//--------------------------------------------------------------------------------------------------
	private String name;
	private String id;
	private String address;
	private String phone;

	//--------------------------------------------------------------------------------------------------

	//Relations

	//--------------------------------------------------------------------------------------------------
	private ArrayList<Pet> pets;

	//--------------------------------------------------------------------------------------------------

	//Methods

	//--------------------------------------------------------------------------------------------------

	/**
	 * Person constructor<br>
	 * @param name Is the client name<br>
	 * @param id Is the client id<br>
	 * @param address Is the client address <br>
	 * @param phone Is the client phone<br>
	 */
	public Person(String name, String id, String address, String phone){
		this.name = name;
		this.id = id;
		this.address = address;
		this.phone = phone;
		pets = new ArrayList<Pet>(); 
	}

	/**
	 * <b>Gets</b> the client name<br>
	 * @return an <code>String</code> specifying the client name.<br>
	 */
	public  String getName() {
		return name;
	}

	/**
	 * <b>Sets</b> the client name.<br>
	 * @param name The client name<br>
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <b>Gets</b> the client id   <br>
	 * @return an <code>String</code> specifying the client id.<br>
	 */
	public  String getId() {
		return id;
	}

	/**
	 * <b>Sets</b> the client id.<br>
	 * @param id The client id<br>
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * <b>Gets</b> the client address<br>
	 * @return an <code>String</code> specifying the client address.<br>
	 */
	public  String getAddress() {
		return address;
	}

	/**
	 * <b>Sets</b> the client address.<br>
	 * @param address The client address<br> 
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * <b>Gets</b> the client phone<br>
	 * @return an <code>String</code> specifying the client phone.<br>
	 */
	public  String getPhone() {
		return phone;
	}

	/**
	 * <b>Sets</b> the client phone.<br>
	 * @param phone The client phone<br>
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * create a new pets objects in ta arrayList
	 * @param clientsPets a list of pets
	 */
	public void createPet(ArrayList<Pet> clientsPets){
		pets = clientsPets;
	}

	/**
	 * show the client informtation
	 * @return an <code>String</code> specifying the client information
	 */
	public String showMyinfo(){
		String msg = "";
		msg += "+--------------------------------------------------------------+\n";
		msg += "| The client's name is: "+name+"\n";
		msg += "| The client's id is: "+id+"\n";
		msg += "| The client's address is: "+address+"\n";
		msg += "| The client's phone number is: "+phone+"\n";
		msg += "+--------------------------------------------------------------+\n";
		msg += "| \n";
		msg += "| The client's pets are:\n";
		msg += "| \n";
		int number = 0;
		for (int i = 0; i < pets.size() ; i++ ) {
			++number;
			msg += "| Pet #"+number+"\n";
			msg += pets.get(i).showPetsinfo();		
		}
		msg += "+--------------------------------------------------------------+\n";
		return msg;
	}

	/**
	 * show the information of the owner
	 * @return an <code>String</code> specifying the owner information
	 */
	public String contactInfo(){
		String msg = "";
		msg += "+--------------------------------------------------------------+\n";
		msg += "| The owner's name is: "+name+"\n";
		msg += "| The owner's id is: "+id+"\n";
		msg += "| The owner's address is: "+address+"\n";
		msg += "| The owner's phone number is: "+phone+"\n";
		msg += "+--------------------------------------------------------------+\n";
		return msg;
	}

	/**
	 * review if there is a pet with that name
	 * @param theName the name of the pet
	 * @return an <code>boolean</code> specifying if there is a pet
	 */
	public boolean reviewPet(String theName){
		boolean hasIt = false;
		for (int i = 0; i < pets.size() && !hasIt ; i++ ) {
			if ((pets.get(i).getName()).equalsIgnoreCase(theName)) {
				hasIt = true;
			}
		}
		return hasIt;
	}

	/**
	 * Hospitalize a pet
	 * @param petsName the name of the pet
	 * @param newMedRec the medicine record
	 * @param petsMeds the medicines of the pet
	 */
	public void startHospitalizePers(String petsName, MedRecord newMedRec, ArrayList<ReqMed> petsMeds){
		Pet pet = givePet(petsName);
		if(pet != null){
			pet.addMedRec(newMedRec, petsMeds);
		}
	}

	/**
	 * take a pet object
	 * @param theName the name of the pet
	 * @return an object <code>Pet</code> specifying the
	 */
	public Pet givePet(String theName){
		Pet found = null;
		boolean hasIt = false;
		for (int i = 0; i < pets.size() && !hasIt ; i++ ) {
			if ((pets.get(i).getName()).equalsIgnoreCase(theName)) {
				hasIt = true;
				found = pets.get(i);
			}
		}
		return found;
	}

	/**
	 * the gather for pet
	 * @return an <code>double</code> specifying the fee
	 */
	public double myBill(){
		double bill = 0.0;
		for (int i = 0; i < pets.size(); i++ ) {
			bill += pets.get(i).gatherCosts();
		}
		return bill;
	}

	/**
	 * count how many hospitalizations have
	 * @return an <code>integrer</code> specifying the hospitalizations times
	 */
	public int countHospitalizations(){
		int counter = 0;
		for (int i = 0; i < pets.size(); i++ ) {
			counter += pets.get(i).countMyHospitalizations();
		}
		return counter;	
	}

	/**
	 * @param petsName the pets name<br>
	 * @param edition what the user want to edit<br>
	 * @param symptomsEdit the new symptons<br>
	 * @param diagnosysEdit the new diagnosys<br>
	 * @param medsName the medicine name<br>
	 * @param medsDose the medicine dose<br>
	 * @param medsPrice the medicine price <br>
	 * @param medsFrecuency the medicine frecuency<br>
	 * @return an <code>String</code> specifying the persone located<br>
	 */
	public String locatePet2AddStuff(String petsName, int  edition, String symptomsEdit, String diagnosysEdit, 
									 String medsName, double medsDose, double medsPrice, String medsFrecuency){
		String msg = "";
		Pet pet = givePet(petsName);
		switch (edition) {
			case 1: 
				pet.addSymptoms(symptomsEdit);
			break;
			case 2: 
				pet.addDiagnosys(diagnosysEdit);
			break;
			case 3:
				msg += pet.addMedicine(medsName, medsDose, medsPrice, medsFrecuency);
			break;	
		}
		return msg;
	}

	/**
	*Description This method allows to update the basic data of a veterinary client, these data include, address and phone number.<br>
	*<b>pre:</b> The client was created before.<br>
	*<b>post:</b> The address and /or phone number of the client is updated.<br>
	*@param newAddress Is the new address of the client. This param could be empty.<br>
	*@param newPhone Is the new phone number of the client. This param could be empty.<br>
	*/
	public void modifyAddressOrPhone(String newAddress, String newPhone){
		if(newAddress.equalsIgnoreCase("")){
			phone = newPhone;
		} else {
			address = newAddress;
		}
	}

	/**
	 * shows all the fees of the services
	 * @param serviceSelection is the user selection for the service
	 * @return an <code>double</code> specifying all the pet services fees
	 */
	public double allPetsServicesFees(int serviceSelection){
		double msg = 0.0;
		switch (serviceSelection) {
			case 0:
				msg += petsFeeServices(1);
				msg += petsFeeServices(2);
				msg += petsFeeServices(3);
				msg += petsFeeServices(4);
				msg += petsFeeServices(5);
			break;
			default:
				msg = petsFeeServices(serviceSelection);	
			break;	
		}
		return msg;
	}

	/**
	 * shows all the fee services
	 * @param serviceSelection is the user selection for the service
	 * @return an <code>double</code> specifying the
	 */
	public double petsFeeServices(int serviceSelection){
		double msg = 0.0;
		for (int i = 0; i<pets.size() ; i++ ) {
			msg += pets.get(i).servicesFees(serviceSelection);	
		}
		return msg;
	}

	/**
	 * start a service 
	 * @param clientPet the pet to the service
	 * @param newService the service
	 */
	public void startServicePers(Pet clientPet, Service newService){
		clientPet.addService(newService);
	}

 }
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
 * This is the principal class.
 * @see java.lang.Object
 * @author Sebastián Barrera.
 */
public class Veterinary{

	//--------------------------------------------------------------------------------------------------

	//Constant

	//--------------------------------------------------------------------------------------------------

	//--------------------------------------------------------------------------------------------------

	//Attributes

	//--------------------------------------------------------------------------------------------------
	private String name;

	//--------------------------------------------------------------------------------------------------

	//Relations

	//--------------------------------------------------------------------------------------------------
	private ArrayList<Person> clientsOwners;
	private MiniRoom[] rooms;

	//--------------------------------------------------------------------------------------------------

	//Methods

	//--------------------------------------------------------------------------------------------------

	/**
     * Veterinary no-argument constructor initializes the name of the veterinary,<br>
     * the array of mini rooms and the arrayList that contains the clientsAAA.<br>
     */
	public Veterinary(){
		this.name = "Mi Pequenia Mascota";
		rooms = new MiniRoom[MiniRoom.ALLROOMS];
		clientsOwners = new ArrayList<Person>();  
	}

	/**
	 * Shows the veterinary name
	 * @return an <code>String</code> specifying the veterinary name
	 */
	public  String getName() {
		return name;
	}

	/**
	 * convert the users choise into a type of the animal
	 * @param choise a number that represents the animal type
	 * @return an <code>String</code> specifying the animal type
	 */
	public  String convertChoise2Type (int choise){
		String msg = "";
		switch (choise){
			case 1: 
				msg += Pet.DOG;
			break;
			case 2: 
				msg += Pet.CAT;
			break;
			case 3: 
				msg += Pet.BIRD;
			break;
			case 4: 
				msg += Pet.OTHER;
			break;
			default: 
				msg += "ERROR: Invalid species selection.";
			break;			
		}
		return msg;
	} 

	/**
	 * create the mini rooms
	 * @param room1 the first mini room
	 * @param room2 the second mini room
	 * @param room3 the third mini room
	 * @param room4 the fourth mini room
	 * @param room5 the fifth mini room
	 * @param room6 the sixth mini room
	 * @param room7 the seventh mini room
	 * @param room8 the eight mini room
	 */
	public void createRooms(MiniRoom room1, MiniRoom room2, MiniRoom room3 , MiniRoom room4, 
							MiniRoom room5, MiniRoom room6, MiniRoom room7, MiniRoom room8){
		/*for (int i=0;i<=7;i++) {
			rooms[i] = rooms + i+1; 
		}*/
		rooms[0] = room1;
		rooms[1] = room2;
		rooms[2] = room3;
		rooms[3] = room4;
		rooms[4] = room5;
		rooms[5] = room6;
		rooms[6] = room7;
		rooms[7] = room8;
	}

	/**
	 * create a new client
	 * @param theNew a new client
	 * @param clientsPets represents the pets of the client
	 */
	public  void createPerson(Person theNew, ArrayList<Pet> clientsPets){
		clientsOwners.add(theNew);
		theNew.createPet(clientsPets);
	}

	/**
	 * tells if a miniroom is aible
	 * @return an <code>boolean</code> specifying if the mini room is aible
	 */
	public boolean miniRoomAvailable(){
		boolean msg =  false;
		for(int i = 0 ; i < MiniRoom.ALLROOMS && !msg ; i++){
			if(rooms[i].getAvailable()){
				msg = true;
			}
		}
		return msg;
	}

	/**
	 * shows the clients information
	 * @param clients is the client name
	 * @param clientsId  is the client id
	 * @return an <code>String</code> specifying the client information
	 */
	public String showClientsInfo(String clients, String clientsId){
		String msg = "";
		msg += "*******************************************************\n";
		msg += "* ERROR: There is not a clientsOwners with that name and ID. *\n";
 		msg += "*******************************************************";
		Person person = findPerson(clients, clientsId);
		if(person != null){
			msg = person.showMyinfo();
		}
		return msg;		
	}

	/**
	 * find a person
	 * @param clients is the client name
	 * @param clientsId is the client id
	 * @return an object <code>Person</code> of the founded person
	 */
	public Person findPerson(String clients, String clientsId){
		Person thePerson = null;
		boolean theStop = false;
		for (int i = 0; i < clientsOwners.size() && !theStop ; i++ ) {
			if ((clientsOwners.get(i).getName()).equalsIgnoreCase(clients)
				&& (clientsOwners.get(i).getId()).equalsIgnoreCase(clientsId)){
				thePerson = clientsOwners.get(i);
				theStop = true;
			}
		}
		return thePerson;
	}

	/**
	 * shows the contact information 
	 * @param kind says if this is a person or a pet
	 * @param theName is the name
	 * @param personId is the id of the person
	 * @return an <code>String</code> specifying the
	 */
	public String showContactInfo(int kind, String theName, String personId) {
		String msg = "";
		switch (kind) {
			case 1: 
				boolean hold = false;
				for (int i = 0 ; i < MiniRoom.ALLROOMS && !hold ; i++) {
					String itsHospitalized = rooms[i].checkIfItsHospitalized(kind, theName);
					if(itsHospitalized.equalsIgnoreCase("")){ 
						hold = true;
						Person person = findPerson(theName, personId);
						if (person != null){
							msg = person.contactInfo();
						}	
					}else {
						msg = itsHospitalized;
					}
				}
			break;
			case 2:
				boolean holdOn = false;
				for (int i = 0 ; i < MiniRoom.ALLROOMS && !holdOn ; i++) {
					String itsHospitalized2 = rooms[i].checkIfItsHospitalized(kind, theName);
					if(itsHospitalized2.equalsIgnoreCase("")){ 
						holdOn = true;
						String ownersName = rooms[i].getOwner();
						boolean theStop2 = false;
						Person actualPerson = null;
						for (int inde = 0; inde < clientsOwners.size() && !theStop2 ; inde++ ) {
							actualPerson = clientsOwners.get(inde);
							if ((actualPerson.getName()).equalsIgnoreCase(ownersName) 
								&& actualPerson.reviewPet(theName)){
								msg = actualPerson.contactInfo();
								theStop2 = true;
							}
						}
					}
					else {
						msg = itsHospitalized2;
					}				
				}
			break;
			default:
			break;		
		}
		return msg;
	}

	/**
	 * this verify if that the inputs of the user are correct
	 * @param name the owner name
	 * @param id the owner id
	 * @param petsName the name of the pet
	 * @return an <code>boolean</code> specifying the
	 */
	public boolean checkOwner(String name, String id, String petsName){
		boolean isReal = false;
		String evaluation = showClientsInfo(name, id);
		if(evaluation.charAt(0) != '*' 
		   && evaluation.toLowerCase().contains(petsName.toLowerCase())){
			isReal = true;
		}
		return isReal;
	}

	/**
	 * Hospitalize a pet<br>
	 * @param name the name of the client<br>
	 * @param id the id of the client<br>
	 * @param petsName the name of the pet<br>
	 * @param newMedRec the medicine record<br>
	 * @param petsMeds the medicines of the pet<br>
	 * @param sick the sick of the pet<br>
	 */
	public void startHospitalizeVet(String name, String id, String petsName, MedRecord newMedRec,
									ArrayList<ReqMed> petsMeds, Pet sick){
		Person person = findPerson(name, id);
		if (person != null){
			person.startHospitalizePers(petsName, newMedRec, petsMeds);
		}
		boolean theStop = false;
		for (int in = 0; in < MiniRoom.ALLROOMS && !theStop ; in++ ) {
			if (rooms[in].getAvailable()){
				theStop = true;
				rooms[in].setOwner(name);
				rooms[in].setPet(petsName);
				rooms[in].setHostage(sick);
				rooms[in].setAvailable(false);
			}
		}
	}

	/**
	 * retieve a pet searched<br>
	 * @param name the client name<br>
	 * @param id the client id<br>
	 * @param petsName the pet name<br>
	 * @return an <code>String</code> specifying the<br>
	 */
	public Pet retrievePet(String name, String  id, String  petsName){
		Pet relationshipOfPet = null;
		Person person = findPerson(name, id);
			if (person != null){
				relationshipOfPet = person.givePet(petsName);
			}
		return relationshipOfPet;
	}

	/**
	 * gather all the fees of the hospitalization<br>
	 * @return an <code>String</code> specifying the<br>
	 */
	public double gatherAllHospitalizationFees(){
		double income = 0.0;
		for (int i = 0; i < clientsOwners.size(); i++ ) {
			income += clientsOwners.get(i).myBill();
		}
		return income;
	}

	/**
	 * calculate the total income <br>
	 * @return an <code>String</code> specifying the total income<br>
	 */
	public double totalIncome(){
		double incomeT = 0.0;
		incomeT += gatherAllHospitalizationFees();
		incomeT += feeServicesVeterinary(0);
		return incomeT;
	}

	/**
	 * calculate all the hospitalization average<br>
	 * @return an <code>String</code> specifying the hospitalization average<br>
	 */
	public double hospitalizationAverage(){
		double hAverage = 0.0;
		for (int i = 0; i < clientsOwners.size(); i++ ) {
			hAverage += clientsOwners.get(i).myBill();
		}
		hAverage = hAverage / countAllHospitalizations();
		return hAverage;
	}

	/**
	 * count how many hospitalizations have<br>
	 * @return an <code>integrer</code> specifying the hospitalizations times<br>
	 */
	public int countAllHospitalizations(){
		int many = 0;
		for (int i = 0; i < clientsOwners.size(); i++ ) {
			many += clientsOwners.get(i).countHospitalizations();
		}
		return  many;
	}

	/**
	 * shows all the record of a the pets<br>
	 * @return an <code>String</code> specifying the records<br>
	 */
	public String medRecsFromHPet(){
		String msg = "";
		for(int i = 0 ; i < MiniRoom.ALLROOMS ; i++){
			if(rooms[i].getAvailable() 
			   && rooms[i].getHostage() == null){
				
			}
			else{
				msg += rooms[i].getHostage().showAllRecords();
			}
		}	
		return msg;
	}	

	/**
	 * show the number of the mini room of the pet<br>
	 * @param petsName the pet name<br>
	 * @return an <code>int</code> specifying the mini room of the pet<br>
	 */
	public int retrieveNumberMiniRoom(String petsName){
		int theNumber = 0;
		boolean theStop = false;
		for(int i = 0 ; i < MiniRoom.ALLROOMS && !theStop ; i++){
			if(rooms[i].getPet().equalsIgnoreCase(petsName) ){ 
				theNumber = rooms[i].getNumberOfMiniRoom();
				theStop = true;
			}	
		}
		return theNumber;
	}

	/**
	 * shows the medicine record of a pet<br>
	 * @param name the client name<br>
	 * @param id the client id<br>
	 * @param petsName the pet name<br>
	 * @return an <code>String</code> specifying the record of a pet<br>
	 */
	public String showAPetMedRecs(String name, String  id, String  petsName){
		boolean theStop = false;
		String msg = "ERROR: No match found";	
		Person person = findPerson(name, id);
		if (person != null){
			msg = person.givePet(petsName).showAllRecords();
		} 
		return msg;
	}

	/**
	 * remove a pet<br>
	 * @param name the client name<br>
	 * @param id the client id<br>
	 * @param petsName the pet name<br>
	 */
	public void removePet(String name, String  id, String  petsName) {
		Person person = findPerson(name, id);
		if (person != null){
			person.givePet(petsName).cutItOff();
			boolean wait = false;
			for(int i = 0 ; i < MiniRoom.ALLROOMS && !wait ; i++) {
				if (rooms[i].getPet().equalsIgnoreCase(petsName) 
				 && rooms[i].getOwner().equalsIgnoreCase(name)) { 
					rooms[i].setAvailable(true);
					rooms[i].setPet("");	
					rooms[i].setOwner("");
					rooms[i].setHostage(null);
					wait = true;	
				}
			}
		} 	
	}
	
	/**
	 * @param name the client name<br>
	 * @param id the client id<br>
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
	public String locatePersonWithPet2AddStuff(String name, String  id, String petsName, int edition, 
											   String symptomsEdit, String diagnosysEdit,
											   String medsName, double medsDose, 
											   double medsPrice, String medsFrecuency){
		String msg = "";
		Person person = findPerson(name, id);
		if (person != null){
			msg += person.locatePet2AddStuff(petsName, edition, symptomsEdit, 
											   diagnosysEdit, medsName, medsDose, 
											   medsPrice, medsFrecuency);
		}
		return msg;
	}

	/**
	 * change de client information<br>
	 * @param name the client name<br>
	 * @param id de id client<br>
	 * @param newAddress de address of the client<br>
	 * @param newPhone the client phone<br>
	 * @return an <code>String</code> specifying the <br>
	 */
	public String changeClientInfo(String name, String  id, String newAddress, String newPhone){
		String msg = "ERROR: No match found";
		Person person = findPerson(name, id);
		if (person != null){
			msg = "Information has been sucessfully updated!";
			person.modifyAddressOrPhone(newAddress, newPhone);
		}
		return msg;
	}

	/**
	 * calculate the total fee<br>
	 * @param serviceSelection is the user selection for the service<br>
	 * @return an <code>double</code> specifying the service fee<br>
	 */
	public double feeServicesVeterinary(int serviceSelection){
		double msg = 0.0;
		switch (serviceSelection) {
			case 0:
				msg += feeServicesPeople(1);
				msg += feeServicesPeople(2);
				msg += feeServicesPeople(3);
				msg += feeServicesPeople(4);
				msg += feeServicesPeople(5);
				break;
			default:
				msg = feeServicesPeople(serviceSelection);	
			break;
		}
		return msg;
	}

	/**
	 * is the total sum of the service<br>
	 * @param serviceSelection is the service selected<br>
	 * @return an <code>String</code> specifying the fee<br>
	 */
	public double feeServicesPeople(int serviceSelection){
		double msg = 0.0;
		for (int i = 0; i<clientsOwners.size() ; i++ ) {
			msg += clientsOwners.get(i).petsFeeServices(serviceSelection);	
		}
		return msg;
	}

	/**
	 * convert the user choise to a char that represents the constan<br>
	 * @param serviceSelection the user selection for the service<br>
	 * @return an <code>char</code> specifying the service<br>
	 */
	public char convertChoise2Char(int serviceSelection){
		char answer = 'a';
		switch (serviceSelection) {
			case 1:
				answer = 'b';	
			break;
			case 2:
				answer = 'd';
			break;
			case 3:
				answer = 't';
			break;
			case 4:
				answer = 'n';
			break;
			case 5:
				answer = 's';
			break;
			default:
			break;	
		}
		return answer;
	}

	/**
	 * Start a new service<br>
	 * @param name name of the person<br>
	 * @param id id of the person<br>
	 * @param clientPet the pet of the client<br>
	 * @param newService the service to add<br>
	 */
	public void startServiceVet(String name, String id, Pet clientPet, Service newService){
		Person person = findPerson(name, id);
		if (person != null){
			person.startServicePers(clientPet, newService);
		}
	}

}
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
 * This class is for the patient.<br>
 * @author Sebastián Barrera.<br>
 */
public class Pet{

	//--------------------------------------------------------------------------------------------------

	//Constant

	//--------------------------------------------------------------------------------------------------
	public final static String DOG = "Dog";
	public final static String CAT = "Cat";
	public final static String BIRD = "Bird";
	public final static String OTHER = "Other";

	//--------------------------------------------------------------------------------------------------

	//Attributes

	//--------------------------------------------------------------------------------------------------
	private String name;
	private String type;
	private double age;
	private double weight;
	private double height;
	private double bmi;

	//--------------------------------------------------------------------------------------------------

	//Relations

	//--------------------------------------------------------------------------------------------------
	private ArrayList<MedRecord> records;
	private Person owner;
	private ArrayList<Service> services;

	//--------------------------------------------------------------------------------------------------

	//Methods

	//--------------------------------------------------------------------------------------------------

	/**
	 * Pet constructor<br>
	 * @param name Is the name of the pet<br>
	 * @param type Is the type of the pet<br>
	 * @param age Is the age of the pet<br>
	 * @param weight Is the weight of the pet<br>
	 * @param height Is the height of the pet<br>
	 * @param owner Is the owner of the pet<br>
	 */
	public Pet(String name, String type, double age, double weight, double height, Person owner){
		this.name = name;
		this.type = type;
		this.age = age;
		this.weight = weight;
		this.height = height;
		bmi = calculateBmi();
		this.owner = owner;
		records = new ArrayList<MedRecord>();
		services = new ArrayList<Service>();
	}

	/**
	 * <b>Gets</b> the name of the pet<br>
	 * @return an <code>String</code> specifying the name of the pet.<br>
	 */
	public  String getName() {
		return name;
	}

	/**
	 * <b>Sets</b> the name of the pet.<br>
	 * @param name The name of the pet<br>
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <b>Gets</b> the type of the pet<br>
	 * @return an <code>String</code> specifying the type of the pet.<br>
	 */
	public  String getType() {
		return type;
	}

	/**
	 * <b>Sets</b> the type of the pet.<br>
	 * @param type The type of the pet<br>
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * <b>Gets</b> the age of the pet<br>
	 * @return an <code>double</code> specifying the age of the pet.<br>
	 */
	public  double getAge() {
		return age;
	}

	/**
	 * <b>Sets</b> the age of the pet.<br>
	 * @param age The age of the pet<br>
	 */
	public void setAge(double age) {
		this.age = age;
	}

	/**
	 * <b>Gets</b> the weight of the pet<br>
	 * @return an <code>double</code> specifying the weight of the pet.<br>
	 */
	public  double getWeight() {
		return weight;
	}

	/**
	 * <b>Sets</b> the weight of the pet.<br>
	 * @param weight The weight of the pet<br>
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * <b>Gets</b> the height of the pet<br>
	 * @return an <code>double</code> specifying the height of the pet<br>.
	 */
	public  double getHeight() {
		return height;
	}

	/**
	 * <b>Sets</b> the height of the pet.<br>
	 * @param height The height of the pet<br>
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Description This method allows to calculate the body mass index for a pet.<br>
	 * <b>pre:</b> The pet was created before and its attributes height and weight are not null neither height must be zero.<br>
	 * <b>post:</b> The BMI is calculated.<br>
	 * @return an <code>double</code> specifying the pet body mass index.<br>
	 * @throws ArithmeticException If the height is zero, so an exception is thrown due to the division on zero does not exist.<br>
	 */
	public  double calculateBmi(){
		return (weight / (height * height));
	}

	/**
	 * shows all the information of the pet
	 * @return an <code>String</code> specifying the pets information
	 */
	public String showPetsinfo(){
		String msg = "";
		msg += "| Pet's name is: "+name+"\n";
		msg += "| Pet's species is: "+type+"\n";
		msg += "| Pet's age is: "+age+" year(s) old\n";
		msg += "| Pet's weight is: "+weight+" Kg\n";
		msg += "| Pet's height is: "+height+" m\n";
		msg += "| Pet's BMI is: "+bmi+" \n";
		msg += "| \n";
		return msg;
	}

	/**
	 * add a new record
	 * @param newMedRec the record to add
	 * @param petsMeds the medicines of the record
	 */
	public void addMedRec(MedRecord newMedRec, ArrayList<ReqMed> petsMeds){
		newMedRec.setPetInfo(showPetsinfo());
		newMedRec.setOwnerInfo(owner.contactInfo());
		newMedRec.addMeds(petsMeds);
		newMedRec.calculatingFee();
		records.add(newMedRec);
	}

	/**
	 * calculate the gather cost
	 * @return an <code>double</code> specifying the gather cost
	 */
	public double gatherCosts(){
		double full = 0.0;
		for (int i = 0; i < records.size(); i++ ) {
			full += records.get(i).getFee();
		}
		return full;
	}

	/**
	 * show all the records
	 * @return an <code>String</code> specifying all the records
	 */
	public String showAllRecords(){
		String msg = "";
		for (int i = 0; i < records.size(); i++ ) {
			msg += records.get(i).medRecordInfo();
		}


		return msg;
	}

	/**
	 * To take off the pet from de veterinary
	 */
	public void cutItOff(){
		MedRecord aboutToEnd = records.get(records.size() - 1);
		Calendar today = new GregorianCalendar();
				int monthT = today.get(Calendar.MONTH) + 1;
				int dayT = today.get(Calendar.DATE);
				int yearT = today.get(Calendar.YEAR);
				DateIn todaysDate = new DateIn (dayT, monthT, yearT);
		aboutToEnd.setStatus(MedRecord.CLOSED);
		aboutToEnd.setDateOut(todaysDate);
	}

	/**
	 * Description This method allows to add a new symptom presented during the hospitalization at the patient stories.<br>
	 * <b>pre:</b> The patient clinic story mustn't be null.<br>
	 * <b>post:</b> A new symptom were added to the patient clinic story.<br>
	 * @param symptomsEdit Is the new symptom presented. This param mustn't be null.<br>
	 */
	public void addSymptoms(String symptomsEdit){
		MedRecord recInMatter = records.get(records.size()-1);
		String previousS = recInMatter.getSymptoms();
		previousS += " | \n"+symptomsEdit;
		recInMatter.setSymptoms(previousS);
	}

	/**
	 * Description This method allows to add new notes to the possible diagnostic during the hospitalization at the patient stories.<br>
	 * <b>pre:</b> The patient clinic story mustn't be null.<br>
	 * <b>post:</b> New notes were added to the possible diagnostic in the patient clinic story.<br>
	 * @param diagnosysEdit Is the notes of possible diagnostic. This param mustn't be null.<br>
	 */
	public void addDiagnosys(String diagnosysEdit){
		MedRecord recInMatter = records.get(records.size()-1);
		String previousD = recInMatter.getDiagnosys();
		previousD += " | \n"+diagnosysEdit;
		recInMatter.setDiagnosys(previousD);
	}

	/**
	 * Description This method allows to add new medicines that were prescription during the hospitalization at the patient stories.<br>
	 * <b>pre:</b> The patient clinic story mustn't be null.<br>
	 * <b>post:</b> New medicines were added to the patient clinic story.<br>
	 * @param medsName Is the medicine name. This param mustn't be null. <br>
	 * @param medsDose Is the medicine dose, this param refers to the amount of medicine supplied to the 
	 *                 pet each time according the frequence assigned. This param mustn't be null. <br>
	 * @param medsPrice Is the medicine cost by each dose. This param could be empty.<br>
	 * @param medsFrecuency Is the frequency of medicine application. This param could be empty.<br>
	 * @return an <code>String</code> message that indiques if medicine was added to the patient clinic story<br>
	 */
	public String addMedicine(String medsName, double medsDose, double medsPrice, String medsFrecuency){
		ReqMed medInMatter = new ReqMed (medsName, medsDose, medsPrice, medsFrecuency);
		MedRecord recInMatter = records.get(records.size()-1);
		recInMatter.addNewMed(medInMatter);
		return "Prescribed medication successfully added!";
	}

	/**
	 * count how many hospitalizations have
	 * @return an <code>integrer</code> specifying the hospitalizations times
	 */
	public int countMyHospitalizations(){
		int msg = 0;

		if(records != null){
			msg += records.size();
		}
		return msg;
	}

	/**
	 * calculate the service fee
	 * @param serviceSelection the user selection for the service
	 * @return an <code>double</code>  specifying the calculate the service fee
	 */
	public double servicesFees(int serviceSelection){
		double msg = 0.0;
		switch (serviceSelection) {
			case 0:
				msg += feeServices(Service.BATH);
				msg += feeServices(Service.BATHDOM);
				msg += feeServices(Service.TEETH);
				msg += feeServices(Service.NAILS);
				msg += feeServices(Service.SHOT);
			break;
			case 1:
				msg = feeServices(Service.BATH);
			break;
			case 2:
				msg = feeServices(Service.BATHDOM);
			break;
			case 3:
				msg = feeServices(Service.TEETH);
			break;
			case 4:
				msg = feeServices(Service.NAILS);
			break;
			case 5:
				msg = feeServices(Service.SHOT);
			break;	
		}
		return msg;
	}

	/**
	 * calculate the service fee
	 * @param serviceChar the user selection for the service
	 * @return an <code>double</code> specifying the fee of the service
	 */
	public double feeServices(char serviceChar){
		double msg = 0.0;

		for (int i = 0; i<services.size() ; i++ ) {
			if(serviceChar == services.get(i).getType()){
				msg += services.get(i).getPrice();
			}	
		}
		return msg;
	}

	/**
	 * add a service to the pet
	 * @param newService the service to add
	 */
	public void addService(Service newService){
		services.add(newService);
	}

 }
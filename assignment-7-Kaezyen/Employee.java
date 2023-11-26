/* Jacob Knott
   H00851354
   CSC 213 W01

   I certify that this is my own work and where appropriate an extension
   of the starter code provided for this assignment.
 */
import java.util.Random;

public class Employee {
    

    //Creating Variables for Employees
    private int employeeID;
    private String firstName;
    private String lastName;
    private Character middleInitial;
    private String address;
    private String city;
    private int zip;
    private String phone;
    private String email;
    private double hourlyRate;
    private String state;



    //Constructors to be able to create a new Employee
    public Employee()
    {
        //Generates a random employee ID from 0-99
        Random rand = new Random();
        employeeID = rand.nextInt(100);
    }
    public Employee(int newEmployeeID)
    {
        employeeID = newEmployeeID;
    }

    //Mutators to be able to change the values of different employee variables
    public void setEmployeeID(int newEmployeeID){

        employeeID = newEmployeeID;
    }
    //Sets employees first name
    public void setFirstName(String newFirstName){
        firstName = newFirstName;
    }
    //Sets employees last name
    public void setLastName(String newLastName){
        lastName =  newLastName;
    }
    //Sets employees middle initial
    public void setMiddleInitial(Character newMiddleInitial){
        middleInitial = newMiddleInitial;
    }
    //sets employees address
    public void setAddress(String newAddress){
        address = newAddress;
    }
    //Sets employees city.
    public void setCity(String newCity){
        city = newCity;
    }
    //Sets employees Zip
    public void setZip(int newZip){
        zip = newZip;
    }
    //Sets employees Phone
    public void setPhone(String newPhone){
        phone = newPhone;
    }
    //Sets employees Email
    public void setEmail(String newEmail){
        email = newEmail;
    }
    //Sets employees hourly rate or wage
    public void setHourlyRate(double newHourlyRate){
        hourlyRate = newHourlyRate;
    }
    //Sets employees State
    public void setState(String newState){
        state = newState;
    }

    //Accessors to be able to access the variables of employees

    //Returns employees ID
    public int getEmployeeID(){
        return employeeID;
    }
    //Returns employees first name
    public String getFirstName(){
        return firstName;
    }
    //Returns employees last name
    public String getLastName(){
        return lastName;
    }
    //Returns employees middle initial
    public Character getMiddleInitial(){
        return middleInitial;
    }
    //Returns employees address
    public String getAddress(){
        return address;
    }
    //Returns employees city
    public String getCity(){
        return city;
    }
    //Returns employees Zip
    public int getZip(){
        return zip;
    }
    //Returns employees Phone
    public String getPhone(){
        return phone;
    }
    //Returns employees Email
    public String getEmail(){
        return email;
    }
    //Returns employees Hourly rate or Wage
    public double getHourlyRate(){
        return hourlyRate;
    }
    public String getState(){
        return state;
    }












}  
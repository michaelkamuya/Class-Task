//This program displays a someone's Name, Age, Address.
public class PersonalInfo{
    //  enter the persons name in this area
    private String name;
    private int age;
    private String address;
    private int phonenumber;
    public PersonalInfo(String name, int age, String address, int phonenumber){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phonenumber = phonenumber;
        
    }
 // Method used to access the program 
    public String getName() {
        return name;
    }
     public int getAge() {
        return age;
    }
     public String getAddress() {
        return address;
    }
     public int getPhoneNumber(){
        return phonenumber;
     }
    
    // Main method of the program which will access the persons class
    public static void main(String[] args) {
        // Creating an object
        PersonalInfo person1 = new PersonalInfo("Michael Kamuya", 20, "00243 Roasters", 125021631);
         // print the persons info that is entered
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Address: " + person1.getAddress());
        System.out.println("Phone number: " + person1.getPhoneNumber());
        
        
    }
} 
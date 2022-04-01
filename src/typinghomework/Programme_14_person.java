package typinghomework;

public class Programme_14_person {
    //Instance variables
    String firstName, lastName;
    int age;

    public static void main(String[] args) {
        Programme_14_person Person  = new Programme_14_person();
        Person.setFirstName("");
        Person.setLastName("");
    Person .setLastName("");
        Person.setAge(10);
        System.out.println("fullName= " + Person.getFullName());
        System.out.println("teen= " + Person.isTeen());
       Person.setFirstName("John"); // firstName is set to John
        Person.setAge(18);
        System.out.println("fullName= " + Person.getFullName());
        System.out.println("teen= " + Person.isTeen());
        Person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + Person.getFullName());
    }

    //Get Firstname Method
    public String getFirstName() {
        return firstName;
    }

    //Get Lastname Method
    public String getLastName() {
        return lastName;
    }

    //Get age Method
    public int getAge() {
        return age;
    }

    //Set Firstname Method
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //Set Lastname Method
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Set age Method
    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    //Check is it Teen or not Method
    public boolean isTeen() {
        if (getAge() > 12 && getAge() < 20) {
            return true;
        } else {
            return false;
        }
    }
    //Get Full name Method
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return " ";
        } else if (firstName.isEmpty()) {
            return getLastName();
        } else if (lastName.isEmpty()) {
            return getFirstName();
        } else {
            return getFirstName() + " " + getLastName();
        }
    }
}



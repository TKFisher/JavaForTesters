package domainentities;

// added from Java For Testers. Chapter 12, ex 1.
// import domainobject.TestAppEnv;


public class User {

    //field variables
    private String username;
    public String password;
    //private TestAppEnv testAppEnv;  //added from Java For Testers. Chapter 12, ex 1.


    // The Constructor: which is a special method. It must use the same name as the Class name.
    public User() {
        username = "default username";
        password = "default password";

        //testAppEnv = new TestAppEnv();  //added from Java For Testers. Chapter 12, ex 1.
}

    /* method 1 (known as accessor and/or getter method)
    because they allow us to access or get the value of the field.
    They take no parameters, and return the values of the field.
    */
    public String getUsername() {
        return username;
    }

    // method 2
    public String getPassword() {
        return password;
    }


    /*  - a constructor with arguments will allow us to update the default username and pwd.
        - This is a duplicate of the first constructor since the no-argument constructor has code
        - to assign values to the fields, as does the constructor which does take arguments.
    */
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // example with unique parameter name does not need "this" infront of "username".
    public  User (String aUser){
        username = aUser;
    }

    /* you can call the argument constructor from the no argument constructor like this:
    public User() {
        this("username", "password");
    }
    */

    //original code before update below
    public void setPassword(String password){
        this.password = password;
    }

/*    //updated setPassword method in Chapter 13 exercise to include the InvalidPassword exception.
    public void setPassword(String password)throws InvalidPassword{
        if (password.length()<7){
            throw new InvalidPassword("Password must be > 6 characters.");
        }
        this.password = password;
    }*/


    /**
     * added from Java For Testers. Chapter 12, ex 1.  Demonstrates how you can add existing an object like getURL method from the TestAppEnv
     * class to another class like the User Class, and then if you want to extend this Class, the User Class, in some other method later
     * you will be to call the getUrl method from within that class:
     */
    /*
     object from the TestAppEnv Class.
    public String getUrl(){
        return TestAppEnv.getURL();
    }*/


    public String getPermission(){
        return "Normal";
    }


}



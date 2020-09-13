package shopProject.shopPackage;

import shopProject.shopPackage.validatiors.BelarusPhoneValidator;
import shopProject.shopPackage.validatiors.DateOfBirthValidator;
import shopProject.shopPackage.validatiors.EmailValidator;
import shopProject.shopPackage.validatiors.Validator;

public class User {

    private String name;
    private UserType type;
    private String dateOfBirth;
    private String phone;
    private String email;

    public User() {
        super();
    }

    public User(String name, UserType type) {
        super();
        this.name = name;
        this.type = type;
    }
    
    public User(String name, UserType type, String phone, String email, String dateOfBirth) {
        super();
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public UserType getType() {
        return type;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    
    public void userInfo1() {
        System.out.println("User " + name + " is " + type);
    }
    
    public void userInfo2() {
        System.out.println("User " + name + " (" + dateOfBirth + ", " +
    phone + ", " + email + ")");
    }
    
    public void checkUserInfo() {
    	System.out.println("checking information about user.");
    	Validator emailValidator = new EmailValidator();
    	Validator belPhoneValidator = new BelarusPhoneValidator();
    	Validator dateOfBirthValidator = new DateOfBirthValidator();
    	if (emailValidator.validate(email)) {
    		System.out.println("Email is correct - " + email);
    	} else {
    		System.out.println("Email is incorrect.");
    		setEmail("notValid@email.why");
    	}
    	
    	if (belPhoneValidator.validate(phone)) {
    		System.out.println("Phone is correct - " + phone);
    	} else {
    		System.out.println("Phone is correct.");
    		setPhone("+375290000000");
    	}
    	
    	if(dateOfBirthValidator.validate(dateOfBirth)) {
    		System.out.println("Date of Birth is correct - " + dateOfBirth);
        } else {
        	System.out.println("Date of Birth is correct.");
        	setDateOfBirth("11/11/1111");
        }
    	if (dateOfBirthValidator.validate(dateOfBirth) 
    			&& emailValidator.validate(email) 
    			&& belPhoneValidator.validate(phone)) {
    		userInfo2();
    	}
    }


}

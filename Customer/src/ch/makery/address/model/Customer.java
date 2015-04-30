package ch.makery.address.model;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Customer {
	private final StringProperty firstName;
	private final StringProperty middleInitial;
    private final StringProperty lastName;
    private final StringProperty gender;
    private final StringProperty address;
    private final StringProperty city;
    private final StringProperty state;
    private final IntegerProperty zip;

    /**
     * Default constructor.
     */
    public Customer() {
        this(null, null);
    }

    /**
     * Constructor with some initial data.
     * 
     * @param firstName
     * @param lastName
     */
    public Customer(String firstName, String lastName) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);

        // Some initial dummy data, just for convenient testing.

        this.middleInitial = new SimpleStringProperty("some initial");
        this.gender = new SimpleStringProperty("some gender");
        this.address = new SimpleStringProperty("some street");
        this.city = new SimpleStringProperty("some city");
        this.state = new SimpleStringProperty("some state");
        this.zip = new SimpleIntegerProperty(1234);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }
    
    public String getMiddleInitial() {
        return middleInitial.get();
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial.set(middleInitial);
    }

    public StringProperty middleInitialProperty() {
        return middleInitial;
    }
    
    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }
    
    public String getGender() {
        return gender.get();
    }

    public void setGender(String gender) {
        this.gender.set(gender);
    }

    public StringProperty genderProperty() {
        return gender;
    }
    
    public String getAddress() {
        return address.get();
    }

    public void setAddress(String address) {
        this.address.set(address);
    }

    public StringProperty addressProperty() {
        return address;
    }
    
    public String getCity() {
        return city.get();
    }

    public void setCity(String city) {
        this.city.set(city);
    }

    public StringProperty cityProperty() {
        return city;
    }
    
    public String getState() {
        return state.get();
    }

    public void setState(String state) {
        this.state.set(state);
    }

    public StringProperty stateProperty() {
        return state;
    }
    
    public int getZip() {
        return zip.get();
    }

    public void setZip(int zip) {
        this.zip.set(zip);
    }

    public IntegerProperty zipProperty() {
        return zip;
    }
}

package ch.makery.address.view;

import ch.makery.address.MainApp;
import ch.makery.address.model.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CustomerController {
	@FXML
    private TableView<Customer> personTable;
    @FXML
    private TableColumn<Customer, String> firstNameColumn;
    @FXML
    private TableColumn<Customer, String> lastNameColumn;
    
	@FXML
	private TextField FirstName;
	@FXML
	private TextField MiddleInitial;
	@FXML
	private TextField LastName;
	@FXML
	private RadioButton Male;
	@FXML
	private RadioButton Female;
	@FXML
	private TextField Address;
	@FXML
	private TextField City;
	@FXML
	private TextField State;
	@FXML
	private TextField Zip;
	@FXML
	private Button Save;
	@FXML
	private Button Clear;
	
	// Reference to the main application.
    private MainApp mainApp;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public CustomerController() {
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    	// Initialize the person table with the two columns.
        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
        
//        // Clear person details.
//        showPersonDetails(null);
//
//        // Listen for selection changes and show the person details when changed.
//        personTable.getSelectionModel().selectedItemProperty().addListener(
//                (observable, oldValue, newValue) -> showPersonDetails(newValue));
    }
    
    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
        
        // Add observable list data to the table
        personTable.setItems(mainApp.getCustomerData());
    }
    
    /**
     * Fills all text fields to show details about the person.
     * If the specified person is null, all text fields are cleared.
     * 
     * @param person the person or null
     */
    private void showPersonDetails(Customer customer) {
        if (customer != null) {
            // Fill the labels with info from the person object.
            FirstName.setText(customer.getFirstName());
            MiddleInitial.setText(customer.getMiddleInitial());
            LastName.setText(customer.getLastName());
            Male.setSelected(false);
            Female.setSelected(false);
            Address.setText(customer.getAddress());
            City.setText(customer.getCity());
            State.setText(customer.getState());
            Zip.setText(Integer.toString(customer.getZip()));

            // TODO: We need a way to convert the birthday into a String! 
            // birthdayLabel.setText(...);
        } else {
            // Person is null, remove all the text.
            FirstName.setText("");
            MiddleInitial.setText("");
            LastName.setText("");
            Male.setSelected(false);
            Female.setSelected(false);
            Address.setText("");
            City.setText("");
            State.setText("");
            Zip.setText("");
        }
    }
    
    @FXML
    private void handleFirstName() {
    }
    
    @FXML
    private void handleMiddleInitial() {
    }
    
    @FXML
    private void handleLastName() {
    }
    
    @FXML
    private void handleMale() {
    	if(Female.isSelected() == true) {
    		Female.setSelected(false);
    	}
    }
    
    @FXML
    private void handleFemale() {
    	if(Male.isSelected() == true) {
    		Male.setSelected(false);
    	}
    }
    
    @FXML
    private void handleAddress() {
    }
    
    @FXML
    private void handleCity() {
    }
    
    @FXML
    private void handleState() {
    }
    
    @FXML
    private void handleZip() {
    }
    
    @FXML
    private void handleSave() {
    }
    
    @FXML
    private void handleClear() {
    	int selectedIndex = personTable.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            personTable.getItems().remove(selectedIndex);
        } /*else {
            // Nothing selected.
            Alert alert = new Alert(AlertType.WARNING);
            alert.initOwner(mainApp.getPrimaryStage());
            alert.setTitle("No Selection");
            alert.setHeaderText("No Person Selected");
            alert.setContentText("Please select a person in the table.");

            alert.showAndWait();
        }*/
    }
}

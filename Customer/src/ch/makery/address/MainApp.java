package ch.makery.address;

import java.io.IOException;

import ch.makery.address.model.Customer;
import ch.makery.address.view.CustomerController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApp extends Application {
	
	private Stage primaryStage;
	
	/**
     * The data as an observable list of Persons.
     */
    private ObservableList<Customer> customerData = FXCollections.observableArrayList();
	
    /**
     * Constructor
     */
    public MainApp() {
        // Add some sample data
    	customerData.add(new Customer("Hans", "Muster"));
    	customerData.add(new Customer("Ruth", "Mueller"));
    	customerData.add(new Customer("Heinz", "Kurz"));
    	customerData.add(new Customer("Cornelia", "Meier"));
    	customerData.add(new Customer("Werner", "Meyer"));
    	customerData.add(new Customer("Lydia", "Kunz"));
    	customerData.add(new Customer("Anna", "Best"));
    	customerData.add(new Customer("Stefan", "Meier"));
    	customerData.add(new Customer("Martin", "Mueller"));
    }
    
    /**
     * Returns the data as an observable list of Persons. 
     * @return
     */
    public ObservableList<Customer> getCustomerData() {
        return customerData;
    }
    
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Date Combo Boxes");
        
        initCustomer();
	}
	
	/**
     * Shows the person overview inside the root layout.
     */
    public void initCustomer() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/Customer.fxml"));
            AnchorPane Customer = (AnchorPane) loader.load();
            
			// Set password prompt into the center of the scene.
			Scene scene = new Scene(Customer);
			primaryStage.setScene(scene);
			
			// Give the controller access to the main app.
			CustomerController controller = loader.getController();
			controller.setMainApp(this);
			
			primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }
    
	public static void main(String[] args) {
		launch(args);
	}
}

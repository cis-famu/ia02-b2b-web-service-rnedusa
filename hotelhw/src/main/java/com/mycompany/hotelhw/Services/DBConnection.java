/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hotelhw.Services;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;

/**
 *
 * @author itzgo
 */
public class DBConnection {
    //Database connection variable. It is shared with any class that inherits from this class
    protected static Firestore db;
    
	//constructor
	//throws file and IO exceptions from attempting to open the credential file
    public DBConnection() {
		
		//Your project id
        String projectId = "hotelreservation-77ef3";
		
		//Open the credential json file 
        FileInputStream serviceAccount;
        try{
            serviceAccount = new FileInputStream("wide-hexagon-302804-ea982cec3d7f.json");

            //set up database connection
            FirestoreOptions firestoreOptions =
            FirestoreOptions.getDefaultInstance().toBuilder()
                .setProjectId(projectId)
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build();

		//connect to database
            db = firestoreOptions.getService();
        }
        catch(IOException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            
            public POService extends DBConnection
                    
                    public POService() {
	super();
}
                    
                    public List<PO> all() throws InterruptedException, ExecutionException {
	List<PO> results = new ArrayList<>();
  
	// asynchronously retrieve all users
	ApiFuture<QuerySnapshot> query = db.collection("PurchaseOrder").get();
	
	// query.get() blocks (stops other processes from excuting) on response 
	// call to firebase
	QuerySnapshot querySnapshot = query.get();
	
	//getting the result set 
	List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
   
   //loop over result set and add them to list
	for(QueryDocumentSnapshot document : documents){
		results.add(document.toObject(PO.class));
	}
	
	return results;
}
                    
                    public PO findById(int id) throws InterruptedException, ExecutionException{
    
	//refernce to the collection(table)
	CollectionReference  po = db.collection("PurchaseOrder");
	//query where clause
	Query query = po.whereEqualTo("id", id);
	
	
	ApiFuture<QuerySnapshot> querySnapshot = query.get();
  
	List<QueryDocumentSnapshot> documents = querySnapshot.get().getDocuments();
	if(documents.size() == 1)
		return documents.get(0).toObject(PO.class);

  
  return null;
}
   
    /**
     *
     * @param customerId
     * @param shipTo
     * @param billTo
     * @param order
     * @return
     * @throws ParseException
     * @throws InterruptedException
     * @throws ExecutionException
     */
    public String createPurchaseOrder(int customerId, Address shipTo, Address billTo, ArrayList<Item>order ) throws ParseException, InterruptedException, ExecutionException{
  
	//create date format that doesn't include time
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
	//get the current date as a string
	String now = formatter.format(new Date(System.currentTimeMillis()));

	//create submitted date
	Date submitted = formatter.parse(now);
  
	// create instance of Random class
	Random rand = new Random();

	// Generate random integers in range 0 to 9999
	int id = rand.nextInt(10000);
	
	
	//create purchase order
	PO newPO = new PO(id, customerId, submitted, billTo, shipTo, order);
	//save values to database
	ApiFuture<DocumentReference> future = db.collection("PurchaseOrder").add(newPO);
	
	//retrieve newly created document(row)
	DocumentReference doc = future.get();
   
    //return the document id;
	return doc.getId();
	
 
}
                    
                    @WebResult(name="objectId")
    public String createPurchaseOrder (@WebParam(name="customerId") int customerId,
                                        @WebParam(name="shipTo") Address shipTo,
                                        @WebParam(name="billTo") Address billTo,
                                        @WebParam(name="order") ArrayList<Item> order) throws ParseException, InterruptedException, ExecutionException
    {
    
        return service.createPurchaseOrder(customerId, shipTo, billTo, order);
    }
        }
        
        
    }
}

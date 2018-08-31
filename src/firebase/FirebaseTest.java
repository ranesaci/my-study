package firebase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

public class FirebaseTest {

	public static void main(String[] args) throws Exception {
		Firestore firestore1 = new FireBaseDB().getFireDtoreDb();
		
		addData(firestore1, "d10");
		firestore1.close();
		Firestore firestore2 = new FireBaseDB().getFireDtoreDb();
		retriveData(firestore2);
		firestore2.close();
		
			
	}

	private static void addData(Firestore firestore, String document) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd / MM / yy");
		
		DocumentReference docRef = firestore.collection("datas").document(document);
        Map<String, Object> data = new HashMap<>();
        data.put("name", "Sac123");
        data.put("age", "31");
        data.put("date", dateFormat.format(new Date()));
        //asynchronously write data
        ApiFuture<WriteResult> result = docRef.set(data);
        while(result.isDone()) {
        	
        }
        
        System.out.println("Updated document :"+document);
		
	}

	private static void retriveData(Firestore firestoreDb) throws InterruptedException, ExecutionException {
		ApiFuture<QuerySnapshot> query = firestoreDb.collection("datas").get();
		 QuerySnapshot querySnapshot = query.get();
		    List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
		    for (QueryDocumentSnapshot document : documents) {
		    	System.out.println("Document: " + document.getId());
		      System.out.println("Name: " + document.getString("name"));
		      System.out.println("Age: " + document.getString("age"));
		      System.out.println("Date: " + document.getString("date"));
		      
		    }
	}

	private static Firestore getFireDtoreDb() throws FileNotFoundException, IOException {
		FileInputStream serviceAccount =
				  new FileInputStream("/home/sachin/Downloads/rest-test-9de76-firebase-adminsdk-qzeyu-34bd2788a6.json");

				FirebaseOptions options = new FirebaseOptions.Builder()
				  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
				  .build();

				FirebaseApp.initializeApp(options);
				Firestore firestore = com.google.firebase.cloud.FirestoreClient.getFirestore();
		return firestore;
	}

	

}

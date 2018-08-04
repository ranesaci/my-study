package firebase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.v1beta1.FirestoreClient;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

public class FireBaseDB {
	
	public  Firestore getFireDtoreDb() throws FileNotFoundException, IOException {
		
		FileInputStream serviceAccount =
				  new FileInputStream("/home/sachin/Downloads/rest-test-9de76-firebase-adminsdk-qzeyu-34bd2788a6.json");

				FirebaseOptions options = new FirebaseOptions.Builder()
				  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
				  .build();
					FirebaseApp.initializeApp(options);
					Firestore firestore = com.google.firebase.cloud.FirestoreClient.getFirestore();
					return firestore;
				
	}
	
	public static void main(String[] args) {
		
		System.out.println(FirebaseApp.getApps().size());
	}
	

}

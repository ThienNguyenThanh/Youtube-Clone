package com.newbiecoder.youtubeclone;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Bucket;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.StorageClient;

@SpringBootApplication
public class YoutubeCloneApplication {

	public static void main(String[] args) {

		try {

			ClassPathResource serviceAccount = new ClassPathResource("firebaseConfig.json");

			FirebaseOptions options = new FirebaseOptions.Builder()
					.setCredentials(GoogleCredentials.fromStream(serviceAccount.getInputStream()))
					.setStorageBucket("clone-ac283.appspot.com")
					.build();

			FirebaseApp.initializeApp(options);

			Bucket bucket = StorageClient.getInstance().bucket();
			System.out.println(bucket);
		} catch (Exception e) {
			e.printStackTrace();
		}

		SpringApplication.run(YoutubeCloneApplication.class, args);
	}

}

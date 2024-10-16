package com.ssafy.notificationservice.global.config;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.FirebaseMessaging;

import com.google.auth.oauth2.GoogleCredentials;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;

@Component
public class FirebaseAppInitializer {

    @PostConstruct
    public void initializeFirebaseApp() {
        if (FirebaseApp.getApps().isEmpty()) {
            try {
                // 리소스 경로에서 파일을 읽어들임
                InputStream serviceAccount = new ClassPathResource("firebase-adminsdk.json").getInputStream();

                if (serviceAccount == null) {
                    throw new IllegalArgumentException("Firebase service account file not found");
                }

                FirebaseOptions options = new FirebaseOptions.Builder()
                        .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                        .build();

                FirebaseApp.initializeApp(options);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Bean
    public FirebaseMessaging firebaseMessaging() throws IOException {
        FirebaseApp firebaseApp = FirebaseApp.getInstance(); // 이미 존재하는 FirebaseApp 인스턴스 가져오기
        return FirebaseMessaging.getInstance(firebaseApp);
    }
}

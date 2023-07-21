package com.example.fieldwire.conf;


import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class AWSConfig {

    @Bean
    public S3Client s3Client() {
        AwsBasicCredentials awsCreds = AwsBasicCredentials.create("AKIASOO5UORSEISAGEXG", "QyUpPTxDj43qoUPKNLOlpWO2im4iVOeEknUXjEpt");

        return S3Client.builder()
                .region(Region.EU_WEST_1) // replace "YOUR_REGION" with your bucket's region
                .credentialsProvider(StaticCredentialsProvider.create(awsCreds))
                .build();
    }
}

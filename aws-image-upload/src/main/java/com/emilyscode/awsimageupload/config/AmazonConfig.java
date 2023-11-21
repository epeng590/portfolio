package com.emilyscode.awsimageupload.config;


import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AmazonConfig {

    @Bean
    public AmazonS3 s3() {
        AWSCredentials awsCredentials = new BasicAWSCredentials(
                accessKey: "AKIAS5FVZRPSUFXLFGMU",
                secretKey: "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"

        );
        return AmazonS3ClientBuilder
                .stanrdard()
                ,withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .build();
    }
}

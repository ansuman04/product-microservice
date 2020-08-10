package com.bubblecart.product.microservice.aws.s3.service;


import org.springframework.web.multipart.MultipartFile;

public interface AWSS3Service {

	void uploadFile(MultipartFile multipartFile);
	
	byte[] downloadFile(String keyName);
}

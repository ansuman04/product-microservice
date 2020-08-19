package com.bubblecart.product.microservice.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bubblecart.product.microservice.aws.s3.service.AWSS3Service;

@Component
public class ImageUtil {
	
	@Autowired
	AWSS3Service AWSS3service;
		
	public byte[] getImageData(String imageName) {
		 return AWSS3service.downloadFile(imageName);
	}

}

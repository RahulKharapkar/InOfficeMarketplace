package com.rk.iom.test;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InOfficeMarketApplicationTests {

	@Test
	void contextLoads() {
	}

//	test case to get encrypted string
	
//	@Test
//	public void testPasswordEncryption() {
//	    PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
//	    SimpleStringPBEConfig config = new SimpleStringPBEConfig();
//	    config.setPassword("encryptedkey"); // encryptor's private key
//	    config.setAlgorithm("PBEWithMD5AndDES");
//	    config.setKeyObtentionIterations("1000");
//	    config.setPoolSize("1");
//	    config.setProviderName("SunJCE");
//	    config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
//	    config.setStringOutputType("base64");
//	    encryptor.setConfig(config);
//	    String plainText = "root";
//	    String encryptedPassword = encryptor.encrypt(plainText);
//	    System.out.println("encryptedPassword : " + encryptedPassword);
//	}
}

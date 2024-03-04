package com.infrasofttech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import com.infrasofttech.api.callback.uaefts.*;

@SpringBootApplication
public class KiyaAiAmlWssTestApplication extends SpringBootServletInitializer {

//	private static final Logger LOG = LogManager.getLogger(KiyaAiAmlWssTestApplication.class);

	public static void main(String[] args) throws Exception {
		SpringApplication springApplication = new SpringApplication(KiyaAiAmlWssTestApplication.class);
		springApplication.setWebApplicationType(WebApplicationType.NONE);
		ConfigurableApplicationContext context = springApplication.run(args);
//		WssSecurityResponseUnmarshallTestForFTSUAEFTS wssSecurityTest = context.getBean(WssSecurityResponseUnmarshallTestForFTSUAEFTS.class);
//		WssSecurityRequestTest bean = context.getBean(WssSecurityRequestTest.class);
//      bean.doCallback();
//		wssSecurityTest.unmarshalTest();
		TestUaeftsFtsCallBackApi testUaeftsFts = context.getBean(TestUaeftsFtsCallBackApi.class);
		testUaeftsFts.doCallback();
	}
	
//			Add these in properties file
//	
//			FTS_CALL_BACK_CERTIFICATE_PATH=D:/CERT/NBF_2way_SSL_2021.pfx
//			FTS_CALL_BACK_CERTIFICATE_PASSWORD=2Way6745!ifntT
//			FTS_CALL_BACK_URL=https://nbfappwmdev2.nbf.ae/ws/NBFAMLScan.NBFAMLScansoap12http/1.0
//			FTS_CALL_BACK_USER_NAME=nbfuatamlusr
//			FTS_CALL_BACK_PASSWORD=nbfuatamlusr@2023
//			FTS_CALL_BACK_API_KEY=bbbef448-bda1-44e8-b23f-ea2b220802d1
//			FTS_CALL_BACK_SOAP_ACTION=AMLScan
//			FTS_CALL_BACK_HEADER_KEY_NAME=NBF-APIKey
//
//			UAEFTSFTS_CALL_BACK_CERTIFICATE_PATH=D:/CERT/NBF_2way_SSL_2021.pfx
//			UAEFTSFTS_CALL_BACK_CERTIFICATE_PASSWORD=2Way6745!ifntT
//			UAEFTSFTS_CALL_BACK_URL=https://nbfappwmdev2.nbf.ae/ws/NBFAMLFTSCallback.NBFAMLFTSCallbacksoap12http/1.0
//			UAEFTSFTS_CALL_BACK_USER_NAME=nbfuatamlusr
//			UAEFTSFTS_CALL_BACK_PASSWORD=nbfuatamlusr@2023
//			UAEFTSFTS_CALL_BACK_API_KEY=bbbef448-bda1-44e8-b23f-ea2b220802d1
//			UAEFTSFTS_CALL_BACK_SOAP_ACTION=UpdateAML
//			UAEFTSFTS_CALL_BACK_HEADER_KEY_NAME=NBF-APIKey
	
	
//	@Bean("callBackSSLSoapTemplate")
//	public WebServiceTemplate webServiceTemplate() throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException,
//			CertificateException, MalformedURLException, IOException {
//		WebServiceTemplate webServiceTemplate = null;
//		try {
//			Properties properties = loadCallbackProperties();
//			KeyStore keyStore = KeyStore.getInstance("PKCS12");
//			TrustManagersFactoryBean trustManager;
//			try {
//				keyStore.load(new FileInputStream(properties.getProperty("FTS_CALL_BACK_CERTIFICATE_PATH")), properties.getProperty("FTS_CALL_BACK_CERTIFICATE_PASSWORD").toCharArray());
//				trustManager = new TrustManagersFactoryBean();
//				trustManager.setKeyStore(keyStore);
//			} catch (Exception e) {
//				LOG.error("trustManagersFactoryBean :- Ftscallbackapi SSL Certificate file is not avilable in the resource path {}", e);
//				trustManager = new TrustManagersFactoryBean();
//			}
//			
//			Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
//			marshaller.setPackagesToScan("com.infrasofttech.config.fts.callback.stub");
//			
//			Wss4jSecurityInterceptor wss4jSecurityInterceptor = new Wss4jSecurityInterceptor();
//	        wss4jSecurityInterceptor.setSecurementActions("UsernameToken");
//	        wss4jSecurityInterceptor.setSecurementUsername(properties.getProperty("FTS_CALL_BACK_USER_NAME"));
//	        wss4jSecurityInterceptor.setSecurementPassword(properties.getProperty("FTS_CALL_BACK_PASSWORD"));
//	        
//			HttpsUrlConnectionMessageSender messageSender = new HttpsUrlConnectionMessageSender();
//			messageSender.setTrustManagers(trustManager.getObject());
//			
//			webServiceTemplate = get
//			webServiceTemplate.setMessageSender(messageSender);
//			webServiceTemplate.setMarshaller(marshaller);
//			ClientInterceptor[] clientInterceptor = {wss4jSecurityInterceptor};
//			webServiceTemplate.setInterceptors(clientInterceptor);
//	        LOG.info("webServiceTemplate init {}", webServiceTemplate.toString());
//		  } catch (Exception e) {
//			  LOG.info("callBackSSLRestTemplate :- Ftscallbackapi SSL Certificate file is not avilable in the resource path");
//			  webServiceTemplate = new WebServiceTemplate();
//		}
//		return webServiceTemplate;
//	}

//	private Properties loadCallbackProperties() throws Exception {
//		Properties properties = new Properties();
//		Iterator<Path> rootDirectories = new File("").toPath().getFileSystem().getRootDirectories().iterator();
//		while (rootDirectories.hasNext()) {
//			Path path = rootDirectories.next();
//			String absolutePath = path.toFile().getAbsolutePath();
//			File propertiesFile = new File(absolutePath + File.separator + "kiya-ai-aml" + File.separator + "UNIVIUS-AML-CONFIG" + File.separator + "SERVICE" + File.separator + "ServiceConfig.properties");
//			if (propertiesFile.exists()) {
//				FileInputStream  stream = new FileInputStream(propertiesFile);
//				properties.load(stream);
//				stream.close();
//				break;
//			}
//		}
//		return properties;
//	}

}
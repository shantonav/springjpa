package com.example.springjpa.springjpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.PageRequest;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringjpaApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringjpaApplication.class);

	@Bean
	public CommandLineRunner demo(final OprPaymentAttemptRepository repo){
		return new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {
				List<OprPaymentattemptEntity> paymentAttempts = repo.findByOrderidAndMerchantid(32838,20000,null);
				log.info("Result of findByOrderidAndMerchantid###");
				for (OprPaymentattemptEntity eachAttempt : paymentAttempts){
					log.info("Atempt:"+eachAttempt.toString());
					//log.info("Order: "+eachAttempt.getOprOrder().toString());
				}


				 paymentAttempts = repo.findByMerchantidAndMerchantorderid(20000,132132,new PageRequest(0,10));
				log.info("Result of findByMerchantidAndMerchantorderid###");
				for (OprPaymentattemptEntity eachAttempt : paymentAttempts){
					log.info("Atempt:"+eachAttempt.toString());
					//log.info("Order: "+eachAttempt.getOprOrder().toString());
				}

				paymentAttempts = repo.findByMerchantidAndReference(20000,"00000200000000001535",new PageRequest(1,5));
				log.info("Result of findByMerchantidAndReference###");
				for (OprPaymentattemptEntity eachAttempt : paymentAttempts){
					log.info("Atempt:"+eachAttempt.toString());
					//log.info("Order: "+eachAttempt.getOprOrder().toString());
				}

				paymentAttempts = repo.findByMerchantidAndMerchantorderidAndReference(20000,132132,"merchantReference",new PageRequest(0,5));
				log.info("Result of findByMerchantidAndMerchantorderidAndReference###");
				for (OprPaymentattemptEntity eachAttempt : paymentAttempts){
					log.info("Atempt:"+eachAttempt.toString());
					log.info("Reference:"+eachAttempt.getReference());
					log.info("MerchantOrderId :"+eachAttempt.getOprOrder().getMerchantorderid());

					//log.info("Order: "+eachAttempt.getOprOrder().toString());
				}
			}
		};
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringjpaApplication.class, args);
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		/*for (String beanName : beanNames) {
			System.out.println(beanName);
		}*/
		System.out.println("Spring Boot started...");
	}
}

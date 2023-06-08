package com.example.springTest;

import com.example.springTest.Collector.DataCollector;
import com.example.springTest.PC.ConsumerThread;
import com.example.springTest.PC.PC;
import com.example.springTest.PC.ProducerThread;
import com.example.springTest.PC.ThreadExecuter;
import com.example.springTest.Serialize.Persist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeoutException;

@SpringBootApplication
public class SpringTestApplication {

	static final int max_pool = 3;
	public static final PC pc = new PC();
	public static void main(String[] args) throws InterruptedException, URISyntaxException, TimeoutException, ExecutionException {
//		SpringApplication.run(SpringTestApplication.class, args);

		ConfigurableApplicationContext context = SpringApplication.run(SpringTestApplication.class, args);
		ClientService c = context.getBean(ClientService.class);
		c.show();

		ThreadExecuter exe = new ThreadExecuter();
		exe.execute();

//		THreadExecuterPrint exe = new THreadExecuterPrint();
//		exe.execute();

//		Persist obj = new Persist();
//		obj.serialize();
//		obj.deserialize();


//		Runnable r1 = new ThreadTest("Task1");
//		Runnable r2 = new ThreadTest("Task2");
//		Runnable r3 = new ThreadTest("Task3");
//		Runnable r4 = new ThreadTest("Task4");
//		Runnable r5 = new ThreadTest("Task5");

//		ExecutorService executor = Executors.newFixedThreadPool(2);
//		executor.execute(r1);
//		executor.execute(r2);
//		executor.execute(r3);
//		executor.execute(r4);
//		executor.execute(r5);

//		ThreadTest task = new ThreadTest("Task1");
//		Thread t1 = new Thread(task);
//		t1.start();
//		CustomerService obj = new CustomerService();
//		obj.getTask();
//		PrintTable obj = new PrintTable();
//		ThreadTest t1 = new ThreadTest(obj);
//		Thread r1 = new Thread(t1);
//		r1.start();
//
//		ThreadTestNew t2 = new ThreadTestNew(obj);
//		Thread r2 = new Thread(t2);
//		r2.start();
//		DataCollector T1 = new DataCollector(new URI("https://ncel39999996b.emea.global.corp.sap:51054/XSAServlet"),
//						"{\"property\":{\"uid\":\"f35fe6d1-5532-42b9-b465-effb875c3827\",\"name\":\"queryRequest\",\"dataSource\":\"d56e66b8-39d4-4728-94a1-d227529ad6dc\",\"utcCreationTimeStamp\":1648039821464,\"frequency\":{\"value\":7,\"unit\":\"DAYS\"}},\"definition\":[{\"uid\":\"b86b9b2e-da27-4b50-a3fb-b267838b7a5f\",\"type\":\"SELECT\",\"selectList\":[\"INSTALL_NO\",\"SYSTEM_ID\",\"SYSTEM_NO\",\"HARDWARE_KEY\",\"INSTALL_NO\",\"SYSTEM_ID\",\"SYSTEM_NO\"],\"from\":{\"schema\":\"SYS\",\"name\":\"M_LICENSE\"},\"condition\":{}}]}",
//						"ac5999a4-c42a-4854-bdb1-e0344ca9540d",
//						"DATA_COLLECTOR");
//
//		Thread r1 = new Thread(T1);
//		r1.start();
	}
}

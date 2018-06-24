package com.jeff.bi;

import com.jeff.bi.service.DemoAnnotationService;
import com.jeff.bi.service.DemoMethodService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BiApplicationTests {

	@Autowired
	private DemoAnnotationService demoAnnotationService;
	@Autowired
	private DemoMethodService demoMethodService;

	@Test
	public void contextLoads() {
		demoAnnotationService.add();
		//demoMethodService.add();
	}

}

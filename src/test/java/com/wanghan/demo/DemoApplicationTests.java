package com.wanghan.demo;

import com.wanghan.demo.api.BlogProperties;
import com.wanghan.demo.dao.UserMapper;
import com.wanghan.demo.models.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import com.wanghan.demo.api.HelloController;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {


	}

	private MockMvc mvc;

	@Autowired
	private WebApplicationContext wc;


	@Autowired
	private UserMapper userMapper;

	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.webAppContextSetup(wc).build();

	}

	@Test
	public void getHello() throws Exception {
		MvcResult result = (MvcResult) mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON)).andReturn();
		Assert.assertEquals(result.getResponse().getStatus(), 200);
		Assert.assertEquals(result.getResponse().getContentAsString(), "Hello World112221");
	}

	@Autowired
	private BlogProperties blogProperties;


	@Test
	public void getHelloConfig() throws Exception {

		System.out.println(blogProperties.getMysql().getName());
		System.out.println(blogProperties.getRedis().getName());

	}



	@Test
	@Rollback
	public void findByName() throws Exception {
		User u = userMapper.findByName("iDeal_test005");

		System.out.println(u.getUserid());
		System.out.println(u.getPhone_num());

	}


}


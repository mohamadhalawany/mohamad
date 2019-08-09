package com.mohamad;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringRunner.class)
@SpringBootTest

@WebAppConfiguration
public class ApplicationTests {
	
	@Autowired
	CountryService service ;
	
	@Autowired 
	WebApplicationContext context ;
	
	MockMvc mock = MockMvcBuilders.webAppContextSetup(context) .build() ;
	
	@Test
	public void testFindCountry() throws Exception{
		String url = "/countries/{code}" ;
		String code = "GBR" ;
		
		MvcResult result = mock.perform(MockMvcRequestBuilders.get(url , code).accept(MediaType.APPLICATION_JSON)).andReturn() ;
		
		String content = result.getResponse().getContentAsString() ;
		int status = result.getResponse().getStatus() ;
		
		Assert.assertEquals("INVALID_COUNTRY_CODE", 404 , status);
		Assert.assertTrue("INVALID_COUNTRY_CODE", content.trim().length() == 0);
	}

}

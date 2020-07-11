
package com.springBoot.LuckyMoney_boot.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
* @ClassName: LuckymoneyControllerTest
* @Description: TODO
* @author GMell
* @date 2020年7月11日
*
*/
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class LuckymoneyControllerTest {
	
	
	@Autowired
	private MockMvc mvc;
	/**
	 * Test method for {@link com.springBoot.LuckyMoney_boot.controller.LuckymoneyController#getAcount(java.lang.Integer)}.
	 * @throws Exception 
	 */
	@Test
	public void testGetAcount() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/luckymoneys/getAcount/123")).andExpect(MockMvcResultMatchers.status().isOk());
	}

}

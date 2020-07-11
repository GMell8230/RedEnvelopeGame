
package com.springBoot.LuckyMoney_boot;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springBoot.LuckyMoney_boot.domain.Luckymoney;
import com.springBoot.LuckyMoney_boot.service.LuckymoneyService;

/**
* @ClassName: LuckymoneyServiceTest
* @Description: TODO
* @author GMell
* @date 2020年7月11日
*
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class LuckymoneyServiceTest {
	@Autowired
	private LuckymoneyService luckymoneyService;
	
	@Test
	public void findTranstionTest() {
		Luckymoney luckymoney = luckymoneyService.findTranstion(7);
		Assert.assertEquals(new BigDecimal("1314.00"),luckymoney.getMoney());
	}
}

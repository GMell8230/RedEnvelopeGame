
package com.springBoot.LuckyMoney_boot.service;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springBoot.LuckyMoney_boot.domain.LuckmoneyRepository;
import com.springBoot.LuckyMoney_boot.domain.Luckymoney;
import com.springBoot.LuckyMoney_boot.enums.ResultCodeEnums;
import com.springBoot.LuckyMoney_boot.exception.AccountException;

/**
* @ClassName: LuckymoneyService
* @Description: TODO
* @author GMell
* @date 2020年7月11日
*
*/

@Service
public class LuckymoneyService {
	@Autowired
	private LuckmoneyRepository respository;
	
	/**
	 * 事务 是mysql的事务，而不是指的是java的事务，要结合引擎如innodb才能使用
	 */
	@Transactional
	public void createTwo() {
		Luckymoney luckymoney1 = new Luckymoney();
		luckymoney1.setProducer("liao shi xiong");
		luckymoney1.setMoney(new BigDecimal("520"));
		respository.save(luckymoney1);
		
		Luckymoney luckymoney2 = new Luckymoney();
		luckymoney2.setProducer("liao shi xiong");
		luckymoney2.setMoney(new BigDecimal("1314"));
		respository.save(luckymoney2);
	}
	
	public void getMoney(Integer id) throws Exception {
		Luckymoney luckymoney = respository.getOne(id);
		BigDecimal acount = luckymoney.getMoney();
		if (acount.compareTo(new BigDecimal(1000)) < 0) {
			//大于10000，到达当日转账上限
			throw new AccountException(ResultCodeEnums.Acount_LIMIT);
		}else if (acount.compareTo(new BigDecimal(100000)) > 0) {
			throw new AccountException(ResultCodeEnums.TRANSACTION_LIMIT);
		}else {
			
		}
	}
	
	
	/**
	 * 通过ID查询一次转账并返回转账双方
	 */
	public Luckymoney findTranstion(Integer id) {
		return respository.findById(id).orElse(null);
	}
}

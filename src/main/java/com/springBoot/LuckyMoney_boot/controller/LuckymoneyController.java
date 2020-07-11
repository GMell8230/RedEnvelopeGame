
package com.springBoot.LuckyMoney_boot.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.apache.coyote.http11.filters.VoidInputFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.LuckyMoney_boot.domain.LuckmoneyRepository;
import com.springBoot.LuckyMoney_boot.domain.Luckymoney;
import com.springBoot.LuckyMoney_boot.domain.ResultMsg;
import com.springBoot.LuckyMoney_boot.service.LuckymoneyService;
import com.springBoot.LuckyMoney_boot.utill.ResultMsgUtill;

/**
* @ClassName: LuckymoneyController
* @Description: TODO
* @author GMell
* @date 2020年7月10日
*
*/
@RestController
public class LuckymoneyController {

	@Autowired
	private LuckmoneyRepository repository;
	@Autowired
	private LuckymoneyService Service;
	
	/**
	 * 获取红包列表
	 */
	@GetMapping("/luckymoneys")
	public List<Luckymoney> list() {
		return repository.findAll();
	}
	
	
	/**
	 * 创建红包（发红包）
	 */
	@PostMapping("/luckymoneys")
	public Luckymoney creat(@RequestParam("producer") String producer,@RequestParam("money") BigDecimal money) {
		Luckymoney luckymoney = new Luckymoney();
		luckymoney.setProducer(producer);
		luckymoney.setMoney(money);
		return repository.save(luckymoney);
		
	}
	
	/**
	 * 通过id查询红包
	 */
	@GetMapping("/luckymoneys/{id}")
	public ResultMsg<Luckymoney> findById(@PathVariable("id") Integer id) {
		Optional<Luckymoney> optional = repository.findById(id);
		if (optional.isPresent()) {
			return ResultMsgUtill.success(optional.get());
		}else {
			return ResultMsgUtill.failed(400, "未查到该id");
		}
	}
	
	/**
	 * 更新红包(领红包)
	 */
	@PutMapping("/luckymoneys/{id}")
	public Luckymoney update(@PathVariable("id") Integer id,@RequestParam("consumer") String consumer) {
		Optional<Luckymoney> optional = repository.findById(id);
		if (optional.isPresent()) {
			Luckymoney luckymoney = optional.get();
			luckymoney.setCosumer(consumer);
			return repository.save(luckymoney);
		}
		return null;
	}

	@PostMapping("/luckymoneys/two")
	public void createTwo() {
		Service.createTwo();
	}
	
	@GetMapping("/luckymoneys/getAcount/{id}")
	public void getAcount(@PathVariable("id") Integer id) throws Exception {
		Service.getMoney(id);
	}
	
	
	
}

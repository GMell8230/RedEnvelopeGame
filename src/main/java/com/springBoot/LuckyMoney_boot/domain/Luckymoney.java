
package com.springBoot.LuckyMoney_boot.domain;

import java.math.BigDecimal;

import javax.annotation.Generated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;


/**
* @ClassName: Luckymoney
* @Description: TODO
* @author GMell
* @date 2020年7月10日
*
*/

@javax.persistence.Entity
public class Luckymoney {
	@Id
	@GeneratedValue
	private Integer id;
	@Max(value=1, message="红包限额1元起发")
	private BigDecimal money;
	
	// 发送方
	private String producer;
	
	// 接收方
	private String cosumer;
	
	
	/**
	 * Luckymoney.
	 *
	 */

	public Luckymoney() {
		// TODO Auto-generated constructor stub
	}


	
	/**
	* @return id
	*/
	
	public Integer getId() {
		return id;
	}


	
	/**
	 * @param paramtheparamthe{bare_field_name} to set
	 */
	
	public void setId(Integer id) {
		this.id = id;
	}


	
	/**
	* @return money
	*/
	
	public BigDecimal getMoney() {
		return money;
	}


	
	/**
	 * @param paramtheparamthe{bare_field_name} to set
	 */
	
	public void setMoney(BigDecimal money) {
		this.money = money;
	}


	
	/**
	* @return producer
	*/
	
	public String getProducer() {
		return producer;
	}


	
	/**
	 * @param paramtheparamthe{bare_field_name} to set
	 */
	
	public void setProducer(String producer) {
		this.producer = producer;
	}


	
	/**
	* @return cosumer
	*/
	
	public String getCosumer() {
		return cosumer;
	}


	
	/**
	 * @param paramtheparamthe{bare_field_name} to set
	 */
	
	public void setCosumer(String cosumer) {
		this.cosumer = cosumer;
	}
}

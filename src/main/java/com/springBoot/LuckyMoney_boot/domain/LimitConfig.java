
package com.springBoot.LuckyMoney_boot.domain;

import java.math.BigDecimal;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* @ClassName: LimitConfig
* @Description: TODO
* @author GMell
* @date 2020年7月10日

*/

@Component
@ConfigurationProperties(prefix = "limit")
public class LimitConfig {
	  private BigDecimal minMoney;
	  private BigDecimal maxMoney;
	  private String description;
	
	/**
	* @return minMoney
	*/
	
	public BigDecimal getMinMoney() {
		return minMoney;
	}
	
	/**
	 * @param paramtheparamthe{bare_field_name} to set
	 */
	
	public void setMinMoney(BigDecimal minMoney) {
		this.minMoney = minMoney;
	}
	
	/**
	* @return maxMoney
	*/
	
	public BigDecimal getMaxMoney() {
		return maxMoney;
	}
	
	/**
	 * @param paramtheparamthe{bare_field_name} to set
	 */
	
	public void setMaxMoney(BigDecimal maxMoney) {
		this.maxMoney = maxMoney;
	}
	
	/**
	* @return description
	*/
	
	public String getDescription() {
		return description;
	}
	
	/**
	 * @param paramtheparamthe{bare_field_name} to set
	 */
	
	public void setDescription(String description) {
		this.description = description;
	}
}


package com.springBoot.LuckyMoney_boot.exception;

import org.aspectj.apache.bcel.classfile.Code;

import com.springBoot.LuckyMoney_boot.enums.ResultCodeEnums;

/**
* @ClassName: AccountException
* @Description: TODO
* @author GMell
* @date 2020年7月11日
*
*/

public class AccountException extends RuntimeException{
	private Integer code;
	
	/**
	 * AccountException.
	 *
	 */

	public AccountException(ResultCodeEnums resultCodeEnums) {
		super(resultCodeEnums.getMessage());
		this.code = resultCodeEnums.getCode();
	}

	
	/**
	* @return code
	*/
	
	public Integer getCode() {
		return code;
	}

	
	/**
	 * @param paramtheparamthe{bare_field_name} to set
	 */
	
	public void setCode(Integer code) {
		this.code = code;
	}
}

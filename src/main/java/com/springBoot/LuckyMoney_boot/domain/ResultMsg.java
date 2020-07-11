
package com.springBoot.LuckyMoney_boot.domain;

/**
* @ClassName: ErrorMsg
* @Description: TODO
* @author GMell
* @date 2020年7月11日
*
*/

public class ResultMsg<T> {
	private Integer errCode;
	
	private String msg;
	
	private T data;

	
	/**
	* @return errCode
	*/
	
	public Integer getErrCode() {
		return errCode;
	}

	
	/**
	 * @param paramtheparamthe{bare_field_name} to set
	 */
	
	public void setErrCode(Integer errCode) {
		this.errCode = errCode;
	}

	
	/**
	* @return msg
	*/
	
	public String getMsg() {
		return msg;
	}

	
	/**
	 * @param paramtheparamthe{bare_field_name} to set
	 */
	
	public void setMsg(String msg) {
		this.msg = msg;
	}

	
	/**
	* @return data
	*/
	
	public T getData() {
		return data;
	}

	
	/**
	 * @param paramtheparamthe{bare_field_name} to set
	 */
	
	public void setData(T data) {
		this.data = data;
	}
	
	
	
}

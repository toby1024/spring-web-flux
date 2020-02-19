package com.example.springwebflux.dto;

import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * @program: springwebflux
 * @description: response
 * @author: Jason
 * @date: 2020-02-18 14:51
 **/
@Data
public class ResponseBean<T> {

  private Integer code;
  private String msg;
  private T data;

  public static <T> ResponseBean success(T data) {
    ResponseBean responseBean = new ResponseBean();
    responseBean.setCode(HttpStatus.OK.value());
    responseBean.setMsg("SUCCESS");
    responseBean.setData(data);
    return responseBean;
  }
}

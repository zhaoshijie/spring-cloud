package com.api.vo;

/**
 * @author kaze 2017/11/2
 */
public class ResponseResult {

    private Integer status;
    private String msg;
    private Object data;

    public static ResponseResult build(Integer status, String msg, Object data) {
        return new ResponseResult(status, msg, data);
    }

    public static ResponseResult ok(Object data) {
        return new ResponseResult(data);
    }

    public static ResponseResult ok() {
        return new ResponseResult(null);
    }


    public ResponseResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public ResponseResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}

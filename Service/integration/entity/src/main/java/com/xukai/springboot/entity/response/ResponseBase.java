package com.xukai.springboot.entity.response;

public class ResponseBase<T> {
    /**
     * 执行结果 0:失败，1：成功
     */
    private  int statue=1;


    /**
     * 错误信息

     */
    private String errMessage="";

    /**
     * 返回数据
     */
    private T data;

    /**
     * 执行结果 0:失败，1：成功
     */
    public int getStatue() {
        return statue;
    }

    /**
     * 执行结果 0:失败，1：成功
     */
    public void setStatue(int statue) {
        this.statue = statue;
    }


    /**
     * 错误信息

     */
    public String getErrMessage() {
        return errMessage;
    }


    /**
     * 错误信息

     */
    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }


    /**
     * 返回数据
     */
    public T getData() {
        return data;
    }


    /**
     * 返回数据
     */
    public void setData(T data) {
        this.data = data;
    }
}

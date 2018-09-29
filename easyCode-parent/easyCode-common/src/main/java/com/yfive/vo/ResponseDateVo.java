package com.yfive.vo;

import com.yfive.enums.ResponseStatusCode;
import com.yfive.responsedata.ResponseData;

import java.io.Serializable;

/**
 * @author huangyufei
 * @Description 统一返回组装类
 * @date 2018-05-29  16:25
 */
public class ResponseDateVo<T> implements Serializable {

    private ResponseData responseData;

    private T object;

    public T getObject() {
        return (T) object;
    }

    public void setObject(T object) {
        this.object = (T) object;
    }

    public ResponseData getResponseData() {
        return responseData;
    }

    public void setResponseData(ResponseData responseData) {
        this.responseData = responseData;
    }

    public ResponseDateVo(ResponseData responseData, T object){
        super();
        this.responseData=responseData;
        this.object=object;
    }

    public ResponseDateVo(ResponseData responseData){
        super();
        this.responseData=responseData;
    }

    /**
     * 成功:
     * --》》表示请求被服务器正常处理
     */
    public static ResponseDateVo success(Object object) {
        return new ResponseDateVo(new ResponseData(ResponseStatusCode.SUCCESS.getCode(), ResponseStatusCode.SUCCESS.getMessage()),object);
    }

    /**
     * 成功：
     * --》》表示请求已成功处理，但是没有内容返回
     */
    public static ResponseDateVo NOT_CONTENT() {
        return new ResponseDateVo(new ResponseData(ResponseStatusCode.NOT_CONTENT.getCode(), ResponseStatusCode.NOT_CONTENT.getMessage()));
    }

    /**
     * 参数条件不满足：
     * --》》客户端发送附带条件的请求时，条件不满足
     */
    public static ResponseDateVo NOT_MODIFIED() {
        return new ResponseDateVo(new ResponseData(ResponseStatusCode.NOT_MODIFIED.getCode(), ResponseStatusCode.NOT_MODIFIED.getMessage()));
    }

    /**
     * 请求错误：
     * --》》请求报文存在语法错误或参数错误，服务器不能解析
     */
    public static ResponseDateVo ERROR_PARAMS() {
        return new ResponseDateVo(new ResponseData(ResponseStatusCode.ERROR_PARAMS.getCode(), ResponseStatusCode.ERROR_PARAMS.getMessage()));
    }

    /**
     * 没有权限：
     * --》》验证身份失败
     */
    public static ResponseDateVo UNAUTHORIZED() {
        return new ResponseDateVo(new ResponseData(ResponseStatusCode.UNAUTHORIZED.getCode(), ResponseStatusCode.UNAUTHORIZED.getMessage()));
    }

    /**
     * 拒绝服务：
     * --》》请求资源成功，服务器拒绝提供资源
     */
    public static ResponseDateVo serverInternalError() {
        return new ResponseDateVo(new ResponseData(ResponseStatusCode.FORBIDDEN.getCode(), ResponseStatusCode.FORBIDDEN.getMessage()));
    }

    /**
     * 找不到资源
     * --》》服务器找不到你请求的资源
     */
    public static ResponseDateVo customerError() {
        return new ResponseDateVo(new ResponseData(ResponseStatusCode.NOTFOUNT.getCode(), ResponseStatusCode.NOTFOUNT.getMessage()));
    }

    /**
     * 服务器异常
     * --》》可能是Web应用有bug或临时故障
     */
    public static ResponseDateVo serverError() {
        return new ResponseDateVo(new ResponseData(ResponseStatusCode.SERVER_ERROR.getCode(), ResponseStatusCode.SERVER_ERROR.getMessage()));
    }

    /**
     * 未知异常
     */
    public static ResponseDateVo unnoweError() {
        return new ResponseDateVo(new ResponseData(ResponseStatusCode.UNNOW_ERROR.getCode(), ResponseStatusCode.UNNOW_ERROR.getMessage()));
    }

    /**
     * 用户自定义异常
     * -->> 使用：
     * target.DEFINEDBYUSER()
     */
    public static ResponseDateVo definedbyuser(int code, String messager) {
        return new ResponseDateVo(new ResponseData(code,messager));
    }

}

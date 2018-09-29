package com.yfive.responsedata;

import com.yfive.enums.ResponseStatusCode;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huangyufei
 * @Description 服务端返回数据集
 * @date 2018-04-24  15:44
 */
public class ResponseData implements Serializable{

    private static final long serialVersionUID = -8289823303352539870L;

    /**
     * 状态码
     *
     * @see ResponseStatusCode
     */
    private int code;

    /**
     * 消息体
     *
     * @see ResponseStatusCode
     */
    private String message;

    /**
     * 数据集
     */
    private final Map<String, Object> data = new HashMap<>();

    public ResponseData() {
        super();
    }

    public ResponseData(int code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    /**
     * 成功:
     * --》》表示请求被服务器正常处理
     */
    public static ResponseData success() {
        return new ResponseData(ResponseStatusCode.SUCCESS.getCode(), ResponseStatusCode.SUCCESS.getMessage());
    }


    /**
     * 成功：
     * --》》表示请求已成功处理，但是没有内容返回
     */
    public static ResponseData notContent() {
        return new ResponseData(ResponseStatusCode.NOT_CONTENT.getCode(), ResponseStatusCode.NOT_CONTENT.getMessage());
    }

    /**
     * 参数条件不满足：
     * --》》客户端发送附带条件的请求时，条件不满足
     */
    public static ResponseData notModified() {
        return new ResponseData(ResponseStatusCode.NOT_MODIFIED.getCode(), ResponseStatusCode.NOT_MODIFIED.getMessage());
    }

    /**
     * 请求错误：
     * --》》请求报文存在语法错误或参数错误，服务器不能解析
     */
    public static ResponseData errorParams() {
        return new ResponseData(ResponseStatusCode.ERROR_PARAMS.getCode(), ResponseStatusCode.ERROR_PARAMS.getMessage());
    }

    /**
     * 没有权限：
     * --》》验证身份失败
     */
    public static ResponseData unauthorized() {
        return new ResponseData(ResponseStatusCode.UNAUTHORIZED.getCode(), ResponseStatusCode.UNAUTHORIZED.getMessage());
    }

    /**
     * 拒绝服务：
     * --》》请求资源成功，服务器拒绝提供资源
     */
    public static ResponseData serverInternalError() {
        return new ResponseData(ResponseStatusCode.FORBIDDEN.getCode(), ResponseStatusCode.FORBIDDEN.getMessage());
    }

    /**
     * 找不到资源
     * --》》服务器找不到你请求的资源
     */
    public static ResponseData customerError() {
        return new ResponseData(ResponseStatusCode.NOTFOUNT.getCode(), ResponseStatusCode.NOTFOUNT.getMessage());
    }

    /**
     * 服务器异常
     * --》》可能是Web应用有bug或临时故障
     */
    public static ResponseData serverError() {
        return new ResponseData(ResponseStatusCode.SERVER_ERROR.getCode(), ResponseStatusCode.SERVER_ERROR.getMessage());
    }

    /**
     * 未知异常
     */
    public static ResponseData unnowError() {
        return new ResponseData(ResponseStatusCode.UNNOW_ERROR.getCode(), ResponseStatusCode.UNNOW_ERROR.getMessage());
    }

    /**
     * 用户自定义异常
     * -->> 使用：
     * target.DEFINEDBYUSER()
     */
    public static ResponseData definedByUser(int code, String message) {
        return new ResponseData(code, message);
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public ResponseData putDataValue(Object value) {
        data.put("Object", value);
        return this;
    }

}

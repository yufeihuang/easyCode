package com.yfive.enums;

/**
 * @Author yufei.Huang
 * @Description 服务端返回状态码枚举类
 * @Date Create in  2018/4/23 22:54
 */
public enum ResponseStatusCode {

    /**
     * 成功:
     * --》》表示请求被服务器正常处理
     */
    SUCCESS(200, "成功"),

    /**
     * 成功：
     * --》》表示请求已成功处理，但是没有内容返回
     */
    NOT_CONTENT(204, "没有内容返回"),


    /**
     * 参数条件不满足：
     * --》》客户端发送附带条件的请求时，条件不满足
     */
    NOT_MODIFIED(304, "请求参数错误"),

    /**
     * 请求错误：
     * --》》请求报文存在语法错误或参数错误，服务器不能解析
     */
    ERROR_PARAMS(400, "请求错误"),

    /**
     * 没有权限：
     * --》》验证身份失败
     */
    UNAUTHORIZED(401, "没有权限"),

    /**
     * 拒绝服务：
     * --》》请求资源成功，服务器拒绝提供资源
     */
    FORBIDDEN(403, "服务拒绝资源提供"),

    /**
     * 找不到资源
     * --》》服务器找不到你请求的资源
     */
    NOTFOUNT(404, "没有资源"),

    /**
     * 服务器异常
     * --》》可能是Web应用有bug或临时故障
     */
    SERVER_ERROR(500, "服务异常"),

    /**
     * 未知异常
     * --》》可能是Web应用有bug或临时故障
     */
    UNNOW_ERROR(-1, "未知异常");

    /**
     * 状态码
     */
    private final int code;

    /**
     * 消息体
     */
    private final String message;

    ResponseStatusCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}

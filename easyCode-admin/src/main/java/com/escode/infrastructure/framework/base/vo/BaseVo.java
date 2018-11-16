package com.escode.infrastructure.framework.base.vo;

import com.escode.infrastructure.framework.base.enums.BaseBusinessEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

/**
 * <p>BaseVo视图结果集</p>
 *
 * @author yFive
 * @version 1.0
 * @Description {BaseVo视图结果集}
 * @Company yFive
 * @date 2018/9/29 15:42
 */
@Slf4j
@Getter
@Setter
public class BaseVo {

    /**
     * 信息
     */
    private String message;

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 结果集
     */
    private Object result;

    public BaseVo() {
        this.code = 200;
        this.message = "成功";
    }

    public BaseVo(int code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 操作成功
     *
     * @return BaseVo
     */
    public BaseVo success() {
        return new BaseVo(200, "成功");
    }

    /**
     * 操作失败---自定义【code】&&【msg】
     *
     * @param code    编码
     * @param message 消息
     * @return BaseVo
     */
    public BaseVo failed(int code, String message) {
        return new BaseVo(code, message);
    }

    /**
     * 操作失败---自定义【msg】
     * <b> 推荐使用该方法 </b>
     *
     * @param message 消息
     * @return BaseVo
     */
    public BaseVo failed(String message) {
        return new BaseVo(BaseBusinessEnum.UNKNOWN_BUSINESS_EXCEPTION.getCode()
                , message);
    }

    /**
     * 操作失败---系统默认【code】&&【msg】
     * <b> 推荐使用该方法 </b>
     *
     * @return BaseVo
     */
    public BaseVo failed() {
        return new BaseVo(BaseBusinessEnum.UNKNOWN_BUSINESS_EXCEPTION.getCode()
                , BaseBusinessEnum.UNKNOWN_BUSINESS_EXCEPTION.getMessage());
    }

    /**
     * 处理结果集
     */
    public BaseVo handleResult(Object obj, BaseVo baseVo) {
        /*StringUtils.isEmpty不包含数值类型的处理，需额外处理*/
        boolean res = obj instanceof Integer && (int) obj == 0;
        if (StringUtils.isEmpty(obj) || res) {
            baseVo = failed("处理接口失败,请检查后重试！");
        } else {
            baseVo.setResult(obj);
        }
        return baseVo;
    }


}

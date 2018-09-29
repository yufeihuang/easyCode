package com.yfive.responsedata;

import com.yfive.enums.UserLoginStatusCode;

/**
 * @author huangyufei
 * @Description 用户登录返回数据集
 * @date 2018-04-24  17:40
 */
public class UserLoginResponseDate extends ResponseData {

    /**
     * 账号错误或不存在:
     */
    public static ResponseData unknownAccount() {
        return new ResponseData(UserLoginStatusCode.UnknownAccount.getCode()
                , UserLoginStatusCode.UnknownAccount.getMessage());
    }

    /**
     * 密码错误:
     */
    public static ResponseData incorrectCredentials() {
        return new ResponseData(UserLoginStatusCode.IncorrectCredentials.getCode()
                , UserLoginStatusCode.IncorrectCredentials.getMessage());
    }

    /**
     * 帐号被锁定:
     */
    public static ResponseData lockedAccountException() {
        return new ResponseData(UserLoginStatusCode.LockedAccount.getCode()
                , UserLoginStatusCode.LockedAccount.getMessage());
    }

    /**
     * 登录失败次数过多:
     */
    public static ResponseData excessiveAttempts() {
        return new ResponseData(UserLoginStatusCode.ExcessiveAttempts.getCode()
                , UserLoginStatusCode.ExcessiveAttempts.getMessage());
    }

    /**
     * 帐号被禁用:
     */
    public static ResponseData disabledAccount() {
        return new ResponseData(UserLoginStatusCode.DisabledAccount.getCode()
                , UserLoginStatusCode.DisabledAccount.getMessage());
    }

    /**
     * 凭证过期:
     */
    public static ResponseData expiredCredentials() {
        return new ResponseData(UserLoginStatusCode.ExpiredCredentials.getCode()
                , UserLoginStatusCode.ExpiredCredentials.getMessage());
    }

    public UserLoginResponseDate() {
        super();
    }

    public UserLoginResponseDate(int code, String message) {
        super(code, message);
    }

    @Override
    public ResponseData putDataValue(Object value) {
        super.getData().put("data", value);
        return this;
    }


}

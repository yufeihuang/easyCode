package com.escode.storage.po;

import io.swagger.annotations.ApiModel;
import lombok.*;

/**
 * <p></p>
 *
 * @author yFive
 * @version 1.0
 * @Description {}
 * @Company yFive
 * @date 2018/9/29 15:42
 */
@Getter
@Setter(AccessLevel.PRIVATE)
@Builder
@ApiModel(description = "答案仓库实体")
@ToString
public class AnswerPO {

    /**
     * 主键id
     */
    int id;

    /**
     * 答案标题
     */
    String title;

    /**
     * 答案内容
     */
    String content;

}

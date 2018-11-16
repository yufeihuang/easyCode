package com.escode.domain.model;

import io.swagger.annotations.ApiModel;
import lombok.*;
import org.springframework.stereotype.Component;

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
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "答案仓库实体")
@Component
public class Answer {

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

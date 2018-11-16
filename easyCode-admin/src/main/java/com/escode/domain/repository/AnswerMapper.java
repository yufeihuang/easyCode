package com.escode.domain.repository;

import com.escode.domain.model.Answer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * <p></p>
 *
 * @author yFive
 * @version 1.0
 * @Description {}
 * @Company yFive
 * @date 2018/9/29 15:42
 */
public interface AnswerMapper {

    /**
     * 获取所有答案
     */
    List<Answer> getAll();

    /**
     * 根据id获取答案
     */
    Answer get(int id);

    /**
     * 根据id修改答案内容
     */
    Integer modifyContentById(@Param("id") int id, @Param("content") String content);

    /**
     * 添加答案
     *  {下面是模拟负责场景的出来逻辑}
     * @return List
     */
    int save(Answer answer);

    /**
     * 根据id删除答案
     * @return int
     */
    int delete(int id);

}

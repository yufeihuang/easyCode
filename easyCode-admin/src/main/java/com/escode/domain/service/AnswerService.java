package com.escode.domain.service;

import com.escode.domain.model.Answer;
import com.escode.domain.repository.AnswerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service
public class AnswerService {

    @Autowired
    private AnswerMapper answerMapper;

    /**
     * 获取所有答案
     */
    public List<Answer> getAll() {
        return answerMapper.getAll();
    }

    /**
     * 根据id获取答案
     */
    public Answer get(int id){
        return answerMapper.get(id);
    }

    /**
     * 根据id修改答案内容
     */
    public int modifyContentById(int id, String content){
        return answerMapper.modifyContentById(id,content);
    }

    /**
     * 添加答案
     * {下面是模拟负责场景的出来逻辑}
     *
     * @return List
     */
    public int save(Answer anser){
        return answerMapper.save(anser);
    }

    /**
     * 根据id删除答案
     *
     * @return int
     */
    public int delete(int id){
        return answerMapper.delete(id);
    }

}

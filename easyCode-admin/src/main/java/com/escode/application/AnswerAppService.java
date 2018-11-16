package com.escode.application;

import com.escode.domain.model.Answer;
import com.escode.domain.service.AnswerService;
import com.escode.infrastructure.framework.base.vo.BaseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * {类说明}
 *
 * @Description: {}
 * @Version: 1.0
 * @Author: HuangYuFei
 * @Company: 北京科码先锋互联网技术股份有限公司
 * @CreateDate: 2018/11/17 0:54
 * @UpdateUser: HuangYuFei
 * @UpdateRemark: {}
 */
@Service
public class AnswerAppService {

    @Autowired
    private AnswerService answerService;

    public List<Answer> getAll() {
         return answerService.getAll();
    }

    public Answer get(@PathVariable("id") int id) {
        return answerService.get(id);
    }

    public int modifyContentById(@PathVariable("id") Integer id, @RequestParam("content") String content) {
        return answerService.modifyContentById(id, content);
    }

    public int getCount() {
        return answerService.getAll().size();
    }

    public int save(Answer answer){
        return answerService.save(answer);
    }

    public int delete(@PathVariable("id") int id) {
        return answerService.delete(id);
    }

}

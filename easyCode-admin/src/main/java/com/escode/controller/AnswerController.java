package com.escode.controller;

import com.escode.application.AnswerAppService;
import com.escode.domain.model.Answer;
import com.escode.infrastructure.framework.base.exception.BaseBusinessException;
import com.escode.infrastructure.framework.base.vo.BaseVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@RestController
@Api(description = "答案管理")
@Slf4j
@RequestMapping("answer")
public class AnswerController {

    @Autowired
    private AnswerAppService answerAppService;

    private BaseVo baseVo = new BaseVo();

    /**
     * 获取所有答案
     *
     * @return List
     */
    @ApiOperation(value = "获取所有答案")
    @GetMapping(value = "/all")
    public BaseVo getAll() {
        List<Answer> list = answerAppService.getAll();
        /*if (list.size() > 5) {
            throw new LoggingException();
        }*/
        return baseVo.handleResult(answerAppService.getAll(), baseVo);
    }


    /**
     * 根据id获取答案
     *
     * @return List
     */
    @ApiOperation(value = "根据id获取答案")
    @GetMapping(value = "/{id}")
    public BaseVo get(@PathVariable("id") int id) {
        return baseVo.handleResult(answerAppService.get(id), baseVo);
    }

    /**
     * 获取所有答案的总数量
     *
     * @return List
     */
    @ApiOperation(value = "获取所有答案总数量")
    @GetMapping(value = "/counts")
    public BaseVo getCount() {
        return baseVo.handleResult(answerAppService.getAll().size(), baseVo);
    }

    /**
     * 根据id修改答案内容
     *
     * @return List
     */
    @ApiOperation(value = "根据id修改答案内容")
    @PutMapping(value = "/{id}")
    public BaseVo modifyContentById(@PathVariable("id") Integer id, @RequestParam("content") String content) {
        return baseVo.handleResult(answerAppService.modifyContentById(id, content), baseVo);
    }

    /**
     * 添加答案
     *
     * @return List
     */
    @ApiOperation(value = "添加答案")
    @PostMapping()
    public BaseVo save(@RequestBody Answer answer) {
        baseVo = new BaseVo();
        int res;
        try {
            res = answerAppService.save(answer);
            baseVo = baseVo.handleResult(res, baseVo);
            return baseVo;
        } catch (Exception exception) {
            throw new BaseBusinessException(-1, "添加答案失败", exception);
        }
    }

    /**
     * 根据id删除答案
     *
     * @return List
     */
    @ApiOperation(value = "根据id删除答案")
    @DeleteMapping(value = "/{id}")
    public BaseVo delete(@PathVariable("id") int id) {
        BaseVo baseVo = new BaseVo();
        int res = answerAppService.delete(id);
        if (res == 0) {
            baseVo = new BaseVo().failed("删除数据失败，请检查是否有该数据！");
        } else {
            baseVo = baseVo.handleResult(res, baseVo);
        }
        return baseVo;
    }

}

package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Tags;
import com.company.project.service.TagsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by ado on 2018-09-10.
*/
@RestController
@RequestMapping("/tags")
public class TagsController {
    @Resource
    private TagsService tagsService;

    @PostMapping("/add")
    public Result add(Tags tags) {
        tagsService.save(tags);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam(value = "id", required = true) Integer id) {
        Tags tags = tagsService.findById(id);
        if(tags != null)
        {
            tagsService.deleteById(id);
            return ResultGenerator.genSuccessResult();
        }
        else
        {
             return ResultGenerator.genFailResult("数据不存在，删除数据失败");
        }
    }

    @PostMapping("/update")
    public Result update(Tags tags) {
        tagsService.update(tags);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam(value = "id", required = true) Integer id) {
        Tags tags = tagsService.findById(id);
        if(tags != null)
        {
            return ResultGenerator.genSuccessResult(tags);
        }
        else
        {
            return ResultGenerator.genFailResult("数据不存在，获取详情失败");
        }
    }



    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Tags> list = tagsService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }






}

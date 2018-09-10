package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.ArticleTags;
import com.company.project.service.ArticleTagsService;
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
@RequestMapping("/article/tags")
public class ArticleTagsController {
    @Resource
    private ArticleTagsService articleTagsService;

    @PostMapping("/add")
    public Result add(ArticleTags articleTags) {
        articleTagsService.save(articleTags);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam(value = "id", required = true) Integer id) {
        ArticleTags articleTags = articleTagsService.findById(id);
        if(articleTags != null)
        {
            articleTagsService.deleteById(id);
            return ResultGenerator.genSuccessResult();
        }
        else
        {
             return ResultGenerator.genFailResult("数据不存在，删除数据失败");
        }
    }

    @PostMapping("/update")
    public Result update(ArticleTags articleTags) {
        articleTagsService.update(articleTags);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam(value = "id", required = true) Integer id) {
        ArticleTags articleTags = articleTagsService.findById(id);
        if(articleTags != null)
        {
            return ResultGenerator.genSuccessResult(articleTags);
        }
        else
        {
            return ResultGenerator.genFailResult("数据不存在，获取详情失败");
        }
    }



    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<ArticleTags> list = articleTagsService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }






}

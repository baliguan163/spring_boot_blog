package com.company.project.api;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.ArticleTags;
import com.company.project.service.ArticleTagsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by ado on 2018-09-09.
*/
@RestController
@RequestMapping("/article/tags")
public class ArticleTagsController {
    @Resource
    private ArticleTagsService articleTagsService;

    @PostMapping
    public Result add(@RequestBody ArticleTags articleTags) {
        articleTagsService.save(articleTags);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        articleTagsService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody ArticleTags articleTags) {
        articleTagsService.update(articleTags);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        ArticleTags articleTags = articleTagsService.findById(id);
        return ResultGenerator.genSuccessResult(articleTags);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<ArticleTags> list = articleTagsService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}

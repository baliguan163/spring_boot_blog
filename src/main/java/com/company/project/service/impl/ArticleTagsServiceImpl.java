package com.company.project.service.impl;

import com.company.project.dao.ArticleTagsMapper;
import com.company.project.model.ArticleTags;
import com.company.project.service.ArticleTagsService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ado on 2018-09-09.
 */
@Service
@Transactional
public class ArticleTagsServiceImpl extends AbstractService<ArticleTags> implements ArticleTagsService {
    @Resource
    private ArticleTagsMapper articleTagsMapper;

}

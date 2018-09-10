package com.company.project.service.impl;

import com.company.project.dao.TagsMapper;
import com.company.project.model.Tags;
import com.company.project.service.TagsService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ado on 2018-09-10.
 */
@Service
@Transactional
public class TagsServiceImpl extends AbstractService<Tags> implements TagsService {
    @Resource
    private TagsMapper tagsMapper;

}

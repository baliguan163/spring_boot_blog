package com.company.project.service.impl;

import com.company.project.dao.BlogLabelMapper;
import com.company.project.model.BlogLabel;
import com.company.project.service.BlogLabelService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;


/**
 * Created by ado on 2018-09-07.
 */
@Service
@Transactional
public class BlogLabelServiceImpl extends AbstractService<BlogLabel> implements BlogLabelService {
    @Resource
    private BlogLabelMapper blogLabelMapper;

}

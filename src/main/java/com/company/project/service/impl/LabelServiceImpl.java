package com.company.project.service.impl;

import com.company.project.dao.LabelMapper;
import com.company.project.model.Label;
import com.company.project.service.LabelService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ado on 2018-09-07.
 */
@Service
@Transactional
public class LabelServiceImpl extends AbstractService<Label> implements LabelService {
    @Resource
    private LabelMapper labelMapper;

}

package com.company.project.service.impl;

import com.company.project.dao.RolesUserMapper;
import com.company.project.model.RolesUser;
import com.company.project.service.RolesUserService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ado on 2018-09-09.
 */
@Service
@Transactional
public class RolesUserServiceImpl extends AbstractService<RolesUser> implements RolesUserService {
    @Resource
    private RolesUserMapper rolesUserMapper;

}

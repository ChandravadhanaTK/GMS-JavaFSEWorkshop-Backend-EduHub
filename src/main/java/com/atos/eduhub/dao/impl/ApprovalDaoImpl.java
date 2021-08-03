package com.atos.eduhub.dao.impl;

import com.atos.eduhub.configuration.QueryConfig;
import com.atos.eduhub.dao.ApprovalDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ApprovalDaoImpl implements ApprovalDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int deleteAllApproval() {
        return jdbcTemplate.update(QueryConfig.DELETE_ALL_APPROVALS);
    }
}

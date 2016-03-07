package com.gus.dao.impl;

import com.gus.dao.TestEntityDao;
import com.gus.entity.TestEntity;
import com.gus.entity.mapper.TestEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class TestEntityDaoImpl implements TestEntityDao {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private TestEntityMapper testEntityMapper;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static final String SELECT_ALL_SQL = "select * from test_entity";

    @Override
    public List<TestEntity> findAll() {
        return jdbcTemplate.query(SELECT_ALL_SQL, testEntityMapper);
    }

    @Override
    public TestEntity findById(int id) {
        return null;
    }

    @Override
    public void persist(TestEntity entity) {

    }

}

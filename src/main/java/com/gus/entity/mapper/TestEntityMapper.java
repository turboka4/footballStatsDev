package com.gus.entity.mapper;

import com.gus.entity.TestEntity;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class TestEntityMapper implements RowMapper<TestEntity> {

    @Override
    public TestEntity mapRow(ResultSet rs, int i) throws SQLException {
        TestEntity te = new TestEntity();
        te.setId(rs.getInt("id"));
        te.setDesc(rs.getString("desc"));
        return te;
    }
}

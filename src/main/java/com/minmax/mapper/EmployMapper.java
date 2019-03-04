package com.minmax.mapper;

import org.springframework.stereotype.Repository;

import com.minmax.model.Employ;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface EmployMapper extends Mapper<Employ> {
}
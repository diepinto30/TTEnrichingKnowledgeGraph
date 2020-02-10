package com.TTEnriching.TTEnriching.mapper;

import com.TTEnriching.TTEnriching.model.Repository;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RepositoryMapper {

    @Select("select * from repositoryNew")
    List<Repository> findAll();
}

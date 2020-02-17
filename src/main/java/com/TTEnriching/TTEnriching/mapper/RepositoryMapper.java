package com.TTEnriching.TTEnriching.mapper;

import com.TTEnriching.TTEnriching.model.Repository;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

@Mapper
public interface RepositoryMapper {

    @Select("select * from repositoryNew")
    List<Repository> findAll();

    @Insert("insert into repositoryNew(origin, nameRepository, resource, state) values(#{origin},#{nameRepository},#{resource},#{state})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "idrepository", before = false, resultType = Integer.class)
    void insert(Repository repository);


}

package com.TTEnriching.TTEnriching;

import com.TTEnriching.TTEnriching.mapper.RepositoryMapper;
import com.TTEnriching.TTEnriching.model.Repository;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(Repository.class)
@MapperScan("com.TTEnriching.TTEnriching.mapper")
@SpringBootApplication
public class TtEnrichingApplication {

	@Autowired
	private RepositoryMapper repositoryMapper;

	public static void main(String[] args) {
		SpringApplication.run(TtEnrichingApplication.class, args);
	}

}

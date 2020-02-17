package com.TTEnriching.TTEnriching.resource;

import com.TTEnriching.TTEnriching.mapper.RepositoryMapper;
import com.TTEnriching.TTEnriching.model.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/rest/repository")
public class repositoryResource {

    public repositoryResource(RepositoryMapper repositoryMapper) {
        this.repositoryMapper = repositoryMapper;
    }

    private RepositoryMapper repositoryMapper;


    @GetMapping("/api")
    public List<Repository> getAll() {
        return repositoryMapper.findAll();

    }

}

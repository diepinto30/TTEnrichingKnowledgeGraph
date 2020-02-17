package com.TTEnriching.TTEnriching.service;

import com.TTEnriching.TTEnriching.model.Repository;
import com.TTEnriching.TTEnriching.repository.RegisterDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResgisterRepoService {

    @Autowired
    private RegisterDataRepository registerDataRepository;

    public void create(Repository repository){
        registerDataRepository.save(repository);

    }

    public List<Repository> getAll(){
        return registerDataRepository.findAll();
    }
}

package com.TTEnriching.TTEnriching.resource;


import com.TTEnriching.TTEnriching.model.Repository;
import com.TTEnriching.TTEnriching.service.ResgisterRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/register")
public class RegisterResource {

    @Autowired
    private ResgisterRepoService resService;

    /*@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Repository> create(@RequestBody final Repository repository){
        resgisterRepoService.create(repository);
        return resgisterRepoService.getAll();

    }*/

   /* @RequestMapping(value = "validate/registeNew", method = RequestMethod.POST)
    public String saveRepository(@ModelAttribute["repository"] Repository repository){
        resService.create(repository);
    }*/



}

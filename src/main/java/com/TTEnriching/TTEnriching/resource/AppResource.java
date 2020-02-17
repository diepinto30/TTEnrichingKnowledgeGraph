package com.TTEnriching.TTEnriching.resource;

import com.TTEnriching.TTEnriching.mapper.RepositoryMapper;
import com.TTEnriching.TTEnriching.model.Repository;
import com.TTEnriching.TTEnriching.repository.RegisterDataRepository;
import com.TTEnriching.TTEnriching.service.ResgisterRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
public class AppResource {

    private RepositoryMapper repositoryMapper;

    @Autowired
    private ResgisterRepoService resService;

    @GetMapping("/")
    public String viewHomePage(Model model){
        return "index";
    }

    @GetMapping("/app/register")
    private List<Repository> register() {
        Repository repo = new Repository();
        repo.setOrigin("externo");
        repo.setNameRepository("example 4");
        repo.setResource("");
        repo.setState(1);

        repositoryMapper.insert(repo);

        return repositoryMapper.findAll();
    }

    @RequestMapping("/lists")
    public String ListDataset(Model model) {
        //model.addAttribute("data", repositoryMapper.findAll());
        return "validate/visualizeData";
    }

    @RequestMapping("/register")
    public String registerDataForm(Model model) {
        model.addAttribute("repository", new Repository());

        return "validate/registeNew";
    }

    //@RequestMapping(value = "/register2", method = RequestMethod.POST)
    @RequestMapping("/register2")
    public String registerDataForm2(Model model) {
        Repository repository = new Repository();
        model.addAttribute("repository", new Repository());

        repositoryMapper.insert(repository);
        return "validate/registeNew";
    }

    @PostMapping("/register")
    public String registerData (Repository repository){
        repositoryMapper.insert(repository);
        return "validate/registeNew";
    }





}

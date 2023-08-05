package gmc.poc.graphql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gmc.poc.graphql.service.GitLabStatsService;

import java.io.IOException;

@RestController
@RequestMapping("/gitlab")
public class GitLabStatsController {

    @Autowired
    private GitLabStatsService gitLabStatsService;

    @GetMapping("/stats")
    public String getGitLabStats() throws IOException {
        return gitLabStatsService.fetchGitLabStats();
    }
    
}

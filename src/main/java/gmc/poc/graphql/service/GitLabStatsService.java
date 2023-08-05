package gmc.poc.graphql.service;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GitLabStatsService {

    @Value("${gitlab.personalAccessToken}")
    private String personalAccessToken;

    private final OkHttpClient client = new OkHttpClient();

    public String fetchGitLabStats() throws IOException {
    	String query = "query { " +
                "  project(fullPath: \"namespace/project_path\") { " +
                "    statistics { " +
                "      commitCount " +
                "      storageSize " +
                "      repositorySize " +
                "    } " +
                "  } " +
                "}";  // Your GraphQL query here

        Request request = new Request.Builder()
                .url("https://gitlab.com/api/graphql")
                .addHeader("Authorization", "Bearer " + personalAccessToken)
                .post(okhttp3.RequestBody.create(null, query))
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
}

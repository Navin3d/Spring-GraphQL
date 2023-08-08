# Spring-GraphQL
This is an simple spring poc using graphql.

query {
  user(username: "username") {
    contributionsCollection(from: "2023-01-01T00:00:00Z", to: "2023-08-01T00:00:00Z") {
      totalIssueContributions
      totalCommitContributions
      totalMergeRequestContributions
      totalRepositoryContributions
      issueContributions(first: 10) {
        nodes {
          issue {
            title
            createdAt
            updatedAt
          }
          occurredAt
        }
      }
      commitContributions(first: 10) {
        nodes {
          commit {
            message
            committedDate
          }
          occurredAt
        }
      }
      mergeRequestContributions(first: 10) {
        nodes {
          mergeRequest {
            title
            createdAt
            updatedAt
          }
          occurredAt
        }
      }
    }
  }
}


repository {
          commitConnection(first: 10) {   # You can adjust the 'first' parameter as needed
            nodes {
              message
              oid
              author {
                name
                email
                date
              }
            }
          }
        }

        

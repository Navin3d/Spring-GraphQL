# Spring-GraphQL
This is an simple spring poc using graphql.

```
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
```

```
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

projects(includeSubgroups: true, first: 3, after: "MjU=") {
      edges {
        cursor
        node {
          id
          fullPath
          statistics {
            commitCount
            storageSize
            repositorySize
            lfsObjectsSize
            buildArtifactsSize
            packagesSize
          }
        }
      }
}

```

```
function getCurrentDate() {
  const today = new Date();
  const year = today.getFullYear();
  const month = String(today.getMonth() + 1).padStart(2, '0'); // Months are zero-based
  const day = String(today.getDate()).padStart(2, '0');

  return `${year}-${month}-${day}`;
}

const formattedDate = getCurrentDate();

var initialDate = new Date('2023-08-10'); // Format: YYYY-MM-DD

// Add 5 days to the initial date
var numberOfDaysToAdd = 5;
var newDate = new Date(initialDate);
newDate.setDate(initialDate.getDate() + numberOfDaysToAdd);

// Output the new date
console.log(newDate.toDateString());
```
        

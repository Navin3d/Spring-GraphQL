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

```
// Create Date objects for the two dates
var date1 = new Date('2023-08-10'); // Format: YYYY-MM-DD
var date2 = new Date('2023-08-15'); // Format: YYYY-MM-DD

// Calculate the time difference in milliseconds
var timeDiff = date2.getTime() - date1.getTime();

// Convert milliseconds to days
var daysDiff = Math.floor(timeDiff / (1000 * 60 * 60 * 24));

// Output the difference in days
console.log('Difference in days:', daysDiff);
```
```
const inputString = "example-data - This is some content";

const regex = /-(\w+)\s/;
const match = regex.exec(inputString);

if (match) {
  const capturedData = match[1];
  console.log(capturedData);
} else {
  console.log("No match found.");
}
```     

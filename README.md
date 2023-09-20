# Backend

Please read the CONTRIBUTING.md first.

## Development

1. Update the project to the latest version: `git pull`
2. Select an issue from the `issues` tab. Let everyone know you are working on this issue, add a comment to the issue and you will be assigned.
3. Switch to develop branch.: `git checkout develop`
4. Create a new branch for this issue: `git checkout -b <issue-id>-<short-description>`
5. After you are done with the task, send the changes:

```bash
git add .
git commit -m "<issue-id>: <A short meaningful description>"
git push -u origin <branch-name>
```
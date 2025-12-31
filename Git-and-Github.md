# Congfiguring Git

- git config --global user.name "My Name"
- git config --global user.email "someone@email.com"

- git config --list //enlist credentials
  
# Git Initilization 
- git init  // used to create a new git repo
  
# Git Commands 
- pwd // current directry on local machine
- git status  // to check status of each file (untracked files, current branch name)
- git add.  // used to stage untracked files
- git commit -m "first commit" // used to push code to remote repository

- git remote add origin <-link->    
- git remote -v      (to verify remote)  // is remote set properly or not 
- git branch         (to check branch)   
- git branch -M main (to rename branch)  // if current branch is * Master to change it to main
- git branch          (to check if branch name is changed)
- git push origin main     (used to push code to main branch)


# after making changes in any file 
(use following commands to commit)

- git status
- git add .  (here . is used for all changes made in any file of the this project)
- git commit -m "New Change"  (it will give us how many files are changed | insertions and deletions | other details)


- git push -u origin main  (once we use this command to comit then afterwords we don't have to use complete command furthur instead we can use only (git push) for that we have to use "-u" flag atleast once)

# if we don't have any untracked files while checking status 
(that time we can add and commit in one command)

- git commit -am "added new change"
- git push


# Github 
code changes -> commit -> PR

# Local Git
code changes -> "add" (stage changes) -> "commit" (commit changes) -> push -> PR

# Git Branches

```
- 1 -> 2 -> 3 -> 4 -> (Main) 
             | 
             3 -> 4 -> (feature)
```

```
              (Bugfix)
              _____ 2 ____
             |            | 
(main) -> 1 -----> 2 --------> 3 ---------> 4 
                                       ^
                   |                   |
                    ----> 3 ----> 4 ---

```
- after merging into the main branch we can delete the bugfix or feature branch 
 
# Branch Commands

- git branch                       (to check branch)
- git branch -M main               (to rename branch)
- git checkout <-branch name->          (to navigate)
- git checkout -b <-new branch name->   (to create new branch)
- git branch -d <-branch name->         (to delete branch)
```
-> git branch   // main

* main

-> git checkout -b feature  //it switch to a new branch called 'feature'.
if we want to switch to branch main

* feature     (newly created)
  main

-> git checkout main // now we are on main branch

  feature
* main

-> git checkout feature // now we are on feature branch

* feature
  main
```

# after changing in feature branch 
```
- if we try to push to the code it will give you --->
fatal : The current brach feature has no upstream branch.

for that we have to set upstream for that use command
-> git push --set-upstream origin feature

it will create origin branch and push 
```

# Merging Code
we can use git to merge code from different branches to main 

```
- git diff <-branch name->    (to compare commits, branches, files & more)
- git merge <-branch name->   (to merge 2 branches)
Or
Ceate a PR
```

# PR / Pull Request
- It lets you tell others about changes you have pushed to a branch in a repository on GitHub.

- merge pull request = 1 commit

# Pull 
Fetch Changes from remote repository to local machine

- git pull origin main    // used to fetch and download content from a remote repo and immidiately update the local repo to match that content.

# Merge Conflicts
An event that takes place when Git is unable to automatically resolve       differences in code between two commits.
    
```
Ex.

<<<<<<<<<<<<<<<<< HEAD (Current Change)
Adding a new change-feature
=======
Adding a new change-main
>>>>>>>>>main (Incoming Change)

```
- git diff main    // shows differences in branches
- git checkout main
- git checkout feature   

- git branch
```
  feature
* main
```
- git merge feature   // if merge conflict is there

(it gives --> 
CONFLICT (content) : Merge conflict in app.js
Automatic merge failed; fix conflict and then commit the result.)

// we have to change the file manually what feature we want to keep and what we want to remove. now file is modified and we have to add it 

- git add .
- git status
- git commit -m "merge with feature" // it shows merge with feature
- git push origin main
 

# Fixing Mistakes

```
Case 1 : Staged changes
    -> git reset <-file name->     // remove last change from perticular file
    -> git reset      // if we want to remove last change we have made

Case 2 : commited changes (for one commit)
    -> git reset HEAD-1   // HEAD points to last commit. when we use this command it removes last commit where HEAD is currently pointing and now HEAD is pointing to its privious commit. (basically used to undo commit)

Case 3 : commited changes (for many commits)
    -> git reset <-commit hash->
    -> git reset --hard <-commit hash->

```

- git log  // gives information about all commits in reverse chronological order.
- git reset HASH // when we use hash, then all the changes we have made after that commit become unstaged.
- git reset --hard HASH // it removes all changes forcefully from the the commits and HEAD goes to previous HASH.












-- Created by Divyanka




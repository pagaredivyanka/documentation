# Congfiguring Git

- git config --global user.name "My Name"
- git config --global user.email "someone@email.com"

- git config --list //enlist credentials
  
# Git Initilization
## init - used to create a new git repo 
- git init  
  
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




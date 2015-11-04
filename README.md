# Problem 4.16 

## Java Code
```java
"insert code"
```

## Console Output
```
console output
```

## Command Promt Output
```
Microsoft Windows [Version 6.1.7601]
Copyright (c) 2009 Microsoft Corporation.  All rights reserved.

C:\Users\LAB>E:

E:\>cd java

E:\Java>cd "problem 4.16"

E:\Java\problem 4.16>echo # probelm-4.16 >> README.md

E:\Java\problem 4.16>git init
Reinitialized existing Git repository in E:/Java/problem 4.16/.git/

E:\Java\problem 4.16>git add README.md

E:\Java\problem 4.16>git commit -m "first commit"

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: unable to auto-detect email address (got 'LAB@STF126B-PC.(none)')

E:\Java\problem 4.16>git config user.email "wallaceb@student.swosu.edu"

E:\Java\problem 4.16>git config user.name "brinden wallace"

E:\Java\problem 4.16>git commit -m "first commit"
[master (root-commit) 32a1234] first commit
 1 file changed, 1 insertion(+)
 create mode 100644 README.md

E:\Java\problem 4.16>git remote add origin https://github.com/bw540418/probelm-4
.16.git
fatal: remote origin already exists.

E:\Java\problem 4.16>git push -u origin master
Username for 'https://github.com': bw540418
Password for 'https://bw540418@github.com':
Counting objects: 3, done.
Writing objects: 100% (3/3), 233 bytes | 0 bytes/s, done.
Total 3 (delta 0), reused 0 (delta 0)
To https://github.com/bw540418/probelm-4.16.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.

E:\Java\problem 4.16>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': bw540418
Password for 'https://bw540418@github.com':
Everything up-to-date

E:\Java\problem 4.16>git add .

E:\Java\problem 4.16>git commit -m "first code written"
[master fbe0c2e] first code written
 4 files changed, 40 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 bin/random_letter.class
 create mode 100644 src/random_letter.java

E:\Java\problem 4.16>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': bw540418
Password for 'https://bw540418@github.com':
Counting objects: 8, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (6/6), done.
Writing objects: 100% (8/8), 1.51 KiB | 0 bytes/s, done.
Total 8 (delta 0), reused 0 (delta 0)
To https://github.com/bw540418/probelm-4.16.git
   32a1234..fbe0c2e  master -> master

E:\Java\problem 4.16>
```

## Conclusion
This was an example of Markdown documentation as we have done in the past.

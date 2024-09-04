#!/bin/bash

# Clone the repository
gh repo clone https://github.com/jargoh999/-new_dev_ops_assignment_ayomide_-_marvelous.git
cd -new_dev_ops_assignment_ayomide_-_marvelous
# Create and switch to the 'register' branch
gh repo fork --remote
git checkout -b register
# Add all files to the staging area
gh repo sync
# Commit changes with a message using gh CLI
gh commit -m "Commit changes to register branch"
# Push changes to the 'register' branch
gh repo sync
# Create and switch to the 'login' branch
git checkout -b login
# Add all files to the staging area
gh repo sync
# Commit changes with a message using gh CLI
gh commit -m "Commit changes to login branch"
# Push changes to the 'login' branch
gh repo sync
# Switch to the 'dev' branch
git checkout dev
# Merge 'register' branch into 'dev'
gh pr create --base dev --head register --title "Merge register into dev" --body "Merging register branch into dev"
gh pr merge --squash
# Merge 'login' branch into 'dev'
gh pr create --base dev --head login --title "Merge login into dev" --body "Merging login branch into dev"
gh pr merge --squash
# Push changes to the 'dev' branch
gh repo sync
# Switch to the 'main' branch
git checkout main
# Merge 'dev' branch into 'main'
gh pr create --base main --head dev --title "Merge dev into main" --body "Merging dev branch into main"
gh pr merge --squash
# Push changes to the 'main' branch
gh repo sync
echo "GitHub CLI commands ex2ecuted successfully."

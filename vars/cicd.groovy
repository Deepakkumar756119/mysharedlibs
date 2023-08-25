def newGit(repo)
{
  git "http://github.com/Deepakkumar756119/${repo}"
}

def newBuild()
{
  sh 'mvn package'
}

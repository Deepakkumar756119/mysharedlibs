def gitDownload(repo)
{
    git "https://github.com/Deepakkumar/${repo}.git"
}

def mavenBuild()
{
    sh 'mvn package'
}


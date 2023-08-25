def newGit(repo)
{
  git "http://github.com/Deepakkumar756119/${repo}"
}

def newBuild()
{
  sh 'mvn package'
}

def newDeploy(jobname,ip,context)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}

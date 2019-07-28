def call(int buildNumber)
{
if (buildNumber %2 == 0)
{
pipeline{
agent any
stages{
stage('even build number')
{
steps{
echo 'the build number is even'
script{
log.info 'starting even build'
log.warning 'nothing to do'
}
}
}
}
}
}
else
{
pipeline{
agent any
stages{
stage('odd build number')
{
steps{
echo 'the build number is odd'
script{
log.info 'starting odd build'
log.warning 'nothing to do'
}
}
}
}
}
}
}

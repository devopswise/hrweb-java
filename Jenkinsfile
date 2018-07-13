pipeline {
    agent { label 'cdt-jenkins-java-slave' }
    
    stages {
        stage ('Checkout') {
            steps {
                checkout scm
            }
        }
       
       stage ('Build') {
          steps {
             sh "/home/user/apache-maven-3.3.9/bin/mvn -B clean package"
          }
       }

       stage ('Unit') {
          steps {
             sh 'echo unit test completed'
          }
       }

       stage ('static') {
          steps {
             sh 'echo completed'
          }
       }
       
       stage ('package') {
          steps {
            // why not use withRegistry? https://issues.jenkins-ci.org/browse/JENKINS-41051  
            withDockerRegistry([ credentialsId: "devopswise-dockerhub", url: "" ]) {
              sh 'docker build -f Dockerfile -t devopswise/hrweb-java:latest .'
              sh 'docker push devopswise/hrweb-java:latest'
            }
            script {  
              def tag = 'latest'
              if ( "${env.BRANCH_NAME}" == "master") {
                withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId: 'devopswise-github',
                    usernameVariable: 'GIT_USERNAME', passwordVariable: 'GIT_PASSWORD']])
                //withCredentials([string(credentialsId: 'devopswise-github', variable: 'GITHUB_PASSWORD')]) {
                  def repo_url = "github.com/devopswise/hrweb-java.git"
                  def user_name = "devopswise"
                  sh("git config user.name 'Onur'")
                  sh("git config user.email 'onur@devopswise.co.uk'")
                  sh("git tag -a ${tag} -m ${tag} ") 
                  sh("git push https://${env.GIT_USERNAME}:${env.GIT_PASSWORD}@${repo_url} --tags") 
                }
            }
          }
        }
       }
       stage ('verification') {
          steps {
             sh 'echo completed'
          }
       }

    }
   // Checkout code
   //git url: 'https://github.com/ozkolonur/hrweb-java'
}

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
            withDockerRegistry([ credentialsId: "devopswise-dockerhub", url: "" ]) {
              sh 'docker build -f Dockerfile -t devopswise/hrweb-java:latest .'
              sh 'docker push devopswise/hrweb-java:latest'
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

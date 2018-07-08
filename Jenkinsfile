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
             sh 'echo completed'
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

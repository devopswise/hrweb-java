node('cdt-jenkins-java-slave'){
    stages {
        stage ('Checkout') {
            steps {
                checkout scm
            }
        }
       
       stage ('Build') {
          steps {
             sh 'mvn -B clean package'
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

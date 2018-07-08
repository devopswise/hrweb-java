node('cdt-jenkins-java-slave'){
   stage 'checkout'

   // Checkout code
   git url: 'https://github.com/ozkolonur/hrweb-java'

   // Get the maven
   def mvnHome = tool 'mvn'

   stage 'build'
   // get Maven
   sh "${mvnHome}/bin/mvn -B clean"
   //sh "${mvnHome}/bin/mvn -B versions:set -DnewVersion=${env.BUILD_NUMBER}"
   sh "${mvnHome}/bin/mvn -B package"

   stage 'test'
   sh "echo testing"

   stage 'archive'
   archive 'target/*.jar'
}

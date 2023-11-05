pipeline {
   agent {
           docker {
               image 'maven:3.9.5-eclipse-temurin-17-alpine'
               args '-v /root/.m2:/root/.m2'
           }
       }

   stages {
        stage('Build') {
             steps {
                  sh 'mvn -B -DskipTests clean package'
              }
          }
        stage('Test') {
             steps {
                 sh 'mvn test'
             }
         }
         stage('Deploy') {
             steps {
                 sh 'java -jar target/simple-rest-api-0.0.1-SNAPSHOT.jar'
             }
         }
   }
}

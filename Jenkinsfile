pipeline {
    agent any

    stages {
        stage('Package the App') {
            steps {
                sh 'sbt package'
            }
        }

        stage('Testing with ScalaTest') {
            steps {
                sh 'sbt test'
            }
        }
        stage('Static Code Analysis') {
          def scannerHome = tool 'SonarQube Scanner';
          withSonarQubeEnv('SonarQube Server') {
              sh "${scannerHome}/bin/sonar-scanner"
          }
        }
    }
}
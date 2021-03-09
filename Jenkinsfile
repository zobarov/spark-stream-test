pipeline {
    agent any
    environment {
        SCANNER_HOME = tool 'SonarQube Scanner';
    }
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
        stage('SonarScan on server') {
            steps {
            sh 'sonar-scanner \
                  -Dsonar.projectKey=Scala_Orchestration \
                  -Dsonar.sources=. \
                  -Dsonar.host.url=http://localhost:9000 \
                  -Dsonar.login=0362fd1cf35fcc9d241ebeca64e0b3dc7e7e918c'
            }
        }

        stage('Static Code Analysis') {
            steps {

                withSonarQubeEnv('SonarQube Server') {
                    sh "${SCANNER_HOME}/bin/sonar-scanner"
                }
            }

        }
    }
}
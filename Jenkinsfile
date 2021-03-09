pipeline {
    agent any
    def scannerHome = tool 'SonarQube Scanner';

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
            steps {

                withSonarQubeEnv('SonarQube Server') {
                    sh "${scannerHome}/bin/sonar-scanner"
                }
            }

        }
    }
}
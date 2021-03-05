pipeline {
    agent any

    stages {
        stage('Install SBT') {
            steps {
              sh 'apt-get install sbt'
            }
        }
        stage('Build') {
            steps {
                sh 'sbt assemble .'
            }
        }
    }
}
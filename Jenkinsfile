pipeline {
    agent any

    stages {
        stage('Install SBT') {
            steps {
              sh 'sudo apt-get install sbt'
            }
        }
        stage('Build') {
            steps {
                sh 'sbt assemble .'
            }
        }
    }
}
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'sbt package'
            }
        }
    }
}
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
    }
}
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
              git credentialsId: "${github_creds}", url: "${github_repo}"
            }
        }
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
    }
}
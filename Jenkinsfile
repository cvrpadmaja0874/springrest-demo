pipeline {
    agent any

    stages {
        stage('Clone Public Repo') {
            steps {
                checkout scm
            }
        }

        stage('Build JAR') {
            steps {
                sh 'chmod +x mvnw && ./mvnw clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t springrest-demo:${BUILD_NUMBER} -t springrest-demo:latest .'
            }
        }
    }
}

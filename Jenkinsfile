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

        stage('Deploy Container') {
            steps {
                sh '''
                    docker stop springrest-container || true
                    docker rm springrest-container || true
                    docker run -d --name springrest-container -p 8082:8082 springrest-demo:latest
                '''
            }
        }
    }
}

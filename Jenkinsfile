pipeline {
    agent any

    stages {
        stage('Clone repo') {
            steps {
                git 'https://github.com/hamza-sougou/Java_client_manager.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Analyse SonarQube') {
            steps {
                withSonarQubeEnv('sonarqube') {
                    bat 'sonar-scanner'
                }
            }
        }
    }
}

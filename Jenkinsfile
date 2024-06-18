pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                ./gradlew build
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
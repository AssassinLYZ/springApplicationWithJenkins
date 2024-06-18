pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps { //Checking out the repo
                checkout changelog: true, poll: true, scm: [$class: 'GitSCM', branches: [[name: '*/main']] ]
            }
        }
        stage('Build') {
            steps {
                script {
                    bat './gradlew.bat build'
                }
            }
        }
    }
}

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
                    // on windows
                    bat './gradlew.bat build'
                    // on unix
                    // sh './gradlew build'
                }
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'build/libs/**/*.jar', fingerprint: true
        }
    }
}

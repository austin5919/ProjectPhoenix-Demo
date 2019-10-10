node {
    stage('Checkout') {
        checkout scm
    }
    stage('Code Style') {
        echo 'WIP Code Style Stage'
        def response = sh 'mvn spotless:check'
        echo 'Code Style Response ${response}'
    }
    stage('Build') {
        echo 'WIP Build Stage'
        sh 'clean install'
    }
    stage('Test') {
        echo 'WIP Test Stage'
    }
    stage('SonarQube') {
        echo 'WIP SonarQube Stage'
    }
    stage('Deploy') {
        echo 'WIP SonarQube Stage'
    }
}

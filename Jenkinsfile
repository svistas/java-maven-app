pipeline {
  
  agent any
  tools {
    maven 'maven-3.9'
  }
  
  stages {
    stage('build jar') {
      steps {
        script {
          echo "Building..."
          sh 'mvn package'
        }
      }
    }
    stage('build docker image') {
  
      steps {
        script {
          echo 'Building docker image...'
          withCredentials([usernamePassword(credentialsId: 'Docker Hub', passwordVariable: 'PASSWORD', usernameVariable: 'USERNAME')]) {
            sh 'docker build -t sofiavistas/demo-app-jenkins:2.0 .'
            sh 'echo $PASSWORD | docker login -u $USERNAME --password-stdin'
            sh 'docker push sofiavistas/demo-app-jenkins:2.0'
          }
        }
      }
    }
    stage('deploy') {
  
      steps {
        echo 'Deploying...'
      }
    } 
  }
}

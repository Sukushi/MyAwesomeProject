pipeline {
	agent any

	tools {
		maven "Maven 3.9.6"
	}

	stages {
		stage('Hello') {
			steps {
				script {
					echo 'Hello World !'
				}
			}
		}

		stage('Maven Build') {
			steps {
				bat 'mvn clean package'
			}
		}

		stage('Build Docker Image') {
			steps {
				script {
					dockerImage = docker.build('myawesomeproject:latest')
				}
			}
		}

		stage('Start Docker Container') {
			steps {
				bat "docker run --name myawesomeproject -d -p 9075:8080 myawesomeproject:latest MyAwesomeProject.jar"
			}
		}
	}
}
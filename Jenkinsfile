pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
		stage('Checkout from git') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/ilyasDah/SpringBootExemple.git'
            }

        }
        stage('Compile code') {
            steps {
                bat 'mvn compile'
            }
		
        }
		stage('build code') {
            steps {
                bat 'mvn clean install'
            }
		
        }
		
		stage('Consruire package') {
            steps {
                bat 'mvn clean package'
            }
		
        }
		
		
		stage ('Démarrer projet'){
			steps {
				bat 'mvn spring-boot:run -Dspring-boot.run.arguments="--server.port=8081"'
			}
		}
    }
	post {
		failure {
			echo "le build n'a pas bien passé :( "
		}
	}
	
}

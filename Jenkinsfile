pipeline {
	agent any
	stages {
		stage('Source') { 
			steps {
				checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/prabhavagrawal/discoveri-happytrip.git']]])
			}
		}
		stage('Build') { 
			tools {
				jdk 'JAVA'
				maven 'Maven'
			}
			steps {
				powershell 'java -version'
				powershell 'mvn -version'
				powershell 'mvn clean package'
				archiveArtifacts 'target/*.war'

			}
		}
		stage ('Deploy to Production'){
  	input{
   		 message "Do you want to proceed for production deployment?"
	  }
    	steps {
                sh 'echo "Deploy into Production"'

              }
        }
		stage('Deploy') {
			steps{
				echo "Deploying"
				deploy adapters: [tomcat7(credentialsId: '98e9cbd9-106c-4efa-8238-9888f9bc8fc3', path: '', url: 'http://localhost:8085')], contextPath: 'happytrip', war: '**/*.war'
			}
		}
		
		stge('Email Notification'){
			steps{
				mail bcc: '', body: '''Hi, 

				On starting the Jenkins

				Thanks
				Veera''', cc: '', from: '', replyTo: '', subject: 'Jenkins Happytrip', to: 'veeranji.hitssbt@gmail.com'
			}
		}
	}
}

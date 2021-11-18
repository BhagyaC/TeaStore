def gv

pipeline {
    agent any
    
    tools {
        maven "Maven"
    }
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
    

    stages {
        stage("init") {
            steps {
                script {
                   gv = load "work.groovy" 
                }
            }
        }
        stage("build") {
            steps {
                script {
                    gv.buildApp()
                    sh "docker-compose -f ./examples/docker/docker-compose_default.yaml up"
                }
            }
        }
        stage("test") {
            
            when {
                expression {
                    params.executeTests
                }
            }
            steps {
                script {
                    sh "mvn clean test"
                    gv.testApp()
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }   
}

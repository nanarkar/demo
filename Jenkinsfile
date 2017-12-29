pipeline {
    agent any
    
    stages {
        stage  ('Compile Code') { 
            steps {
                withMaven(maven: 'maven_3_5_2') {
                    sh 'mvn clean compile'
                }
            }
            
        }
        stage  ('Run JUnits') { 
            steps {
                withMaven(maven: 'maven_3_5_2') {
                    sh 'mvn test -Punit-tests'
                }
            }
            
        }
        stage  ('Create WAR') { 
            steps {
                withMaven(maven: 'maven_3_5_2') {
                    sh 'mvn package -DskipTests'
                }
            }
            
        }
         stage  ('Create Docker Image') { 
            steps {
                    sh 'docker build -t 10.102.84.122/demo1 .'
                    sh 'docker save 10.102.84.122/demo1 > demo1.tar.gz'
            }
            
        }
         stage  ('Deploy demo') { 
            steps {
                    sh 'docker stop demo'
                    sh 'docker rm demo'
                }
            }
        }
         stage  ('Deploy demo') { 
            steps {
                    sh 'docker run -d -p 18080:8080 --name demo 10.102.84.122/demo1'
                    sh 'chmod +x chromedriver'
                }
            }
        }
        stage  ('UI test') { 
             steps {
                withMaven(maven: 'maven_3_5_2') {
                    sh 'mvn test -Pcucumber-tests'
                }
            }
        }
    }
}
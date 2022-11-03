pipeline {

     agent any

        stages{
            stage('Git Checkout'){
                steps{
                    git 'https://github.com/thusiyanth/SpringFramwork.git'
                }
            }

             stage('UNIT Testing'){
                steps{
                    sh 'mvn test'

                }
            }
            stage('sh how to') {
                    steps {
                        sh 'ls -l'
                    }
                }



        }

}
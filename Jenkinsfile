pipeline {

     agent any
        stages{
            stage('Git Checkout'){
                steps{
                    git 'https://github.com/thusiyanth/SpringFramwork.git'
                }
            }
        stages{
            stage('Unite Testing'){
                 steps{
                     sh 'mvn test'
                 }
            }

        }
}
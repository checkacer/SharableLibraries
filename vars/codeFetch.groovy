#!groovy
pipeline {
   def mvnHome
   def jdkHome
   stage('Preparation') { 
      git credentialsId: '13735461-01df-48bf-85cc-373338e73227', url: 'https://github.com/checkacer/runindockerdemo'      
      mvnHome = tool 'maven'
      jdkHome = tool 'jdk'
   }
   stage('Package') {
      sh "'${mvnHome}/bin/mvn' package"
   }
   stage('Results') {
      archive 'target/*.jar'
   }
}

#!groovy 
def call(String a){
   if(a == "a"){
     echo "starting fetch code......"
   }else{
     echo "-----------------bbb"
   }
   pipeline {
     stages {
       stage('in stage') {
         steps {
	   echo "-----------------innnn"
	 }         
       }
     }
   }
}

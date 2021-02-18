node{
    stage("checkout"){
        checkout scm
    }
    stage("deploy"){
        
        sh "mvn package"
    }
}

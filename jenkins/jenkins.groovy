
node{
    stage("checkout"){
        checkout scm
    }
    stage("Build"){
        
        mavenPath = tool 'maven3'
        
        sh "${mavenPath}/mvn command"
    }
    
    stage("RUN"){
        sh "javac Helloworld.java"
        sh "java Helloworld"
    }
}

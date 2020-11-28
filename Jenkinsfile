pipeline {
    agent any
    stages {
        stage('Track') {
            when {
                branch 'master'
            }
            steps {
                echo 'master'
		sh 'mvn clean package'
		sh 'cp Dockerfile target/'
		sh 'cd target'
		sh 'docker rmi -f test'
		sh 'docker build -t test .'
		sh 'docker run -it --name test -p 7000:8080 test'
            }
        }
}
}

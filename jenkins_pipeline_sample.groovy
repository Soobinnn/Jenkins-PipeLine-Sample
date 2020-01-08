pipeline {
  agent {
    label 'jenkins-pipeline-sample'
  }
  
  environment {
  //     REGISTRY_HOST=""
  //     REGISTRY_PORT=""
  //     REPOSITORY_NAME="${env.SERVER_TYPE == "prod" ? "${PROJECT_NAME}" : "${PROJECT_NAME}-${SERVER_TYPE}"}"
  }

  stages {
     stage("Set Current Build DisplayName") {
      steps {
        script {
          currentBuild.displayName = "${SERVER_TYPE}_${BRANCH_NAME}_${EXECUTOR}"
        }
      }
     }
  }
}

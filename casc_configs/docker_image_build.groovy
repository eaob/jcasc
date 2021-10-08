pipelineJob('docker-image-build') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            github('eaob/Multistage_Dockerfile', 'ssh')
            credentials('github')
          }
          branch('*/main')
        }
      }
      lightweight()
    }
  }
}

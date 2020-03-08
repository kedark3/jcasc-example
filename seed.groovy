multibranchPipelineJob('configuration-as-code-via-url') {
  branchSources {
      git {
          id = 'configuration-as-code'
          remote('https://github.com/jenkinsci/configuration-as-code-plugin.git')
      }
  }
}
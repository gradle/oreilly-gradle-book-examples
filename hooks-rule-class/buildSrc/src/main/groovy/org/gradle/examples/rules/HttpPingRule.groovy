import org.gradle.api.Rule

class HttpPingRule
  implements Rule {

  def project
  def pingLogDir

  HttpPingRule(project) {
    this.project = project
    pingLogDir = project.ext.pingLogDir
  }

  String getDescription() { 
    'Rule Usage: ping<Hostname>' 
  }

  void apply(String taskName) {
    if(taskName.startsWith('ping')) {
      project.task(taskName) {
        ext.hostname = taskName - 'ping'
        doLast {
          def url = new URL("http://${ext.hostname}")
          def logString = pingServer(url)
          logResults(pingLogDir, 'ping.log', logString)
        }
      }
    }
  }

  def pingServer(url) {
    try {
      def pageContent = url.text
      if(parsePageContent(pageContent)) {
        ext.up = true
        logString = "${new Date()}\t${url}\tUP\n"
      }
      else {
        ext.up = false
        logString = "${new Date()}\t${url}\tDOWN\n"
      }
    }
    catch(UnknownHostException e) {
      ext.up = false
      logString = "${new Date()}\t${ext.hostname}\tUNKNOWN HOST\n"
    }
    catch(ConnectException e) {
      ext.up = false
      logString = "${new Date()}\t${ext.hostname}\tDOWN\n"
    }
  }

  def parsePageContent(content) {
    return true
  }

  def logResults(directory, filename, text) {
    file(directory).mkdirs()
    file(${directory}/${file}) << text
  }

}

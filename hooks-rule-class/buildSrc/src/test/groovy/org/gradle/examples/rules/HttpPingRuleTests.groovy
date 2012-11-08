import org.junit.Before
import org.junit.Test
import static org.junit.Assert.*

/**
 * A class illustrating partial test coverage of a Gradle Rule class
 * using ad-hoc Groovy mocking.
 */
class HttpPingRuleTests {

  def rule

  @Before
  void setup() {
    rule = new HttpPingRule([ext: [pingLogDir: 'log-dir']])
  }

  @Test
  void unknownHostIsDetected() {
    def url = [ getText: { -> throw new UnknownHostException() },
                toString: { -> "HOSTNAME"} ]
    def log = rule.pingServer(url)
    def logParts = log.split('\t')
    assertEquals "UNKOWN HOST", logParts[2]
    assertEquals "HOSTNAME", logParts[1]
    assert
  }

  @Test
  void connectionProblemIsDetected() {
    def url = [ getText: { -> throw new ConnectException() },
                toString: { -> "HOSTNAME"} ]
    def log = rule.pingServer(url)
    def logParts = log.split('\t')
    assertEquals "DOWN", logParts[2]
    assertEquals "HOSTNAME", logParts[1]
  }

}
package coop.rchain.rholang.parser.under

import java.util.Arrays.asList

import coop.rchain.rholang.parser.LexerAssertUtils.tokenize
import coop.rchain.rholang.parser.RhoTokenType._
import coop.rchain.rholang.parser.log.impl.DiagnosticCollector
import org.scalatest.{FlatSpec, Matchers, OneInstancePerTest}

class UnderSpec extends FlatSpec with Matchers  with OneInstancePerTest {

  val collector = new DiagnosticCollector

  "RhoLexer" should "return [PAR, EOF] for \"|\"" in {
    val tokens = tokenize("|", collector)

    tokens shouldBe asList(PAR.T, EOF.T)
    collector.getDiagnostics shouldBe empty
  }
}

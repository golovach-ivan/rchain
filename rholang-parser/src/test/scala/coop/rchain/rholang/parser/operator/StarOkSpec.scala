package coop.rchain.rholang.parser.operator

import java.util.Arrays.asList

import coop.rchain.rholang.parser.LexerAssertUtils.tokenize
import coop.rchain.rholang.parser.RhoTokenType._
import coop.rchain.rholang.parser.log.impl.DiagnosticCollector
import org.scalatest.{FlatSpec, Matchers, OneInstancePerTest}

class StarOkSpec extends FlatSpec with Matchers  with OneInstancePerTest {

  val collector = new DiagnosticCollector

  "RhoLexer" should "return [STAR, EOF] for \"*\"" in {
    val tokens = tokenize("*", collector)

    tokens shouldBe asList(STAR.T, EOF.T)
    collector.getDiagnostics shouldBe empty
  }
}
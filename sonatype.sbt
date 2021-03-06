// Following instructions from https://github.com/xerial/sbt-sonatype
// see https://issues.sonatype.org/browse/OSSRH-27720
pomExtra in Global :=
    <inceptionYear>2016</inceptionYear>
    <scm>
      <url>git@github.com:Chymyst/Chymyst.git</url>
      <connection>scm:git:git@github.com:Chymyst/Chymyst.git</connection>
    </scm>
    <developers>
      <developer>
        <id>winitzki</id>
        <name>Sergei Winitzki</name>
        <url>https://sites.google.com/site/winitzki</url>
      </developer>
    </developers>

sonatypeProfileName := "winitzki"

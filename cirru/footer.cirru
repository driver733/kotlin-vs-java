footer
  div
    :class
      = "container text-center"
    div (:class "row justify-content-center pt-4")
      .col
        span
          = "Java 13"
    div (:class "row justify-content-center")
      .col
        span
          = "Kotlin 1.3.60"
    div (:class "row justify-content-center pt-4 pb-2")
      .col
        span
          = "Created by: "
          a (:href https://www.driver733.com)
            = @driver733
    div (:class "row justify-content-center")
      .col
        a (:href "https://github.com/driver733/kotlin-vs-java")
          img (:src "//img.shields.io/github/stars/driver733/kotlin-vs-java.svg?style=social") (:alt "GitHub stars")
    div (:class "row justify-content-center pt-4 pb-4")
      .col
        span
          = "Based on: "
        a (:href https://github.com/fabiomsr/from-java-to-kotlin)
          = fabiomsr/from-java-to-kotlin
@insert ../../end.html

.section
  .list-group-flush
    div (:class "list-group-item border-0")
      .title "Equals"
      .container-fluid
        .row
          .col
            .lang Java
            pre.code $ code (@insert ../../code/java/error-prone/01-equals.java) $ :class java
          .col
            .lang Kotlin
            pre.code $ code (@insert ../../code/kotlin/error-prone/01-equals.kt) $ :class kotlin


.section
  .list-group-flush
    div (:class "list-group-item border-0")
      .title "I"
      .container-fluid
        .row
          .col
            .lang Java
            pre.code $ code (@insert ../../code/java/concurrency/01.java) $ :class java
          .col
            .lang Kotlin
            pre.code $ code (@insert ../../code/kotlin/concurrency/01.kt) $ :class kotlin
    div (:class "list-group-item border-0")
      .title "II"
      .container-fluid
        .row
          .col
            .lang Java
            pre.code $ code (@insert ../../code/java/concurrency/02.java) $ :class java
          .col
            .lang Kotlin
            pre.code $ code (@insert ../../code/kotlin/concurrency/02.kt) $ :class kotlin
    div (:class "list-group-item border-0")
      .title "III"
      .container-fluid
        .row
          .col
            .lang Java
            pre.code $ code (@insert ../../code/java/concurrency/03.java) $ :class java
          .col
            .lang Kotlin
            pre.code $ code (@insert ../../code/kotlin/concurrency/03.kt) $ :class kotlin

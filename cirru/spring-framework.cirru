.section
  .list-group-flush
    div (:class "list-group-item border-0")
      .title "Immutable Configuration properties"
      .container-fluid
        .row
          .col
            .lang Java
            pre.code $ code (@insert ../../code/java/spring-framework/spring-framework-00.java) $ :class java
          .col
            .lang Kotlin
            pre.code $ code (@insert ../../code/kotlin/spring-framework/spring-framework-00.kt) $ :class kotlin

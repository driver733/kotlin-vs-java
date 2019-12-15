.section
  .list-group-flush
    div (:class "list-group-item border-0")
      .title "Read file contents into a string"
      .container-fluid
        .row
          .col
            .lang Java
            pre.code $ code (@insert ../../code/java/io/read-file-to-string.java) $ :class java
          .col
            .lang Kotlin
            pre.code $ code (@insert ../../code/kotlin/io/read-file-to-string.kt) $ :class kotlin

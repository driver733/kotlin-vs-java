.section
  .list-group-flush
    div (:class "list-group-item border-0")
      .title "Lazy"
      .container-fluid
        .row
          .col
            .lang Java
            pre.code $ code (@insert ../../code/java/delegated-properties/lazy.java) $ :class java
          .col
            .lang Kotlin
            pre.code $ code (@insert ../../code/kotlin/delegated-properties/lazy.kt) $ :class kotlin
    div (:class "list-group-item border-0")
      .title "Map"
      .container-fluid
        .row
          .col
            .lang Java
            pre.code $ code (@insert ../../code/java/delegated-properties/map.java) $ :class java
          .col
            .lang Kotlin
            pre.code $ code (@insert ../../code/kotlin/delegated-properties/map.kt) $ :class kotlin
    div (:class "list-group-item border-0")
      .title "Observable"
      .container-fluid
        .row
          .col
            .lang Java
            pre.code $ code (@insert ../../code/java/delegated-properties/observable.java) $ :class java
          .col
            .lang Kotlin
            pre.code $ code (@insert ../../code/kotlin/delegated-properties/observable.kt) $ :class kotlin

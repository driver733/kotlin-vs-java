doctype

html
  head
    title "Kotlin vs Java"
    meta (:charset utf-8)
    link (:rel stylesheet) (:href css/style.css)
    link (:rel stylesheet) (:href css/bootstrap.min.css)
    link (:rel stylesheet) (:href css/highlightjs-night-owl.css)
    script (:src js/highlight.9.16.2.js)
    script (:src js/bootstrap.min.js)
    script "hljs.initHighlightingOnLoad();"

  body

    div
      :class
        = "container-fluid text-center top-title"
      div
        :class
          = "row justify-content-center align-items-center text-center"
        .col
          p
            = "Kotlin vs Java"

    div
      :class
        = "container-fluid header text-center"
      div
        :class
          = "d-flex justify-content-start"
        .p-2
          a
            :href
              = index.html
            = Basic
        .p-2
          a
            :href
              = functions.html
            = Functions
        .p-2
          a
            :href
              = scoping-functions.html
            = Scoping functions
        .p-2
          a
            :href
              = classes.html
            = Classes
        .p-2
          a
            :href
              = collections.html
            = Collections
        .p-2
          a
            :href
              = concurrency.html
            = Concurrency


    div (:class "section")
      div (:class "list-group-flush")
        div (:class "list-group-item border-0")
          .title "Hello world"
          div (:class "list-group-flush")
            div (:class "list-group-item border-0")
              .lang Java
              pre.code $ code (@insert ../code/java/basic/hello-world.java) $ :class java
            div (:class "list-group-item border-0")
              .lang Kotlin
              pre.code $ code (@insert ../code/kotlin/basic/hello-world.kt) $ :class kotlin
        div (:class "list-group-item border-0")
          .title "Variables I"
          div (:class "list-group-flush")
            div (:class "list-group-item border-0")
              .lang Java
              pre.code $ code (@insert ../code/java/basic/variables-i.java) $ :class java
            div (:class "list-group-item border-0")
              .lang Kotlin
              pre.code $ code (@insert ../code/kotlin/basic/variables-i.kt) $ :class kotlin
        div (:class "list-group-item border-0")
          .title "Variables II"
          div (:class "list-group-flush")
            div (:class "list-group-item border-0")
              .lang Java
              pre.code $ code (@insert ../code/java/basic/variables-ii.java) $ :class java
            div (:class "list-group-item border-0")
              .lang Kotlin
              pre.code $ code (@insert ../code/kotlin/basic/variables-ii.kt) $ :class kotlin
        div (:class "list-group-item border-0")
          .title "Null I"
          div (:class "list-group-flush")
            div (:class "list-group-item border-0")
              .lang Java
              pre.code $ code (@insert ../code/java/basic/null-i.java) $ :class java
            div (:class "list-group-item border-0")
              .lang Kotlin
              pre.code $ code (@insert ../code/kotlin/basic/null-i.kt) $ :class kotlin
        div (:class "list-group-item border-0")
          .title "Null II"
          div (:class "list-group-flush")
            div (:class "list-group-item border-0")
              .lang Java
              pre.code $ code (@insert ../code/java/basic/null-ii.java) $ :class java
            div (:class "list-group-item border-0")
              .lang Kotlin
              pre.code $ code (@insert ../code/kotlin/basic/null-ii.kt) $ :class kotlin
        div (:class "list-group-item border-0")
          .title "Elvis operator"
          div (:class "list-group-flush")
            div (:class "list-group-item border-0")
              .lang Java
              pre.code $ code (@insert ../code/java/basic/elvis-operator.java) $ :class java
            div (:class "list-group-item border-0")
              .lang Kotlin
              pre.code $ code (@insert ../code/kotlin/basic/elvis-operator.kt) $ :class kotlin
        div (:class "list-group-item border-0")
          .title "Strings I"
          div (:class "list-group-flush")
            div (:class "list-group-item border-0")
              .lang Java
              pre.code $ code (@insert ../code/java/basic/strings-i.java) $ :class java
            div (:class "list-group-item border-0")
              .lang Kotlin
              pre.code $ code (@insert ../code/kotlin/basic/strings-i.kt) $ :class kotlin
        div (:class "list-group-item border-0")
          .title "Strings II"
          div (:class "list-group-flush")
            div (:class "list-group-item border-0")
              .lang Java
              pre.code $ code (@insert ../code/java/basic/strings-ii.java) $ :class java
            div (:class "list-group-item border-0")
              .lang Kotlin
              pre.code $ code (@insert ../code/kotlin/basic/strings-ii.kt) $ :class kotlin
        div (:class "list-group-item border-0")
          .title "Ternary operator"
          div (:class "list-group-flush")
            div (:class "list-group-item border-0")
              .lang Java
              pre.code $ code (@insert ../code/java/basic/ternary-operator.java) $ :class java
            div (:class "list-group-item border-0")
              .lang Kotlin
              pre.code $ code (@insert ../code/kotlin/basic/ternary-operator.kt) $ :class kotlin


    footer
      div
        :class
          = "container-fluid text-center"
        .row
          .col
            p
              = Created by:
              a
                :href
                  = https://www.driver733.com
                = " @driver733"
            p
              = Based on:
              a
                :href
                  = https://github.com/fabiomsr/from-java-to-kotlin
                = " fabiomsr/from-java-to-kotlin"

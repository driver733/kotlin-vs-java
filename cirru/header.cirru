@insert ../../start.html
script (:async) (:src "https://www.googletagmanager.com/gtag/js?id=UA-127781126-2")
script = "window.dataLayer = window.dataLayer || []; function gtag(){dataLayer.push(arguments);} gtag('js', new Date()); gtag('config', 'UA-127781126-2');"
script (:src "https://code.jquery.com/jquery-3.3.1.slim.min.js") (:integrity "sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo") (:crossorigin "anonymous")
script (:src "https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js") (:integrity "sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1") (:crossorigin "anonymous")
script (:src "https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js") (:integrity "sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM") (:crossorigin "anonymous")
script (:src js/highlight.9.16.2.js)
script (:src js/bootstrap.min.js)
script "hljs.initHighlightingOnLoad();"
link (:rel "stylesheet") (:href "https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css") (:integrity "sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T") (:crossorigin "anonymous")
link (:rel stylesheet) (:href css/style.css)
link (:rel stylesheet) (:href css/highlightjs-night-owl.css)
link (:rel apple-touch-icon) (:sizes 180x180) (:href /apple-touch-icon.png)
link (:rel "icon") (:type image/png) (:sizes 32x32) (:href /favicon-32x32.png)
link (:rel "icon") (:type image/png) (:sizes 16x16) (:href /favicon-16x16.png)
link (:rel "manifest") (:href /site.webmanifest)
link (:rel "mask-icon") (:href /safari-pinned-tab.svg) (:color #5bbad5)
title "Kotlin vs Java"
meta (:charset utf-8)
meta (:name viewport) (:content "width=device-width") (:initial-scale 1)
meta (:name msapplication-TileColor) (:content #da532c)
meta (:name theme-color) (:content #ffffff)

@insert ../../start-body.html

div (:class "container-fluid text-center header-title")
  div (:class "row text-center")
    .col
      p
        = "Kotlin vs Java"

nav (:class "navbar navbar-dark navbar-expand-lg")
  button (:class navbar-toggler) (:type button) (:data-toggle collapse) (:data-target #navbarNav) (:aria-controls navbarNav) (:aria-expanded false) (:aria-label "Toggle navigation")
    span (:class navbar-toggler-icon)
  div (:class "collapse navbar-collapse") (:id "navbarNav")
    ul (:class "navbar-nav")
      @if (@ index)
        li (:class "nav-item px-2 active")
          a (:class nav-link) (:href /index.html)
            = Basics
          span (:class sr-only)
            = (current)
        li (:class "nav-item px-2")
          a (:class nav-link) (:href /index.html)
            = Basics
      @if (@ classes)
        li (:class "nav-item px-2 active")
          a (:class nav-link) (:href /classes.html)
            = Classes
          span (:class sr-only)
            = (current)
        li (:class "nav-item px-2")
          a (:class nav-link) (:href /classes.html)
            = Classes
      @if (@ collections)
        li (:class "nav-item px-2 active")
          a (:class nav-link) (:href /collections.html)
            = Collections
          span (:class sr-only)
            = (current)
        li (:class "nav-item px-2")
          a (:class nav-link) (:href /collections.html)
            = Collections
      @if (@ concurrency)
        li (:class "nav-item px-2 active")
          a (:class nav-link) (:href /concurrency.html)
            = Concurrency
          span (:class sr-only)
            = (current)
        li (:class "nav-item px-2")
          a (:class nav-link) (:href /concurrency.html)
            = Concurrency
      @if (@ delegated_properties)
        li (:class "nav-item px-2 active")
          a (:class nav-link) (:href /delegated-properties.html)
            = Delegated Properties
          span (:class sr-only)
            = (current)
        li (:class "nav-item px-2")
          a (:class nav-link) (:href /delegated-properties.html)
            = Delegated Properties
      @if (@ dsl)
        li (:class "nav-item px-2 active")
          a (:class nav-link) (:href /dsl.html)
            = DSL
          span (:class sr-only)
            = (current)
        li (:class "nav-item px-2")
          a (:class nav-link) (:href /dsl.html)
            = DSL
      @if (@ functions)
        li (:class "nav-item px-2 active")
          a (:class nav-link) (:href /functions.html)
            = Functions
          span (:class sr-only)
            = (current)
        li (:class "nav-item px-2")
          a (:class nav-link) (:href /functions.html)
            = Functions
      @if (@ io)
        li (:class "nav-item px-2 active")
          a (:class nav-link) (:href /io.html)
            = "I/O"
          span (:class sr-only)
            = (current)
        li (:class "nav-item px-2")
          a (:class nav-link) (:href /io.html)
            = "I/O"
      @if (@ scoping_functions)
        li (:class "nav-item px-2 active")
          a (:class nav-link) (:href /scoping-functions.html)
            = Scoping Functions
          span (:class sr-only)
            = (current)
        li (:class "nav-item px-2")
          a (:class nav-link) (:href /scoping-functions.html)
            = Scoping Functions
      @if (@ spring_framework)
        li (:class "nav-item px-2 active")
          a (:class nav-link) (:href /spring-framework.html)
            = Spring Framework
          span (:class sr-only)
            = (current)
        li (:class "nav-item px-2")
          a (:class nav-link) (:href /spring-framework.html)
            = Spring Framework

a
  :href
    = https://github.com/driver733/kotlin-vs-java
  :class
    = github-corner
  :aria-label
    = View source on Github
  svg (:width 80) (:height 80) (:viewBox 0 0 250 250) (:style fill:#70B7FD; color:#fff; position: absolute; top: 0; border: 0; right: 0;) (:aria-hidden true)
    path (:d "M0,0 L115,115 L130,115 L142,142 L250,250 L250,0 Z")
    path (:d "M128.3,109.0 C113.8,99.7 119.0,89.6 119.0,89.6 C122.0,82.7 120.5,78.6 120.5,78.6 C119.2,72.0 123.4,76.3 123.4,76.3 C127.3,80.9 125.5,87.3 125.5,87.3 C122.9,97.6 130.6,101.9 134.4,103.2") (:fill currentColor) (:style transform-origin: 130px 106px;) (:class octo-arm)
    path (:d "M115.0,115.0 C114.9,115.1 118.7,116.5 119.8,115.4 L133.7,101.6 C136.9,99.2 139.9,98.4 142.2,98.6 C133.8,88.0 127.5,74.4 143.8,58.0 C148.5,53.4 154.0,51.2 159.7,51.0 C160.3,49.4 163.2,43.6 171.4,40.1 C171.4,40.1 176.1,42.5 178.8,56.2 C183.1,58.6 187.2,61.8 190.9,65.4 C194.5,69.0 197.7,73.2 200.1,77.6 C213.8,80.2 216.3,84.9 216.3,84.9 C212.7,93.1 206.9,96.0 205.4,96.6 C205.1,102.4 203.0,107.8 198.3,112.5 C181.9,128.9 168.3,122.5 157.7,114.1 C157.9,116.9 156.7,120.9 152.7,124.9 L141.0,136.5 C139.8,137.7 141.6,141.9 141.8,141.8 Z") (:fill currentColor) (:class octo-body)
  style
    = ".github-corner:hover .octo-arm{animation:octocat-wave 560ms ease-in-out}@keyframes octocat-wave{0%,100%{transform:rotate(0)}20%,60%{transform:rotate(-25deg)}40%,80%{transform:rotate(10deg)}}@media (max-width:500px){.github-corner:hover .octo-arm{animation:none}.github-corner .octo-arm{animation:octocat-wave 560ms ease-in-out}}"

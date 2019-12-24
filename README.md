# Kotlin vs Java

[![Build Status](https://travis-ci.com/driver733/kotlin-vs-java.svg)](https://travis-ci.com/driver733/kotlin-vs-java)

[![Dependabot Status](https://api.dependabot.com/badges/status?host=github&repo=driver733/kotlin-vs-java)](https://dependabot.com)

[![License](https://img.shields.io/badge/license-MIT-green.svg)](https://github.com/driver733/kotlin-vs-java/blob/master/LICENSE.txt)

Web page: [https://www.kotlinvsjava.com](https://www.kotlinvsjava.com)

Based on: [fabiomsr/from-java-to-kotlin](https://github.com/fabiomsr/from-java-to-kotlin)

### Develop

1. Install npm
2. Install coffeescript

    `npm install -g coffeescript`
3. Install node-gyp

    `npm install -g node-gyp`
4. Install dependencies 

    `npm install`
5. Generate html 

    `./make.coffee dev`

## HTML generation

First, the cirru templates (in `./cirru`) are combined with the header and footer (`./cirru/header.cirru` + `./cirru/{FILE}.cirru` + `./cirru/footer.cirru`).
Next, the generated cirru templates from the first step (in `./cirru/generated`) are converted into HTML (in `./`).

## Adding new code snippets

The code snippets reside in the `code/java` and `code/kotlin` folders.
They are referenced in cirru (`./cirru`) templates this way:
```
.lang Java
pre.code $ code (@insert ../../code/java/dsl/04.java) $ :class java
```

## How to contribute

Fork repository, make changes, send a pull request. I will review
your changes and apply them to the `master` branch shortly, provided
they don't violate the quality standards. Before
sending your pull request please check that the HTML is generated correctly:

```
./make.coffee dev
```

## Got questions?

If you have questions or general suggestions, don't hesitate to submit
a new [Github issue](https://github.com/driver733/kotlin-vs-java/issues/new).

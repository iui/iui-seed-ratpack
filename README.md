iui-seed-ratpack
================

iUI Seed Project using Ratpack project template
-----------------------------------------------

This is a prototype "seed" project that uses [iUI](http://www.iui-js.org) on the client and [Ratpack](https://github.com/ratpack/ratpack) on the server.

Created using the [Ratpack template](https://github.com/pledbrook/lazybones/tree/master/src/templates/ratpack) from [Lazybones](https://github.com/pledbrook/lazybones)

Boilerplate README from the Lazybones Template
----------------------------------------------
We have set you up with a standard project structure, a
simple home page, and Spock for writing tests (because you'd be mad not to
use it).

In this project you get:

* A Gradle build file with pre-built Gradle wrapper
* A tiny home page at src/ratpack/public/index.html
* A routing file at src/ratpack/ratpack.groovy
* Reloading enabled via src/ratpack/config.groovy
* A standard project structure:

    <proj>
      |
      +- src
          |
          +- ratpack
          |     |
          |     +- ratpack.groovy
          |     +- config.groovy
          |     +- public          // Static assets in here
          |          |
          |          +- images
          |          +- lib
          |          +- scripts
          |          +- styles
          |
          +- main
          |   |
          |   +- groovy
                   |
                   +- // App classes in here!
          |
          +- test
              |
              +- groovy
                   |
                   +- // Spock tests in here!

That's it! You can start the basic app with

    ./gradlew run

but it's up to you to add the bells, whistles, and meat of the application.

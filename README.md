iui-seed-ratpack
================

iUI Seed Project using Ratpack project template
-----------------------------------------------

This is a prototype "seed" project that uses [iUI](http://www.iui-js.org) on the client and [Ratpack](http://www.ratpack-framework.org) on the server.

Created using the [Ratpack template](https://github.com/pledbrook/lazybones/tree/master/src/templates/ratpack) from [Lazybones](https://github.com/pledbrook/lazybones)

Very similar structure to the [Example Ratpack Gradle/Groovy App](https://github.com/ratpack/example-ratpack-gradle-groovy-app) which has a [better README](https://github.com/ratpack/example-ratpack-gradle-groovy-app#readme).

Directory Structure
-------------------

Unlike a typical Ratpack Gradle/Groovy App, the ```ratpack``` directory is not in ```src/ratpack```.  Instead the contents of that directory are in the project root directory.

  * ```public``` - directory contains static HTML and resources
  * ```templates``` - directory contains Groovy templates (HTML with some Groovy variables)
  * ```ratpack.groovy``` - Ratpack routes, code to set template variables, etc.
  
Running
-------

    ./gradlew run
    
Building
--------

To make a full copy of the app in the ```build/install/iui-seed-ratpack``` directory:

    ./gradlew installApp
    
To run that app:
    cd build/install/iui-seed-ratpack
    build/install/iui-seed-ratpack
    
To make a zip in ```build/distributions/iui-seed-ratpack.zip```:

    ./gradlew distZip


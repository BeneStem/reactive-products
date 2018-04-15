# reactive-products

> "How can I die, when I have so much of the Universe left to explore?" - Stephen Hawking

Make breuninger products reactive.

## Roadmap

* include font into service-worker

## Setup

> Use [IntelliJ](https://www.jetbrains.com/idea/download) for coding.
1. Install jdk10 on you machine 
2. Install and start mongodb on you machine
3. **Open** the cloned github folder and the gradle import wizard should pop up.

### Dependencies

Install client dependencies:

    $ yarn install

## Production

Build client:

    $ yarn build

Build server:

    $ gradle build

Start server:

    $ java -jar build/libs/reactive-products.jar

### Endpoints

* [Products](http://localhost:4242/reactive-products/products?take=10)
* [Status](http://localhost:4242/reactive-products/internal/status)
* [Loggers](http://localhost:4242/reactive-products/internal/loggers)
* [Jobdefinitions](http://localhost:4242/reactive-products/internal/jobdefinitions)
* [Jobs](http://localhost:4242/reactive-products/internal/jobs)
* [Toggles](http://localhost:4242/reactive-products/internal/toggles/console/index)
* [Health](http://localhost:4242/reactive-products/internal/health)
* [Metrics](http://localhost:4242/reactive-products/internal/metrics)
* [Httptrace](http://localhost:4242/reactive-products/internal/httptrace)
* [Info](http://localhost:4242/reactive-products/internal/info)
* [Mappings](http://localhost:4242/reactive-products/internal/mappings)
* [Conditions](http://localhost:4242/reactive-products/internal/conditions)
* [Env](http://localhost:4242/reactive-products/internal/env)
* [Beans](http://localhost:4242/reactive-products/internal/beans)

## Development

Start client watcher:

    $ yarn start

Start server:

    $ gradle bootRun [--debug-jvm]
    
You may need to set jvm args if using java 10

    $ --illegal-access=deny --add-opens java.base/java.util=ALL-UNNAMED --add-opens java.base/java.lang=ALL-UNNAMED --add-opens=java.rmi/sun.rmi.transport=ALL-UNNAMED

## Testing

### Test client

    $ yarn test

### Test server

    $ gradle test

## Dependency Update

Client dependencies:

    $ yarn dependency-update

Server dependencies:

    $ gradle dependencyUpdates -Drevision=release

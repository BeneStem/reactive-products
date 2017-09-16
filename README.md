# reactive-products

> "TODO" - Someone Nice

Make otto products reactive.

## Roadmap

* include font into service-worker

## Setup

Install dependencies:

    $ yarn install

## Build

Build client:

    $ yarn build

Build server:

    $ gradle build

## Startup

Start server:

    $ java -jar build/libs/reactive-products.jar

Start client in dev mode:

    $ yarn start

Start server in dev mode:

    $ gradle bootRun [--debug-jvm]

## Testing

### Test client

    $ yarn test

### Test server

    $ gradle test

## Dependency Update

Client dependencies:

    $ yarn upgrade && yarn upgrade-interactive

Server dependencies:

    $ gradle dependencyUpdates -Drevision=release

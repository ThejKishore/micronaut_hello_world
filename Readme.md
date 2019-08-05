### Micronaut CLI commands quick reference:

```bash

$> mn

mn> tab

create-app          create-cli-app      create-federation   create-function     create-profile      help                list-profiles       profile-info        !                   exit                
quit                -n                  --plain-output      -x                  --stacktrace        -v                  --verbose           -h                  --help              -V                  
--version  



mn> help create-app
Usage: mn create-app [-hinvVx] [-b=BUILD-TOOL] [-l=LANG] [-p=PROFILE] [-f=FEATURE[,FEATURE...]]...
                     [NAME]
Creates an application
      [NAME]               The name of the application to create.
  -b, --build=BUILD-TOOL   Which build tool to configure. Possible values: gradle, maven.
  -f, --features=FEATURE[,FEATURE...]
                           The features to use. Possible values: 
                           		security-session, 
                           		java,
                           		 picocli,
                           		  spock,
                             micrometer-ganglia, rabbitmq, hibernate-gorm, graphql, hibernate-jpa, jib,
                             springloaded, kotlin, jrebel, mongo-gorm, micrometer-elastic,
                             micrometer-kairos, asciidoctor, micrometer-atlas, kafka,
                             aws-api-gateway-graal, aws-api-gateway, micrometer-appoptics,
                             mongo-reactive, micrometer-new-relic, annotation-api,
                             micrometer-prometheus, micrometer-jmx, postgres-reactive,
                             micrometer-datadog, 
                             netflix-ribbon, 
                             application, 
                             cassandra,
                             netflix-hystrix, 
                             micrometer-cloudwatch,
                              file-watch,
                               redis-lettuce,
                             config-consul,
                              jdbc-hikari,
                               jdbc-dbcp,
                                micrometer-azure-monitor,
                             netflix-archaius,
                              elasticsearch,
                               micrometer-humio,
                                micrometer-statsd,
                             tracing-jaeger, micrometer-influx, logback, micrometer-graphite,
                             kafka-streams, neo4j-bolt, junit, graal-native-image, micrometer-wavefront,
                             swagger-java, micrometer-signalfx, tracing-zipkin, discovery-eureka,
                             discovery-consul, jdbc-tomcat, liquibase, micrometer, security-jwt,
                             http-server, flyway, micrometer-stackdriver, management, spek, groovy,
                             http-client, micrometer-dynatrace, neo4j-gorm
  -h, --help               Show this help message and exit.
  -i, --inplace            Create a service using the current directory
  -l, --lang=LANG          Which language to use. Possible values: java, groovy, kotlin.
  -n, --plain-output       Use plain text instead of ANSI colors and styles.
  -p, --profile=PROFILE    The profile to use. Possible values: base, cli, configuration, federation,
                             function, function-aws, function-aws-alexa, grpc, kafka, profile, rabbitmq,
                             service, base, cli, configuration, federation, function, function-aws,
                             function-aws-alexa, grpc, kafka, profile, rabbitmq, service.
  -v, --verbose            Create verbose output.
  -V, --version            Print version information and exit.
  -x, --stacktrace         Show full stack trace when exceptions occur.

example:

mn> mn create-app -b gradle -l java -p service -f 


```



Micronaut CLI command line interface for generating projects and services.
Commonly used commands are:
  create-app NAME
  create-cli-app NAME
  create-federation NAME --services SERVICE_NAME[,SERVICE_NAME]...
  create-function NAME

Options:
  -h, --help           Show this help message and exit.
  -n, --plain-output   Use plain text instead of ANSI colors and styles.
  -v, --verbose        Create verbose output.
  -V, --version        Print version information and exit.
  -x, --stacktrace     Show full stack trace when exceptions occur.

Commands:
  create-app         Creates an application
  create-cli-app     Creates a command line application
  create-federation  Creates a federation of services
  create-function    Creates a serverless function application
  create-profile     Creates a profile
  help               Prints help information for a specific command
  list-profiles      Lists the available profiles
  profile-info       Display information about a given profile
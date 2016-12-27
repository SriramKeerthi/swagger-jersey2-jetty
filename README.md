# Swagger with Jersey2 on Jetty Embedded
Swagger with Jersey2 on Jetty Embedded without web.xml and Spring MVC

# UPDATE
If you don't want to actually do this from scratch, but just want the goodness of a framework that has easy Swagger, Jersey 2 and Jetty backing, you should look at [https://github.com/caffinc/jetter](https://github.com/caffinc/jetter "jetter").

All configurations are done with code, no web.xml, no Spring. Builds into a shaded jar with dependencies and can be run with `java -jar jarfile.jar`

# Build
`mvn clean package`

# Run
`java -jar <output.jar>`

# Help
<mailto:sriram@raremile.com>

# Build Status
[![Build Status](https://travis-ci.org/SriramKeerthi/swagger-jersey2-jetty.png)](https://travis-ci.org/SriramKeerthi/swagger-jersey2-jetty)

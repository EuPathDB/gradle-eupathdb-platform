plugins {
  `java-platform`
}

repositories {
  mavenCentral()

  // iRODS Jargon Repo
  maven { setUrl("https://raw.github.com/DICE-UNC/DICE-Maven/master/releases") }
}

dependencies {
  constraints {
    // FGP Utilities
    // runtime("org.gusdb:fgputil-util:${project.version}")
    // runtime("org.gusdb:fgputil-accountdb:${project.version}")

    // JSON Parsing
    runtime("org.json:json:20170516")
    api("javax.json:javax.json-api:1.0")
    runtime("jdom:jdom:1.0")
    runtime("org.glassfish:javax.json:1.0.4")
    runtime("com.fasterxml.jackson.core:jackson-core:${Versions.JACKSON}")
    runtime("com.fasterxml.jackson.core:jackson-databind:${Versions.JACKSON}")
    runtime("com.fasterxml.jackson.core:jackson-annotations:${Versions.JACKSON}")
    runtime("com.fasterxml.jackson.jaxrs:jackson-jaxrs-json-provider:${Versions.JACKSON}")
    runtime("com.fasterxml.jackson.datatype:jackson-datatype-json-org:${Versions.JACKSON}")

    runtime("javax.xml.bind:jaxb-api:2.3.0")
    runtime("com.sun.xml.bind:jaxb-core:2.3.0")
    runtime("com.sun.xml.bind:jaxb-impl:2.3.0")

    // JSON Web Token processing
    runtime("io.jsonwebtoken:jjwt:0.6.0")

    // JSON Schema validation
    runtime("com.github.java-json-tools:json-schema-validator:2.2.10")
//    {
//      // Exclude this lib so we can use fixed version below
//      exclude("com.github.fge", "msg-simple")
//    }
    runtime("com.github.fge:msg-simple:1.2-EUPATHDB")

    // XML Parsing and Validation
    runtime("commons-digester:commons-digester:1.8.1")
    runtime("xalan:serializer:2.7.1")
    runtime("xml-apis:xml-apis:1.4.01")
    runtime("net.sf.saxon:saxon-dom:8.7")
    runtime("com.thaiopensource:jing:20091111")
//    {
//      exclude("xerces", "xercesImpl")
//    }

    // PDF Support
    runtime("com.lowagie:itext:4.2.1")

    // Ontology Support
    runtime("uk.ac.manchester.cs.owl:factplusplus-P4.3:1.6.3")
    runtime("com.github.ansell.pellet:pellet-owlapiv3:1.0.0")
    runtime("net.sourceforge.owlapi:owlapi-distribution:3.5.0")
    runtime("args4j:args4j:2.0.23")
    runtime("org.semanticweb:HermiT:1.3.4")

    // Command Line Support
    runtime("commons-cli:commons-cli:1.2")

    // Encryption Utils
    runtime("commons-codec:commons-codec:1.8")

    // Email Support
    runtime("javax.mail:mail:1.4.7")

    // Database Access Utilities
    runtime("org.mybatis:mybatis:3.2.7")
    runtime("org.apache.commons:commons-dbcp2:2.6.0")

    // JAX-RS / RESTful Web Services
    runtime("javax.ws.rs:javax.ws.rs-api:2.0")
    runtime("org.glassfish.jersey.core:jersey-server:${Versions.JERSEY}")
    runtime("org.glassfish.jersey.containers:jersey-container-servlet:${Versions.JERSEY}")
    runtime("org.glassfish.jersey.core:jersey-client:${Versions.JERSEY}")
    runtime("org.glassfish.jersey.containers:jersey-container-jetty-http:${Versions.JERSEY}")
    runtime("org.glassfish.jersey.ext:jersey-mvc:${Versions.JERSEY}")
    runtime("org.glassfish.jersey.ext:jersey-mvc-jsp:${Versions.JERSEY}")
    runtime("org.glassfish.jersey.media:jersey-media-multipart:${Versions.JERSEY}")

    // OAuth 2
    runtime("org.apache.oltu.oauth2:org.apache.oltu.oauth2.common:${Versions.OLTU}")
    runtime("org.apache.oltu.oauth2:org.apache.oltu.oauth2.authzserver:${Versions.OLTU}")
    runtime("org.apache.oltu.oauth2:org.apache.oltu.oauth2.resourceserver:${Versions.OLTU}")
    runtime("org.apache.oltu.oauth2:org.apache.oltu.oauth2.client:${Versions.OLTU}")

    // URL Rewrite Filter (used in web.xmls)
    runtime("org.tuckey:urlrewritefilter:4.0.4")

    // Google APIs
    runtime("com.google.api-client:google-api-client:1.20.0")
//    {
//      // Unexclude if we ever decide to use Google to log in (OAuth)
//      exclude("org.apache.httpcomponents", "httpclient")
//    }

    // Spring Framework / IoC
    runtime("org.springframework:spring-beans:4.0.6.RELEASE")
    runtime("org.springframework:spring-context:4.0.6.RELEASE")

    // Struts and MVC/Action Support
    runtime("org.apache.struts:struts-core:1.3.10")
//    {
//      exclude("commons-logging", "commons-logging")
//      exclude("commons-fileupload", "commons-fileupload")
//    }
    runtime("org.apache.struts:struts-taglib:1.3.10")
    runtime("commons-fileupload:commons-fileupload:1.3.2")
//    {
//      exclude("commons-io", "commons-io")
//    }

    //  IRODS Jargon
    runtime("org.irods.jargon:jargon-core:4.3.0.1-RELEASE")
//    {
//      exclude("commons-codec", "commons-codec")
//    }

    //  CSV File Handling
    // https://mvnrepository.com/artifact/net.sf.opencsv/opencsv
    runtime("net.sf.opencsv:opencsv:2.3")

    // Standard Servlet API
    runtime("javax.servlet:servlet-api:2.5")

    // JSP Tag Libraries
    runtime("javax.servlet:jsp-api:2.0")
    runtime("javax.servlet:jstl:1.2")
    runtime("org.glassfish.web:jstl-impl:1.2")
//    {
//      exclude("javax.servlet", "servlet-api")
//      exclude("javax.servlet.jsp", "jsp-api")
//      exclude("javax.servlet.jsp.jstl", "jstl-api")
//    }
    runtime("taglibs:standard:1.1.2")
    runtime("taglibs:random:1.0.2")
    runtime("jsptags:pager-taglib:2.0")
    runtime("wraptag:wraptag:1.4")
    runtime("com.crashingdaily:wheninrome:1.0")

    // Unit Test Support
    runtime("junit:junit:4.11")
    runtime("org.hsqldb:hsqldb:2.2.9")
    runtime("net.sourceforge.htmlunit:htmlunit:2.29")
    runtime("org.testng:testng:6.8")
    runtime("org.mockito:mockito-core:2.21.0")

    // Logging
    api("org.slf4j:slf4j-api:1.7.10")
    runtime("org.slf4j:slf4j-log4j12:1.7.10")
    runtime("log4j:log4j:1.2.17")

    //  Reflections
    runtime("org.reflections:reflections:0.9.9-RC1")

    //  Miscellany
    runtime("com.google.gdata:core:1.47.1")
//    {
//      exclude("org.apache.httpcomponents", "httpclient")
//    }
    runtime("com.google.guava:guava:26.0-jre")
    runtime("org.apache.commons:commons-lang3:3.1")
    runtime("io.vulpine.lib:Jackfish:1.1.0")
  }
}

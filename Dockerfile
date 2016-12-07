FROM jboss/wildfly
ADD target/sep_rcc.war /opt/jboss/wildfly/standalone/deployments/

EXPOSE 8080
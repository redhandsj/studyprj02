しおり　：　P.454
URL　:　 http://localhost:8080/DataWebApp1/person

-------------------------------------------------------------------------------
★P.449 のサンプルは動かない！！！
 mvn spring-boot:run
 
 
[ERROR] No plugin found for prefix 'spring-boot' in the current project and in the plugin groups [org.apache.maven.plugins, org.codehaus.mojo] available from the repositories [local (G:\repos\m2\repository), central (https://repo.maven.apache.org/maven2)] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/NoPluginFoundForPrefixException
G:\works\repos\mvn\pj001\MyBootApp1\src\main\java\jp\tuyano\spring\boot\myapp1>

-------------------------------------------------------------------------------
★
mvn clean package
java -jar target\MyBootApp1-0.0.1-SNAPSHOT.jar
だと正常起動して、
 http://localhost:8080/
 にアクセスすればOK
 -------------------------------------------------------------------------------
★




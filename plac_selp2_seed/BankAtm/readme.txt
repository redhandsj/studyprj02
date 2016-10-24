★SpringFramework4_プログラミング入門.pdf
しおり　：　P.404
 - List 8-14
URL　:　 http://localhost:8080/BankAtm/atm
URL　:　 http://localhost:8080/
-------------------------------------------------------------------------------
★SpringBoot_プログラミング入門.pdf
しおり　：　P 55



-------------------------------------------------------------------------------
★JavaEE使い方メモ（JPA その２ - マッピング）
http://qiita.com/opengl-8080/items/265f9f66a65e966678cb







-------------------------------------------------------------------------------
★SpringFramework4_プログラミング入門.pdf
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




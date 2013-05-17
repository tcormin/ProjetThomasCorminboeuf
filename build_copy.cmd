call mvn clean install
call copy "C:\Dev\project\benevolat\target\benevolat.war" "C:\Dev\jboss-as-7.1.1.Final\standalone\deployments"
pause
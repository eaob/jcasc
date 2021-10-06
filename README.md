###  (Jenkins configuration as code)


Запустить jenkins-dind контейнер:

` docker run --privileged -d -v jenkins_home:/var/jenkins_home -p 8080:8080 -p 50000:50000 ayudadigital/jenkins-dind`

Admin password:

` docker exec $CONTAINER_ID cat  /var/jenkins_home/secrets/initialAdminPassword`

Установить плагин [Configuration as Code Plugin - Groovy Scripting Extension](https://plugins.jenkins.io/configuration-as-code-groovy/ "Configuration as Code Plugin - Groovy Scripting Extension")

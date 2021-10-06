###  (Jenkins configuration as code)


Запустить jenkins-dind контейнер:

` docker run --privileged -d -v jenkins_home:/var/jenkins_home -p 8080:8080 -p 50000:50000 ayudadigital/jenkins-dind`

Ключ для разблокировки Jenkins:

` docker exec $CONTAINER_ID cat  /var/jenkins_home/secrets/initialAdminPassword`

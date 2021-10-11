### JCasC

 Запустить:
 
`git clone`

`cd jcasc`


В примере креды для взаимодействия Jenkins с внешними сервисами и пароль от УЗ администратора хранятся локально по путям:

`/home/centos/hometasks/jenkins_as_code/secrets/admin`

`/home/centos/hometasks/jenkins_as_code/secrets/dockerhub`

`home/centos/hometasks/jenkins_as_code/secrets/github`


`docker-compose up --build -d`

Jenkins web - http://$HOST_IP

Импортировать конфигурацию /var/jenkins_conf/jenkins.yaml






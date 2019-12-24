# Пример работы с кэшем Hazelcast

## Запуск Hazelcast Management Center
Выполняем команду <code>docker run -p 8080:8080 hazelcast/management-center</code>
Hazelcast Management Center будет доступен по URL - http://localhost:8080/hazelcast-mancenter/login.html

## Запуск Hazelcast
Выполняем команду <code>docker run -ti -e MANCENTER_URL="http://localhost:8080/hazelcast-mancenter" hazelcast/hazelcast</code>
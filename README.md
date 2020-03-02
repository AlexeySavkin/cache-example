# Пример работы с кэшем Hazelcast

## Настройка окружения
- В командной строке переходим в директорию <code>docker</code>
- Выполняем команду <code>docker-compose up</code>. Выполнится запуск сервисов: PostgreSQL, Hazelcast, Hazelcast management center.

## Работа с Hazelcast management center
- Сервис будет досупен по URL - http://localhost:8080/hazelcast-mancenter/

## Работа с сервисом
- Сервис будет доступен по URL - http://localhost:8081/
- Список поддерживаемых методов можно посмотреть в com.example.cache.controller.CacheController
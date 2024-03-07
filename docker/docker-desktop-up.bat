IF "%~1" == "up" (
  docker-compose -f "docker-compose.yml" pull
  docker-compose -f "docker-compose.yml" up -d
)
IF "%~1" == "down" (
  docker-compose -f "docker-compose.yml" down
)
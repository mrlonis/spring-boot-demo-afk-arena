echo "restartDocker.bat: Starting..."
echo "restartDocker.bat: Restarting Docker..."
docker stop mrlonis_mssql
docker rm mrlonis_mssql
docker stop mrlonis-rabbit
docker rm mrlonis-rabbit
docker run -e ACCEPT_EULA=Y -e SA_PASSWORD=Some1Password! --name mrlonis_mssql -p 1433:1433 -d mcr.microsoft.com/mssql/server
docker run -d --hostname my-rabbit --name mrlonis-rabbit -p 15672:15672 -p 5672:5672 -e RABBITMQ_DEFAULT_USER=mrlonis -e RABBITMQ_DEFAULT_PASS=I1Am3Here? -m=512m rabbitmq:3-management
echo "restartDocker.bat: Done!"
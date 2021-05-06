printf "restartDocker.sh: Starting...\n"
hostname >hostname.txt

if grep -q jenkins hostname.txt; then
    printf "restartDocker.sh: Running on Jenkins!\n"
else
    printf "restartDocker.sh: NOT Running on Jenkins!\n"
    printf "restartDocker.sh: Restarting Docker...\n"
    docker stop "$(docker ps -a | grep mrlonis_mssql | awk '{print $1}')"
    docker rm "$(docker ps -a | grep mrlonis_mssql | awk '{print $1}')"
    docker stop "$(docker ps -a | grep mrlonis-rabbit | awk '{print $1}')"
    docker rm "$(docker ps -a | grep mrlonis-rabbit | awk '{print $1}')"
    docker run -e 'ACCEPT_EULA=Y' -e 'SA_PASSWORD=Some1Password!' --name 'mrlonis_mssql' -p 1433:1433 -d mcr.microsoft.com/mssql/server
    docker run -d --hostname my-rabbit --name mrlonis-rabbit -p 15672:15672 -p 5672:5672 -e RABBITMQ_DEFAULT_USER=mrlonis -e RABBITMQ_DEFAULT_PASS=I1Am3Here? -m=512m rabbitmq:3-management
fi

rm hostname.txt
printf "restartDocker.sh: Done!\n"
